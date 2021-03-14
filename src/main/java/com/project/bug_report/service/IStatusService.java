package com.project.bug_report.service;

import com.project.bug_report.entity.Status;

import java.util.List;

public interface IStatusService {
    List<Status> getAll();
    Status getStatusById(int statusId);
}
