package com.weymu;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动程序
 *
 * @author weymu
 */
@MapperScan("com.weymu.**.mapper") // Mapper扫描
@SpringBootApplication
public class Application {
  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
    LoggerFactory.getLogger(Application.class).info(">>>>>>  The service started successfully.  >>>>>>  服务启动成功！");
  }
}
