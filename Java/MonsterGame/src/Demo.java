import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Monster.buildBattleBoard();
        Monster[] Monsters = new Monster[5];
        Monster Player = new Monster("Player", 50, 200, 1);
        Monster.numOfMonsters--;

        for (int i = 0; i < Monsters.length; i++)
            Monsters[i] = new Monster(i + "Goblin", 200, 10*(i+1), 1);

        Monster.redrawBoard();

        do {
            int input = userInput.nextInt();
            Player.moveDirection(input);

            for (Monster m : Monsters) {
                if (m.getAlive())
                    Player.attack(m);
            }

            for (Monster m : Monsters) {
                if (m.getAlive()) {
                    m.move();
                    m.attack(Player);
                }
            }
            Monster.redrawBoard();
            System.out.println(Player.getHealth());

        } while (Monster.numOfMonsters != 0 && Player.getAlive());

        if (Player.getAlive())
            System.out.println("You won!");
        else
            System.out.println("You lost! :(");

        System.out.println("Your health left: " + Player.getHealth());
    }
}
