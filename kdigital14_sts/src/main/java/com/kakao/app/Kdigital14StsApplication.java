package com.kakao.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import mybatis.EmpDAO;
import mybatis.EmpMybatisController;

@SpringBootApplication


@ComponentScan(basePackageClasses = JenkinsController.class)
@ComponentScan(basePackageClasses = EmpMybatisController.class)
@ComponentScan(basePackageClasses = PropertiesController.class)
@ComponentScan

@MapperScan(basePackageClasses = EmpDAO.class)
public class Kdigital14StsApplication {

	public static void main(String[] args) {
		SpringApplication.run(Kdigital14StsApplication.class, args);
		System.out.println("작동중");
	}

}
