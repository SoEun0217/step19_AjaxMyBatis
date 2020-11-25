package kosta.mvc.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kosta.mvc.model.repository.SuggestDao;

@Service
public class SuggestServiceImpl implements SuggestService {
	
	@Autowired
	private SuggestDao suggestDao;

	@Override
	public List<String> suggest(String keyWord) {
		return suggestDao.suggestSelect(keyWord);
	}

}
