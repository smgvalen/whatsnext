package com.project.whatsnext.tvshows;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class TVShow {

  @Id
  @GeneratedValue
  private Long id;
  private String name;
  private boolean in_production;
  private String last_air_date;
}
