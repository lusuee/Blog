package dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import entity.Blog;

@Repository
public interface BlogDao {

	void addBlog(Blog blog);
	
	Blog queryBlogById(String id);
	
	List<Blog> queryBlog();
	
	void deleteBlogById(int id);
	
	void editBlog(Blog blog);
	
}
