package com.kodehive.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.kodehive.model.MahasiswaModel;

public interface MahasiswaRepository extends JpaRepository<MahasiswaModel, String> {

	@Query("Select P from MahasiswaModel P where kdMahasiswa = ?1")
	MahasiswaModel cariKodeMhs(String kode);
}