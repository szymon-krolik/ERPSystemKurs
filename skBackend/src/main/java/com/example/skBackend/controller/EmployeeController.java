package com.example.skBackend.controller;

import com.example.skBackend.entity.Employee;
import com.example.skBackend.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//słuzy do stworzenia konstruktora
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeRepository employeeRepository;

//    Tworzenie nowego pracownika

//    Mapowanie po metodzie POST
    @PostMapping("/employees")
    Employee newEmplyee(@RequestBody Employee newEmployee) {
//        Przekazanie do interfejsu nowego pracownika, save same zwraca pracownika
        return employeeRepository.save(newEmployee);
    }

    //zwraca liste prawownikow

    @GetMapping("/employees")
    List<Employee> listEmployees() {
        return employeeRepository.findAll();
    }

    @DeleteMapping("/employees")
    ResponseEntity deleteEmployee(@RequestBody Long idEmployee) {
         employeeRepository.deleteById(idEmployee);
         return ResponseEntity.ok().build();
    }


}
