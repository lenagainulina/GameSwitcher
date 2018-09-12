import java.util.Scanner;

public class Client {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a game! \nPress a number: \n'1' for tetris \n'2' for memory \n'3' for hearts");
        int n1 = scanner.nextInt();

        processRequest(n1);

    }

    public static void processRequest(int input){
        Switcher switcher = new Switcher();

        GameStrategy tetris = new TetrisGame();
        GameStrategy memory = new MemoryGame();
        GameStrategy hearts = new HeartsGame();

        switcher.enterId(GameId.TETRIS, tetris);
        switcher.enterId(GameId.MEMORY, memory);
        switcher.enterId(GameId.HEARTS, hearts);

        if (input ==1){
        switcher.startGame(GameId.TETRIS);}
        if (input ==2){
        switcher.startGame(GameId.MEMORY);}
        if (input ==3){
        switcher.startGame(GameId.HEARTS);}
    }
}
