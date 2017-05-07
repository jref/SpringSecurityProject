package com.ua.codespace.service;


import com.ua.codespace.model.User;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface UserService {
    List<User> getUserFriends(Long id);

    @CachePut("users")
    User save(User user, MultipartFile image);

//    @Cacheable("users")
    User get(Long id);
}
