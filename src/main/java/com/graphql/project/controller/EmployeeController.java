package com.graphql.project.controller;

import com.graphql.project.entity.Employee;
import com.graphql.project.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/vijay")
public class EmployeeController {

    @Autowired
    private EmployeeRepository repository;

    @GetMapping("/getData")
    public ResponseEntity<List<Employee>> getDetail(@PathParam("firstname") String firstname){
        return ResponseEntity.status(HttpStatus.OK).body(repository.findByFirstName(firstname));
    }

}
