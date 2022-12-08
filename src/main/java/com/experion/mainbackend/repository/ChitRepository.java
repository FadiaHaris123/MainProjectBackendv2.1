package com.experion.mainbackend.repository;

import com.experion.mainbackend.entity.Chitty;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "chitty",path = "chitty")
public interface ChitRepository extends JpaRepository<Chitty,Long> {
    Page<Chitty> findBychitNumber(@Param("chitno") Long chitNumber, Pageable pageable);
//    Page<Chitty> findByNameContaining(@Param("name") String name, Pageable pageable);
}
