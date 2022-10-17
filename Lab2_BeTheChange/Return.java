public class Return {
    private double paid;
    private double total;
    public Return(double purchase, double tendered)
    {
        total = purchase;
        paid = tendered;
    }
    public void makeChange()
    {
        double change = paid - total;
        int centsChange = (int)(100*change+0.5);
        int coinsChange = centsChange%100;
        int billsChange = (centsChange-coinsChange)/100; 
        System.out.println("Your change is " + billsChange + " dollars and " + coinsChange + " cents");
        System.out.println(coinsChange + " cents is returned as: ");
        int totalQuarters = ((coinsChange-(coinsChange%25))/25);
        coinsChange -= totalQuarters*25;
        System.out.println(totalQuarters + " quarters");
        int totalDimes = ((coinsChange-(coinsChange%10))/10);
        coinsChange -= totalDimes*10;
        System.out.println(totalDimes + " dimes");
        int totalNickels = ((coinsChange-(coinsChange%5))/5);
        coinsChange -= totalNickels*5;
        System.out.println(totalNickels + " nickels");
        int totalPennies = coinsChange;
        System.out.println(totalPennies + " pennies");
        }
    }