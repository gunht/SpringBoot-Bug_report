package com.project.bug_report.service;

import com.project.bug_report.entity.Role;
import com.project.bug_report.entity.User;
import com.project.bug_report.model.request.CreateUserReq;
import org.springframework.data.domain.Page;

import java.util.List;

public interface IUserService {
    Page<User> getAllUser(int page);
    User findUserById(long id);
    User createUser(CreateUserReq req, List<Role> roles);
    User save(User user);
}
