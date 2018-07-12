// class TwoD{
//    public static void main(String[] args) {
//       int [][] x = new int[3][];
//       x[0] = new int[3];
//       x[1] = new int[2];
//       x[2] = new int[5];

//       int c = 0;
//       // System.out.println(x.length);
//       // System.out.println(x[2].length);
//       for(int i=0;i<x.length;i++){
//          for(int j=0;j<x[i].length;j++){
//             x[i][j] = ++c;
//             System.out.print(x[i][j]+" ");
//          }
//          System.out.println();
//       }
//       System.out.println(x[2][0]);

//    }
// }



// class S{
//    public static void main(String[] args) {
//       // int [] a =new int[2] {1,2,3};
//       // for(int i : a)
//          // System.out.println(i);
//          // while(true){
//          // int i = 0;
//          // }
//       int i =0;
//          for(System.out.println("Hi");i<10;i++){
//             System.out.println("Hi");
//          }
//    }

// }


// while(true)
// int i = 0;
// err.

// while(true){
//    int i = 0; 
// }
// corr.



// import java.io.*;
// import  java.util.*;

// // Read only region start
// class UserMainCode
// {

// 	public void NthPrime(int input1){
// 		// Read only region end
// 		// Write code here...
// 		int arr[] = new int[1000];
// 		int k =0;
// 		for(int i = 2;i<=1000;i++){
//               int count = 0;
// 		  for(int j = 1; j <= 500; j++){
//                    if(i%j == 0)
//                         count++;
// 		  }
// 		  if(count <= 2){
//                   arr[k] = i;
//                   k++;
// 		  }
// 	}
//       for(int i=0;i<k;i++){
//             System.out.print(arr[i]+" ");
//       }
//       System.out.println("\n"+arr[input1-1]);
// 	}
// }
// class Main{
//       public static void main(String[] args) {
//             UserMainCode u = new UserMainCode();
//             u.NthPrime(10);
//             // System.out.println(ret);
//       }
// }




class Op{
      public static void main(String[] args) {
            int a = 1, b=2, c=3;
            a|=4;
            b>>=1;
            c<<=1;
            // a^=c;
            System.out.println(a+" "+b+" "+c);
      }
}