package com.fahamutech.shutabackend.repo;

import com.fahamutech.shutabackend.entity.AuthenticationEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(path = "user", collectionResourceRel = "user")
public interface UserRepo extends CrudRepository<AuthenticationEntity, Integer> {
    List<AuthenticationEntity> findAllByUserInformationByUserInformationId(@Param("id") String id);
}
