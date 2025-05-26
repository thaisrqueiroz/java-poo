package org.example.starwars;

public class Sith extends Character implements ForceSensitive {

    private String lightsaber;

    public Sith(String name, String planet, String languaje, String warparticipatedin, int height){
        this lightsaber = lightsaber;
        super(name, languaje, warparticipatedin, height);
    }

    @Override
    public void greet(){
        System.out.println("Nunca subestimes el poder del lado oscuro. Soy " + getName());
    }

}
