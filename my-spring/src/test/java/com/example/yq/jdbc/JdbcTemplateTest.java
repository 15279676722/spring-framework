package com.example.yq.jdbc;

import org.apache.commons.dbcp.BasicDataSource;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceUtils;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class JdbcTemplateTest {

	private static JdbcTemplate jdbcTemplate;
	@BeforeAll
	public static void before() {
		FileInputStream inStream = null;

		try {
			inStream = new FileInputStream("/Users/yangqiang/Desktop/study/spring-framework/my-spring/src/main/resources/dbutil.properties");
			Properties prop = new Properties();
			prop.load(inStream);
			BasicDataSource dataSource = new BasicDataSource();
			dataSource.setDriverClassName(prop.getProperty("driver"));
			dataSource.setUrl(prop.getProperty("url"));
			dataSource.setUsername(prop.getProperty("userName"));
			dataSource.setPassword(prop.getProperty("password"));
			jdbcTemplate = new JdbcTemplate(dataSource);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testJdbcTemplate() {
		jdbcTemplate.update("update account set balance=balance-? where id=?",500,1);
	}
}
