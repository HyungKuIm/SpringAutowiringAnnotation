package com.oraclejava.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class JuminCard {

    @Value("760101-1234567")
    private String juminNo;

    @Value("신머피")
    private String juminName;

    public String getJuminNo() {
        return juminNo;
    }

    public void setJuminNo(String juminNo) {
        this.juminNo = juminNo;
    }

    public String getJuminName() {
        return juminName;
    }

    public void setJuminName(String juminName) {
        this.juminName = juminName;
    }
}
