package com.example.resteventhandler;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "entityOne", path = "entityOne")
public interface EntityOneRepository extends CrudRepository<EntityOne, Long> {
}
