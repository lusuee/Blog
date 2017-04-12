package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	public String doAdd(String title, String content) {
		Blog blog = new Blog();
		blog.setTitle(title);
		blog.setContent(content);
		blogService.addBlog(blog);
		return "redirect:/blog";
	}
}
