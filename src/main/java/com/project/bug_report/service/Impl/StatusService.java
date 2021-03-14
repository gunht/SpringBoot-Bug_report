package com.project.bug_report.service.Impl;

import com.project.bug_report.entity.Status;
import com.project.bug_report.repository.IStatusRepository;
import com.project.bug_report.service.IStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatusService implements IStatusService {
    @Autowired private IStatusRepository statusRepository;

    @Override
    public List<Status> getAll() {
        return statusRepository.findAll();
    }

    @Override
    public Status getStatusById(int statusId) {
        return statusRepository.findById(statusId);
    }
}
