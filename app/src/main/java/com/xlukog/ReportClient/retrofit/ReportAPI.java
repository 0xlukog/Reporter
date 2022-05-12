package com.xlukog.ReportClient.retrofit;

import com.xlukog.ReportClient.model.Report;

import java.util.List;

import retrofit2.http.Body;
import retrofit2.http.POST;

public class ReportAPI {

    @POST("/report/save")
    Call<Report> save(@Body Report report);
}
