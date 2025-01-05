//public class  {
//}
import java.util.Scanner;
import java.util.Random;

class game{
    int ra,number,flag=0;
    public void game(){
        Random ran = new Random();
        ra = ran.nextInt(1,100);
//        return ra;
    }

    public void takeUserInput() {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter your guess");
            number = sc.nextInt();
            if (ra > number) {
                System.out.println("higher");
                flag++;
            } else if (ra < number) {
                System.out.println("lower");
                flag++;
            }
        }
        while (number != ra);
    }

    public void isCorrectNumber(){
        System.out.println("Correct guess");
    }

    public void result(){
        if(flag<= 3){
            System.out.println("Pro player");
        } else if (flag >3 && flag <=7) {
            System.out.println("Good player");
        } else if (flag > 7) {
            System.out.println("Noob player");
        }

    }
}
public class Oops_03_sol_copy {
    public static void main(String[] args) {
        game obj = new game();
        obj.game();
        obj.takeUserInput();
        obj.isCorrectNumber();
        obj.result();

    }
}