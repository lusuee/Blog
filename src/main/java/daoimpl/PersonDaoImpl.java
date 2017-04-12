package daoimpl;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import dao.PersonDao;

@Repository
public class PersonDaoImpl implements PersonDao {
	
	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public void addPerson() {
		jdbcTemplate.update("INSERT INTO user (name, phone, address) values(?, ?, ?)", "1", "2", "3");
	}

}
