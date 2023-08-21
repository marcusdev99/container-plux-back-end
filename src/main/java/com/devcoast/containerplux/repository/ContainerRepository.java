package com.devcoast.containerplux.repository;

import com.devcoast.containerplux.model.Container;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContainerRepository extends JpaRepository<Container,Long> {
}
