package B_Matrices.Exercises;

import java.util.Scanner;

public class G_CollectTheCoins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[][] matrix = new char[4][];

        for (int i = 0; i < 4; i++) {
            char[] strings = scanner.nextLine().toCharArray();
            matrix[i]=strings;
        }

        char[] commands = scanner.nextLine().toCharArray();

        int coins = 0;
        int wallsHit=0;
        int currRow=0;
        int currCol=0;

        for (int i = 0; i < commands.length; i++) {
            char command = commands[i];

            try {
                if (command == 'V'){
                    if (matrix[currRow+1][currCol]=='$'){
                        currRow++;
                        coins++;
                    }
                    else{
                        currRow++;
                    }
                }

                else if (command == '<'){
                    if (matrix[currRow][currCol-1]=='$'){
                        currCol--;
                        coins++;
                    }
                    else{
                        currCol--;
                    }
                }

                else if (command == '^'){
                    if (matrix[currRow-1][currCol]=='$'){
                        currRow--;
                        coins++;
                    }
                    else{
                        currRow--;
                    }
                }

                else if(command == '>'){
                    if (matrix[currRow][currCol+1]=='$'){
                        coins++;
                        currCol++;
                    }
                    else{
                        currCol++;
                    }
                }
            }

            catch (IndexOutOfBoundsException e){
                wallsHit++;
            }
        }

        System.out.println("Coins = "+coins);
        System.out.println("Walls = "+wallsHit);
    }
}
