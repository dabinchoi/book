package my.bookstore.book.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {


    //  @RequestMapping(method=GET, path="/list") 와 같은 것
    @GetMapping("/main")
    public String main(Model model){
               return "main"; // view name
    }
}
