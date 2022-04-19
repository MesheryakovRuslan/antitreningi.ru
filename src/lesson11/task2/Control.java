package lesson11.task2;

import java.util.Scanner;

public class Control {
    private int totalSum;
    private Controller lastAction = null;

    public boolean nextStep() {
        Controller nextStep = this.getNextStep();
        if (nextStep == null) {
            return false;
        }
        nextStep.action();
        this.lastAction = nextStep;
        return true;
    }

    public Controller getNextStep() {
        if (this.lastAction == null) {
            return Controller.START_SELECT_CATEGORIES;
        }
        Scanner scanner = new Scanner(System.in);
        int userSelect = scanner.nextInt();
        return this.lastAction.getNextAction(userSelect);
    }
}