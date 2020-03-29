package com.project.whatsnext.services;

import com.project.whatsnext.DTO.TMDbApiResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface TMDbAPI {

  @GET("tv/popular")
  Call<TMDbApiResponse> getPopularTVShows(
      @Query("api_key") String apiKey,
      @Query("language") String language,
      @Query("page") int page
  );
}
