package ch.bbw.fl.cluedo.controller;

import ch.bbw.fl.cluedo.model.DataService;
import ch.bbw.fl.cluedo.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ViewController {

    @GetMapping("/")
    public String loadPlayers(Model model) {
        List<Person> people = DataService.people;
        model.addAttribute("people", people);
        return "viewTemplate";
    }
}
