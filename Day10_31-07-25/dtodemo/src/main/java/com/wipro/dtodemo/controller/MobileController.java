package com.wipro.dtodemo.controller;


import org.springframework.web.bind.annotation.*;

import com.wipro.dtodemo.Mobile;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/mobile")
public class MobileController {

    private Map<String, Mobile> mobileStore = new HashMap<>();

    
    @PostMapping
    public String addMobile(@RequestBody Mobile mobile) {
        mobileStore.put(mobile.getModelNumber(), mobile);
        System.out.println("Added: " + mobile);
        return "Mobile added successfully!";
    }

    
    @GetMapping
    public Mobile getMobile(@RequestParam String modelNumber) {
        Mobile mobile = mobileStore.get(modelNumber);
        System.out.println("Retrieved: " + mobile);
        return mobile;
    }

   
    @PutMapping
    public String updateMobile(@RequestBody Mobile mobile) {
        if (mobileStore.containsKey(mobile.getModelNumber())) {
            mobileStore.put(mobile.getModelNumber(), mobile);
            System.out.println("Updated: " + mobile);
            return "Mobile updated successfully!";
        } else {
            return "Mobile not found!";
        }
    }

 
    @DeleteMapping
    public String deleteMobile(@RequestParam String modelNumber) {
        Mobile removed = mobileStore.remove(modelNumber);
        System.out.println("Deleted: " + removed);
        return removed != null ? "Mobile deleted successfully!" : "Mobile not found!";
    }
}


