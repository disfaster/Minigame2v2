package model;

import controller.GameException;
import controller.Item;
import controller.Room;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Class : RoomDB.java
 * This class handles all of the DB interactions for Rooms
 */
public class RoomDB {
    /**
     * Method: getNextRoomID
     * Purpose: gets the next ID for a room
     * @return int
     */

    private ArrayList<Room> rooms = new ArrayList<Room>();


    public int getNextRoomID() throws SQLException {
        SQLiteDB sdb = null;
        try {
            sdb = new SQLiteDB();
        }
        catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        //Get the next room ID
        //This is the max value of the roomNumber column in the Room table plus 1
        //This is the same as the number of rows in the table plus 1
        int next = sdb.getMaxValue("roomNumber", "room") + 1;
        //Close the SQLiteDB connection since SQLite only allows one updater
        sdb.close();

        return next;
    }

    /**
     * Method: getRoom
     * Purpose: Gets a room based upon the supplied ID
     * @param id
     * @return Room
     * @throws SQLException
     */
    public Room getRoom(int id) throws SQLException, ClassNotFoundException {
        SQLiteDB sdb = new SQLiteDB();
        Room rm = new Room();
        String sql = "Select * from Room WHERE roomNumber = " + id;
        ResultSet rs = sdb.queryDB(sql);
        if (rs.next()) {
            System.out.println(rs.getInt("roomNumber"));
            rm.setRoomID(rs.getInt("roomNumber"));
            rm.setRoomName(rs.getString("roomName"));
            rm.setRoomDescription(rs.getString("roomDescription"));
            rm.setExits(rs.getString("exits"));
        }
        else {
            throw new SQLException("Room " + id + " not found");
        }
        //Close the SQLiteDB connection since SQLite only allows one updater
        sdb.close();
        return rm;
    }

    /**
     * Method: getAllRooms
     * Purpose: gets all rooms
     * @return ArrayList<Room>
     * @throws SQLException
     */
    public ArrayList<Room> getAllRooms() throws SQLException, ClassNotFoundException {
        ArrayList<Room> rooms = new ArrayList<Room>();
        SQLiteDB sdb = new SQLiteDB();
        String sql = "Select * from Room";

        ResultSet rs = sdb.queryDB(sql);

        while (rs.next()) {
            Room rm = new Room();
            rm.setRoomID(rs.getInt("roomNumber"));
            rm.setRoomName(rs.getString("roomName"));
            rm.setRoomDescription(rs.getString("roomDescription"));
            rm.setExits(rs.getString("Exits"));
            rooms.add(rm);
        }

        //Close the SQLiteDB connection since SQLite only allows one updater
        sdb.close();
        return rooms;
    }


    //you will need to create a getItems() method
    public ArrayList<Item> getItems(int roomID) throws GameException{
            return null;
    }

    public String getMap(){
        return null;
    }


    public ArrayList<Room> getRooms(){
        return rooms;
    }

    public void updateRoom(int roomID) throws GameException, SQLException,
            ClassNotFoundException{
        SQLiteDB sdb = new SQLiteDB();
        String sql = "UPDATE ROOM SET visited = 1 WHERE roomNumber = " + roomID;
        sdb.updateDB(sql);
        sdb.close();

    }

    public int isVisited(int roomID) throws SQLException, ClassNotFoundException {
        int visitedNum = 0;
        SQLiteDB sdb = new SQLiteDB();
        String sql = "SELECT visited FROM ROOM WHERE roomNumber = " + roomID;
        ResultSet rs = sdb.queryDB(sql);
        while(rs.next()) {
            visitedNum = rs.getInt("visited");
        }
        sdb.close();
        return visitedNum;
    }

}
