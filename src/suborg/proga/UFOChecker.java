package suborg.proga;

import java.util.Scanner;

public class UFOChecker {
    public void checkUFO() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Вы видели НЛО? (да/нет):");
        String answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("да")) {
            UFOEncounter ufoEncounter = new UFOEncounter();
            ufoEncounter.recordEncounter();
        } else if (answer.equalsIgnoreCase("нет")) {
            System.out.println("I wish you good luck in the search for UFOs! Goodbye!");
        } else {
            System.out.println("Incorrect response. Please enter 'да' or 'нет'.");
            checkUFO();
        }
    }
}