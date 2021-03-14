package com.project.bug_report.model.request;

import com.project.bug_report.entity.Post;
import com.project.bug_report.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CreateCommentReq {
    private String content;

    private Post post;

    private User commenter;
}
