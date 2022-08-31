package com.example.demo.uuid;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
@Component
public class UUIDService {
    public List<UUID> getUUIDs(int size) {
        List<UUID> uuids = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            uuids.add(UUID.randomUUID());
        }
        System.out.println("was created");
        return uuids;
    }
}
