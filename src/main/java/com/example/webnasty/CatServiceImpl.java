package com.example.webnasty;

@Service
public class CatServiceImpl implements Cat.CatService {

    @Override
    public String getCatsFromFile(String filename) {
        list.add("первая строка");
        model.addAttribute("spisok", list);
        return "simple_list";
    }
}


