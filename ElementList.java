import java.util.*;

public class ElementList {

   // FIELDS
   // Array of integers that stores counts of answers for each element
   private int[] elementData;

   // CONSTRUCTOR - constructs an ElementList with 10 elements by default
   //
   public ElementList() {
      elementData = new int[10];
   }
   
   // CONSTRUCTOR - constructs an ElementList with specified number of elements
   //
   public ElementList(int types) {
      elementData = new int[types];
   }
   
   // INTERPRETERS - Interpret Questions of different kinds
   
      // 10 Options (a, b, c, d, e, f, j, h, i, j)
      // returns: String correspondingType - String indicating which Element
      //          the answer corresponds to
      // parameters: char answer - the character inputted by user
      //             
      public String interpret10(char answer) {
         String correspondingType = "";
         if(answer == 'a') {
            correspondingType = "earth";
         } else if(answer == 'b') {
            correspondingType = "fire";         
         } else if(answer == 'c') {
            correspondingType = "storm";         
         } else if(answer == 'd') {
            correspondingType = "life";         
         } else if(answer == 'e') {
            correspondingType = "ice";         
         } else if(answer == 'f') {
            correspondingType = "water";         
         } else if(answer == 'g') {
            correspondingType = "air";         
         } else if(answer == 'h') {
            correspondingType = "space";         
         } else if(answer == 'i') {
            correspondingType = "death";         
         } else if(answer == 'j') {
            correspondingType = "unknown";         
         }      
         return correspondingType;
      }
   
   
   // Adds 1 to type total counter
   // parameters: String type - the type whose count will be increased by 1
   //
   public void add(String type) {
      type = type.toLowerCase();
      if(type.equals("earth")) {
         elementData[0] ++;
      } else if(type.equals("fire")) {
         elementData[1] ++;
      } else if(type.equals("storm")) {
         elementData[2] ++;
      } else if(type.equals("life")) {
         elementData[3] ++;
      } else if(type.equals("ice")) {
         elementData[4] ++;
      } else if(type.equals("water")) {
         elementData[5] ++;
      } else if(type.equals("air")) {
         elementData[6] ++;
      } else if(type.equals("space")) {
         elementData[7] ++;
      } else if(type.equals("death")) {
         elementData[8] ++;
      } else if(type.equals("unknown")) {
         elementData[9] ++;
      }
   }
   
   
   // Prints a list of the user's elemental answers.
   //
   public void printCounts() {
      System.out.println(Arrays.toString(elementData));
      //System.out.println(elementData);
   }
   
   // For testing purposes, lists total counts for each type.
   // parameters: int types - the class constant in the main method determining how
   //             many types to test for
   // 
   public void print(int types) {
      System.out.println("Total answers for each type:");
      System.out.println("   Fire:" + elementData[1]);
      System.out.println("   Earth:" + elementData[0]);
      System.out.println("   Air:" + elementData[6]);
      System.out.println("   Water:" + elementData[5]);
      System.out.println("   Ice:" + elementData[4]);
      System.out.println("   Space:" + elementData[7]);
      System.out.println("   Storm:" + elementData[2]);
      System.out.println("   Life:" + elementData[3]);
      if (types > 8) {
         System.out.println("   Death:" + elementData[8]);
      }
      if (types > 9) {
         System.out.println("   Unknown:" + elementData[9]);
      }
   }
   
   // Determines which type accrued the most answers.
   // returns: int majorityAnswer - the indice of the type with
   //          the highest count in elementData
   // ERROR : IF MULTIPLE TYPES ARE TIED, JUST RETURNS WHICHEVER ONE 
   //         COMES LATEST IN ELEMENTDATA
   //
   public int yourType() {
      int majorityAnswer = -1;
      int highestCount = 1;
      for(int i = 0; i < elementData.length; i++) {
         if(elementData[i] > highestCount) {
            highestCount = elementData[i];
            majorityAnswer = i;
         }
      }
      return majorityAnswer;
   }
   
   // Tells user what type they are!
   // parameters: String yourName - user's inputted name
   //             int majorityAnswer - the type whose answers were chosen the most
   //
   public void yourTypeAnalysis(String yourName, int majorityAnswer) {
      if(majorityAnswer < 0) {
         System.out.println(yourName + ", looks like you don't have an element...");
      } else {
         boolean singleType = true;
         System.out.println();
         if(singleType) {
            System.out.print(yourName + ", your element is... ");
         } else {
            System.out.print(yourName + ", your elements are... ");
         }
         if(majorityAnswer == 0){
            System.out.print("Earth!");
         } else if(majorityAnswer == 1){
            System.out.print("Fire!");
         } else if(majorityAnswer == 2){
            System.out.print("Storm!");
         } else if(majorityAnswer == 3){
            System.out.print("Life!");
         } else if(majorityAnswer == 4){
            System.out.print("Ice!");
         } else if(majorityAnswer == 5){
            System.out.print("Water!");
         } else if(majorityAnswer == 6){
            System.out.print("Air!");
         } else if(majorityAnswer == 7){
            System.out.print("Space!");
         } else if(majorityAnswer == 8){
            System.out.print("Death!");
         } else if(majorityAnswer == 9){
            System.out.print("Unknown!");
         }
      }
   }

}