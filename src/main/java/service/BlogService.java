package service;

import java.util.List;

import entity.Blog;

public interface BlogService {

	void addBlog(Blog blog);
	
	List<Blog> queryAll();
	
}
