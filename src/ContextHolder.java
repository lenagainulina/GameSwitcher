import java.util.HashMap;
import java.util.Map;

public class ContextHolder {

    private static Map<Integer, GameStrategy> gameContext = new HashMap<>();


    public static Map<Integer, GameStrategy> getGameContext() {
        gameContext.put(GameTypeEnum.TETRIS.getOrderNumber(), new TetrisGame());
        gameContext.put(GameTypeEnum.HEARTS.getOrderNumber(), new HeartsGame());
        gameContext.put(GameTypeEnum.MEMORY.getOrderNumber(),new MemoryGame());

        return gameContext;
    }
}
