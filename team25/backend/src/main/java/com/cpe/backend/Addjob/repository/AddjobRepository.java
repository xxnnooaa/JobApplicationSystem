package com.cpe.backend.Addjob.repository;

import com.cpe.backend.Addjob.entity.Addjob;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:8080")
@RepositoryRestResource
public
interface AddjobRepository extends JpaRepository<Addjob, Long> {
            Addjob findById(long id);
}