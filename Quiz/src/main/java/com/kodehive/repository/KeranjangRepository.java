package com.kodehive.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.kodehive.model.KeranjangModel;

public interface KeranjangRepository extends JpaRepository<KeranjangModel, String> {

	
}