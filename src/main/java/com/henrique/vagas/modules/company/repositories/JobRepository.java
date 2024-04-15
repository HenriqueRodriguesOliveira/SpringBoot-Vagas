package com.henrique.vagas.modules.company.repositories;

import com.henrique.vagas.modules.company.entites.JobEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface JobRepository extends JpaRepository<JobEntity, UUID> {

}
