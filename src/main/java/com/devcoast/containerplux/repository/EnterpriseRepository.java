package com.devcoast.containerplux.repository;

import com.devcoast.containerplux.model.Enterprise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnterpriseRepository extends JpaRepository<Enterprise,Long> {
}
