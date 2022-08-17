package com.mck.mcklearn.resources;

import com.mck.mcklearn.dto.NotificationDTO;
import com.mck.mcklearn.services.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notifications")
public class NotificationResource {

    @Autowired
    private NotificationService service;

    @GetMapping
    public ResponseEntity<Page<NotificationDTO>> notificationsForCurrentUser(
            @RequestParam(name = "unreadOnly", defaultValue = "false") Boolean unreadOnly,
            Pageable pageable) {
        Page<NotificationDTO> page = service.notificationsForCurrentUser(unreadOnly, pageable);
        return ResponseEntity.ok().body(page);

    }
}
