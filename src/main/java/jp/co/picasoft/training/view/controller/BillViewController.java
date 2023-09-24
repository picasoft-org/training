package jp.co.picasoft.training.view.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bills")
public class BillViewController {
    
    @GetMapping("/")
    public String init() {
        return "bill/bills";
    }
}
