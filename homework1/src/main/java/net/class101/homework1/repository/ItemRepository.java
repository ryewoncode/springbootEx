package net.class101.homework1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import net.class101.homework1.domain.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {

	
}