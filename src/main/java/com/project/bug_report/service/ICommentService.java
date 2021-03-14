package com.project.bug_report.service;

import com.project.bug_report.entity.Comment;
import com.project.bug_report.entity.Post;
import com.project.bug_report.entity.User;
import com.project.bug_report.model.request.CreateCommentReq;

import java.util.List;

public interface ICommentService {
    List<Comment> getCommentsByPost(long id);
    Comment saveComment(CreateCommentReq req, Post post, User user);
}
