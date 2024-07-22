import java.util.Random;
import java.util.Scanner;

class Gamer{
    int winsRounds = 0;
}
class Computer{
    int winsRounds = 0;
}
class Game{
    Gamer g = new Gamer();
    Computer c = new Computer();
    String choiceOfGamer, choiceOfComputer;
    //int choiceOfGamer1, choiceOfComputer1;
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    public void start() {
        System.out.println("Welcome to Rock - Paper - Scissors");
        System.out.println("Enter the count of won rounds: ");
        int rounds = scanner.nextInt();
        System.out.println("Enter: 1 for rock, 2 for paper, or 3 for scissors");
        System.out.print("Enter your choose: ");

        while(g.winsRounds != rounds && c.winsRounds != rounds){
            int userChoice = scanner.nextInt();
            choiceOfGamer(userChoice);
            int computerChoice = random.nextInt(3) + 1;
            choiceOfComputer(computerChoice);
            checking(choiceOfGamer(userChoice),choiceOfComputer(computerChoice));
        }
    }




    public String choiceOfGamer(int num){
        switch (num) {
            case 1:
                choiceOfGamer = "Rock";
                break;
            case 2:
                choiceOfGamer = "Paper";
                break;
            case 3:
                choiceOfGamer = "Scissors";
                break;
            default:
                choiceOfGamer = "Invalid";
                break;
        }
    return choiceOfGamer;
    }
    public String choiceOfComputer(int num){
        switch (num) {
            case 1:
                choiceOfComputer = "Rock";
                break;
            case 2:
                choiceOfComputer = "Paper";
                break;
            case 3:
                choiceOfComputer = "Scissors";
                break;
        }
        return choiceOfComputer;
    }
    public void checking(String gamer, String computer ) {
        if (gamer == "Invalid") {
            System.out.println("Invalid choice. Please choose 1 for Rock, 2 for Paper, or 3 for Scissors.");
        } else {
            if (gamer == computer) {
                System.out.println("You choose: " + gamer);
                System.out.println("Computer chooses: " + computer);
                System.out.println("Ոչ ոքի!");
            } else if ((gamer == "Rock" && computer == "Scissors") || (gamer == "Paper" && computer == "Rock") || (gamer == "Scissors" && computer == "Paper")) {
                System.out.println("You choose: " + gamer);
                System.out.println("Computer chooses: " + computer);
                System.out.println("You win!");
                g.winsRounds += 1;
                System.out.println("Դու ունես " + g.winsRounds + " հաղթանակ.Համակարգիչը ունի " + c.winsRounds + " հաղթանակ");
            } else {
                System.out.println("You choose: " + gamer);
                System.out.println("Computer chooses: " + computer);
                System.out.println("Computer wins!");
                c.winsRounds += 1;
                System.out.println("You have " + g.winsRounds + " wins.Computer has " + c.winsRounds + " wins");
            }
        }
    }
}
class Main{
    public static void main(String[] args){
        Game game = new Game();
        game.start();
    }
}