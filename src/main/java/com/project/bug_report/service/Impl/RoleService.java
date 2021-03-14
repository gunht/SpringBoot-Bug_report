package com.project.bug_report.service.Impl;

import com.project.bug_report.entity.Role;
import com.project.bug_report.repository.IRoleRepository;
import com.project.bug_report.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService implements IRoleService {
    @Autowired private IRoleRepository roleRepository;

    @Override
    public List<Role> findRoleById(long id) {
        return roleRepository.findById(id);
    }

    @Override
    public List<Role> getAll() {
        return roleRepository.findAll();
    }
}
