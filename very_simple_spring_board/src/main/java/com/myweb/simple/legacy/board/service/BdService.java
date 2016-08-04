package com.myweb.simple.legacy.board.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.myweb.simple.legacy.board.dao.BdDao;
import com.myweb.simple.legacy.board.dto.BdDto;

public class BdService {

	BdDao dao = null;
	
	public void executeList(Model model) {
		
		Map<String, Object> map = model.asMap();
		HttpServletRequest request =  (HttpServletRequest)map.get("request");
		
		dao = new BdDao();
		
		List<BdDto> dtolist =  dao.getList();
		
		model.addAttribute("list", dtolist);
	}
}
