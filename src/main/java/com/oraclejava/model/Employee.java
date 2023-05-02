package com.oraclejava.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {

    @Value("133313")
    private Integer employeeId;

    @Value("Sean Murphy")
    private String employeeName;

    @Autowired
    private JuminCard juminCard;

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public JuminCard getJuminCard() {
        return juminCard;
    }

    public void setJuminCard(JuminCard juminCard) {
        this.juminCard = juminCard;
    }
}
