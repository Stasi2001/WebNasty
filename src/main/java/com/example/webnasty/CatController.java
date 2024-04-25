package com.example.webnasty;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CatController {

    @Autowired
    private CatService catService;

    @GetMapping("/")
    public String showForm() {
        return "catForm";
    }

    @PostMapping("/getCats")
    public String getCats(@RequestParam("filename") String filename, Model model) {
        List<Cat> cats = catService.getCatsFromFile(filename);
        model.addAttribute("cats", cats);
        return "catList";
    }
}

