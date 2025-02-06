import java.util.Scanner;

public class Game {
    public static void main(String[] args){
        Map myMap = new Map();
        Scanner input = new Scanner(System.in);
        
        boolean loop = true;
        int playerRole = 0;
        
        int winner = 0;
        
        System.out.print("Input player 1 name: ");
        String player1 = input.nextLine();
        
        System.out.print("Input player 2 name: ");
        String player2 = input.nextLine();
        
        //Like system cls
        System.out.print("\033[H\033[2J"); 
        System.out.flush();
        
        
        System.out.println("=======TIC TAC TOE GAME========");
        myMap.printMap();

        while (loop){
            if (playerRole == 0){
                System.out.print(player1 + " [O] - move[x y]: ");
            } else {
                System.out.print(player2 + " [X] - move[x y]: ");
            }

            int posX = input.nextInt();
            int posY = input.nextInt();
            input.nextLine();
            
            int posFix = posY * 3 + posX; //change position because we use 1D array

            if (posX > 2 || posX < 0 || posY > 2 || posY < 0){
                System.out.println("Position is not valid!");
                continue;
            } else {
                if (myMap.validateLocation(posFix) == 0){
                    continue;
                } else {
                    myMap.getInput(posFix, playerRole);
    
                    if (playerRole == 1){
                        playerRole = 0;
                    } else {
                        playerRole = 1;
                    }
                }
            }
            
            myMap.printMap();

            winner = myMap.winnerCheck();
            int dashCurr = myMap.dash();

            if (winner == 1 || dashCurr == 0){
                loop = false;
                break;
            }
        }

        if (winner == 1){
            if (playerRole == 1){
                System.out.print(player1);
            } else {
                System.out.print(player2);
            }

            System.out.println(" won the game!");
        } else {
            System.out.println("No player won the game!");
        }

    }

}