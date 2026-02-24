import java.util.*;
class Character {
    String name;
    int health;

    public Character(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public void attack(Character target) {
        System.out.println(this.name + " attacks " + target.name);
        // Attack logic goes here
    }
}

public class game {
    public static void main(String[] args) {
        System.out.println("Welcome to the Game!");
        // Game logic goes here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter character name: ");
        String name = scanner.nextLine();
        Character player = new Character(name, 100);
        System.out.println("Character " + player.name + " created with health " + player.health
        );
    }
}
