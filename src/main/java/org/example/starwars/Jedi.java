package org.example.starwars;

public class Jedi  extends Character implements ForceSensitive {

    private String lightsaber;
    private String master;
    private String padawan;

    public Jedi(String name, String planet, String languaje, String warparticipatedin, int height, String lightsaber, String master, String padawan){
        this lightsaber = lightsaber;
        super(name, languaje, warparticipatedin, height);
    }

    @Override
    public void greeting(){
        System.out.println("Que la fuerza te acompañe. Soy " + getName());
    }

    @Override
    public void relationships(){
        System.out.println("Mi maestro fue " + master + "y mi padawan fue " + padawan);
    }
}