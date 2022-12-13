package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int CheesePrice;
    private int toppingPrice;
    private int bagPrice;
    boolean CheesePriceAdded ;
    boolean toppingPricesAdded;
    boolean bagPriceAdded ;
    boolean isBillGenrated;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.CheesePrice = 80;
        this.bagPrice = 20;
        // your code goes here
        if(isVeg==true){
            this.price = 300;
            this.toppingPrice = 70;
        }else{
            this.price = 400;
            this.toppingPrice = 120;
        }

        this.CheesePriceAdded = false;
        this.toppingPricesAdded = false;
        this.bagPriceAdded = false;
        this.isBillGenrated = false;
        this.bill = "Base Price Of The Pizza "+this.price+'\n';
       // System.out.println("Base Price Of The Pizza "+this.price+'\n');
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(CheesePriceAdded==false){
            this.price = this.price + this.CheesePrice;
            CheesePriceAdded = true;
        }

        return;
    }

    public void addExtraToppings(){
        // your code goes here
        if(toppingPricesAdded==false){
            this.price = this.price + this.toppingPrice;
            toppingPricesAdded = true;
        }

        return;
    }

    public void addTakeaway(){
        // your code goes here
        if(bagPriceAdded==false){
            this.price = this.price + this.bagPrice;
            bagPriceAdded = true;
        }

        return;
    }

    public String getBill(){
        // your code goes here
        if(isBillGenrated==false){
            if(CheesePriceAdded==true){
                this.bill = "Extra Cheese Added: "+this.CheesePrice+'\n';
                CheesePriceAdded = false;

            }
            if(toppingPricesAdded==true){
                this.bill = "Extra Toppings Added: "+this.toppingPrice+'\n';
                toppingPricesAdded = false;
            }
            if(bagPriceAdded==true){
                this.bill = "Paper bag Added: "+this.bagPrice+'\n';
                bagPriceAdded = false;
            }
            this.bill = "Total Price:" + this.price;
            isBillGenrated = true;

        }


        return this.bill;
    }
}
