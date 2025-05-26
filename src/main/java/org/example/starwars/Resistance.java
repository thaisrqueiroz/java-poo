package org.example.starwars;

public class Resistance extends Character {

    public Resistance(String name, String planet, String language, String warparticipatedin, double height){
        super(name, planet, language, warparticipatedin, height);
    }

    @Override
    public void greeting(){
        System.out.println("For the Resistance! Nice to meet you, I'm " + getName() + ".");
    }
}
