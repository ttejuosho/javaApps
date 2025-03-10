import java.util.Scanner;

public class QuizGame{
    public static void main(String[] args){
        String[] questions = {
                "What is the default value of an uninitialized int variable in Java?",
                "Which keyword is used to prevent method overriding?",
                "What will System.out.println(10 + 20 + \"Java\"); output?",
                "Which data structure does Java’s HashMap use internally?",
                "Which of these can be used to create a thread in Java?",
        };

        String[][] options = {
                { "A. 0", "B. null", "C. Garbage value", "D. 1" },
                { "A. final", "B. static", "C. private", "D. abstract" },
                { "A. Java30", "B. 1020Java", "C. 30Java", "D. Compilation error" },
                { "A. Linked List", "B. Tree", "C. Hash Table", "D. Stack" },
                { "A. Extending Thread Class", "B. Implementing Runnable interface", "C. Using ExecutorService", "D. All of the above" },
        };

        String[] answers = {"A", "A", "C", "C", "D"};

        int score = 0;
        String guess;

        Scanner scanner = new Scanner(System.in);

        System.out.println("******************************");
        System.out.println("Welcome to the Java Quiz Game.");
        System.out.println("******************************");

        for(int i = 0; i < questions.length; i++){
            System.out.println(questions[i]);
            for(String option : options[i]){
                System.out.println(option);
            }

            System.out.print("Enter Answer Option: ");
            guess = scanner.nextLine();
            if(guess.equals(answers[i])){
                System.out.println("*********");
                System.out.println("CORRECT");
                System.out.println("*********");
                score++;
            } else {
                System.out.println("*********");
                System.out.println("WRONG");
                System.out.println("*********");
            }
        }

        System.out.println("You got " + score + " out of 5 points");

        scanner.close();
    }
}