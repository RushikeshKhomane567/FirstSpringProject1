package com.ethdc.FirstProject.Repository;

import com.ethdc.FirstProject.Entity.InstituteMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface InstituteMasteRepository extends CrudRepository<InstituteMaster,Integer> {
    List<InstituteMaster> findAlls();
}
