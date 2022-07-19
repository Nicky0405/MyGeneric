package com.example.tryGeneric.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.example.tryGeneric.demo.model.GenericEntity;

@NoRepositoryBean
public interface BaseRepo<T extends GenericEntity<T>> extends JpaRepository<T, Long> {

}
