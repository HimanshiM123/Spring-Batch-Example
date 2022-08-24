package com.bridgelabz.springbatch.repository;

import com.bridgelabz.springbatch.entity.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateRepository extends JpaRepository<Candidate, Long> {
}
