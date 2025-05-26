package org.example;

import org.example.starwars.Character;
import org.example.starwars.ForceSensitive;
import org.example.starwars.Jedi;
import org.example.starwars.Sith;

public class Main {
    public static void main(String[] args) {
        Character[] characters = {
                new Jedi("Luke Skywalker", "Tatooine", "Amatakka", "Galactic Civil War, the Battle of Yavin and the Battle of Endor", 1.75, "green", "Obi-Wan Kenobi", "Ben Solo and Rey"),
                new Sith("Darth Plagueis", "Mygeeto", "Bith language", "Clone Wars", 2, "red", "Darth Tenebrous", "Darth Sidious")
        };

        for (Character character : characters){
            character.greeting();

            if (character instanceof ForceSensitive){
                ((ForceSensitive) character).master();
            }

            if (character instanceof ForceSensitive){
                ((ForceSensitive) character).padawan();
            }
        }

    }
}