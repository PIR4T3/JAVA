/**
 * Program to return the second word in uppercase.
 * For example, input a string as “We will get placed”, the output should be WILL.
 * Input a string as “Placement 2018” , the output should be 2018
 * Input a string as “Practice”, the output should be LESS.
 */

class SecondUpper{
   public static void main(String[] args) {
      int i=0;
      int n = args[0].length();
      for(i=0;i<n;i++){
         if(args[0].charAt(i) == ' ')
            break;
         }
      if(n==i){
            System.out.println("LESS");
      }

      else{
            i = i+1;
            while(i<n && args[0].charAt(i)!=' '){
               System.out.print(Character.toUpperCase(args[0].charAt(i)));
               i++;
            }
      }
   }
}