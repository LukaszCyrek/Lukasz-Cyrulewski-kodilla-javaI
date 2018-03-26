package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Item;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ItemDao extends CrudRepository {
    List<Item> findByName(int id);
}