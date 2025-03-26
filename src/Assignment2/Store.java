package Assignment2;

public class Store {
    private final String crisps = "Crisps";
    private final String redBull = "Red Bull";
    private int crispsAmount = 0;
    private int redBullAmount = 0;

    public void addCrisps(int amount){
        crispsAmount += amount;
    }

    public void addRedBull(int amount){
        redBullAmount += amount;
    }

    public void printStock(){
        String info = crisps + ": " + crispsAmount + " " + redBull + ": " + redBullAmount;
        System.out.println(info);
    }

}
