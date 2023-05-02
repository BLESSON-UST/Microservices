package com.UST.stateDistrictMapping.Controller;

import com.UST.stateDistrictMapping.Model.District;
import com.UST.stateDistrictMapping.Services.DistServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dist")
public class DistController {
    @Autowired
    private DistServices distServices;
    @GetMapping("/get/{state}")
    public List<District> getbystate(@PathVariable String State){
        return distServices.getbyState(State);

    }


}
