package org.example.starwars;

public class Jedi  extends Character implements ForceSensitive {

    private String lightsaber;

    public Jedi(String name, String planet, String languaje, String warparticipatedin, int height){
        this lightsaber = lightsaber;
        super(name, languaje, warparticipatedin, height);
    }

    @Override
    public void greet(){
        System.out.println("Que la fuerza te acompañe. Soy " + getName());
    }

}
