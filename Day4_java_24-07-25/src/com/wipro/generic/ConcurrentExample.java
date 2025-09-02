package com.wipro.generic;

import java.util.List;

public class ConcurrentExample {
	public static void main(String[] args) {
		Movie m1= new Movie("Titanic", "English", "Romantic", 8);

		Movie m2= new Movie("Jurasic Park", "English", "Adventure", 7.5);

		Movie m3= new Movie("Sholay", "Hindi", "Action", 8.5);

		Movie m4= new Movie("Drishyam", "Malayalam", "Thriller", 8.1);

		List<Movie> movieList= new ArrayList<>();

		for(Movie movie:movieList) {
			if(movie.getImdbRating()<8) {
				movieList.remove(movie);
			}
		}

}
