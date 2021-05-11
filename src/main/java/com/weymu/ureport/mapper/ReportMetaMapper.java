package com.weymu.ureport.mapper;

import com.weymu.ureport.domain.ReportMeta;

public interface ReportMetaMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ReportMeta record);

    int insertSelective(ReportMeta record);

    ReportMeta selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ReportMeta record);

    int updateByPrimaryKey(ReportMeta record);

    int deleteByPath(String path);

    ReportMeta selectByPath(String path);
}