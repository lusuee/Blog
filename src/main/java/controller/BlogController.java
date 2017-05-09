package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import entity.Blog;
import service.BlogService;

@Controller
@RequestMapping("/blog")
public class BlogController {

	@Autowired
	private BlogService blogService;
	
	@RequestMapping
	public String queryBlog(Model model) {
		model.addAttribute("blogList", blogService.queryAll());
		return "/blog/blogList";
	}
	
	@RequestMapping("/add")
	public String addBlog() {
		return "/blog/newBlog";
	}
	
	@RequestMapping("/doAdd")
	public String doAdd(Blog blog) {
		if ("".equals(blog.getId())) {
			blogService.addBlog(blog);
		} else {
			blogService.editBlog(blog);
		}
		return "redirect:/blog";
	}
	
	@RequestMapping("/{id}")
	public String doQuery(@PathVariable String id, Model model) {
		Blog blog = blogService.queryById(id);
		model.addAttribute("blog", blog);
		return "/blog/blogDetail";
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteBlogById(@PathVariable int id) {
		blogService.deleteById(id);
		return "redirect:/blog";
	}
	
	@RequestMapping("/edit/{id}")
	public String edit(@PathVariable String id, Model model) {
		Blog blog = blogService.queryById(id);
		model.addAttribute("blog", blog);
		return "/blog/newBlog";
	}
	
	public void doEdit(Blog blog) {
		
	}
}
