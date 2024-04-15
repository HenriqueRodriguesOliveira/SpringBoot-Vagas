package com.henrique.vagas.modules.company.repositories;

import com.henrique.vagas.modules.candidate.CandidateEntity;
import com.henrique.vagas.modules.company.entites.CompanyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface CompanyRepository extends JpaRepository<CompanyEntity, UUID> {
    Optional<CompanyEntity> findByUsernameOrEmail(String username, String email);

}
