package com.wad.firstmvc.services;

import com.wad.firstmvc.domain.Order;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class OrderData {

    private List<Order> orders = new ArrayList<>();
    private Long nextId = 1L;

    public List<Order> getAll() {
        return orders;
    }

    public List<Order> findByUsername(String username) {
        return orders.stream().filter(o -> o.getUsername().equals(username)).toList();
    }

    public void save(Order order) {
        order.setId(nextId++);
        orders.add(order);
    }

    public void updateStatus(Long id, String newStatus) {
        for (Order o : orders) {
            if (o.getId().equals(id)) {
                o.setStatus(newStatus);
                return;
            }
        }
    }

}