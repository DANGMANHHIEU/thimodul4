package com.example.thimodul4.service;

import java.util.Optional;

public interface Generic<T> {
    Iterable<T> findAll();
    Optional<T> findById(Long id);
    T save(T t);
    void remove(Long id);
}
