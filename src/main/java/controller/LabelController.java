package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import entity.Label;
import service.LabelService;

@Controller
@RequestMapping("/label")
public class LabelController {

	@Autowired
	private LabelService labelService;

	@RequestMapping
	@ResponseBody
	public List<Label> queryLabel() {
		return labelService.queryLabel(); 
	}
	
	@RequestMapping("list")
	public String labelList(Model model) {
		model.addAttribute("labelList", labelService.queryLabel());
		return "/label/labelList";
	}
}
