package team.mreal.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping(value = {"/"})
    public String index() {
        return "index.html";
    }


    @GetMapping(value = {"/practice"})
    public String Practice() {
        return new String();
    }
    
    

}
