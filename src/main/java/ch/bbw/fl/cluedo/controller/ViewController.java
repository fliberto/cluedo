package ch.bbw.fl.cluedo.controller;

import ch.bbw.fl.cluedo.model.DataService;
import ch.bbw.fl.cluedo.model.Person;
import ch.bbw.fl.cluedo.model.Room;
import ch.bbw.fl.cluedo.model.Weapon;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ViewController {

    @GetMapping("/")
    public String loadAll(Model model) {
        List<Person> people = DataService.people;
        List<Weapon> weapons = DataService.weapons;
        List<Room> rooms = DataService.rooms;
        model.addAttribute("people", people);
        model.addAttribute("weapons", weapons);
        model.addAttribute("rooms", rooms);
        return "viewTemplate";
    }


}
