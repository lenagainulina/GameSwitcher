import java.util.HashMap;
import java.util.Map;

public class Switcher {

    private Map<GameId, GameStrategy> gameList = new HashMap<>();

    public void enterId(GameId id, GameStrategy strategy){
        gameList.put(id, strategy);
    }

    public void startGame(GameId id){
        gameList.get(id).playGame();
    }
}
