import java.util.Scanner;

public class Client {

    public static void main(String[] args) {

        printIntroduction();
        int userInput = getUserInput();

    //    runMenuWithEnum(userInput);
        runMenuWithMap(userInput);

    }

    private static void printIntroduction(){
        System.out.println("Enter a number to choose a game");
        for(GameTypeEnum gameTypes : GameTypeEnum.values()){
            System.out.println("Game number: [" + gameTypes.getOrderNumber() + "] game: '" + gameTypes.getGameName() + "'");
        }
    }


    private static int getUserInput(){
        System.out.print("You've chosen: ");
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    private static void runMenuWithEnum(int gameNumber) {
        GameTypeEnum.findGameTypeByNum(gameNumber).getGame().playGame();
    }

    private static void runMenuWithMap(int gameNumber) {
        ContextHolder.getGameContext().get(gameNumber).playGame();
    }

}