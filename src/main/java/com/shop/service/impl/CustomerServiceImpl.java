package com.shop.service.impl;

import com.shop.service.CustomerService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService, DisposableBean {
    @Override
    public String actionInStore(String product) {
        if(product.equalsIgnoreCase("cash")) {
            throw new IllegalArgumentException("Don't touch our cash!!!");
        }

        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "He bought a: " + product;
    }

    @Override
    public void destroy() throws Exception {

    }
}
