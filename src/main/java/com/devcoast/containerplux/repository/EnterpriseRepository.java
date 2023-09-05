package com.devcoast.containerplux.repository;

import com.devcoast.containerplux.model.Enterprise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnterpriseRepository extends JpaRepository<Enterprise,Long> {
}
