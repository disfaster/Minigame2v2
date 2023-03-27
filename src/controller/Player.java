package controller;

import java.util.ArrayList;

public class Player {

    //add attributes Player object needs
    private int currentRoom;
    private ArrayList<Item> itemInventory;

    ArrayList<Item> items;
    //constructor
    public Player(){
        this.currentRoom = 1;
        this.itemInventory = items = new ArrayList<Item>();
    }

    public Player(int currentRoom, ArrayList<Item> itemInventory) {
        this.currentRoom = currentRoom;
        this.itemInventory = itemInventory;
    }

    //getters and setters

    public int getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(int currentRoom) {
        this.currentRoom = currentRoom;
    }

    public ArrayList<Item> getItemInventory() {
        return itemInventory;
    }

    public void setItemInventory(ArrayList<Item> itemInventory) {
        this.itemInventory = itemInventory;
    }

    //addItem method
    public void addItem(Item it){
        this.itemInventory.add(it);
        System.out.println(it.getItemName() + " has been added to your inventory.");
    }
    //removeItem method
    public void removeItem(Item it){
        for(Item i : itemInventory){
            if (i.getItemName().equalsIgnoreCase(it.getItemName())){
                itemInventory.remove(i);
                System.out.println(i.getItemName() + " has been removed from your inventory.");
            }
            else{
                System.out.println(i.getItemName() + " is not in your inventory.");
            }
        }
    }
    //printInvetory() method
    public void printInventory(){
        System.out.println(itemInventory.toString());
    }
    //you can add more method as you need.
}
