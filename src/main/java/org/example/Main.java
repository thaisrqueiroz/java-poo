package org.example;

import org.example.starwars.*;
import org.example.starwars.Character;

public class Main {
    public static void main(String[] args) {
        Character[] characters = {
                new Jedi("Luke Skywalker", "Tatooine", "Amatakka", "Galactic Civil War, the Battle of Yavin and the Battle of Endor", 1.75, "green", "Obi-Wan Kenobi", "Ben Solo and Rey"),
                new Sith("Darth Plagueis", "Mygeeto", "Bith language", "Clone Wars", 2, "red", "Darth Tenebrous", "Darth Sidious"),
                new Resistance("Chewbacca", "Kashyyyk", "Shyriiwook", "Galactic Civil War and Clone Wars", 2.3),
                new Jedi("Ahsoka Tano", "Shili", "Galactic Basic Standard", "Clone Wars", 1.7,"white", "Anakin Skywalker", "Sabine Wren"),
                new Sith("Sheev Palpatine, also known by my Sith name, Darth Sidious", "Naboo", "Balc", "Clone Wars", 1.78, "red", "Darth Plagueis", "Anakin Skywalker"),
                new Jedi("Mace Windu", "Haruun Kal", "Galactic Basic Standard", "Clone Wars", 1.92, "purple", "Cyslin Myr and Yoda", "Depa Billaba"),
                new Resistance("Gial Ackbar", "Mon Cala", "Gial'ic", "the Clone Wars, the Galactic Civil War and the Cold War", 1.8),

        };

        System.out.println("💫✨ A long time ago in a galaxy far, far away...");

        for (Character character : characters){
            System.out.println();
            character.greeting();
            System.out.println(character.introduce());

            if (character instanceof ForceSensitive){
                ((ForceSensitive) character).lightsaber();
                ((ForceSensitive) character).master();
                ((ForceSensitive) character).padawan();
            }
        }
    }
}