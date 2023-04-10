package com.UST.employeedetails.Controller;

import com.UST.employeedetails.Model.employee;
import com.UST.employeedetails.Services.employeeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class employeeController {
    @Autowired
    private employeeServices employeeservices;
    @PostMapping("/post")
    public employee insert(@RequestBody employee emp)
    {
        return employeeservices.insert(emp);
    }
    @GetMapping("/get")
    public List<employee> getall()
    {
        return employeeservices.getallemp();
    }

    @GetMapping("/get/{eid}")
    public employee getbyId(@PathVariable String eid)
    {
        return employeeservices.getbiId(eid);
    }

    @DeleteMapping("/del/{eid}")
    public employee deletebyId(@PathVariable String eid)
    {


        return employeeservices.deletebyeid(eid);
    }


}
