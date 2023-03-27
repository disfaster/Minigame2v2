package controller;

public class Item   {

    //provide attributes for Item data
    private int itemID;
    private String itemName;
    private String itemDescription;

    public Item(){
        this.itemID = 1;
        this.itemName = " ";
        this.itemDescription = " ";
    }
    public Item(int itemID, String itemName, String itemDescription) {
        this.itemID = itemID;
        this.itemName = itemName;
        this.itemDescription = itemDescription;
    }

    //getter and setters

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }


    //display() to return item's description
    public void display(){
        System.out.println(itemDescription);
    }
    //toString() method to provide information of attribute data of item.
    @Override
    public String toString() {
        return "Item: " + "Item ID = " + itemID + ", Item Name = " + itemName + ", Item Description = " + itemDescription;
    }
}
