package com.lpp.demo.redemo;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import com.lpp.demo.redemo.adapter.ArticleAdapter;
import com.lpp.demo.redemo.api.Api;
import com.lpp.demo.redemo.api.SimpleCallback;
import com.lpp.demo.redemo.api.TsmsApi;
import com.lpp.demo.redemo.bean.Article;
import com.lpp.demo.redemo.widgets.loadmore.LoadMoreContainer;
import com.lpp.demo.redemo.widgets.loadmore.LoadMoreHandler;
import com.lpp.demo.redemo.widgets.loadmore.LoadMoreListViewContainer;
import com.readystatesoftware.systembartint.SystemBarTintManager;

import java.util.ArrayList;

import in.srain.cube.views.ptr.PtrClassicFrameLayout;
import in.srain.cube.views.ptr.PtrDefaultHandler;
import in.srain.cube.views.ptr.PtrFrameLayout;
import in.srain.cube.views.ptr.PtrHandler;
import retrofit2.Call;

public class MainActivity extends AppCompatActivity {

    private ListView listview;
    public ArrayList<Article.T1348648517839Entity> arrayList;
    private PtrClassicFrameLayout activity_view_ptrfresh_frame;
    private LoadMoreListViewContainer activity_view_ptrloadmore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ///if (isApplyKitKatTranslucency()) {
            setSystemBarTintDrawable(getResources().getDrawable(R.drawable.delete_order));
        //}

        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        initView();
        arrayList = new ArrayList<>();
        workData();
        activity_view_ptrfresh_frame.setPtrHandler(new PtrHandler() {
            @Override
            public boolean checkCanDoRefresh(PtrFrameLayout frame, View content, View header) {
                return PtrDefaultHandler.checkContentCanBePulledDown(frame, listview, header);
            }
            @Override
            public void onRefreshBegin(PtrFrameLayout frame) {
                workData();

            }
        });
        activity_view_ptrfresh_frame.disableWhenHorizontalMove(true);
    }

    private void initView() {
        listview = (ListView) findViewById(R.id.listview);
        activity_view_ptrfresh_frame = (PtrClassicFrameLayout) findViewById(R.id.activity_view_ptrfresh_frame);
        activity_view_ptrloadmore = (LoadMoreListViewContainer) findViewById(R.id.activity_view_ptrloadmore);
        activity_view_ptrloadmore.useDefaultFooter();
        activity_view_ptrloadmore.setShowLoadingForFirstPage(true);
        activity_view_ptrloadmore.setLoadMoreHandler(new LoadMoreHandler() {
            @Override
            public void onLoadMore(LoadMoreContainer loadMoreContainer) {
                workData();
            }
        });
    }

    public void workData() {
        Api api = TsmsApi.getTsmsApi();
        Call<Article> call = api.login("" , "");
        call.enqueue(new SimpleCallback<Article>() {
            @Override
            public void onResponse(Article result, int code, String msg) {
                Log.e("MainActivity", "result.getT1348648517839().get(1).getAds():" + result.getT1348648517839().get(2));
                arrayList.addAll(result.getT1348648517839());
                ArticleAdapter articleAdapter = new ArticleAdapter(MainActivity.this, arrayList);
                listview.setAdapter(articleAdapter);
                activity_view_ptrloadmore.loadMoreFinish(arrayList == null || arrayList.size() <= 0, arrayList != null && arrayList.size() == 10);
                activity_view_ptrfresh_frame.refreshComplete();
            }

        });
    }
    protected void setSystemBarTintDrawable(Drawable tintDrawable) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            SystemBarTintManager mTintManager = new SystemBarTintManager(this);
            if (tintDrawable != null) {
                mTintManager.setStatusBarTintEnabled(true);
                mTintManager.setTintDrawable(tintDrawable);
            } else {
                mTintManager.setStatusBarTintEnabled(false);
                mTintManager.setTintDrawable(null);
            }

        }
    }

}
