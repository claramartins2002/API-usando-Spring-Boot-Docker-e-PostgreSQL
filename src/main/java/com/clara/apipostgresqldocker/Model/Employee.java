package com.clara.apipostgresqldocker.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static javax.persistence.GenerationType.IDENTITY;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee extends EmployeeAudit{
    @Id @GeneratedValue(strategy = IDENTITY)
    private int id;
    private String name;

}
