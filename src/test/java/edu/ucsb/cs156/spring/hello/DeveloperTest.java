package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import org.junit.jupiter.api.Test;

public class DeveloperTest {

    @Test
    public void testPrivateConstructor() throws Exception {
        // this hack is from https://www.timomeinen.de/2013/10/test-for-private-constructor-to-get-full-code-coverage/
        Constructor<Developer> constructor = Developer.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()),"Constructor is not private");

        constructor.setAccessible(true);
        constructor.newInstance();
    }

    @Test
    public void getName_returns_correct_name() {
        assertEquals("Timothy N.", Developer.getName());
    }

    @Test
    public void getGitHubId_returns_corectgithubId() {
        assertEquals("timothy878", Developer.getGithubId());
    }

    @Test
    public void getTeam_returns_team_with_correct_name() {
        Team  t = Developer.getTeam();
        assertEquals("s25-06", t.getName());
    }
    @Test
    public void getTeam_returns_team_with_correct_members() {
        Team  t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Aryan"),"Team should contain Aryan");
        assertTrue(t.getMembers().contains("Riya"),"Team should contain Riya");
        assertTrue(t.getMembers().contains("Saeed"),"Team should contain Saeed");
        assertTrue(t.getMembers().contains("Sanjana"),"Team should contain Sanjana");
        assertTrue(t.getMembers().contains("Timothy"),"Team should contain Timothy");
        assertTrue(t.getMembers().contains("Yarwin"),"Team should contain Yarwin");
    }
}
