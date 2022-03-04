package model;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class heroTest {

    @Test
    public void getName() {
    Hero testHero=newHero();
    assertEquals("pu",testHero.getName());
    }

    @Test
    public void getAge() {
        Hero testHero=newHero();
        assertEquals(23,testHero.getAge());
    }

    @Test
    public void getSpecial_power() {
        Hero testHero=newHero();
        assertEquals("sing",testHero.getSpecial_power());
    }

    @Test
    public void getWeakness() {
        Hero testHero=newHero();
        assertEquals("mad",testHero.getWeakness());
    }

    @Test
    public void returnHeroes() {
        Hero testHero=newHero();
        ArrayList<Hero>testHeroes=new ArrayList<>();
        testHeroes.add(testHero);
        assertEquals(testHeroes.contains(testHero), Hero.getAll().contains(testHero)
        );
    }
    //tested
    public Hero newHero(){
        return new Hero("pu",23,"sing","mad");
    }
}