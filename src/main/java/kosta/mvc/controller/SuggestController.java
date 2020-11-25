package kosta.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import kosta.mvc.model.service.SuggestService;

@RestController
public class SuggestController {
	
	@Autowired
	private SuggestService suggestService;
	
	@PostMapping("/suggest")
	public List<String> suggest(String keyWord){
		return suggestService.suggest(keyWord);
	}
}
