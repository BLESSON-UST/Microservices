package com.UST.stateDistrictMapping.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "distDetails")
public class District {

    private String District;
    private String State;

    public District(String District, String State) {

        this.District = District;
        this.State = State;
    }

    public District() {
    }

    public String getDistrict() {
        return District;
    }

    public String getState() {
        return State;
    }
}
