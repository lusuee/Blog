package controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import service.MovieService;

@Controller
@RequestMapping("/movie")
public class MovieController {

	@Autowired
	private MovieService movieService;
	
	@RequestMapping("/get")
	public String getMovies(Model model) {
		List<Map<String, Object>> movieList = movieService.getMovies();
		model.addAttribute("movieList", movieList);
		return "index";
	}
	
	@RequestMapping("{id}")
	public String getMovieById() {
		return "";
	}
	
}
