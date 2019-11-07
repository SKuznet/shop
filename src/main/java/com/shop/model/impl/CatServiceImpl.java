package com.shop.model.impl;

import com.shop.model.Cat;
import com.shop.model.CatService;
import org.springframework.stereotype.Service;

@Service
public class CatServiceImpl implements CatService {
    @Override
    public String getCatName(Cat cat) {
        return cat.getName();
    }
}
