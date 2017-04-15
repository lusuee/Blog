package daoimpl;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import dao.MovieDao;
import db.DBUtil;
import entity.Movie;

@Repository
public class MovieDaoImpl implements MovieDao {

	private SqlSession session;

	public MovieDaoImpl() throws IOException {
		this.session = DBUtil.getSession().openSession();
	}

	public List<Map<String, Object>> getMovies() {
		// return this.jdbcTemplate.queryForList("SELECT * FROM movies");
		return session.selectList("movie.findAll");
	}

	public Movie getMovieById() {
		return null;
	}

}
