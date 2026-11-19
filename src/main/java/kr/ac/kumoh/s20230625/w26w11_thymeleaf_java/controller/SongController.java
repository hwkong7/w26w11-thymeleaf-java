package kr.ac.kumoh.s20230625.w26w11_thymeleaf_java.controller;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SongController {
    @GetMapping("/songs/random")
    String getRandomSong(Model model) {
        model.addAttribute("songTitle", "Cosmic Echo");
        return "random";
    }
}

