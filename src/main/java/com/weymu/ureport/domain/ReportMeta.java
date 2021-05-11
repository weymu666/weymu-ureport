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
public class ReportMeta {
    private Long id;

    private String path;

    private Date createTime;

    private Date updateTime;
}