package com.project.whatsnext.tvshows;

import com.project.whatsnext.tvshows.TVShow;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TVShowRepository extends CrudRepository<TVShow, Long> {

}
