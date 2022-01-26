package selects;

import action.*;

import java.util.Scanner;

public class SelectAction {

    public  static  void  selectAction (int numberTask){
        Scanner scanner = new Scanner(System.in);
        int selectNumber;
        if(numberTask == 1){
            EvenNumber.determinesNumberEvenOrNotEven();
        }
        else if(numberTask == 4){
            Fibonacci.firstFiftyNumber();
        }
        else if(numberTask == 3){
            Reverse.reverseString();
        }
        else if(numberTask == 5){
            Replace.replaceLetterOnSymbol();
        }
        else if(numberTask == 2){
            Armstrong.armstrongNumber();
        }
        else {
            System.out.println("Error number, can you repeat");
            selectNumber = scanner.nextInt();
            SelectAction.selectAction(selectNumber);
        }

    }
}
