package com.kodehive.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kodehive.model.MahasiswaModel;
import com.kodehive.repository.MahasiswaRepository;

@Service
@Transactional
public class MahasiswaService {

	@Autowired
	MahasiswaRepository mahasiswaRepository;

	public void save(MahasiswaModel mahasiswaModel) {
		mahasiswaRepository.save(mahasiswaModel);
	}

	public List<MahasiswaModel> readAll() {
		return mahasiswaRepository.findAll();
	}
	
	public MahasiswaModel cariPrimaryKey(String kode) {
		return mahasiswaRepository.cariKodeMhs(kode);
	}
}
