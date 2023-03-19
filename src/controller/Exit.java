package controller;

import java.util.Arrays;

/**
 * Use this class – contains the Exit information. Allows the user to build
 * an exit to be added to the Room.
 *
 */
public class Exit {

    private String direction;
    private int destination;
    private final java.util.List<String> VALID_DIRECTIONS = Arrays.asList(new String[] {"WEST", "NORTH", "SOUTH", "EAST", "UP", "DOWN"});

    public String getDirection() {
        return this.direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public int getDestination() {
        return this.destination;
    }

    public void setDestination(int destination) {
        this.destination = destination;
    }

    @Override()
    public String toString() {
        return "";
    }


    /**
     * Method buildExit
     * @param ex
     * @throws GameException
     * Builds an Exit from the String provided throws an exception for an
     * invalid exit You can replace this with a constructor that takes a
     * String and parses into the Exit.
     * @param ex - String containing the information for the exit
     *
     */
    public void buildExit(String ex) throws GameException {
        String[] exit = ex.split(" ");
        if(VALID_DIRECTIONS.contains(exit[0])) {
            this.destination = Integer.parseInt(exit[1]);
            this.direction = exit[0];
        } else {
            throw new GameException("Invalid exit has been read in");
        }
    }

}