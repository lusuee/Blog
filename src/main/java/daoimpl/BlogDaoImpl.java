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
		sqlSession.commit(true);
	}
	
	public void addBlog(Blog blog) {
		sqlSession.insert("blog.insert", blog);
	}

	public Blog queryBlogById(String id) {
		return sqlSession.selectOne("findById", id);
	}

	public List<Blog> queryBlog() {
		return sqlSession.selectList("blog.findAll");
	}

	public void deleteBlogById(int id) {
		sqlSession.delete("deleteById", id);
	}

	public void editBlog(Blog blog) {
		sqlSession.update("", "");
	}

	
}
