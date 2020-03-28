package com.project.whatsnext.retrofit;

public class TMDbApiResult {

  private int id;
  private boolean in_production;
  private String original_language;
  private String last_air_date;
  private String name;
  private String original_name;
  private int number_of_episodes;
  private int number_of_seasons;
  private int popularity;
  private Object[] seasons;

  public TMDbApiResult() {
  }

  public TMDbApiResult(int id, boolean in_production, String original_language,
      String last_air_date, String name, String original_name, int number_of_episodes,
      int number_of_seasons, int popularity, Object[] seasons) {
    this.id = id;
    this.in_production = in_production;
    this.original_language = original_language;
    this.last_air_date = last_air_date;
    this.name = name;
    this.original_name = original_name;
    this.number_of_episodes = number_of_episodes;
    this.number_of_seasons = number_of_seasons;
    this.popularity = popularity;
    this.seasons = seasons;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public boolean isIn_production() {
    return in_production;
  }

  public void setIn_production(boolean in_production) {
    this.in_production = in_production;
  }

  public String getOriginal_language() {
    return original_language;
  }

  public void setOriginal_language(String original_language) {
    this.original_language = original_language;
  }

  public String getLast_air_date() {
    return last_air_date;
  }

  public void setLast_air_date(String last_air_date) {
    this.last_air_date = last_air_date;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getOriginal_name() {
    return original_name;
  }

  public void setOriginal_name(String original_name) {
    this.original_name = original_name;
  }

  public int getNumber_of_episodes() {
    return number_of_episodes;
  }

  public void setNumber_of_episodes(int number_of_episodes) {
    this.number_of_episodes = number_of_episodes;
  }

  public int getNumber_of_seasons() {
    return number_of_seasons;
  }

  public void setNumber_of_seasons(int number_of_seasons) {
    this.number_of_seasons = number_of_seasons;
  }

  public int getPopularity() {
    return popularity;
  }

  public void setPopularity(int popularity) {
    this.popularity = popularity;
  }

  public Object[] getSeasons() {
    return seasons;
  }

  public void setSeasons(Object[] seasons) {
    this.seasons = seasons;
  }
}
