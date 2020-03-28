package com.project.whatsnext.retrofit;

import org.springframework.stereotype.Service;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Service
public class RetrofitService {

  private Retrofit getConnectionToMovieApi(String url) {
    return new Retrofit
        .Builder()
        .baseUrl(url)
        .addConverterFactory(GsonConverterFactory.create())
        .build();
  }

  public TMDbAPI getMovieAPI() {
    return getConnectionToMovieApi(System.getenv("API_URL")).create(TMDbAPI.class);
  }
}

