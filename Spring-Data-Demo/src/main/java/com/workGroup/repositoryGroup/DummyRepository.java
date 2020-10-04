package com.workGroup.repositoryGroup;

import org.springframework.data.repository.CrudRepository;

import com.workGroup.entityGroup.Dummy;

public interface DummyRepository extends CrudRepository<Dummy, Integer> {

	// custom CRUD method
	public Iterable<Dummy> findAllByName(String name);

}
