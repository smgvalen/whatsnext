package com.project.whatsnext.retrofit;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface TMDbAPI {

 @GET("tv/latest")
  Call<TMDbApiResponse> getLatestTvShows(
      @Query("api_key") String apiKey,
     @Query("language") String language,
     @Query("page") int page
 );
}
