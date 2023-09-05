package ch.bbw.fl.cluedo.model;

import java.util.List;

public class DataService {

    public static List<Person> people = List.of(
            new Person("Hans", "blue", 44, 188.5),
            new Person("Peter", "brown", 22, 150)
    );

    public static List<Weapon> weapons = List.of(
            new Weapon("Dagger", "steal", 25, 450, "silver"),
            new Weapon("LeadPipe", "lead", 50, 2500, "grey"),
            new Weapon("Rope", "Weed", 2500, 500, "brown")
    );

    public static List<Room> rooms = List.of(
            new Room("Library", 50, 1, 8, "brown"),
            new Room("Kitchen", 35, 2, 3, "stony grey"),
            new Room("Bedroom", 75, 1, 2, "red")
    );
}
