package com.shop.model.impl;

import com.shop.model.Cat;
import com.shop.model.CatService;
import org.springframework.stereotype.Service;

@Service("barsikService")
public class BarsikServiceImpl implements CatService {
    @Override
    public String getCatName(Cat cat) {
        return null;
    }
}
