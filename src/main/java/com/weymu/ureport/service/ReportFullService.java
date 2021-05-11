package com.weymu.ureport.service;

import com.weymu.ureport.mapper.ReportContentMapper;
import com.weymu.ureport.domain.ReportContent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author weymu
 * @date 2019-04-25
 **/
@Slf4j
@Service
public class ReportFullService {

    @Autowired
    private ReportContentMapper mapper;

    public ReportContent findByFileName(String fileName) {
        return mapper.findByFileName(fileName);
    }

    public ReportContent findById(Long id) {
        return mapper.selectByPrimaryKey(id);
    }

    public void save(String fileName, String content) {
        if (isExisted(fileName)) {
            update(fileName, content);
        } else {
            ReportContent reportContent = assembleReportContent(fileName, content);
            mapper.insertSelective(reportContent);
        }
    }

    public void update(String fileName, String content) {
        mapper.updateContentByFileName(fileName, content);
    }

    public boolean deleteByFileName(String fileName) {
        return mapper.deleteByFileName(fileName) > 0;
    }

    public boolean deleteById(Long id) {
        return mapper.deleteByPrimaryKey(id) > 0;
    }

    public List<ReportContent> findAll() {
        List<ReportContent> all = mapper.findAll();
        if (all == null) {
            return new ArrayList<>();
        }

        return all;
    }

    private boolean isExisted(String fileName) {
        return findByFileName(fileName) != null;
    }

    private ReportContent assembleReportContent(String fileName, String content) {
        ReportContent reportContent = new ReportContent();
        reportContent.setFileName(fileName);
        reportContent.setContent(content);
        return reportContent;
    }
}
