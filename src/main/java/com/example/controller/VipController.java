package com.example.controller;


import com.example.entity.Vip;
import com.example.service.VipService;
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
@RequestMapping("//vip")
public class VipController {
    @Autowired
    private VipService vipService;
    @GetMapping("list")
    public List<Vip> list(){
        return this.vipService.list();
    }
    @PutMapping("/insert")
    public boolean insert(@RequestBody Vip vip){
        return this.vipService.saveOrUpdate(vip);
    }
    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id") Integer id){
        return this.vipService.removeById(id);
    }
}

