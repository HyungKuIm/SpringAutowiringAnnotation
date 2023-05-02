package com.oraclejava.client;

import com.oraclejava.model.Employee;
import com.oraclejava.model.JuminCard;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Employee employee = context.getBean("employee", Employee.class);

        System.out.println(employee.getEmployeeId() + "\t" + employee.getEmployeeName());

        JuminCard juminCard = employee.getJuminCard();

        if (juminCard != null) {
            System.out.println(juminCard.getJuminNo() + "\t" + juminCard.getJuminName());
        } else {
            System.out.println("주민 카드 없음.");
        }

        ((AbstractApplicationContext)context).close();
    }
}
