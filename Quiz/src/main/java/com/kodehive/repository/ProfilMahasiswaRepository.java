package com.kodehive.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.kodehive.model.MahasiswaModel;
import com.kodehive.model.ProfilMahasiswaModel;

public interface ProfilMahasiswaRepository extends JpaRepository<ProfilMahasiswaModel, Integer> {

	@Query("Select P from MahasiswaModel P where kdMahasiswa = ?1")
	MahasiswaModel cariKodeMhs(String kode);
}