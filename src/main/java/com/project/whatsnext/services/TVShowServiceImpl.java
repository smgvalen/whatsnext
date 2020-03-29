package com.project.whatsnext.services;

import com.project.whatsnext.DTO.TMDbApiResponse;
import com.project.whatsnext.DTO.TMDbApiResult;
import com.project.whatsnext.entity.TVShow;
import com.project.whatsnext.repository.TVShowRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

@Service
public class TVShowServiceImpl implements TVShowService {

  private TVShowRepository repository;
  private RetrofitService retrofitService;

  private TMDbAPI tmDbAPI;

  private final String API_KEY = System.getenv("api_key");

  @Autowired
  public TVShowServiceImpl(TVShowRepository repository,
      RetrofitService retrofitService) {
    this.repository = repository;
    this.retrofitService = retrofitService;
    this.tmDbAPI = retrofitService.getTMDbAPI();
  }

  @Override
  public List<TVShow> findAll() {
    List<TVShow> tvShows = new ArrayList<>();
    repository.findAll().forEach(tvShows::add);
    return tvShows;
  }

  @Override
  public void saveTVShows(TMDbApiResponse tmDbApiResponse) {
    List<TMDbApiResult> results = tmDbApiResponse.getResults();
    results.forEach(result -> repository.save(
        new TVShow(
            result.getOriginal_language(),
            result.getFirst_air_date(),
            result.getName(),
            result.getOriginal_name(),
            result.getNumber_of_episodes(),
            result.getNumber_of_episodes(),
            result.getVote_average()
        )));
  }

  @Override
  public void getTVShows() {
    tmDbAPI.getPopularTVShows(API_KEY, "en_US", 1)
        .enqueue(new Callback<TMDbApiResponse>() {
          @Override
          public void onResponse(
              Call<TMDbApiResponse> call, Response<TMDbApiResponse> response) {
            assert response.body() != null;
            saveTVShows(response.body());
          }

          @Override
          public void onFailure(Call<TMDbApiResponse> call, Throwable t) {
            t.printStackTrace();
          }
        });
  }
}
