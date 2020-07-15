package sudoku.problemdomain;

public class Coordinates {
    // Functions
    private final int x;
    private final int y;

    // Constructor
    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getters
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    }
}
