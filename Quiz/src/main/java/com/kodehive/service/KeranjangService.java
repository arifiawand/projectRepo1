package com.kodehive.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kodehive.model.KeranjangModel;
import com.kodehive.repository.KeranjangRepository;

@Service
@Transactional
public class KeranjangService {

	@Autowired
	KeranjangRepository keranjangRepository;

	public void save(KeranjangModel keranjangModel) {
		keranjangRepository.save(keranjangModel);
	}

	public List<KeranjangModel> readAll() {
		return keranjangRepository.findAll();
	}
	
}
