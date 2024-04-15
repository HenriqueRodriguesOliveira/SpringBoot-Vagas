package com.henrique.vagas.modules.company.useCases;

import com.henrique.vagas.modules.company.entites.JobEntity;
import com.henrique.vagas.modules.company.repositories.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateJobUseCase {

    @Autowired
    private JobRepository jobRepository;

    public JobEntity execute(JobEntity jobEntity) {
      return this.jobRepository.save(jobEntity);
    }
}
