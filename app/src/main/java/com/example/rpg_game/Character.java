package com.example.rpg_game;

public class Character {
    private double health;
    private double damage;

    public Character(double health, double damage) {
        this.health = health;
        this.damage = damage;
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

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public void dealDamage(Character opp){
        double newHealth = opp.getHealth() - this.getDamage();
        opp.setHealth(newHealth);
    }
}
