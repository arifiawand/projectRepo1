package com.kodehive.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.kodehive.model.SayurModel;

public interface SayurRepository extends JpaRepository<SayurModel, String> {

	
}