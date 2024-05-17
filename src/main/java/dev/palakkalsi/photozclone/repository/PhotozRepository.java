package dev.palakkalsi.photozclone.repository;

import org.springframework.data.repository.CrudRepository;

import dev.palakkalsi.photozclone.model.Photo;

public interface PhotozRepository extends CrudRepository<Photo,Integer>{
   
}
