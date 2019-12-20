package com.ifa.finalproject.network;

import com.ifa.finalproject.models.ListWisataModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetDataService {

    @GET("get/list/wisata")
    Call<List<ListWisataModel>> getListWisata();
}
