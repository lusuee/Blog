package dao;

import java.util.List;

import entity.Blog;

public interface BlogDao {

	void addBlog(Blog blog);
	
	Blog queryBlogById();
	
	List<Blog> queryBlog();
	
}
