package com.UST.interviewFeedback.mapper;

import com.UST.interviewFeedback.Entity.Interviewfeedback;
import com.UST.interviewFeedback.dto.InterviewfeedbackDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(componentModel = "spring")
public interface InterviewfeedbackMapper extends GenericMapper<Interviewfeedback, InterviewfeedbackDTO> {

    @Mapping(target = "id", ignore = false)
    Interviewfeedback asEntity(InterviewfeedbackDTO dto);
}