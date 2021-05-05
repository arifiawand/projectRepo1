package com.kodehive.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kodehive.model.SayurModel;
import com.kodehive.repository.SayurRepository;

@Service
@Transactional
public class SayurService {

	@Autowired
	SayurRepository sayurRepository;

	public void save(SayurModel sayurModel) {
		sayurRepository.save(sayurModel);
	}

	public List<SayurModel> readAll() {
		return sayurRepository.findAll();
	}
	
}
