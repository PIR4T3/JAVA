/**
 * Print Pattern as follows:
         
         1*2*3*4*17*18*19*20
	   5*6*7*14*15*16
	       8*9*12*13
	  	10*11
 */

class Pattern{
   public static void main(String args[]){
      int n, k, temp, i, j, x = 1;
      n = Integer.parseInt(args[0]);
      k = n*n + 1;
      temp = k;
      for(i=0;i<n;i++){
         for(j=0;j<i;j++){
            System.out.print("  ");
         }
         
         for(j=n-1;j>=i;j--){
            System.out.print(x++ + "*");
         }
         
         for(j=0;j<n-i;j++){
            System.out.print(k++ + "*");
         }
         
         temp = temp - (n-1) + i;
         k = temp;
         System.out.println();
      }
   }
}
