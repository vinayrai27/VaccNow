package com.app.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Branches;
import com.app.repository.BranchRepository;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class BranchController {
@Autowired
private BranchRepository branchRepository;

		@GetMapping("/branches")
		public ResponseEntity<List<Branches>> getAllBranches() {
			try {
				List<Branches> barnches = new ArrayList<Branches>();
				branchRepository.findAll().forEach(barnches::add);
				if (barnches.isEmpty()) {
					return new ResponseEntity<>(HttpStatus.NO_CONTENT);
				}
				return new ResponseEntity<>(barnches, HttpStatus.OK);
			} catch (Exception e) {
				return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
		
		@PostMapping("/branches")
		public ResponseEntity<Branches> createBranch(@RequestBody Branches branch) {
			try {
				branchRepository.save(branch);
				return new ResponseEntity<>(branch, HttpStatus.CREATED);
			} catch (Exception e) {
				return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
		
		@GetMapping("/availableDateTime/{branchId}")
		public ResponseEntity<Branches> getAvailableDateTime(@PathVariable("branchId") long branchId) {
		Optional<Branches> branch = branchRepository.findById(branchId);

			if (branch.isPresent()) {
				return new ResponseEntity<>(branch.get(), HttpStatus.OK);
			} else {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
		}
	}

