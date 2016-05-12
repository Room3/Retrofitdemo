package com.lpp.demo.redemo.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by liuwang
 * on 2016/3/13.
 */
public final class TsmsApi {
    public static final String TSMS_URL = "http://c.m.163.com/nc/article/";

    /**
     * 工作提议赞和反对
     */
    public static final String DT_TYPE_SUGGEST = "3";

    /**
     * 工作提议支持
     */
    public static final String SUPPORT = "support";

    /**
     * 工作提议反对
     */
    public static final String OPPOSE = "oppose";

    private Retrofit retrofit;

    private static TsmsApi instance = new TsmsApi();

    private TsmsApi() {
        retrofit = new Retrofit.Builder()
                .baseUrl(TSMS_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static <T> T api(Class<T> clazz) {
        return instance.retrofit.create(clazz);
    }

    public static Api getTsmsApi() {
        return api(Api.class);
    }
}
