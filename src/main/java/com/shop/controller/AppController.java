package com.shop.controller;

import com.shop.model.Cat;
import com.shop.model.CatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@ImportResource(value = "classpath:ioc.xml")
public class AppController {
    private Cat cat;
    private CatService catService;

    // http://localhost:8080/
    @RequestMapping("/")
    public String getHelloPage(Model model) {
        model.addAttribute("info", catService.getCatName(cat));
        return "hello";
    }

    // http://localhost:8080/name/jack
    @RequestMapping("/name/{name}")
    public String getName(@PathVariable("name") String name, Model model){
        model.addAttribute("name", name);
        return "name";
    }

//    @Value("BrsTheGreat")
//    public void setCat(Cat cat) {
//        this.cat = cat;
//    }

    @Autowired
    public void setCat(Cat cat) {
        this.cat = cat;
    }

    @Autowired
    @Qualifier("catServiceImpl")
    public void setCatService(CatService catService) {
        this.catService = catService;
    }
}
