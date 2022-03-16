package com.clara.apipostgresqldocker.Controller;

import com.clara.apipostgresqldocker.Model.Employee;
import com.clara.apipostgresqldocker.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeRepository repository;

    @PostMapping("/employees")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
        return ResponseEntity.ok(repository.save(employee));
    }

    @GetMapping("/employees")
    public ResponseEntity<List<Employee>> getEmployees() {
        return ResponseEntity.ok(repository.findAll());
    }

    @GetMapping("/employees/{id}")
    public ResponseEntity<Optional<Employee>> getEmployee(@PathVariable(value = "id") Integer id) {
        return ResponseEntity.ok(repository.findById(id));
    }

    @DeleteMapping("/employees/{id}")
    public void deleteEmployee(@PathVariable(value = "id") Integer id){
        repository.deleteById(id);
    }

}
