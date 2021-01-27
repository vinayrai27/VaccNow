package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Branches;

public interface BranchRepository extends JpaRepository<Branches, Long>{

}
