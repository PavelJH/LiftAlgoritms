public class Elevator {
    private int currentFloor;
    private boolean isMovingUp;

    public Elevator(int initialFloor) {
        this.currentFloor = initialFloor;
        this.isMovingUp = true;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void moveUp() {
        currentFloor++;
    }

    public void moveDown() {
        currentFloor--;
    }

    public boolean isMovingUp() {
        return isMovingUp;
    }

    public void setMovingUp(boolean movingUp) {
        isMovingUp = movingUp;
    }
}

