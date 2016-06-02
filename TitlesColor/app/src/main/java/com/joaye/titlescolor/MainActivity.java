package com.joaye.titlescolor;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.baidu.location.BDLocation;
import com.baidu.location.BDLocationListener;
import com.baidu.location.LocationClient;
import com.baidu.location.LocationClientOption;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

import qiu.niorgai.StatusBarCompat;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public TextView text;
    public TextView messages;
    public LocationClient mLocationClient = null;
    public BDLocationListener myListener = new MyLocationListener();
    public Button strat, stop;
    public StringBuffer stringBuffer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
        //注册EventBus
        EventBus.getDefault().register(this);
        text = (TextView) findViewById(R.id.text);
        strat = (Button) findViewById(R.id.statr);
        stop = (Button) findViewById(R.id.stop);
        messages = (TextView) findViewById(R.id.messages);
        strat.setOnClickListener(this);
        stop.setOnClickListener(this);
        mLocationClient = new LocationClient(getApplicationContext());     //声明LocationClient类
        mLocationClient.registerLocationListener(myListener);    //注册监听函数
        initLocation();
        //设置状态栏的颜色
        // StatusBarCompat.setStatusBarColor(MainActivity.this,R.color.colorAccent);
//为状态栏颜色设置透明度
        // StatusBarCompat.setStatusBarColor(MainActivity.this, R.color.colorAccent, 112);
//透明状态栏
        StatusBarCompat.translucentStatusBar(this);
//当SDK >= 21时, 是否需要隐藏状态栏的背景色(默认的黑色背景)
        StatusBarCompat.translucentStatusBar(MainActivity.this, false);
        /**
         * 开启定位功能。
         */

    }

    private void initLocation() {
        LocationClientOption option = new LocationClientOption();
        option.setLocationMode(LocationClientOption.LocationMode.Hight_Accuracy);//可选，默认高精度，设置定位模式，高精度，低功耗，仅设备
        option.setCoorType("bd09ll");//可选，默认gcj02，设置返回的定位结果坐标系
        int span = 0;            //设置定位的秒数，1000为一秒
        option.setScanSpan(span);//可选，默认0，即仅定位一次，设置发起定位请求的间隔需要大于等于1000ms才是有效的
        option.setIsNeedAddress(true);//可选，设置是否需要地址信息，默认不需要
        option.setOpenGps(true);//可选，默认false,设置是否使用gps
        option.setLocationNotify(true);//可选，默认false，设置是否当gps有效时按照1S1次频率输出GPS结果
        option.setIsNeedLocationDescribe(true);//可选，默认false，设置是否需要位置语义化结果，可以在BDLocation.getLocationDescribe里得到，结果类似于“在北京天安门附近”
        option.setIsNeedLocationPoiList(true);//可选，默认false，设置是否需要POI结果，可以在BDLocation.getPoiList里得到
        option.setIgnoreKillProcess(true);//可选，默认true，定位SDK内部是一个SERVICE，并放到了独立进程，设置是否在stop的时候杀死这个进程，默认不杀死
        option.SetIgnoreCacheException(false);//可选，默认false，设置是否收集CRASH信息，默认收集
        option.setEnableSimulateGps(false);//可选，默认false，设置是否需要过滤gps仿真结果，默认需要
        mLocationClient.setLocOption(option);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.statr:
                mLocationClient.start();
                break;
            case R.id.stop:
                mLocationClient.stop();
                break;
        }
    }
    @Subscribe
    public void onMessageEvent(FirstEvent event) {
        BDLocation location = event.getLocation();
        switch (location.getLocType()) {
            case 161:
                //Toast.makeText(this, "定位失败，请重新定位", Toast.LENGTH_SHORT).show();
                break;
            case 62:
                Toast.makeText(this, "无法获取有效定位依据，定位失败，请检查运营商网络或者wifi网络是否正常开启，尝试重新请求定位", Toast.LENGTH_SHORT).show();
                break;
            default:

                break;
        }
        if (location.getLocType() != 161) {
            Toast.makeText(this, location.getLocationDescribe() + "", Toast.LENGTH_SHORT).show();
        } else {
            messages.setText(location.getLatitude() + "纬度" + location.getLongitude() + "纬度" + location.getCity() + "城市" + location.getLocType() + "errocode");
        }
        //Toast.makeText(this, event.getStringBuffer().toString(), Toast.LENGTH_SHORT).show();
    }

    //    public void onEventMainThread(FirstEvent event) {
//
//        String msg = "onEventMainThread收到了消息：" + event.getMsg();
//        Log.d("harvic", msg);
//        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
//    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);//反注册EventBus
    }
}
