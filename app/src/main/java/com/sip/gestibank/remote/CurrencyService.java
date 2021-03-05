package com.sip.gestibank.remote;

import com.sip.gestibank.model.Currency;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface CurrencyService {

    @GET
    Call<Currency> getData(@Url String url);
}
