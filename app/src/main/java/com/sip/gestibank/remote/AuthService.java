package com.sip.gestibank.remote;

import com.sip.gestibank.model.User;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface AuthService {
    @GET("users/{email}")
    Call<User> getUserByEmail(@Path("email")String email);
}
