package com.shop.controller;

import com.shop.service.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @RequestMapping("/action")
    public String getActionInfo(@RequestParam("product") String product, Model model){
        model.addAttribute("result", customerService.actionInStore(product));
        return "action";
    }
}
