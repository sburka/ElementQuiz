
// A quiz that tells you which element you would be based on your answers!

// You can have between 0 and 4 types, with 2 types being the most common. 

import java.util.*;

public class typeQuiz {

   // The number of types we are using in the quiz. 
   // If 10, includes all types. If 9, excludes Unknown. If 8, excludes Death.
   public static final int TYPES = 10;
   
   public static void main(String[] args){
      
      Scanner input = new Scanner(System.in);
      
      // Creates elementlist that stores answers
      ElementList userAnswers = new ElementList(TYPES); 
      
      welcome();
      String name = yourName(input);
      
      //Asks questions and updates the user's answer count accordingly
      //question0();
         //tenOptionUpdate(input, userAnswers);
      question1();
         tenOptionUpdate(input, userAnswers);
      question2();
         tenOptionUpdate(input, userAnswers);
      /*question3();
         tenOptionUpdate(input, userAnswers);
         */
         
      //Just for testing
      userAnswers.print(TYPES);
      
      // Analyzes user's answers and determines what type they are
      //    Currently uses a majority-wins system, will update to use more 
      //    complicated algorithm
      userAnswers.yourTypeAnalysis(name, userAnswers.yourType());           

   }
   
   //updates list of answers for an 10 option question
   //
   public static void tenOptionUpdate(Scanner input, ElementList userAnswers) {
      userAnswers.add(userAnswers.interpret10(answer(input)));
      //userAnswers.add(typeAnswer);
   }
   
   //Determines if the answer is valid for an 10-option question
   //
   public static boolean validAnswer(String userInput) {
      boolean valid = true;
      //Death and unknown included
      if(TYPES == 10) {
         // valid answers
         if(!userInput.equals("a") && !userInput.equals("b") && !userInput.equals("c") && 
            !userInput.equals("d") && !userInput.equals("e") && !userInput.equals("f") && 
            !userInput.equals("g") && !userInput.equals("h") && !userInput.equals("i") && 
            !userInput.equals("j")) {
            valid = false;
         } 
      // Death included but not unknown 
      } else if(TYPES == 9) {
         if(!userInput.equals("a") && !userInput.equals("b") && !userInput.equals("c") && 
            !userInput.equals("d") && !userInput.equals("e") && !userInput.equals("f") && 
            !userInput.equals("g") && !userInput.equals("h") && !userInput.equals("i")) {
            valid = false;
         }
      // Death and unknown excluded
      } else if(TYPES == 8) {
         if(!userInput.equals("a") && !userInput.equals("b") && !userInput.equals("c") && 
            !userInput.equals("d") && !userInput.equals("e") && !userInput.equals("f") && 
            !userInput.equals("g") && !userInput.equals("h")) {
            valid = false;
         }
      }
      return valid;
   }
   
   // Reads and returns the letter the user inputted
   //
   public static char answer(Scanner input) {
      char answer = ' '; 
      String userInput = "";
      boolean valid = false;
      // Re-prompt user until they give a viable answer (case-insensitively).
      while (!valid) {
         System.out.print("Your answer: ");
         userInput = input.nextLine();
         userInput = userInput.toLowerCase();
         //checks validity of answer
         valid = validAnswer(userInput);
         if (!valid) {
             System.out.print("Invalid answer. ");
         }
      }
      answer = userInput.charAt(0);
      return answer;
   }
   
   
   //Takes in and records user's name
   //
   public static String yourName(Scanner input) {
      return input.nextLine();
   }
   
   // Explains what the quiz is.
   //
   public static void welcome() {
      System.out.println();
      System.out.println("Welcome to the Types Quiz!");
      System.out.print("Insert your name to begin. ");
   }
   
   
   
   // QUESTION 0
   //
   public static void question0() {
      System.out.println();
      System.out.println("This is question 0.");
      System.out.println("   a) Earth");
      System.out.println("   b) Fire");
      System.out.println("   c) Storm");
      System.out.println("   d) Life");
      System.out.println("   e) Ice");
      System.out.println("   f) Water");
      System.out.println("   g) Air");
      System.out.println("   h) Space");
      if(TYPES > 9) {
      System.out.println("   j) Death");
      }
      if(TYPES > 10) {
         System.out.println("   k) Unknown");
      }
   }
   
   // QUESTION 1
   //
   public static void question1() {
      System.out.println();
      //Earth
      System.out.println("It's a rainy Saturday evening. What are your plans?");
      System.out.println("   a) I'll use this opportunity to be productive and get some work");
      System.out.println("      done around the house.");
      //Fire
      System.out.println("   b) I'm going out to a club or party. Spending the night inside");
      System.out.println("      would be an outrage, even if it's miserable out!");
      //Storm
      System.out.println("   c) I love the rain; I'd go outside and have some fun in it!");
      //Life
      System.out.println("   d) I'll pop some popcorn and have a cozy movie night in with all"); 
      System.out.println("      my friends.");
      //Ice
      System.out.println("   e) Probably curl up in my bed with an interesting book.");
      //Water
      System.out.println("   f) Go outside and take a nice long, slow walk in the rain and");
      System.out.println("      reflect on my thoughts.");
      //Air
      System.out.println("   g) Go for a long drive in it while blasting some music.");
      //Space
      System.out.println("   h) Try and paint the beautiful view!");
      //Death
      if(TYPES > 9) {
      System.out.println("   j) Sit at the window and stare outside.");
      }
      //Unknown
      if(TYPES > 10) {
         System.out.println("   k) Probably contemplate life...");
      }
   }
   
   // QUESTION 2
   //
   public static void question2() {
      System.out.println();
      //Earth
      System.out.println("What does your room look like?");
      System.out.println("   a) Homey. There's a lot of stuff in there, but I keep it");
      System.out.println("      organized, and it's all pretty meaningful to me.");
      //Fire
      System.out.println("   b) It's kind of messy. I just never have time to clean it!");
      //Storm
      System.out.println("   c) It has a bunch of posters from my favourite bands.");
      //Life
      System.out.println("   d) Verdant, with lots of natural light. I have a ton of plants,"); 
      System.out.println("      too.");
      //Ice
      System.out.println("   e) Very cozy, filled with books and blankets and soft, warm things.");
      //Water
      System.out.println("   f) Peaceful and organized with lots of things for me to fiddle with.");
      //Air
      System.out.println("   g) Clean, spacious, and minimalistic.");
      //Space
      System.out.println("   h) It's a bit cluttered but filed with anything I find cool - trinkets,");
      System.out.println("      cool rocks, old sentimetal notes.");
      //Death
      if(TYPES > 9) {
      System.out.println("   j) Death");
      }
      //Unknown
      if(TYPES > 10) {
         System.out.println("   k) Probably contemplate life...");
      }
   }
}