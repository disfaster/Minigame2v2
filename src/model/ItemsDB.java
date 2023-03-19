package model;

import controller.GameException;
import controller.Item;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ItemsDB {

    //create a method to getItem.

    public Item getItem(int itemId) throws GameException, SQLException,
            ClassNotFoundException{
        Item item = new Item();
        SQLiteDB sqLiteDB = new SQLiteDB();
        String sql = "SELECT * FROM ITEM WHERE itemID = " + itemId;
        ResultSet rs = sqLiteDB.queryDB(sql);
        while(rs.next()) {

            //check the MonsterDB's getMonster. Almost identical.


        }
        sqLiteDB.close();
        return item;
    }

}
