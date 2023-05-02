package com.UST.interviewSchedule.Services;

import com.UST.interviewSchedule.Model.Interview;
import com.UST.interviewSchedule.Repository.InterviewRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InterviewServices {
    @Autowired
    private InterviewRepo repo;

    public Interview save(Interview inte) {
        return repo.save(inte);
    }

    public List<Interview> find() {
        return repo.findAll();
    }

    public Interview findById(int id) {
        return repo.findById(id).orElse(null);
    }

    public Interview findByemail(String email) {
        return repo.findByemail(email);
    }

    public String deleteByemail(String email) {
        repo.deleteByemail(email);
        return "The data is deleted";
    }
}
