package com.example.rpg_game;

public class Character {
    private double health;
    private double damage;
    private int imageResourceID;

    public Character(double health, double Damage, int id) {
        this.health = health;
        this.damage = Damage;
        imageResourceID = id;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getDamage() {
        return damage;
    }

    public void setHeroDamage() {
        // Commented out code below is for testing game/demoing
        //double Damage = 50;

        double Damage = (int)(Math.random() * 6) + 20;
        this.damage = Damage;
    }

    public void setVillainDamage(double damage) {
        this.damage = damage;
    }

    public int getImageID() {
        return imageResourceID;
    }

    public void setImageID(int id) {
        imageResourceID = id;
    }

    public void dealDamage(Character opp){
        double newHealth = opp.getHealth() - this.getDamage();
        opp.setHealth(newHealth);
    }
}
