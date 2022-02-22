package com.example.controller;


import com.example.entity.Rooms;
import com.example.service.RoomsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
@RequestMapping("//rooms")
public class RoomsController {

    @Autowired
    private RoomsService roomsService;
    @GetMapping("/list")
    public List<Rooms> list(){
        return this.roomsService.list();
    }

    @PutMapping("/update")
    public boolean update(@RequestBody Rooms rooms){
        return this.roomsService.updateById(rooms);
    }
}

