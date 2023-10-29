package suborg.proga;

import java.util.Scanner;

public class UFOEncounter {
    public void recordEncounter() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the date of the UFO encounter:");
        String date = scanner.nextLine();

        System.out.println("I wish you new meetings with UFOs and after " + date + "!");
    }
}