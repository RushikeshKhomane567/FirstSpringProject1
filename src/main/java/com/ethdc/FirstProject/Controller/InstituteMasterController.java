package com.ethdc.FirstProject.Controller;

import com.ethdc.FirstProject.Entity.InstituteMaster;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InstituteMasterController {


    @GetMapping("/institutes")
    public ResponseEntity<List<InstituteMaster>> findAll(){
        List<InstituteMaster> i=
        return ResponseEntity.ok("get all institutes");
    }




}
