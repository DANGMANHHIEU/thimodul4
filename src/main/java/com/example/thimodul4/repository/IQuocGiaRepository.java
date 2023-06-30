package com.example.thimodul4.repository;

import com.example.thimodul4.model.QuocGia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IQuocGiaRepository extends JpaRepository<QuocGia,Long> {
}
