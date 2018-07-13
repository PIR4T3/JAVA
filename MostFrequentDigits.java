/**
 * Program to find the most frequent digit when 4 numbers are passed as parameters in a method as:
	int mostFreqDig(int p1, int p2, int p3, int p4).
	
 * However, if there are more digits that can be the answer, the value to be returned should be the highest digit.
 */

class MostFrequentDigit{
   public void digit(int no, int num[]) {
      int arr[] = new int[10];
      for(int i=0;i<no;i++){
         arr[num[i]]++;
      }
      int max=-999,max_index=-9;
      for(int i=0;i<9;i++){
         if(max <= arr[i]){
            max=arr[i];
            max_index=i;
         }
      }
      System.out.println(max_index);
   }
}

class Main{
   public static void main(String[] args) {
      int no = Integer.parseInt(args[0]);
      int num[] = new int[10];
      for(int i=0;i<no;i++){
         num[i] = Integer.parseInt(args[i+1]);
      }
      MostFrequentDigit m = new MostFrequentDigit();
      m.digit(no, num);
   }
}
