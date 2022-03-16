package com.clara.apipostgresqldocker.Repository;

import com.clara.apipostgresqldocker.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
