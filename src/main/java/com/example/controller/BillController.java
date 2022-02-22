package com.example.controller;


import com.example.entity.Bill;
import com.example.service.BillService;
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
@RequestMapping("//bill")
public class BillController {

    @Autowired
    private BillService billService;

    @GetMapping("/list")
    public List<Bill> list(){
        return this.billService.list();
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id") Integer id){
        return this.billService.removeById(id);
    }

    @PutMapping("/save")
    public boolean sava(@RequestBody Bill bill){
        return this.billService.save(bill);
    }

    @PutMapping("/pay")
    public boolean pay(@RequestBody Bill pay){
        return this.billService.updateById(pay);
    }
}

