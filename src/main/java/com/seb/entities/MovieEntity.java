package com.seb.entities;

import java.util.List;

import org.springframework.lang.Nullable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MovieEntity {

	@JsonProperty("Response")
	public boolean response;

	@Nullable
	@JsonProperty("Title")
	String title;
	
	@Nullable
	@JsonProperty("Rated")
	String rated;
	
	@Nullable
	@JsonProperty("Released")
	String released;
	
	@Nullable
	@JsonProperty("Runtime")
	String runtime;
	
	@Nullable
	@JsonProperty("Genre")
	String genre;
	
	@Nullable
	@JsonProperty("Director")
	String director; 
	
	@Nullable
	@JsonProperty("Writer")
	String writer; 
	@Nullable
	@JsonProperty("Actors")
	String actors;
	@Nullable
	@JsonProperty("Plot")
	String plot; 
	@Nullable
	@JsonProperty("Language")
	String language;
	@Nullable
	@JsonProperty("Country")
	String country;
	@Nullable
	@JsonProperty("Awards")
	String awards;
	@Nullable
	@JsonProperty("Poster")
	String poster;

	@Nullable
	@JsonProperty("Ratings")
	List<rating> ratings;

	@Nullable
	@JsonProperty("Metascore")
	String metascore; 
	
	@Nullable
	@JsonProperty("imbdRating")
	String imbdRating;	
	
	@Nullable
	@JsonProperty("imbdVotes")
	String imbdVotes;
	
	
	
	
	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}


	public String getImbdRating() {
		return imbdRating;
	}


	public void setImbdRating(String imbdRating) {
		this.imbdRating = imbdRating;
	}


	public String getImbdVotes() {
		return imbdVotes;
	}


	public void setImbdVotes(String imbdVotes) {
		this.imbdVotes = imbdVotes;
	}


	public String getImbdID() {
		return imbdID;
	}


	public void setImbdID(String imbdID) {
		this.imbdID = imbdID;
	}





	@JsonProperty("ImbdID")
	String imbdID;
	
	@Nullable
	@JsonProperty("Type")
	String type;
	
	@Nullable
	@JsonProperty("DVD")
	String dvd;
	
	@Nullable
	@JsonProperty("BoxOffice")
	String boxOffice;
	
	@Nullable
	@JsonProperty("Production")
	String production;
	
	@Nullable
	@JsonProperty("Website")
	String website;

	



	static class rating {
		
		@JsonProperty("Source")
		String source;
		@JsonProperty("Value")
		String value;

		public rating() {
		}

	
	}

}
