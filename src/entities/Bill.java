package entities;

public class Bill {

    public char gender;
    public int qBeer;
    public int qSoftDrink;
    public int qBarbecue;

    public static double BEER = 5.00;
    public static double SOFT_DRINK = 3.00;
    public static double BARBECUE = 7.00;
    public static double COUVERT = 4.00;




    public double feeding() {
        return (qBeer * BEER) + (qSoftDrink * SOFT_DRINK) + (qBarbecue * BARBECUE);
    }
    
    public double couvert() {
        if (feeding() < 30.0) {
            return COUVERT;
        }
        else {
        	return 0.0;
        }
    }

    public double ticket() {
        if (gender == 'F') {
            return 8.00;
        }
        else {
            return 10.00;
        }
    }

    public double total() {
        return feeding() + couvert() + ticket();
    }
}