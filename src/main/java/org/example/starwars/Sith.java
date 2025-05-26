package org.example.starwars;

public class Sith extends Character implements ForceSensitive {

    private String lightsaber;
    private String master;
    private String padawan;

    public Sith(String name, String planet, String language, String warparticipatedin, double height, String lightsaber, String master, String padawan){
        super(name, planet, language, warparticipatedin, height);
        this.lightsaber = lightsaber;
        this.master = master;
        this.padawan = padawan;
    }

    @Override
    public void greeting(){
        System.out.println("Never underestimate the power of the dark side. I'm " + getName());
    }

    @Override
    public void master(){
        System.out.println("My master was " + master);
    }

    @Override
    public void padawan(){
        System.out.println("My padawan was " + padawan);
    }

}
