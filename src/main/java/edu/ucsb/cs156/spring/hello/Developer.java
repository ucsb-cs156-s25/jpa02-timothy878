package edu.ucsb.cs156.spring.hello;

/**
 * A class with static methods to provide information about the developer.
 */

public class Developer {

    // This class is not meant to be instantiated
    // so we make the constructor private

    private Developer() {}
    
    /**
     * Get the name of the developer
     */

    public static String getName() {

        return "Timothy N.";
    }

    /**
     * Get the github id of the developer
     * @return github id of the developer
     */

    public static String getGithubId() {
        return "timothy878";
    }

    /**
     * Get the developers team
     * @return developers team as a Java object
     */
    
    public static Team getTeam() {
        Team team = new Team("s25-06");
        team.addMember("Aryan");
        team.addMember("Riya");
        team.addMember("Saeed");
        team.addMember("Sanjana");
        team.addMember("Timothy");
        team.addMember("Yarwin");
        return team;
    }
}
