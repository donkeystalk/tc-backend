package dardo.backbone.repo;

import org.springframework.data.repository.CrudRepository;

import dardo.backbone.model.Patch;

public interface PatchRepo extends CrudRepository<Patch, Long> {
	
}
