package com.jiyun.helloworld.day03lx.http;

import android.database.Observable;

import com.jiyun.helloworld.day03lx.bean.BaseResponse;
import com.jiyun.helloworld.day03lx.bean.ListData;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * Created by ASAS on 2019/7/26.
 */

public interface MyServer {
    @GET
    Observable<BaseResponse<List<ListData>>> get(@Url String url);
}
