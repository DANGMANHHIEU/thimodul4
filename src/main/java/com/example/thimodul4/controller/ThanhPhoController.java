package com.example.thimodul4.controller;

import com.example.thimodul4.model.ThanhPho;
import com.example.thimodul4.service.thanhpho.IThanhPhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/thanhpho")
@CrossOrigin
public class ThanhPhoController {
    @Autowired
    private IThanhPhoService thanhPhoService;
    @GetMapping("/list")
    public ResponseEntity<Iterable<ThanhPho>> findAll(){
        Iterable<ThanhPho> thanhPhos = thanhPhoService.findAll();
        return new ResponseEntity<>(thanhPhos, HttpStatus.OK);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Optional<ThanhPho>> deleteThanhPho(@PathVariable Long id){
        thanhPhoService.remove(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<ThanhPho> createThanhPho(@RequestBody ThanhPho thanhPho){
        return  new ResponseEntity<>(thanhPhoService.save(thanhPho),HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<ThanhPho>> view(@PathVariable Long id){
        Optional<ThanhPho> thanhPho = thanhPhoService.findById(id);
        return new ResponseEntity<>(thanhPho,HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Optional<ThanhPho>> updateThanhPho(@PathVariable Long id,@RequestBody ThanhPho thanhPho){
        Optional<ThanhPho> thanhPho1 = thanhPhoService.findById(id);
        if(!thanhPho1.isPresent()){
            return new ResponseEntity<>(HttpStatus.OK);
        }
        thanhPho.setIdThanhPho(thanhPho1.get().getIdThanhPho());
        thanhPhoService.save(thanhPho);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
