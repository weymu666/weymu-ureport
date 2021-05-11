package com.weymu.ureport.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ReportContent {
    private Long id;

    private String fileName;

    private String content;

    private Date createTime;

    private Date updateTime;
}