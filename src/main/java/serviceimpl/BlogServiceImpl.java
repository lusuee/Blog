package serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.BlogDao;
import entity.Blog;
import service.BlogService;

@Service
public class BlogServiceImpl implements BlogService {

	@Autowired
	private BlogDao blogDao;
	
	public List<Blog> queryAll() {
		return blogDao.queryBlog();
	}

	public void addBlog(Blog blog) {
		blogDao.addBlog(blog);
	}

	public Blog queryById(String id) {
		return blogDao.queryBlogById(id);
	}

	public void deleteById(int id) {
		blogDao.deleteBlogById(id);
	}

	public void editBlog(Blog blog) {
		blogDao.editBlog(blog);
	}

}
