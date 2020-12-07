//package main.java;

public class Steward {

    CommandIF command;

    public void fulfillOrder(CommandIF commandObject)
    {
        command = commandObject;
        command.getOrderUp();
    }
}
