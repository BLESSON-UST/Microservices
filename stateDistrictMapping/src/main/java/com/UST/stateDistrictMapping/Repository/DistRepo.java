package com.UST.stateDistrictMapping.Repository;

import com.UST.stateDistrictMapping.Model.District;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DistRepo extends JpaRepository<District,String> {
}
