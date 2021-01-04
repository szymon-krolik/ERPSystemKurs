package com.example.skBackend.controller;

import com.example.skBackend.entity.Item;
import com.example.skBackend.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
//słuzy do stworzenia konstruktora
@RequiredArgsConstructor
public class ItemController {
    private final ItemRepository itemRepository;




    @PostMapping("/items")
    Item newItem(@RequestBody Item newItem) {
        return itemRepository.save(newItem);
    }


    @GetMapping("/items")
    List<Item> listItems() {
        return itemRepository.findAll();
    }

    @DeleteMapping("/items")
    ResponseEntity deleteItem(@RequestBody Long idItem) {
        itemRepository.deleteById(idItem);
        return ResponseEntity.ok().build();
    }
}
