package com.oraclejava.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

    private Integer employeeId;
    private String employeeName;

    @Autowired(required = false)
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
