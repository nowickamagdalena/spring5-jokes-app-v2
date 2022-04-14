package guru.springframework.controller;

import guru.springframework.service.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private JokeService service;

    public JokesController(JokeService service) {
        this.service = service;
    }

    @RequestMapping({"/",""})
    String getJoke(Model model){
        model.addAttribute("joke", service.getJoke());
        return "joke/index";
    }
}
