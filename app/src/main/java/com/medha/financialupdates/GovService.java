package com.medha.financialupdates;

import com.medha.financialupdates.model.Complaints;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.GET;

/**
 * Created by Prathyusha on 2/16/17.
 */

public interface GovService {
    @GET("resource/jhzv-w97w.json")
     Call<ResponseBody> returnResponse();
}
