package controller;

import java.util.Arrays;

public class Commands {


        //add attributes such as Player object, directions, item commands, etc.

    //validateCommand(String command) throws GameException ..
    //executeCommand(String command) if you still want to connect db, then
    // you can use a switch statement to identify which type of movement the
    // player object is trying to attempt.
   //here are example codes you can take a look.

//    public String executeCommand(String cmd) throws GameException, SQLException {
//        int cmdType;
//        try {
//            cmdType = validateCommand(cmd);
//        } catch(GameException ge) {
//            throw new GameException("Invalid command.");
//        }
//
//        Room room = new Room();
//        room.retrieveByID(player.getCurrRoom());
//
//        switch (cmdType) {
//            case 1: // move command
//                processMovement(cmd.substring(5));
//                return "You moved to a new location.";
//            case 2: // item command
//                String itemResult;
//                try {
//                    itemResult = itemCommand(cmd);
//                } catch(GameException ge) {
//                    throw new GameException("Invalid item command.");
//                }
//                return itemResult + room.toString() + "\n\nWhat would you like to do?";
//            case 3: // display room command
//                return room.display();
//            case 4: // inventory command
//                return player.printInventory();
//            case 5: // exit command
//                return "Exit";
//            default:
//                throw new GameException("Invalid command.");
//        }
//    }
//
//    protected void processMovement(String object) throws GameException, SQLException {
//        if (player.getCurrRoom() == -1) { // street movement
//            int nextStreetID = chunk.getStreet().validDirection(object);
//            player.setCurrStreet(nextStreetID);
//            chunk.loadChunk(nextStreetID);
//        } else { // room movement
//            Room r = chunk.getRoom(player.getCurrRoom());
//            r.setVisited(true);
//            int nextRoomID = r.validDirection(object);
//            chunk.holdUpdateObject(r);
//            player.setCurrRoom(nextRoomID);
//        }
//    }

}
