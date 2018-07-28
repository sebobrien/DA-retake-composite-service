package com.seb.entities;

import org.springframework.lang.Nullable;

public class CompositeEntity{
	
	private MovieEntity movie;
	
	@Nullable
	private String reviews, recommendations;
	
	public CompositeEntity() {}

	public MovieEntity getMovie() {
		return movie;
	}

	public void setMovie(MovieEntity movie) {
		this.movie = movie;
	}

	public String getReviews() {
		return reviews;
	}

	public void setReviews(String reviews) {
		this.reviews = reviews;
	}

	public String getRecommendations() {
		return recommendations;
	}

	public void setRecommendations(String recommendations) {
		this.recommendations = recommendations;
	}
}