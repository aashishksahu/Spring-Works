package com.workGroup.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.workGroup.entityGroup.Dummy;
import com.workGroup.repositoryGroup.DummyRepository;

@Controller
@RequestMapping("/demo")
public class MainController {
	@Autowired
	private DummyRepository usersRepo;

	@GetMapping(path = "/all")
	public @ResponseBody Iterable<Dummy> getAllUsers() {
		return usersRepo.findAll();
	}

	@GetMapping(path = "/count")
	public @ResponseBody long getTotalCount() {
		return usersRepo.count();
	}

	@GetMapping(path = "/searchByName")
	public @ResponseBody Iterable<Dummy> searchByName(@RequestParam("name") String name) {
		return usersRepo.findAllByName(name);
	}
}
