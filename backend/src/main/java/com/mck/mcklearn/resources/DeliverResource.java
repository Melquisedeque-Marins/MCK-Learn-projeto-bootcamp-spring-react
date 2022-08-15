package com.mck.mcklearn.resources;

import com.mck.mcklearn.dto.DeliverRevisionDTO;
import com.mck.mcklearn.dto.UserDTO;
import com.mck.mcklearn.services.DeliverService;
import com.mck.mcklearn.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/deliveries")
public class DeliverResource {

    @Autowired
    private DeliverService service;

    @PreAuthorize("hasAnyRoles('ADMIN','INSTRUCTOR')")
    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@PathVariable Long id, @RequestBody DeliverRevisionDTO dto){
        service.saveRevision(id, dto);
        return ResponseEntity.noContent().build();
    }
}
