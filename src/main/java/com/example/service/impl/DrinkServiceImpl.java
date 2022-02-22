package com.example.service.impl;

import com.example.entity.Drink;
import com.example.mapper.DrinkMapper;
import com.example.service.DrinkService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author admin
 * @since 2021-11-30
 */
@Service
public class DrinkServiceImpl extends ServiceImpl<DrinkMapper, Drink> implements DrinkService {

}
