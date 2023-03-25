public class ElevatorController {
    private Elevator[] elevators;

    public ElevatorController(int numElevators) {
        elevators = new Elevator[numElevators];
        for (int i = 0; i < numElevators; i++) {
            elevators[i] = new Elevator(0);
        }
    }

    public void requestElevator(int floor) {
        Elevator closestElevator = findClosestElevator(floor);
        closestElevator.setMovingUp(floor > closestElevator.getCurrentFloor());
        while (closestElevator.getCurrentFloor() != floor) {
            if (closestElevator.isMovingUp()) {
                closestElevator.moveUp();
            } else {
                closestElevator.moveDown();
            }
        }
    }

    private Elevator findClosestElevator(int floor) {
        Elevator closestElevator = null;
        int minDistance = Integer.MAX_VALUE;
        for (Elevator elevator : elevators) {
            int distance = Math.abs(elevator.getCurrentFloor() - floor);
            if (distance < minDistance) {
                closestElevator = elevator;
                minDistance = distance;
            }
        }
        return closestElevator;
    }

}
