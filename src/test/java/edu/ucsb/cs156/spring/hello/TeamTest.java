package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }
    @Test
    public void same_Exact_Team() {
        Team team1 = new Team("team1");
        assertEquals(team1, team1);
    }
    @Test
    public void classes_Are_Different() {
        Team team2 = new Team("team2");
        int number = 878;
        assertNotEquals(team2, number);
    }
    @Test
    public void same_Team_Names_And_Members() {
        Team twinteam = new Team("twinteam");
        Team twinteam2 = new Team( "twinteam");
        twinteam.addMember("Jeffrey");
        twinteam.addMember("Brian");
        twinteam.addMember("Michael");
        twinteam2.addMember("Jeffrey");
        twinteam2.addMember("Brian");
        twinteam2.addMember("Michael");
        assertEquals(twinteam, twinteam2);
    }
    @Test
    public void different_Team_Names_but_Same_Members() {
        Team team3 = new Team("team3");
        Team team4 = new Team("team4");
        team3.addMember("Alex");
        team3.addMember("Bryce");
        team4.addMember("Alex");
        team4.addMember("Bryce");
        assertNotEquals(team3, team4);
    } 
    @Test
    public void same_Team_Names_but_Different_Member() {
        Team realTeam = new Team("realTeam");
        Team impostorTeam = new Team("realTeam");
        realTeam.addMember("Real");
        impostorTeam.addMember("Impostor");
        assertNotEquals(realTeam,impostorTeam);
    }
    @Test
    public void hash_Test_1() {
        Team hashTest1 = new Team();
        hashTest1.setName("hashTest1");
        hashTest1.addMember("hasher1");
        Team hashTest01 = new Team();
        hashTest01.setName("hashTest1");
        hashTest01.addMember("hasher1");
        assertEquals(hashTest1.hashCode(), hashTest01.hashCode());
     
    }
    @Test
    public void hash_Test_Value() {
    Team hashTest2 = new Team("hashTest2");
    int hashCode = hashTest2.hashCode();
    int expectedHashCode = 299046259;
    assertEquals(expectedHashCode, hashCode);
    }

}
