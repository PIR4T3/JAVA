/**
 * Program to find number of non-repeated digits in a number.
 * For example, input a number 109894, the result should be 4 as 1, 0, 8 and 4 are non-repeated digits.
 */

class Repeat{
      public void check(int num){
            int []arr = new int[10];
            int i;
            int rem;
            while(num>0){
               rem = num%10;
               arr[rem]++;
               num /= 10;      
            }  
            for(i=0;i<arr.length;i++){
               if(arr[i]==1)
                  System.out.print(i+" ");
            }

      }
}
class Main{
      public static void main(String[] args) {
         int num;
         num = Integer.parseInt(args[0]);
         Repeat r = new Repeat();
         r.check(num);
      }
}
