package com.programming.inventoryservice.service;

import com.programming.inventoryservice.repository.InventoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InventoryService {

    private final InventoryRepository inventoryRepository;

    public boolean isInStock(String skuCode) {
        inventoryRepository.findBySkuCode();
    }
}
