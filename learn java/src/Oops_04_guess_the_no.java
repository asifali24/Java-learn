import java.util.Random;
import java.util.Scanner;

class GuessTheNo {
    int guessCount = 0;
    int randomNo = 0;

    public GuessTheNo() {
        Random r = new Random();
        randomNo = r.nextInt(1,100);
    }

    public void guess() {
        boolean isCorrectGuess = false;
        Scanner sc = new Scanner(System.in);
        System.out.println(randomNo);
//        do {
//            System.out.println("Enter your no : ");
//            guessCount++;
//            int no = sc.nextInt();
//            if (no == randomNo) {
//                System.out.println("cong correct guess");
//                isCorrectGuess = true;
//            } else if (no > randomNo) {
//                System.out.println("your no is greater than guess no");
//            } else {
//                System.out.println("your no is less than guess no");
//            }
//        } while (!isCorrectGuess);
        while(!isCorrectGuess){
            System.out.println("Enter your no : ");
            guessCount++;
            int no = sc.nextInt();
            if (no == randomNo) {
                System.out.println("cong correct guess");
                isCorrectGuess = true;
            } else if (no > randomNo) {
                System.out.println("your no is greater than guess no");
            } else {
                System.out.println("your no is less than guess no");
            }
        }
    }

    public int getNoOfGuess(){
        return guessCount;
    }
}



public class Oops_04_guess_the_no {
    public static void main(String[] args) {
        GuessTheNo g = new GuessTheNo();
        g.guess();
        int guessCount = g.getNoOfGuess();
        System.out.println("Guess count is : "+guessCount);
    }
}
