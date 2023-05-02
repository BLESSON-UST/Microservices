package com.UST.stateDistrictMapping.Services;

import com.UST.stateDistrictMapping.Model.District;
import com.UST.stateDistrictMapping.Repository.DistRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistServices {
    @Autowired
    private DistRepo repo;

    public List<District> getbyState(String state) {
        return repo.finddistbystate(State);
    }
}
