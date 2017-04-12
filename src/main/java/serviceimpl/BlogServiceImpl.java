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
	
	@Override
	public List<Blog> queryAll() {
		return blogDao.queryBlog();
	}

}
