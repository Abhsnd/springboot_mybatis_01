package com.kaung;

import com.kaung.service.DepartmentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootDruidApplicationTests {
    @Autowired
    private DepartmentService departmentService;

    @Test
    public void testSelect() {
//        System.out.println(departmentService.getDepartmentList());
        System.out.println(departmentService.getDepartmentById(101));
    }
//    @Autowired
//    private DataSource dataSource;
//
//    @Test
//    void contextLoads() throws SQLException {
//        System.out.println("dataSource = " + dataSource.getClass());
//        Connection connection = dataSource.getConnection();
//        System.out.println("connection = " + connection);
//
//        DruidDataSource druidDataSource = (DruidDataSource) dataSource;
//        System.out.println("druidDataSource 数据源最大连接数：" + druidDataSource.getMaxActive());
//        System.out.println("druidDataSource 数据源初始化连接数：" + druidDataSource.getInitialSize());
//
//        connection.close();
//    }

}
