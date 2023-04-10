package com.UST.employeedetails.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class employee {


    @Id
    @GeneratedValue
    private int id;
    private String eId;
    private String eName;
    private String eEmail;
    private String eDesignation;
    private String eManager;

    public int getId() {
        return id;
    }

    public String geteId() {
        return eId;
    }

    public String geteName() {
        return eName;
    }

    public String geteEmail() {
        return eEmail;
    }

    public String geteDesignation() {
        return eDesignation;
    }

    public String geteManager() {
        return eManager;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void seteId(String eId) {
        this.eId = eId;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public void seteEmail(String eEmail) {
        this.eEmail = eEmail;
    }

    public void seteDesignation(String eDesignation) {
        this.eDesignation = eDesignation;
    }

    public void seteManager(String eManager) {
        this.eManager = eManager;
    }


    public employee(int id, String eId, String eName, String eEmail, String eDesignation, String eManager) {
        this.id = id;
        this.eId = eId;
        this.eName = eName;
        this.eEmail = eEmail;
        this.eDesignation = eDesignation;
        this.eManager = eManager;
    }
    public employee()
    {

    }
}
