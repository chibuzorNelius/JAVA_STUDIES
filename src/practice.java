//============================LIFE TIME CALCULATOR==============
//import  java.until.Scanner;

void main() {
//    the code  below is operators pratical, that collacts two numbers from user and use then to perform all the operator example

//======================remove from comment to test
//    Scanner input = new Scanner(System.in);
//    int num1;
//    int num2;
//    System.out.println("enter the first number in your mind: >");
//    num1 = input.nextInt();
//    System.out.println("enter the second number in your mind: >");
//    num2 = input.nextInt();
//
//    System.out.printf("number1 + number2= %d \n", num1 + num2 );
//
//    System.out.printf("number1 - number2= %d \n", num1 - num2 );
//
//    System.out.printf("number1 * number2= %d \n", num1 * num2 );
//
//    System.out.printf("number1 / number2= %d \n", num1 / num2 );
//
//    System.out.printf("number1 %% number2= %d \n", num1 % num2 );
//===============================

//    ======Number Guessing Game =====
//    the is to test my understanding if control flow statements

Scanner input = new Scanner(System.in);

    int secretNumber = 30;
    int guessNumber;
    System.out.println("Guess the secret number");

    guessNumber = input.nextInt();

    // I will use WHILE LOOP cuz we need to keep asking till needs to repeat till you get the correct number
    while (true){
        if (guessNumber > secretNumber){
            System.out.println("your number is higher, try a lower number");
            guessNumber = input.nextInt();
        }
        else if  (guessNumber < secretNumber){
            System.out.println("your number is lower, try a higher number");
            guessNumber = input.nextInt();
        }
        else{
            System.out.println("you guessed the number correctly👍, it's " + secretNumber);
        }break;
//        >.>>>> Lesion Learnt<<<<<
//        I tried using the normal conditional WHILE but something want wrong.
//        I first used while loop that  runs only when the condiction is false and the my IF, ELSE IF workrd but he ELSE did not work cuz the condition have become true so the loop cannot execute anyother thing, only if i will put the last massage upt of the loop.
//        @ but i learnt a new method, by using the (WHILE (TRUE){ }) this method will let all the condition both the terminator to run
    }

}