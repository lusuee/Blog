package service;

import java.util.List;

import entity.Blog;

public interface BlogService {

	void addBlog(Blog blog);
	
	Blog queryById(String id);
	
	List<Blog> queryAll();
	
	void editBlog(Blog blog);
	
	void deleteById(int id);
}
