public class BurgerHub {

                                        //----------------------*BURGER HUB*---------------------//

                                             //--------------------*MENU*-------------------//

                                                 //*******Veg Burger Price:- ₹200*******//

                                                  //****Non-Veg Burger Price: ₹400****//

                                                     //*****Cheese Price: ₹100*****//

                                                      //**Toppings Price: ₹100**//

                                                      //*Bag Packing Price: ₹50*//

                                        //-----------------*Thanks For Visit*-----------------//
    private int price;
    private boolean veg;

    private int extraCheesePrice = 100;
    private int extraToppingsPrice = 100;
    private int bagPackPrice = 50;
    private int baseburgerPrice = this.price;

    private Boolean isExtraCheeseAdded = false;
    private Boolean isExtraToppingsAdded = false;
    private Boolean isOptedForTakeAway = false;

    public BurgerHub(boolean veg) {
        this.veg = veg;
        if(this.veg){
            this.price = 200;
        }else{
            this.price = 400;
        }
    }

    public void getburgerPrice(){
        if (this.veg) {
            System.out.println("Veg Burger Price:- ₹"+this.price);
        } else {
            System.out.println("Non-Veg Burger Price:- ₹"+this.price);

        }

    }

    public void addExtraCheese(){
        isExtraCheeseAdded = true;
        this.price += extraCheesePrice;

    }

    public void addExtraToopings(){
        isExtraToppingsAdded = true;
        this.price += extraToppingsPrice;

    }

    public void takeAway(){
        isOptedForTakeAway = true;
        this.price += bagPackPrice;

    }

    public void getBill(){
        String Bill = "";
        if(isExtraCheeseAdded){
            Bill += "Extra Cheese Added: ₹"+extraCheesePrice+ "\n";
        }
        if(isExtraToppingsAdded){
            Bill += "Extra Toppings Added: ₹"+extraToppingsPrice+ "\n";
        }
        if(isOptedForTakeAway){
            Bill += "Take Away: ₹"+bagPackPrice+ "\n";
        }
        Bill += "Bill = ₹"+this.price + "\n";
        System.out.println(Bill);

    }

    public static class DeluxBurger extends BurgerHub{
        public DeluxBurger(Boolean veg){
            super(veg);
            super.addExtraCheese();
            super.addExtraToopings();
        }
    }



    public static void main(String[] args) {
    BurgerHub baseburger = new BurgerHub(true);
    baseburger.getburgerPrice();
    baseburger.addExtraCheese();
    baseburger.addExtraToopings();
    baseburger.takeAway();
    baseburger.getBill();

    DeluxBurger db = new DeluxBurger(true);
    db.takeAway();
    db.getBill();

    }
}
