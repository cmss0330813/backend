package com.StoryPick.backend.service.util;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;

public interface AuthService {
    
    Member findByLoginId(String LoginId) throws NotFoundException;
}
