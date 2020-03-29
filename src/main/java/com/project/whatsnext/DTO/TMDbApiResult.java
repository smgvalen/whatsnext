package com.project.whatsnext.DTO;

public class TMDbApiResult {

  private int id;
  private String original_language;
  private String first_air_date;
  private String name;
  private String original_name;
  private int number_of_episodes;
  private int number_of_seasons;
  private double vote_average;

 // public TMDbApiResult() { }

  public TMDbApiResult(int id, String original_language,
      String first_air_date, String name, String original_name, int number_of_episodes,
      int number_of_seasons, double vote_average) {
    this.id = id;
    this.original_language = original_language;
    this.first_air_date = first_air_date;
    this.name = name;
    this.original_name = original_name;
    this.number_of_episodes = number_of_episodes;
    this.number_of_seasons = number_of_seasons;
    this.vote_average = vote_average;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getOriginal_language() {
    return original_language;
  }

  public void setOriginal_language(String original_language) {
    this.original_language = original_language;
  }

  public String getFirst_air_date() {
    return first_air_date;
  }

  public void setFirst_air_date(String first_air_date) {
    this.first_air_date = first_air_date;
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

  public double getVote_average() {
    return vote_average;
  }

  public void setVote_average(double vote_average) {
    this.vote_average = vote_average;
  }

}
