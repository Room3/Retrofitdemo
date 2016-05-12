package com.lpp.demo.redemo.api;

import android.support.v4.widget.SwipeRefreshLayout;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by liuwang on 2016/3/13.
 */
public abstract class SimpleCallback<T> implements Callback<T> {

    private SwipeRefreshLayout swip_refresh;

    public SimpleCallback() {
    }

    public SimpleCallback(SwipeRefreshLayout swip_refresh) {
        this.swip_refresh = swip_refresh;
    }

    /**
     * 请求成功
     *
     * @param call
     * @param response
     */
    @Override
    public void onResponse(Call<T> call, Response<T> response) {

        if (swip_refresh != null) {
            swip_refresh.setRefreshing(false);
        }
        // System.out.println(response.errorBody().toString());
        if (response.isSuccess()) {
            onResponse(response.body(), response.code(), response.message());
        } else {
            onResponseFail();
        }
    }

    /**
     * 请求失败
     *
     * @param call
     * @param t
     */
    @Override
    public void onFailure(Call<T> call, Throwable t) {
        System.out.println(t.toString() + "onfailure");
        if (swip_refresh != null) {
            swip_refresh.setRefreshing(false);
        }
    }


    /**
     * on response return
     *
     * @param result result 数据
     * @param code   http code 请求的返回码
     * @param msg    http msg 返回的信息
     */
    public abstract void onResponse(final T result, int code, String msg);

    /**
     *
     */
    public void onResponseFail() {

    }
}
