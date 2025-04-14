package com.ecom.product_service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
// import java.util.Collection;

import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;
import java.util.stream.Collectors;


@RequestMapping("/api")
@RestController
public class ProductController {
    @GetMapping("/products")
    public List<String> getProducts(){
        String[] names={"Laptop","Mobile","Tablet"};
        List<String>namelist=Arrays.stream(names).collect(Collectors.toList());
        return namelist;
    }
    
}
