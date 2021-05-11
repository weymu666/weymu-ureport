package com.weymu.ureport.service;

import com.weymu.ureport.mapper.ReportMetaMapper;
import com.weymu.ureport.domain.ReportMeta;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author weymu
 * @date 2019-04-24
 **/
@Slf4j
@Service
public class ReportService {

    @Autowired
    private ReportMetaMapper mapper;

    public void save(String path) {
        log.info("save path: {}", path);
        if (isExisted(path)) {
            return;
        }

        ReportMeta reportMeta = new ReportMeta();
        reportMeta.setPath(path);
        reportMeta.setCreateTime(new Date());
        mapper.insertSelective(reportMeta);
    }

    public void delete(String path) {
        log.info("delete path: {}", path);
        mapper.deleteByPath(path);
    }

    private boolean isExisted(String path) {
        return mapper.selectByPath(path) != null;
    }
}
