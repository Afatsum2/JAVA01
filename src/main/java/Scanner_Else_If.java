import java.util.Scanner;

public class Scanner_Else_If {


        /*
      Scanner class is used to get the data fromm user into our codes.

      How do we get the data from the user?
      1.Step: Create an object from "Scanner Class".

      Class Name     Object Name    Assignment Operator    new Keyword     Constructor==>Class Name +()
       Scanner        input             =                    new               Scanner(System.in);
                      scan
       2.Step: Give a message to user about the data you ask
       */
        public static void main(String[] args) {

            //Ask user to enter his/her name
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your name, please");

            String userName= input.next();
            System.out.println(userName); // Tom

            //Ask user enter his/her address

            //1.step: Create object from Scanner class
            Scanner input1= new Scanner(System.in);

//2.Step: Send message to the user.Ask user to enter his/her grade
            System.out.println("Enter your grade");

//3.Step: Create a container with the appropriate data type
            int score= input1.nextInt();

//4.Step: Type code condition with if statement

//1.way: with if else.
//      if(score >= 50){
//          System.out.println("You passed");
//        }else {
//          System.out.println("You failed");
            //     }

//2.way: with multiple if statements
//      if(score<50){
//         System.out.println("You failed");
//     }
//     if(score>=50){
//         System.out.println("You passed");
//     }

//3.way:
            if(score<50 && score>0){
                System.out.println("You failed");
            }else if(score>=50  && score <= 100){
                System.out.println("You passed");
            }else if((score<=0) || (score>100)){
                System.out.println("Enter a valid score");
            }

        }


    }


