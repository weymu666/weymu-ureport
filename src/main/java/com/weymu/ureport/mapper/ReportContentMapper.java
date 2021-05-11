package com.weymu.ureport.mapper;

import com.weymu.ureport.domain.ReportContent;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ReportContentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ReportContent record);

    int insertSelective(ReportContent record);

    ReportContent selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ReportContent record);

    int updateByPrimaryKey(ReportContent record);

    ReportContent findByFileName(String fileName);

    int deleteByFileName(String fileName);

    List<ReportContent> findAll();

    int updateContentByFileName(@Param("fileName") String fileName,
                                @Param("content") String content);
}