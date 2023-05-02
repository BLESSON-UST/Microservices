package com.UST.interviewSchedule.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Time;
import java.util.Date;

@Entity
public class Interview {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String email;
    private String phonenum;
    private String skills;
    private int experience;
    private Date date;
    private Time time;
    private String link;
    private  String poc;

    public Interview(int id, String name, String email, String phonenum, String skills, int experience, Date date, Time time, String link, String poc) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phonenum = phonenum;
        this.skills = skills;
        this.experience = experience;
        this.date = date;
        this.time = time;
        this.link = link;
        this.poc = poc;
    }

    public Interview() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getPoc() {
        return poc;
    }

    public void setPoc(String poc) {
        this.poc = poc;
    }
}
