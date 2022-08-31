package com.example.demo.uuid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
public class UUIDRestController {
    private UUIDService uuidService;

    public UUIDService getUuidService() {
        return uuidService;
    }
       @Autowired
    public void setUuidService(UUIDService uuidService) {
        this.uuidService = uuidService;
    }
     @GetMapping("/uuid")
    public List<UUID> getUUIDList(@RequestParam("parameter") int size)
     {
         return  uuidService.getUUIDs(size);
     }
}
