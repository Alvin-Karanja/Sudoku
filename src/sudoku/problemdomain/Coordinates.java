package sudoku.problemdomain;

import java.util.Objects;

import static com.sun.tools.javac.main.Option.O;

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
        if (o == null || getClass() != o.getClass()) return false;
        Coordinates that = (Coordinates) o;
        return x == that.x &&
                y == that.y;
    }

    // Hash code function
    @Override
    public int hashCode(){
        return Objects.hash(x, y);
    }
}
