package com.example.thimodul4.service.thanhpho;

import com.example.thimodul4.model.ThanhPho;
import com.example.thimodul4.repository.IThanhPhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class ThanhPhoService implements IThanhPhoService{
    @Autowired
    private IThanhPhoRepository thanhPhoRepository;
    @Override
    public Iterable<ThanhPho> findAll() {
        return thanhPhoRepository.findAll();
    }

    @Override
    public Optional<ThanhPho> findById(Long id) {
        return thanhPhoRepository.findById(id);
    }

    @Override
    public ThanhPho save(ThanhPho thanhPho) {
        return thanhPhoRepository.save(thanhPho);
    }

    @Override
    public void remove(Long id) {
        thanhPhoRepository.deleteById(id);

    }
}
