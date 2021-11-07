package com.example.avnproject.service;

import java.util.List;

public interface BaseService<T> {
    T create(T t);

    T getById(Long id);

    List<T> getAll();

    T update(T t);
}
