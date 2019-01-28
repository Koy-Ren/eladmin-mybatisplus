package me.zhengjie;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import me.zhengjie.utils.SpringContextHolder;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;

/**
 * @author jie
 * @date 2018/11/15 9:20:19
 */
@SpringBootApplication(exclude = DruidDataSourceAutoConfigure.class)
@EnableScheduling
@EnableTransactionManagement
@EnableWebSocketMessageBroker
@MapperScan({"com.hemiao100.storage.**.*.mapper"})
@ComponentScan(basePackages = {"me.zhengjie",    "com.hemiao100"})
public class AppRun {

    public static void main(String[] args) {
        SpringApplication.run(AppRun.class, args);
    }

    @Bean
    public SpringContextHolder springContextHolder() {
        return new SpringContextHolder();
    }
}
