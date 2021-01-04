package com.example.skBackend.controller;
import java.util.List;
import com.example.skBackend.entity.Operator;
import com.example.skBackend.repository.OperatorRepository;
import org.springframework.web.bind.annotation.*;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import lombok.RequiredArgsConstructor;

@RestController
//słuzy do stworzenia konstruktora
@RequiredArgsConstructor
public class OperatorController {
    private final OperatorRepository operatorRepository;


    @PostMapping("/operator")
    Operator newOperator(@RequestBody Operator newOperator) {
        return operatorRepository.save(newOperator);
    }


    @GetMapping("/operator")
    List<Operator> listOperator() {
        return operatorRepository.findAll();
    }

    @DeleteMapping("/operator")
    ResponseEntity deleteOperator(@RequestBody Long idOperator) {
        operatorRepository.deleteById(idOperator);
        return ResponseEntity.ok().build();
    }
}
