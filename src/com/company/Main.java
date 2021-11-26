package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(1000);
        boss.setDamage(100);
        boss.weapon.setFireArms("Огнестрельное оружие");
        boss.weapon.setGun("Пушка");

        System.out.println("Здоровье:" + boss.health + " Урон:" + boss.damage + " Тип оружие:" + boss.weapon.getFireArms() + " название:" + boss.weapon.getGun() );

    }
}
