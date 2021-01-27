package com.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Vaccines;
import com.app.repository.VaccineRepository;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class VaccinesController {
@Autowired
private VaccineRepository vaccineRepository;

		@GetMapping("/vaccines")
		public ResponseEntity<List<Vaccines>> getAllBranches() {
			try {
				List<Vaccines> vaccines = new ArrayList<Vaccines>();
				vaccineRepository.findAll().forEach(vaccines::add);
				if (vaccines.isEmpty()) {
					return new ResponseEntity<>(HttpStatus.NO_CONTENT);
				}
				return new ResponseEntity<>(vaccines, HttpStatus.OK);
			} catch (Exception e) {
				return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
		
		@PostMapping("/vaccines")
		public ResponseEntity<Vaccines> createBranch(@RequestBody Vaccines vaccines) {
			try {
				vaccineRepository.save(vaccines);
				return new ResponseEntity<>(vaccines, HttpStatus.CREATED);
			} catch (Exception e) {
				return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
	}

