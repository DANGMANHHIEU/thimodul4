package com.example.thimodul4.service.quocgia;

import com.example.thimodul4.model.QuocGia;
import com.example.thimodul4.repository.IQuocGiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class QuocGiaService implements IQuocGiaService{
    @Autowired
    private IQuocGiaRepository quocGiaRepository;
    @Override
    public Iterable<QuocGia> findAll() {
        return quocGiaRepository.findAll();
    }

    @Override
    public Optional<QuocGia> findById(Long id) {
        return quocGiaRepository.findById(id);
    }

    @Override
    public QuocGia save(QuocGia quocGia) {
        return quocGiaRepository.save(quocGia);
    }

    @Override
    public void remove(Long id) {
   quocGiaRepository.deleteById(id);
    }
}
