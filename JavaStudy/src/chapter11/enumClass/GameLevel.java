package chapter11.enumClass;

public enum GameLevel {
    BEGINNER_LEVEL(1, "초보자"),
    ADVANCED_LEVEL(2, "숙련자"),
    SUPER_LEVEL(3, "고수");

    private int level;
    private String hint;

    GameLevel(int level, String hint) {
        this.level = level;
        this.hint = hint;
    }

    public int getLevel() {
        return level;
    }

    public String getHint() {
        return hint;
    }
}
