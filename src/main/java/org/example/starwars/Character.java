package org.example.starwars;

public abstract class Character {
    private String name;
    private String planet;
    private String language;
    private String warparticipatedin;
    private int height;

    public Character(String name, String planet, String language, String warparticipatedin, int height) {
        this.name = name;
        this.planet = planet;
        this.language = language;
        this.warparticipatedin = warparticipatedin;
        this.height = height;
    }

    public String introduce(){
        return "Hi! Nice to meet you! I’m " + this.name + ". I’m " + this.height + " meters tall and from the planet " + this.planet + ". I fought in the " + this.warparticipatedin +  ". Thanks to technology, we can communicate now—my native language is " + this.language + "!"
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

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
}
