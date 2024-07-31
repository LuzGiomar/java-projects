import java.util.Scanner;

public class  PedraPapelTesoura {

    public static void main(String[] args) 

    Scanner scanner = new Scanner(System.in);

       while (true) { 
       String[] ppt = {"p", "p", "t"};
       String computerMove = ppt [new random(). nextInt (ppt.length)];

       
       String playerMove;
       }
       while (true) { 
       System.out.println("Please enter your move (p, p, ou t)");
       playerMove = scanner.nextLine();
       if (playerMove.equals.("p") | | playerMove.equals.("p") | | playerMove.equals.("t")) {
        break;
       }  
       System.out.println(playerMove + " is not a valid move.");

       System.out.println("computer played: " + computerMove);

       if (playerMove.equals(computerMove)) {
         System.out.println("The game was a tie!");
       }
       else if  (playerMove.equals("p")) {
        if (computerMove.equals("p")){
            System.out.println("You lose!");
        
        } else if (computerMove.equals ("t")) {
            System.out.printlin("You win!");

            else if  (playerMove.equals("p")) {
                if (computerMove.equals("p")){
                    System.out.println("You win!");
                
                } else if (computerMove.equals ("t")) {
                    System.out.printlin("You lose!");

                    else if  (playerMove.equals("t")) {
                        if (computerMove.equals("p")){
                            System.out.println("You win!");
                        
                        } else if (computerMove.equals ("p")) {
                            System.out.printlin("You lose!");
                     }
                 }
                 System.out.printlin("Play again? (y/n)");
                 String playAgain = scanner.nextLine();
                 
                 if (!playAgain.equals("y")) {
                    break;
                 }

                 scanner.close();
             }
           }



         }
       }
    }
}  