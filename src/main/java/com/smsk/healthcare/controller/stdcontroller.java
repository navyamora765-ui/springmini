package com.smsk.healthcare.controller;

import com.smsk.healthcare.entity.std;
import com.smsk.healthcare.service.stdser;
import com.smsk.healthcare.service.stdser;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/home")
@RequiredArgsConstructor
public class stdcontroller {

    private final stdser con;

    @GetMapping("/all")
    public List<std> getall(){
        return con.get();
    }
    @PostMapping("/add")
    public std add(@RequestBody std student_new){
        return con.insert(student_new);
    }

    @PutMapping("/update/{id}")
    public std update(@PathVariable Long id, @RequestBody std new_student){
        return con.update(id,new_student);
    }

    @DeleteMapping("/delete/{id} ")

    public void delete(@PathVariable Long id){
        con.delete(id);
    }

}