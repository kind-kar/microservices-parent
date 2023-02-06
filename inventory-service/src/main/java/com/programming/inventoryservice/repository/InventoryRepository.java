package com.programming.inventoryservice.repository;

import com.programming.inventoryservice.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory, Long> { // use the object type and type of primary key
    void findBySkuCode();
}
