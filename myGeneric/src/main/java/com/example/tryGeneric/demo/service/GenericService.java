package com.example.tryGeneric.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.tryGeneric.demo.Repo.BaseRepo;
import com.example.tryGeneric.demo.model.GenericEntity;

public abstract class GenericService<T extends GenericEntity<T>> {

//	private final BaseRepo<T> repository;
//	@Autowired
	
	
	private BaseRepo<T> repository;
	
	

    public GenericService(BaseRepo<T> repository) {
     this.repository=repository; 
    }

    public List<T> getPage(){
    	
    	return repository.findAll();
    	
    	
//        return repository.findAll(pageable);
    }

    public Page<T> getPageable(Pageable pageable){
    
    	return repository.findAll(pageable);
    }
    
    public Optional<T> get(Long id){
        return repository.findById(id);
    }

//    @Transactional
//    public T update(T updated){
//        T dbDomain = get(updated.getId());
//        dbDomain.update(updated);
//
//        return repository.save(dbDomain);
//    }
//
//    @Transactional
//    public T create(T newDomain){
//        T dbDomain = newDomain.createNewInstance();
//        return repository.save(dbDomain);
//    }
//
//    @Transactional
//    public void delete(Long id){
//        //check if object with this id exists
//        get(id);
//        repository.deleteById(id);
//    }
}

