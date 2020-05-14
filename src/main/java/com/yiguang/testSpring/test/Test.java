package com.yiguang.testSpring.test;

import java.io.InputStream;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jndi.support.SimpleJndiBeanFactory;

import com.yiguang.testSpring.pojo.Student;

public class Test {
	public static void main(String[] args) {
		ApplicationContext application=new ClassPathXmlApplicationContext("spring.xml");
		Student student=(Student) application.getBean("student1",Student.class);
		student.setId(1);
		student.setName("yiguang");
		student.setSex("女");
		System.out.println(student.getId()+"--"+student.getName());
				
	}
}
