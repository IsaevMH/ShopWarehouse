package ru.testproject.shopwarehouse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import ru.testproject.shopwarehouse.utils.DataBaseCheckerUtil;

import javax.sql.DataSource;

@SpringBootApplication
public class ShopWarehouseApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ShopWarehouseApplication.class, args);
        DataSource dataSource = context.getBean(javax.sql.DataSource.class);
        DataBaseCheckerUtil.connectionDataBase(dataSource);
    }

}
