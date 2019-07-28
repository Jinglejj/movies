package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pojo.Movie;
import service.MovieService;

import java.util.List;

@Controller
public class MovieController {


    @Autowired
    private MovieService movieService;

    @RequestMapping("/getAll")
    public String getAll(Model model){
        List<Movie> list=movieService.getAll();
        model.addAttribute("list",list);
        return "user/index";
    }
}
