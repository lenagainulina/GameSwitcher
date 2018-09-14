public enum GameTypeEnum {
    TETRIS(1, TetrisGame.class.getSimpleName(), new TetrisGame()),
    MEMORY(2, MemoryGame.class.getSimpleName(), new MemoryGame()),
    HEARTS(3, HeartsGame.class.getSimpleName(), new HeartsGame());

    private final String gameName;
    private final Integer orderNumber;
    private final GameStrategy game;

    GameTypeEnum(Integer orderNumber, String gameName, GameStrategy game) {
        this.gameName = gameName;
        this.orderNumber = orderNumber;
        this.game = game;
    }

    public String getGameName() {
        return gameName;
    }

    public Integer getOrderNumber() {
        return orderNumber;
    }

    public GameStrategy getGame() {
        return game;
    }

    public static GameTypeEnum findGameTypeByNum(Integer num) {
        for (GameTypeEnum gameType : GameTypeEnum.values()) {
            if (gameType.getOrderNumber().equals(num)) {
                return gameType;
            }
        }
        return null;
    }
}
