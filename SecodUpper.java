/**
 * Program to return the second word in uppercase.
 * For example, input a string as “We will get placed”, the output should be WILL.
 * Input a string as “Placement 2018” , the output should be 2018
 * Input a string as “Practice”, the output should be LESS.
 */

class SecondUpper{
   public void upper(String str) {
      int i=0;
      int n = str.length();
      for(i=0;i<n;i++){
         if(str.charAt(i) == ' ')
            break;
         }
      if(n==i){
            System.out.println("LESS");
      }

      else{
            i = i+1;
            while(i<n && str.charAt(i)!=' '){
               System.out.print(Character.toUpperCase(str.charAt(i)));
               i++;
            }
      }
   }
}

class Main{
      public static void main(String[] args) {
            String str = args[0];
            SecondUpper u = new SecondUpper();
            u.upper(str);
      }
}
