package dao;

import java.util.List;

import entity.Blog;

public interface BlogDao {

	void addBlog(Blog blog);
	
	Blog queryBlogById(String id);
	
	List<Blog> queryBlog();
	
	void deleteBlogById(int id);
	
	void editBlog(Blog blog);
	
}
