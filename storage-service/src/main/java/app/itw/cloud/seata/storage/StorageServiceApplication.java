package app.itw.cloud.seata.storage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
//排除springboot的DataSource自动装配
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
//开启注册中心
@EnableDiscoveryClient
//开启FeignClients
@EnableFeignClients
@MapperScan("app.itw.cloud.seata.storage.mapper")
public class StorageServiceApplication {

  public static void main(String[] args) {
    SpringApplication.run(StorageServiceApplication.class, args);
  }

}
