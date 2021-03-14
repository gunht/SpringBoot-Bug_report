package com.example.bug_report.service;

import com.example.bug_report.entity.Role;

import java.util.List;

public interface IRoleService {
    List<Role> findRoleById(long id);
    List<Role> getAll();
}
