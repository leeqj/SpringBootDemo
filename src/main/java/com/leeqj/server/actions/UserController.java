package com.leeqj.server.actions;

import com.leeqj.server.entitys.User;
import com.leeqj.server.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>User: Zhang Kaitao
 * <p>Date: 13-12-22
 * <p>Version: 1.0
 */
@EnableAutoConfiguration
@RestController
@RequestMapping("/user")
public class UserController {

//    @RequestMapping(method= RequestMethod.GET)
//    def get(Long id) {
//        id ? repository.findOne(id) : repository.findAll()
//    }
    @Autowired
UserRepository userRepository;

    @RequestMapping("/id/{id}")
    private User id(@PathVariable("id") Long id) {
        return userRepository.findOne(id);
    }

    @RequestMapping("/all")
    private List<User> all() {
        return (List<User>) userRepository.findAll();
    }
}