package com.project.whatsnext.services;

import com.project.whatsnext.DTO.TMDbApiResponse;
import com.project.whatsnext.entity.TVShow;
import java.util.List;

public interface TVShowService {

    List<TVShow> findAll();

    void saveTVShows(TMDbApiResponse tmDbApiResponse);

    void getTVShows();

}
