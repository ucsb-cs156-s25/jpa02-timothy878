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
        // TODO: Change this to your team name
        Team team = new Team("s25-06");
        team.addMember("Aryan C.");
        team.addMember("Riya G.");
        team.addMember("Saeed A.");
        team.addMember("Sanjana J.");
        team.addMember("Timothy N.");
        team.addMember("Yarwin L.");
        return team;
    }
}
