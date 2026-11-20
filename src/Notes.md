fgbv//import java.until.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
//    camel caseing is the  best practice for creating variables in java
int age = 19;
int num;
num = 711;

//JAVA also supports declearation of multiple varables in one line but shearing same data type


//      ---DATA TYPES---
//    every data type has a specific space they take in your storage
//    >> CATEGORY= primetive: datas stores = the main value
//      # int for a whole number (int k = 23). it has limits of values to store
//            |__ long = 765l. this is the loner version of int storing
//            |___  short = 987. this is the shorter version of int
//            |___byte = 9876. the shortest version
//                    --------LITERALS--------- = the value of the variables
//                    |__ binary = (0-1) the values contains "0b" [base two]
//                    |___ decimal = (0-9) [base ten]
//                    |___Haxdecimal = (0-9/A-F) the value contains "ox"cant put an underscore after

//      # float for numbers with decimal points (float z = 32.43f), but you need add 'f' to diffrenciate float from double
//            |__ float = 654.53f. use the f
//            |___

//      # double (double k = 355.554) just like float
//      # boolean ( paid = true )
//      # char(charater) only stores a single charater and must be in single quote ' '
//      # string("I can be better") string is not normal data type, it's a CLASS, it must have a double quote " "

//    >> refrence: data stores = the location of the data . it can store multi datas at once like arry

//   >>> types of verable
//    > INSTANCE VARIABLE = every classes have

//    --------------EsCAPE SEQUENCE-------------
//    escape sequence are the charaters that we cannot enter from keyboard. they uses backslash "\"
//      # backspace← (delete a charater ) [\b]
//      # teb↹ (*4 spacing ) [\t]
//      # enter↲ (go the new line ) [\n]
//      # single quote' (a single quote can cause error if you want to display it) [\'] same for double quote
//      # .... (font feed ) [\f]
//      # backspace (delete a charater ) [\xxx]
//      # backspace (delete a charater )

//    to create a constant variables, the varaibles that their literals cannot be reasigned
//        . to crate it, you add the key word "final" before the data type [final string name = "Nelius"
//================= ENUMERATION(ENUM)===================




//   === INPUTS AND OUTPUTS TO THE TERMINAL====
//    ------OUTPUTS PRINTING METHODS----
//          |__ >(system.out.println("print anything"))=[PRINTLN method]= this will always create a new line for every print
//          |__ >(system.out.print("print anything"))=[PRINT method]= this is the normal print but it does't create a new line for any out put. in this case, every print will display in one line
//          |__ (system.out.printf("print anything"))=[PRINTF method]= this is from the low level language, were you have to specify the format , and it does not create a new line
int  times = 19;
System.out.printf("the loop will run %d times",times);
//   you can also concate strings with veraiables with other printing methods using + not just printf
//------FORMAT SPECIFIERS-----------

// ou/



    //OPERATORS

    //OPERATORS = is a symbols or words that indicate the type of things that can be done to a value. it is used with values or variables. When you use an operator with a variable,
    // the variable or value is operands. The variable and operands is called expressions, and it evaluates to a result.

    //======CATEGORIES OF OPERATORS=====
    //1. Arithmetic operators works with numbers and perform mathematical operation
    int x,j,i;


    x = 2 + 3;
    System.out.println(x);
    x = 8 - 5;
    System.out.println(x);
    x = 5 * 2;
    System.out.println(x);
    x = 10 / 2;
    System.out.println(x);
    x = 16 % 3;
    System.out.println(x);

    //ASSIGNMENT OPERATOR
    //IT TAKES THE VALUE OF THE RESULT OF THE FIRST OPERATION
    //PLUS + OPERATOR

    x = 10;
    x += 5;
    System.out.println(x);

    //MINUS - OPERATOR
    x -= 5;
    System.out.println(x);

    //MULT - OPERATOR
    x *= 5;
    System.out.println(x);

    //DIV - OPERATOR
    x /= 2;
    System.out.println(x);

    //MOD - OPERATOR
    x %= 2;
    System.out.println(x);

    //UNARY OPERATOR - it works with just one operator
    //types
    //Unary plus OPERATOR - number indicates that the number is a + number

     i = +5;
    //Unary minus OPERATOR
 
    int m = -5;
    //increment OPERATOR

     j = i++;
//then the --

  =======LOGICAL OPERATORS=================

1. AND ($$) this the normal logical and operator
NOTE: the bite wise operator only works with number values
2. bitwise AND($)= this first converts the values to desimal places, then compare the decimal values using the and operator
3. then convert the answer back to base ten 

2. OR (||)

===================CLASSES AND OBJECTS====================
a class is like a modle or components that stores some set of logics (a Template) ,
classes alone cannot do anything to the app cuz it's just a template, then calling or using the class is called the Object.
the class contains some methods depending on the purpose.
. you can create as many methode in a class
>>>(method over-loading) when you create many methods with same name , with differeant parameters
> 
the class can now be used as an object in the main file with a suitable parameter,
. 


int[] scores;
scores = new int[5] ;
scores[0] = 23;
scores[1] = 23;
scores[2] = 23;  // this method is called storing by index but you can store by collections using {}

//    ths time we are declearing and storing the arrays at once
int[] scores2 = {32,45,64,65}; // we useing like javaScript object bethod to collect multiple values and store them once

//    >> MULTI-DIMENTIONAL ARRAY
//    you need to specify from the declearation that it will store multiple dimentions, using duble box braked [][] .
int[][] manyScores = {
{54,65,35,65,},
{18,42,19,43,},
{54,65,35,65,}

    };

//    we access this arrays with a metrix methods, by identefying both the index of the row and column [] []

    System.out.println(manyScores[0][3]);
    System.out.println(manyScores[1][2]);
    System.out.println(manyScores[2][0]);

>>>>>> this is a typle of for loop that's call the enhance for loop
> eg. for(int star : stars){
 System.out.println(star)
}
this method is similar to python which is easier (python > for i in score: print(i)