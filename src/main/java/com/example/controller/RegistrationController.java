package com.example.controller;


import com.example.entity.Registration;
import com.example.service.RegistrationService;
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
@RequestMapping("//registration")
public class RegistrationController {

    @Autowired
    private RegistrationService registrationService;
    @GetMapping("/list")
    public List<Registration> list(){
        return this.registrationService.list();
    }
    @PutMapping("/insert")
    public boolean insert(@RequestBody Registration rs){
        return this.registrationService.saveOrUpdate(rs);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id") Integer id){
        return this.registrationService.removeById(id);
    }
}

