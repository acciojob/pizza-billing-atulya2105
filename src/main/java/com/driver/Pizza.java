package com.driver;

public class Pizza {

    private int price;// total price of pizza
    private Boolean isVeg;
    private String bill;
    private int cheesePrice;
    private int toppingPrice;
    private int paperBagPrice;


    private  boolean extraCheese;
    private boolean isBillGenerated;
    private boolean extraTopping;
    private boolean takeAway;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.cheesePrice=80;
        this.paperBagPrice=20;


        if(isVeg==true){
            this.price=300;
            this.toppingPrice=70;
        }
        else{
            this.price= 400;
            this.toppingPrice=120;
        }
        extraCheese=false;
        extraTopping=false;
        takeAway=false;

        this.bill="Base Price Of The Pizza: "+this.price+"\n";
        // your code goes here
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(extraCheese==false){
            this.price=this.price+this.cheesePrice;
            extraCheese=true;// your code goes here
        }
    }

    public void addExtraToppings(){
        if(extraTopping==false){
            this.price=this.price+this.toppingPrice;
            extraTopping=true;// your code goes here
        }
    }

    public void addTakeaway(){
        if(takeAway==false){
            this.price=this.price+this.paperBagPrice;
            takeAway=true;// your code goes here
        }
    }

    public String getBill(){
        if(isBillGenerated==false){
            if(extraCheese==true){
                this.bill=this.bill+"Extra Cheese Added: "+this.cheesePrice+"\n";// your code goes here
            }
            if(extraTopping==true){
                this.bill=this.bill+"Extra Toppings Added: "+this.toppingPrice+"\n";
            }
            if(takeAway==true){
                this.bill=this.bill+"Paperbag Added: "+this.paperBagPrice+"\n";
            }
            this.bill=this.bill+"Total Price: "+this.price+"\n";
            isBillGenerated=true;
        }
        return this.bill;
    }
}