package daoimpl;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import dao.MovieDao;
import db.DBUtil;
import entity.Movie;

@Repository
public class MovieDaoImpl implements MovieDao {

	private JdbcTemplate jdbcTemplate;
	private SqlSession session;
	
	public MovieDaoImpl() throws IOException {
		this.session = DBUtil.getSession().openSession();
	}
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public List<Map<String, Object>> getMovies() {
		//return this.jdbcTemplate.queryForList("SELECT * FROM movies");
		return session.selectList("movie.findAll");
	}

	@Override
	public Movie getMovieById() {
		return this.jdbcTemplate.queryForObject("SELECT * FROM movies WHERE id = ?", Movie.class);
	}

}
