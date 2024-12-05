//feedback

/*
Simon great work
Yam
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
            int amount = Integer.parseInt(args[1]);
            String wordUpper = args[0].toUpperCase();
            int length = wordUpper.length();
            String anLetters = "AEFHILMNORSX";
            for (int i = 0; i < length; i++){ //compare each letter to anLetters and print a or an as needed
                if (anLetters.indexOf(wordUpper.charAt(i)) != -1){
                     System.out.println("Give me an " + wordUpper.charAt(i) + ": " + wordUpper.charAt(i) + "!");   
                } else {
                     System.out.println("Give me a  " + wordUpper.charAt(i) + ": " + wordUpper.charAt(i) + "!");
                }
            }
            System.out.println("What does that spell?"); // print the word, in uppercase, the amount of times specified 
            for (int j = 0; j < amount; j++){
                System.out.println(wordUpper + "!!!");
            }
        }
}
