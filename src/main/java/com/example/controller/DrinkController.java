package com.example.controller;


import com.example.entity.Drink;
import com.example.service.DrinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author admin
 * @since 2021-11-30
 */
@RestController
@RequestMapping("//drink")
public class DrinkController {
    @Autowired
    private DrinkService drinkService;

    @GetMapping("/list")
    public List<Drink> list(){
        return this.drinkService.list();
    }

    @PutMapping("/update")
    public boolean update(@RequestBody Drink drink){
        return this.drinkService.updateById(drink);
    }
}

