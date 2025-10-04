public class Receipt
{
   public static void main(String [] args){
   
      String School = "TREVOR PACKER HS";
      double DrinkP = 1.50;
      double CandyP = 1.25;
      double HotDogP = 2.75;
      double HamburgerP = 3.50;

      int OrderNum = (int)(Math.random() * 101);
      int DrinkNum = (int)(Math.random() * 3);
      int CandyNum = (int)(Math.random() * 3);
      int HotDogNum = (int)(Math.random() * 3);
      int HamburgerNum = (int)(Math.random() * 3);
      double DrinkTotal = (DrinkP * DrinkNum);
      double CandyTotal = (CandyP * CandyNum);
      double HotDogTotal = (HotDogP * HotDogNum);
      double HamburgerTotal = (HamburgerP * HamburgerNum);
      double TaxRate = 0.13;
      double SubTotal = DrinkTotal + CandyTotal + HotDogTotal + HamburgerTotal;
      double TaxTotal= SubTotal * TaxRate;
      double Total= SubTotal + TaxTotal;
    

      System.out.println("**************************************");
      System.out.println("*                                    *");
      System.out.println("*     "+School+" SNACK BAR     *");
      System.out.println("*                                    *");
      System.out.println("*     DRINK ..........$"+DrinkP+"           *");                      
      System.out.println("*     CANDY ..........$"+CandyP+"          *");     
      System.out.println("*     HOT DOG ........$"+HotDogP+"          *");     
      System.out.println("*     HAMBURGER ......$"+HamburgerP+"           *");     
      System.out.println("*                                    *");    
      System.out.println("**************************************");
      System.out.println("* Order Number "+OrderNum+"                    *");    
      System.out.println("* QTY     ITEM          TOTAL        *");    
      System.out.println("**************************************");
      System.out.println("* "+DrinkNum+"       DRINK         "+DrinkTotal+"          *");
      System.out.println("* "+CandyNum+"       CANDY         "+CandyTotal+"          *");   
      System.out.println("* "+HotDogNum+"       HOTDOG        "+HotDogTotal+"          *");    
      System.out.println("* "+HamburgerNum+"       HAMBURGER     "+HamburgerTotal+"          *"); 
      System.out.println("**************************************");
      System.out.println("* SUBTOTAL          "+SubTotal+"              *");    
      System.out.println("* TAX          "+TaxTotal+"                  *");    
      System.out.println("* TOTAL          "+Total+"                *");    
      System.out.println("**************************************");
   }
}
