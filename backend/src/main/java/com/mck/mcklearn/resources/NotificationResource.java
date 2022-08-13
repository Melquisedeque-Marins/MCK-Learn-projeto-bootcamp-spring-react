package com.mck.mcklearn.resources;

import com.mck.mcklearn.dto.NotificationDTO;
import com.mck.mcklearn.services.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notifications")
public class NotificationResource {

    @Autowired
    private NotificationService service;

    @GetMapping
    public ResponseEntity<Page<NotificationDTO>> findById(Pageable pageable){
        Page<NotificationDTO> NotificationDTO = service.notificationsForCurrentUser(pageable);
        return ResponseEntity.ok().body(NotificationDTO);

    }
}
