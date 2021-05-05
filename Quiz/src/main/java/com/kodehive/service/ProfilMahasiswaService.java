package com.kodehive.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kodehive.model.ProfilMahasiswaModel;
import com.kodehive.repository.ProfilMahasiswaRepository;

@Service
@Transactional
public class ProfilMahasiswaService {

	@Autowired
	ProfilMahasiswaRepository profilMahasiswaRepository;

	public void save(ProfilMahasiswaModel profilMahasiswaModel) {
		profilMahasiswaRepository.save(profilMahasiswaModel);
	}

	public List<ProfilMahasiswaModel> readAll() {
		return profilMahasiswaRepository.findAll();
	}
	
}
