package com.project.bug_report.model.request;

import com.project.bug_report.entity.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CreatePostReq {
    private String title;
    private String content;
    private Status status;

    private String image1;
    private String image2;
    private String image3;

    private String prImage1;
    private String prImage2;
    private String prImage3;
}
