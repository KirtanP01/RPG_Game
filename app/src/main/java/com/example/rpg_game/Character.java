package com.example.rpg_game;

public class Character {
    private double health;
    private double damage;
    private int imageResourceID;

    public Character(double health, double damage, int id) {
        this.health = health;
        this.damage = damage;
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
        double damage = (int)(Math.random() * 5) + 20;
        this.damage = damage;
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
