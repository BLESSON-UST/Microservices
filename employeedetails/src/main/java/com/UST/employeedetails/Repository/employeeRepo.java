package com.UST.employeedetails.Repository;

import com.UST.employeedetails.Model.employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface employeeRepo extends JpaRepository<employee, Integer> {
    employee findByeId(String eId);

    employee deleteByeId(String eId);
}
