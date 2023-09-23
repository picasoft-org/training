package jp.co.picasoft.training.view.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
// @RequestMapping()
public class IndexViewController {

    @GetMapping("/")
    public String index() {
        return "index";
    }
}
