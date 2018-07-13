/**
 * Program to form a K-Concatenated-String from a given string.
 * For Example: 
 * Input a string glalagalglll, for the value k=3, will give the output as agllagllagll.
 * Input a string aaabbbccc, for the value  k=2, will give the output NOT POSSIBLE.
 */

class Concatenate{
   public void concatenate(String str, int k) {
      char arr[] = new char[30];
      char temp;
      int count=1, flag=0,z;
      int n = str.length();

      for(int i=0;i<n;i++){
         arr[i] = str.charAt(i);
      }
      for(int i=0;i<n;i++){
         for(int j=0;j<n-i-1;j++){
            if(arr[j] > arr[j+1]){
               temp = arr[j];
               arr[j] = arr[j+1];
               arr[j+1] = temp;
            }
         }
      }
      for(int i=0;i<n;i++){
         if(arr[i]==arr[i+1]){
            count++;
            continue;
         }
         if(count%k != 0){
            flag = 1;
            break;
         }
         count=1;
      }
      if(flag==1){
         System.out.println("NOT POSSIBLE");
      }
      else{
         for(int i =0;i<k;i++){
            z=0;
            for(int j=0;j<n/k;j++){
               System.out.print(arr[i+z]);
               z+=k;
            }
         }
      }
   }
}

class Main{
   public static void main(String[] args) {
      String str = args[0];
      int k = Integer.parseInt(args[1]);
      Concatenate c = new Concatenate();
      c.concatenate(str, k);
   }
}
