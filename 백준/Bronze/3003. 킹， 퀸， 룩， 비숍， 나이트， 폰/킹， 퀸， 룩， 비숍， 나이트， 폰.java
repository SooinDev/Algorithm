import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int king = 1;
        int queen = 1;
        int rook = 2;
        int bishop = 2;
        int knight = 2;
        int pawn = 8;

        int tempKing = Integer.parseInt(st.nextToken());
        int tempQueen = Integer.parseInt(st.nextToken());
        int tempRook = Integer.parseInt(st.nextToken());
        int tempBishop = Integer.parseInt(st.nextToken());
        int tempKnight = Integer.parseInt(st.nextToken());
        int tempPawn = Integer.parseInt(st.nextToken());

        int answerKing = king - tempKing;
        int answerQueen = queen - tempQueen;
        int answerRook = rook - tempRook;
        int answerBishop = bishop - tempBishop;
        int answerKnight = knight - tempKnight;
        int answerPawn = pawn - tempPawn;

        bw.write(answerKing + " " + answerQueen + " " + answerRook + " " + answerBishop + " " + answerKnight + " " + answerPawn);
        bw.flush();
        bw.close();
    }
}