package dao;

import java.util.List;
import java.util.Map;

import entity.Movie;

public interface MovieDao {

	public List<Map<String, Object>> getMovies();
	
	public Movie getMovieById();
	
}
