package daoimpl;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import dao.BlogDao;
import db.DBUtil;
import entity.Blog;

@Repository
public class BlogDaoImpl implements BlogDao {

	private SqlSession sqlSession;
	
	public BlogDaoImpl() throws IOException {
		this.sqlSession = DBUtil.getSession().openSession();
	}
	
	@Override
	public void addBlog() {
		
	}

	@Override
	public Blog queryBlogById() {
		return null;
	}

	@Override
	public List<Blog> queryBlog() {
		return sqlSession.selectList("blog.findAll");
	}

}
