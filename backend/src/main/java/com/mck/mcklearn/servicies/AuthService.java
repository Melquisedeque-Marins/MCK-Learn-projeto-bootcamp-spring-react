package com.mck.mcklearn.servicies;

import com.mck.mcklearn.entities.User;
import com.mck.mcklearn.repositories.UserRepository;
import com.mck.mcklearn.servicies.exceptions.ForbiddenException;
import com.mck.mcklearn.servicies.exceptions.UnauthorizedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.security.Security;
import java.util.Optional;

@Service
public class AuthService {

    @Autowired
    private UserRepository repository;

    @Transactional(readOnly = true)
    public User authenticated() {
        try {
            String username = SecurityContextHolder.getContext().getAuthentication().getName();
            return repository.findByEmail(username);
        } catch (Exception e){
            throw new UnauthorizedException("Invalid user");
        }
    }

    public void validateSelfOrAdmin(Long userId){
        var user = authenticated();

        if (!user.getId().equals(userId) && !user.hasRole("ROLE_ADMIN")) {
        throw new ForbiddenException("Access denied");
        }
    }
}
