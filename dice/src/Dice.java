import java.util.Scanner;  //Needed for Scanner class 
 
public class Dice 
{ 
   public static void main(String[] args) 
   { 
      Diceroll die1 = new Diceroll(); 
   
      Diceroll die2 = new Diceroll(); 
   
      Diceroll die3 = new Diceroll(); 
   
      Diceroll die4 = new Diceroll(); 
   
      Diceroll die5 = new Diceroll(); 
       
      int user = 0; 
       
      String latter = ""; 
   
      int total = 0;      //Total of the five die rolled 
       
      System.out.println("Petals Around the Rose is a logic game with "  
                         + "concealed rules, played using 5 standard dice");
      System.out.println("\n"); 
 
      Scanner keyboard = new Scanner(System.in); 
       
      Scanner key = new Scanner(System.in); 
   
      while (!latter.equals("n")) 
      { 
 
         System.out.println("\n"); 
          
         //roll die. 
         die1.setroll((int)(Math.random()*6) + 1);     //first die rolled 
   
         die2.setroll((int)(Math.random()*6) + 1);     //secend die rolled 
 
         die3.setroll((int)(Math.random()*6) + 1);     //third die rolled 
   
         die4.setroll((int)(Math.random()*6) + 1);     //fourth die rolled 
   
         die5.setroll((int)(Math.random()*6) + 1);     //fifth die rolled 
   
         die1.display(); 
   
         System.out.println("\n"); 
   
         die2.display(); 
   
         System.out.println("\n"); 
   
         die3.display(); 
   
         System.out.println("\n"); 
   
         die4.display(); 
   
         System.out.println("\n"); 
   
         die5.display(); 
 
         int add1 = 0; 
 
         die1.data(); 
       
         add1 = die1.getdata(); 
 
         int add2 = 0; 
 
         die2.data(); 
       
         add2 = die2.getdata(); 
 
         int add3 = 0; 
 
         die3.data(); 
       
         add3 = die3.getdata(); 
 
         int add4 = 0; 
 
         die4.data(); 
       
         add4 = die4.getdata(); 
 
         int add5 = 0; 
 
         die5.data(); 
       
         add5 = die5.getdata(); 
       
         total = add1 + add2 + add3 + add4 + add5; 
       
         System.out.println("Hint 1: you need to think of a rose"); 
       
         user = keyboard.nextInt(); 
       
         int count = 1; 
       
         while (count != 4) 
         {  
                 
            if (user == total) 
            { 
               System.out.println("you are right and you are part of the brotherhood of rose"); 
               count = 4; 
            } 
         
            if (count == 1) 
            { 
               System.out.println("Hint 2: it will min 0, and max 20"); 
               user = keyboard.nextInt(); 
           
               if (user == total) 
               { 
                  System.out.println("you are right and you are part of the  brotherhood of rose"); 
                  count = 4; 
               } 
         
               else 
                  count++; 
            } 
         
            if (count == 2) 
            { 
               System.out.println("Hint 3: It will be even"); 
               user = keyboard.nextInt(); 
               if (user == total) 
               { 
                  System.out.println("you are right and you are part of the brotherhood of rose"); 
                  count = 4; 
               } 
         
               else 
                  count++; 
            } 
         
            if (count == 3) 
            { 
               System.out.println("Sorry The right answer is " + total); 
               count++; 
            } 
         } 
       
         System.out.println("you what to replay the game y/n: "); 
       
         latter = key.next(); 
      } 
 
   }     
} 
 
class Diceroll 
{ 
   private int dice; 
    
   private int gamedata; 
    
   public void setroll(int number) 
   {    
      dice = number; 
   } 
    
   public int getroll() 
   { 
      return dice; 
   } 
    
   public void display() 
   { 
      switch(dice){ 
         case 1: 
            System.out.println("     \n" +  
                               "   *  \n" + 
                               "     \n"); 
            break; 
         case 2: 
            System.out.println(" *   \n" +  
                               "     \n" + 
                               "     *\n"); 
            break; 
         case 3: 
            System.out.println(" *   \n" +  
                               "   *  \n" + 
                               "     *\n"); 
            break; 
         case 4: 
            System.out.println(" *   * \n" +  
                               "       \n" + 
                               " *   * \n"); 
            break; 
         case 5: 
            System.out.println(" *   * \n" +  
                               "   *   \n" + 
                               " *   * \n"); 
            break; 
         case 6: 
            System.out.println(" *   * \n" +  
                               " *   * \n" + 
                               " *   * \n"); 
            break; 
      } 
   } 
    
   public void data() 
   { 
      switch(dice){ 
         case 1: 
            gamedata = 0; 
            break; 
         case 2: 
            gamedata = 0; 
            break; 
         case 3: 
            gamedata = 2; 
            break; 
         case 4: 
            gamedata = 0; 
            break; 
         case 5: 
            gamedata = 4; 
            break; 
         case 6: 
            gamedata = 0; 
            break; 
      } 
   } 
 
   public int getdata() 
   { 
      return gamedata; 
   } 
    
}