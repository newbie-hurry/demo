package com.example.luban.demo.base.T;

import org.springframework.stereotype.Service;

/**
 * @Author: dxq
 * @Date: 2021/4/12 14:31
 * @Version 1.0
 */
@Service
public class KindergartenPaintingServiceImpl implements PaintingService{


    @Override
    public <T extends Fruits> void paint(T fruits) {
        System.out.println(""+ fruits.getColor());
    }
}
