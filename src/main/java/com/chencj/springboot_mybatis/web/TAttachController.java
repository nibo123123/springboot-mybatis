package com.chencj.springboot_mybatis.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chencj.springboot_mybatis.entity.TAttach;
import com.chencj.springboot_mybatis.mapper.TAttachMapper2;

@RestController 
public class TAttachController {

	@Autowired
	private TAttachMapper2 tAttachMapper2;
	
	@GetMapping("/list")
	public List<TAttach> getList(){
		return tAttachMapper2.selectAll();
	}
	
	@PostMapping("/save")
	public void save(TAttach attach){
		tAttachMapper2.insert(attach);
	}
	
	@PutMapping("/update")
	public void update(TAttach attach){
		tAttachMapper2.updateByPrimaryKey(attach);
	}
	
	@GetMapping("/One/{id}")
	public TAttach getOne(@PathVariable("id")Integer id){
		return tAttachMapper2.selectByPrimaryKey(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable("id")Integer id){
		tAttachMapper2.deleteByPrimaryKey(id);
	}
}
