package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Vaccines;

public interface VaccineRepository extends JpaRepository<Vaccines, Long>{

}
