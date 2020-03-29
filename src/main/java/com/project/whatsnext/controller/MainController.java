package com.project.whatsnext.controller;

import com.project.whatsnext.entity.TVShow;
import com.project.whatsnext.services.TVShowService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

  private TVShowService service;

  @Autowired
  public MainController(TVShowService service) {
    this.service = service;
  }

  @PutMapping("/dataFromAPI")
  public ResponseEntity<?> getDataFromAPI() {
    service.getTVShows();
    return ResponseEntity.status(HttpStatus.OK).body("saved");
  }

  @GetMapping("/popularTVShows")
  public ResponseEntity<List<TVShow>> getPopulars() {
    return ResponseEntity.status(HttpStatus.OK).body(service.findAll());
  }


}
