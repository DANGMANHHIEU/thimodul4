package com.example.thimodul4.controller;

import com.example.thimodul4.model.QuocGia;
import com.example.thimodul4.service.quocgia.IQuocGiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/quocgia")
@CrossOrigin
public class QuocGiaController {
    @Autowired
    private IQuocGiaService quocGiaService;

    @GetMapping("/list")
    public ResponseEntity<Iterable<QuocGia>> findAll(){
        Iterable<QuocGia> quocGiaList =quocGiaService.findAll();
        return new ResponseEntity<>(quocGiaList, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<QuocGia> createQuocGia(@RequestBody QuocGia quocGia){
        return new ResponseEntity<>(quocGiaService.save(quocGia),HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<QuocGia>> findById(@PathVariable Long id){
        Optional<QuocGia> quocGia = quocGiaService.findById(id);
        return new ResponseEntity<>(quocGia,HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Optional<QuocGia>> updateQuocGia(@PathVariable Long id,@RequestBody QuocGia quocGia){
        Optional<QuocGia> quocGia1 = quocGiaService.findById(id);
        if(!quocGia1.isPresent()){
            return new ResponseEntity<>(HttpStatus.OK);
        }
        quocGia.setIdQuocgia(quocGia1.get().getIdQuocgia());
        quocGiaService.save(quocGia);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Optional<QuocGia>> deleteQuocGia(@PathVariable Long id){
        quocGiaService.remove(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
