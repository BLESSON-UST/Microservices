package com.UST.employeedetails.Services;

import com.UST.employeedetails.Model.employee;
import com.UST.employeedetails.Repository.employeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class employeeServices {
    @Autowired
    private employeeRepo repo;

    public employee insert(employee emp) {
       return repo.save(emp);
    }

    public List<employee> getallemp() {
        return repo.findAll();
    }


    public employee getbiId(String eId) {
        return repo.findByeId(eId);
    }



    public employee deletebyeid(String eId) {

        return  repo.deleteByeId(eId);

    }
}
