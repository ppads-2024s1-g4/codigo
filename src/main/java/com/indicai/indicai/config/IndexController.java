package com.indicai.indicai.config;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    @RequestMapping("/index")
    public ModelAndView index(){
        return new ModelAndView("/index");
    }

    @RequestMapping("/scripts/gerenciadorInicial.js")
    public ModelAndView gerenciadorInicial(){
        return new ModelAndView("/scripts/gerenciadorInicial.js");
    }

    @RequestMapping("/scripts/avaliacao.js")
    public ModelAndView avaliacaoJs(){
        return new ModelAndView("/scripts/avaliacao.js");
    }

    @RequestMapping("/scripts/filmes.js")
    public ModelAndView filmeJs(){
        return new ModelAndView("/scripts/filmes.js");
    }

    @RequestMapping("/style.css")
    public ModelAndView style(){
        return new ModelAndView("/style.css");
    }

    
}
