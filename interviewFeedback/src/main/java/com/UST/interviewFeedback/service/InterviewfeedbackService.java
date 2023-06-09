package com.UST.interviewFeedback.service;

import com.UST.interviewFeedback.Entity.Interviewfeedback;

import java.util.Optional;

public interface InterviewfeedbackService extends GenericService<Interviewfeedback, Long> {
    void deleteById(long id);

    Optional<Interviewfeedback> findById(long id);
}