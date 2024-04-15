package com.henrique.vagas.modules.company.useCases;

import com.henrique.vagas.exceptions.UserFoundException;
import com.henrique.vagas.modules.company.entites.CompanyEntity;
import com.henrique.vagas.modules.company.repositories.CompanyRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateCompanyUseCase {

    @Autowired
    private CompanyRepository companyRepository;

    public CompanyEntity execute(CompanyEntity companyEntity) {

        this.companyRepository
                .findByUsernameOrEmail(companyEntity.getUsername(), companyEntity.getEmail())
                .ifPresent((user) -> {
                    throw new UserFoundException();
        });

        return this.companyRepository.save(companyEntity);
    }
}
