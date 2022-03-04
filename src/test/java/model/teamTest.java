package model;

import org.junit.Test;

import static org.junit.Assert.*;

public class teamTest {

    @Test
    public void getSize() {
      Team testTeam =  newSquad();
      assertEquals(3, testTeam.getSize());
    }

    @Test
    public void getName() {
        Team testTeam =  newSquad();
        assertEquals("than", testTeam.getName());
    }

    @Test
    public void getCause() {
        Team testTeam =  newSquad();
        assertEquals("help", testTeam.getCause());
    }
    //tested
    public Team newSquad(){
        return new Team(3,"than","help");
    }
}