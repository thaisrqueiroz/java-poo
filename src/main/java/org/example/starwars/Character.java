package org.example.starwars;

public abstract class Character {
    private String name;
    private String planet;
    private String language;
    private String warparticipatedin;
    private double height;

    public Character(String name, String planet, String language, String warparticipatedin, double height) {
        this.name = name;
        this.planet = planet;
        this.language = language;
        this.warparticipatedin = warparticipatedin;
        this.height = height;
    }

    public abstract void greeting();

    public String introduce(){
        return "I’m " + this.height + " meters tall and from the planet " + this.planet + ".\nI fought in the " + this.warparticipatedin +  ".\nThanks to technology, we can communicate now — I speak " + this.language + "!";
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlanet() {
        return this.planet;
    }

    public void setPlanet(String planet) {
        this.planet = planet;
    }

    public String getLanguage() {
        return this.language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getWarparticipatedin() {
        return this.warparticipatedin;
    }

    public void setWarparticipatedin(String warparticipatedin) {
        this.warparticipatedin = warparticipatedin;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}