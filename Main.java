public class Main {
    public static void main(String[] args) {
        int balance = 200 ;
        int refill = 100 ;
        int priceBonus = 100 ;

        int bonus = refill / priceBonus ;
        int total = balance + refill ;
        int creditedBonus = 0 ;

        if (refill >= 1000) {
            total = balance + refill + bonus ;
            creditedBonus = bonus ;
        }
        
        System.out.println("Итоговый баланс " + total);
        System.out.println( "Начислено " + creditedBonus + " бонусов");
  } 
}