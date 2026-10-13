import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        // Find and print the length of the longest substring without repeats
      //Set up max length
      int maxLength=0;
      //loop through the letters
      for (int x=0;x<text.length();x++){
      	//sub starts with first letter
        String sub = text.substring(x,x+1);
      	//loop again
        for (int y=x+1;y<text.length();y++){
          char current = text.charAt(y);
      		//if current letter not in sub
          if (sub.indexOf(current)<0){
      			//add letter
            sub+=current;
          }
      		//else
          else{
      			//break out of loop
            break;
          }
        }
      	//compare maxlength with current length
        if (sub.length()>maxLength){
          maxLength=sub.length();
        }
      }
      //print result
      System.out.println(maxLength);
    }
}
