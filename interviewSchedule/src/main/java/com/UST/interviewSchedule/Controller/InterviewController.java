package com.UST.interviewSchedule.Controller;

import com.UST.interviewSchedule.Model.Interview;
import com.UST.interviewSchedule.Services.InterviewServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/interview")
public class InterviewController {
    @Autowired
    private InterviewServices interviewServices;

    @PostMapping("/post")
    public Interview save(@RequestBody Interview inte)
    {
       return interviewServices.save(inte);
    }

    @GetMapping("/get")
    public List<Interview> find()
    {
        return interviewServices.find();
    }

    @GetMapping("/getbyid/{id}")
    public Interview findById(@PathVariable int id)
    {
        return interviewServices.findById(id);
    }

    @GetMapping("/get/{email}")
    public Interview findByEmail(@PathVariable String  email)
    {
        return interviewServices.findByemail(email);
    }

    @DeleteMapping("/del/{email}")
    public String deleteByEmail(@PathVariable String email)
    {
        return interviewServices.deleteByemail(email);
    }

}
