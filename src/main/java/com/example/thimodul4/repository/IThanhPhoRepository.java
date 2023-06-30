package com.example.thimodul4.repository;

import com.example.thimodul4.model.ThanhPho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IThanhPhoRepository extends JpaRepository<ThanhPho,Long> {
}
