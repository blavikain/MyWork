import java.util.Arrays;

public class Monster {
    //the game interface
    static char[][] battleBoard = new char[10][10];
    static int[] direction = new int[5];

    public static void buildBattleBoard() {
        for (char[] row : battleBoard)
            Arrays.fill(row, ' ');
    }

    public static void redrawBoard() {
        for (int i = 1; i<=30; i++){
            System.out.print('-');
        }
        System.out.println();

        for (char[] row : battleBoard) {
            for (char element : row) {
                System.out.print("|" + element + "|");
            }
            System.out.println();
        }

        for (int i = 1; i<=30; i++){
            System.out.print('-');
        }
        System.out.println();
    }

    //fields and methods
    public final String TOMBSTONE = "Here lies a dead monster!";

    public String name = "Some Monster";
    public char nameChar = 'M';
    private int attack = 20;
    private int health = 500;
    private int movement = 2;
    public int xPosition = 0;
    public int yPosition = 0;
    private boolean alive = true;
    public static int numOfMonsters = 0;

    public int getAttack() {
        return attack;
    }

    public int getMovement() {
        return movement;
    }

    public int getHealth() {
        return health;
    }

    public boolean getAlive() {
        return alive;
    }

    public void setHealth(int decreaseHealth) {
        health -= decreaseHealth;
        if (health < 0) {
            alive = false;
            battleBoard[this.xPosition][this.yPosition] = ' ';
            numOfMonsters--;
        }
    }


    public void setHealth(double decreaseHealth) {
        health -= (int)decreaseHealth;
        if (health < 0) {
            alive = false;
            battleBoard[this.xPosition][this.yPosition] = ' ';
            numOfMonsters--;
        }
    }

    public Monster(String name, int health, int attack, int movement) {
        this.name = name;
        this.nameChar = this.name.charAt(0);
        this.health = health;
        this.attack = attack;
        this.movement = movement;

        int maxXBoardSpace = battleBoard.length - 1;
        int maxYBoardSpace = battleBoard[0].length - 1;

        int randNumX, randNumY;

        do {
            randNumX = (int) (Math.random() * maxXBoardSpace);
            randNumY = (int) (Math.random() * maxYBoardSpace);
        } while (battleBoard[randNumX][randNumY] != ' ');

        this.xPosition = randNumX;
        this.yPosition = randNumY;

        battleBoard[xPosition][yPosition] = this.nameChar;
        numOfMonsters++;
    }

    public void move() {
        int randDirection = (int)(Math.random() * 4);
        moveDirection(randDirection);
    }

    public void moveDirection(int direction) {
        battleBoard[this.xPosition][this.yPosition] = ' ';
        switch (direction) {
            case 0:
                break;
            case 4:
                if (yPosition-1 >= 0 && battleBoard[xPosition][yPosition-1] == ' ')
                    yPosition--;
                break;
            case 3:
                if (xPosition+1 <= 9 && battleBoard[xPosition+1][yPosition] == ' ')
                    xPosition++;
                break;
            case 2:
                if (yPosition+1 <= 9 && battleBoard[xPosition][yPosition+1] == ' ')
                    yPosition++;
                break;
            case 1:
                if (xPosition-1 >= 0 && battleBoard[xPosition-1][yPosition] == ' ')
                    xPosition--;
                break;
        }
        battleBoard[xPosition][yPosition] = this.nameChar;
    }

    public void attack(Monster enemy) {
        if (this.alive && this.distance(enemy) == 1.0) {
            enemy.setHealth(this.getAttack());
        }
    }

    private double distance(Monster enemy) {
        return Math.sqrt((this.xPosition-enemy.xPosition)*(this.xPosition-enemy.xPosition) + (this.yPosition-enemy.yPosition)*(this.yPosition-enemy.yPosition));
    }
}