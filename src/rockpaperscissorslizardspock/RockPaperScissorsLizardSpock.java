
package rockpaperscissorslizardspock;

import java.util.Random;
import java.util.Scanner;


public class RockPaperScissorsLizardSpock {


    public static void main(String[] args) {
        int player = 0;
        int computer = 0;
        String p; //for the player's choice
        int ap = 0;
        int ac = 0;
        char answer;
        boolean error = true;
        Scanner input = new Scanner (System.in);
        Random rand = new Random();
        boolean again = true;
        while(again == true){
        
        
        
        
        System.out.println("Choose from rock, paper, scissors, lizard or Spock");
        p = input.next();
        if((!"rock".equals(p))&&(!"paper".equals(p))&&(!"scissors".equals(p))&&(!"lizard".equals(p))&&(!"spock".equals(p))){
            while(error == true){
                if((!"rock".equals(p))&&(!"paper".equals(p))&&(!"scissors".equals(p))&&(!"lizard".equals(p))&&(!"spock".equals(p))){
                System.out.println("Invalid option, try again");
                p = input.next();
            } else {
                    error = false;
                }
        }
    }
        if("rock".equals(p)){
            ap = 1;
        } else if("paper".equals(p)){
            ap = 2;
        } else if ("scissors".equals(p)){
            ap = 3;
        } else if ("lizard".equals(p)){
            ap = 4;
        } else {
            ap = 5;
        }
    ac = rand.nextInt(5) + 1;
            switch (ap) {
                case 1:
        switch (ac) {
            case 1:
                System.out.println("Draw");
                break;
            case 2:
                System.out.println("Paper covers rock so the computer wins");
                computer = computer + 1;
                break;
            case 3:
                System.out.println("Rock breaks scissors so you win");
                player = player + 1;
                break;
            case 4:
                System.out.println("Rock crushes lizard so you win");
                player = player + 1;
                break;
            default:
                System.out.println("Spock vaporises rock so the computer wins");
                computer = computer + 1;
                break;
        }
break;
                case 2:
        switch (ac) {
            case 1:
                System.out.println("Paper covers rock so you win");
                player = player + 1;
                break;
            case 2:
                System.out.println("Draw");
                break;
            case 3:
                System.out.println("Scissors cuts paper so the computer wins");
                computer = computer + 1;
                break;
            case 4:
                System.out.println("Lizard eats paper so the computer wins");
                computer = computer + 1;
                break;
            default:
                System.out.println("Paper disproves Spock so you win");
                player = player + 1;
                break;
        }
break;
                case 3:
        switch (ac) {
            case 1:
                System.out.println("Rock breaks scissors so the computer wins");
                computer = computer + 1;
                break;
            case 2:
                System.out.println("Scissors cuts paper so you win");
                player = player + 1;
                break;
            case 3:
                System.out.println("Draw");
                break;
            case 4:
                System.out.println("Scissors decapitates lizard so you win");
                player = player + 1;
                break;
            default:
                System.out.println("Spock breaks scissors so the computer wins");
                computer = computer + 1;
                break;
        }
break;
                case 4:
        switch (ac) {
            case 1:
                System.out.println("Rock crushes lizard so the computer wins");
                computer = computer + 1;
                break;
            case 2:
                System.out.println("Lizard eats paper so you win");
                player = player + 1;
                break;
            case 3:
                System.out.println("Scissors decapitates lizard so the computer wins");
                computer = computer + 1;
                break;
            case 4:
                System.out.println("Draw");
                break;
            default:
                System.out.println("Lizard poisons Spock so you win");
                player = player + 1;
                break;
        }
break;
                default:
        switch (ac) {
            case 1:
                System.out.println("Spock vaporises rock so you win");
                player = player + 1;
                break;
            case 2:
                System.out.println("Paper disproves Spock so the computer wins");
                computer = computer + 1;
                break;
            case 3:
                System.out.println("Spock breaks scissors so you win");
                player = player + 1;
                break;
            case 4:
                System.out.println("Lizard poisons Spock so the computer wins");
                computer = computer + 1;
                break;
            default:
                System.out.println("Draw");
                break;
        }
break;
            }
    System.out.println("    Player          Computer");
    System.out.println("      " + player + "                " + computer);
    System.out.println();
    System.out.println("Would you like to play again?(y/n)");
    char ans = input.next().charAt(0);
    if((ans != 'y')&&(ans != 'n')){
        error = true;
        System.out.println("Invalid option, try again");
        ans = input.next().charAt(0);
        while(error == true){
            if((ans != 'y')&&(ans != 'n')){
                System.out.println("Invalid option, try again");
            } else {
                error = false;
            }
        }
    }
    if(ans == 'y'){
        again = true;
    } else {
        again = false;
    }
}
    }
}