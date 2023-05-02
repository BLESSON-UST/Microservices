package com.UST.interviewSchedule.Repository;

import com.UST.interviewSchedule.Model.Interview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterviewRepo extends JpaRepository<Interview, Integer> {
    Interview findByemail(String email);

    void deleteByemail(java.lang.String email);
}
