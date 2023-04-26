package com.graphql.project.controller;

import com.graphql.project.entity.Employee;
import com.graphql.project.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class GraphqlController {

    @Autowired
    private EmployeeRepository repository;

    @QueryMapping
    Iterable<Employee> employee(){
        return repository.findAll();
    }

}
