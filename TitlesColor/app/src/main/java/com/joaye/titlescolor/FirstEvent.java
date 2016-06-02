package com.joaye.titlescolor;

import com.baidu.location.BDLocation;

/**
 * Created by zhuzi on 16/5/31.
 */
public class FirstEvent {
    public StringBuffer stringBuffer;
    private String mMsg;
    private BDLocation location;



    public StringBuffer getStringBuffer() {
        return stringBuffer;
    }

    public FirstEvent(BDLocation location) {
        this.location = location;
    }

    public BDLocation getLocation() {
        return location;
    }

    public FirstEvent(StringBuffer stringBuffers) {
        stringBuffer = stringBuffers;
    }
    public FirstEvent(String msg) {
        mMsg = msg;
    }

    public String getMsg() {
        return mMsg;
    }
}
