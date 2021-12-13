import java.util.Random;
import java.util.Scanner;
public class rpcProject {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("----------Game Start-----------");

        int userChoice;
        int machineChoice;
        int totalUserWin = 0;
        int totalMachineWin = 0;
        while (totalUserWin < 5 && totalMachineWin < 5) {
            Random rnd = new Random();
            machineChoice = rnd.nextInt(3) + 1;

            System.out.println(" Rock=1 , Paper=2 , Scissors=3 ");
            System.out.print (" Enter your choice = ");
            userChoice = scan.nextInt();
            System.out.println("User Choice = " +  userChoice);
            System.out.println("Machine Chose = " + machineChoice);
            if (userChoice != 1 && userChoice != 2 && userChoice != 3) {
                System.out.println("You cannot chose this character.Please enter valid character.");
            } else {
                if (machineChoice == userChoice) {
                    System.out.println        (" Draw ");
                    System.out.println("Nobody won this round.");
                } else if ((machineChoice == 1 && userChoice == 3) || (machineChoice == 2 && userChoice == 1) ||
                        (machineChoice == 3 && userChoice == 2)) {
                    totalMachineWin++;
                    System.out.println("You lost this round.");
                    System.out.println("Round finish  Score===>     MACHINE SCORE =" + totalMachineWin + " ----- USER SCORE =" + totalUserWin);
                } else {
                    totalUserWin++;
                    System.out.println("Well done. You won this round.");
                    System.out.println("Round finish  Score===>  MACHINE SCORE=" + totalMachineWin + " ----- USER SCORE=" + totalUserWin);
                }
                if (totalUserWin==5) {
                    System.out.println("You win the game. Humanity always find a way.");

                    System.out.println("------------------Game Over------------------");
                }
                if (totalMachineWin==5) {
                    System.out.println( "Technology always win.You lost the game.");

                    System.out.println("-----------------Game Over---------------");
                }
            }
        }

    }
}
