package com.polyglot.training.controller;

import com.polyglot.training.dto.AlertDTO;
import com.polyglot.training.dto.UsersDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {

    public List<UsersDTO> dataUser = List.of(
            UsersDTO.builder().id(0).name("asyraf").password("asdf").build(),
            UsersDTO.builder().id(1).name("rani").password("asdf").build()
    );

    @GetMapping
    public ResponseEntity<UsersDTO> getUsers(){
        UsersDTO data = new UsersDTO();
        data.setId(1);
        data.setName("Risa");
        data.setPassword("Risa29");
        return new ResponseEntity<>(data, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<AlertDTO> addUsers(){
        AlertDTO data = new AlertDTO();
        data.setMessage("Data pengguna berhasil ditambahkan");
        data.setStatus(true);
        return new ResponseEntity<>(data, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<AlertDTO> editUsers(){
        AlertDTO data = new AlertDTO();
        data.setMessage("Data pengguna berhasil diedit");
        data.setStatus(true);
        return new ResponseEntity<>(data, HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<AlertDTO> deleteUsers(){
        AlertDTO data = new AlertDTO();
        data.setMessage("Data yang ingin dihapus tidak ditemukan");
        data.setStatus(false);
        return new ResponseEntity<>(data, HttpStatus.NOT_FOUND);
    }
}
