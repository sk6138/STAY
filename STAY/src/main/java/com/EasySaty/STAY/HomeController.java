package com.EasySaty.STAY;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;





@Controller
public class HomeController {
    @Autowired
    OwnerRepo repo;

    @Autowired
    contactRepo contact;

    @GetMapping("/home/list")
    public List<Owner>  gethome(ModelMap map) {
        List<Owner> ll = new ArrayList<Owner>();
        ll = repo.findAll();
        return ll;
    }
    @GetMapping("/home")
    public String  gethomepage(Model model) {
        
        return "home";
    }
    @GetMapping("/home/{type}")
    public List<Owner>  gethome(@PathVariable String type ,ModelMap map) {
        List<Owner> ll = new ArrayList<Owner>();
        ll = repo.findByType(type);
        return ll;
    }
    @GetMapping("/home/owner")
    public Owner  owner(@ModelAttribute Owner own) {
        repo.save(own);
        
        return own;
    } @GetMapping("/home/customer")
    public List<Owner>  customer(ModelMap map) {
        List<Owner> ll = new ArrayList<Owner>();
        ll=repo.findAll();
        return ll;
    }


    @GetMapping("/AllList")
    public String  getAllList(ModelMap map) {
        List<Owner> list = new ArrayList<>();
        list = repo.findAll();
        map.addAttribute("list",list);
        return "AllList";
    }



    @GetMapping("/OwnerForm")
    public String  OwnerForm() {
        return "OwnerForm";
    }
    
    


    @GetMapping("/Contact")
    public String  getcontactpage() {
        return "contact";
    }
    @GetMapping("/About")
    public String  getabout() {
        return "about";
    }



    @GetMapping("/test")
    public String  getabeout() {
        return "form";
    }

    @PostMapping("/con")
    public String  storecontact(@ModelAttribute Contact con,ModelMap model,@RequestParam String name) {
        contact.save(con);
       System.out.println("complete");
       StringBuilder sb = new StringBuilder();
       String pre = "Thank you ";
       String msg =" ! Your message has been sent.";
       sb.append(pre);
       sb.append(name);
       sb.append(msg);

        model.addAttribute("name", sb.toString());
        System.out.println(name);
        return "/home";
       
    }
}
