package Exam_Retake_May_2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class C_ChessKnight {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> result = new ArrayList<>();
        int offboard = 0;
        int invalid = 0;
        String[][] chessBoard = new String[8][8];

        for (int i = 0; i < 8; i++) {
            String[] cells = reader.readLine().split("\\|");
            chessBoard[i] = cells;
        }


        String startPosition = reader.readLine();
        int playerRow = Integer.parseInt(startPosition.substring(0,1));
        int playerCol = Integer.parseInt(startPosition.substring(1,2));

        boolean isValid = true;
        while (!"END".equals(startPosition = reader.readLine())){
            String[] newPoint = startPosition.split(" ");

            int nextRow = Integer.parseInt(newPoint[1].substring(0,1));
            int nextCol = Integer.parseInt(newPoint[1].substring(1,2));

            try{
                if (nextRow == playerRow-2 && (nextCol==playerCol-1 || nextCol==playerCol+1) ||
                        nextRow == playerRow+2 && (nextCol==playerCol-1 || nextCol==playerCol+1) ||
                        nextRow == playerRow-1 && (nextCol==playerCol-2 || nextCol==playerCol+2)||
                        nextRow == playerRow+1 && (nextCol==playerCol-2 || nextCol==playerCol+2) ||
                        nextRow == playerRow && nextCol==playerCol
                        ){
                    playerRow = nextRow;
                    playerCol = nextCol;
                    if (!chessBoard[playerRow][playerCol].equals(" ")){
                        result.add(chessBoard[playerRow][playerCol]);
                    }
                }else {
                    invalid++;
                    isValid=false;
                }
            }catch (IndexOutOfBoundsException e){
                offboard++;
            }
        }

        StringBuilder stats = new StringBuilder();
        stats.append("Pieces take: ").append(String.join(", ",result)).append(System.lineSeparator())
                .append("Invalid moves: ").append(invalid).append(System.lineSeparator())
                .append("Board out moves: ").append(offboard).append(System.lineSeparator());

        System.out.println(stats);
    }
}
