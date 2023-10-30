package Model;

public class Robot {
    private char icon;
    private Layout layout;
    public char getIcon() {
        return icon;
    }

    private Position position;

    public Position getPosition() {
        return position;
    }

    public void moveUp(int steps) {
        Position currentPosition = this.getPosition();
        int newY = currentPosition.getY() - steps;
        if (newY >= 0) {
            currentPosition.setY(newY);
        } else {
            System.out.println("Robot tidak dapat keluar dari area permainan.");
        }
    }

    public void moveDown(int steps) {
        Position currentPosition = this.getPosition();
        int newY = currentPosition.getY() + steps;
        if (newY < layout.getMaxY()) {
            currentPosition.setY(newY);
        } else {
            System.out.println("Robot tidak dapat keluar dari area permainan.");
        }
    }

    public void moveLeft(int steps) {
        Position currentPosition = this.getPosition();
        int newX = currentPosition.getX() - steps;
        if (newX >= 0) {
            currentPosition.setX(newX);
        } else {
            System.out.println("Robot tidak dapat keluar dari area permainan.");
        }
    }

    public void moveRight(int steps) {
        Position currentPosition = this.getPosition();
        int newX = currentPosition.getX() + steps;
        if (newX < layout.getMaxX()) {
            currentPosition.setX(newX);
        } else {
            System.out.println("Robot tidak dapat keluar dari area permainan.");
        }
    }


    public void setPosition(Position position) {
        this.position = position;
    }

    public Robot(char icon, Position position, Layout layout) {
        this.icon = icon;
        this.position = position;
        this.layout = layout;
    }
}
