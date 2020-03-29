package com.project.whatsnext.services;

import org.springframework.stereotype.Service;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Service
public class RetrofitService {

  private Retrofit getConnectionToTMDbAPI(String url) {
    return new Retrofit
        .Builder()
        .baseUrl(url)
        .addConverterFactory(GsonConverterFactory.create())
        .build();
  }

  public TMDbAPI getTMDbAPI() {
    return getConnectionToTMDbAPI(System.getenv("API_URL")).create(TMDbAPI.class);
  }

}

