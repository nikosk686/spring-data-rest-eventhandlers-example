package com.example.resteventhandler;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "entityTwo", path = "entityTwo")
public interface EntityTwoRepository extends CrudRepository<EntityTwo, Long> {
}
