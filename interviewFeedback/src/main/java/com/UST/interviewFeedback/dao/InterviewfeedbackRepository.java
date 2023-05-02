package com.UST.interviewFeedback.dao;

import com.UST.interviewFeedback.Entity.Interviewfeedback;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterviewfeedbackRepository extends PagingAndSortingRepository<Interviewfeedback, Long> {
}