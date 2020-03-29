package com.project.whatsnext.repository;

import com.project.whatsnext.entity.TVShow;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TVShowRepository extends CrudRepository<TVShow, Long> {

}
