// package medhat;

//  class exceptionHandlingExample {
//     public static void main(String[] args) {
//         int []arr = {1,5,7};
//         int finalResult= getIndex(4, arr);
//         System.out.println("the finalResult(index in array) : " + finalResult);
//     }
//     public static int getIndex(int index, int[]arr){
//         int value = 0;
//         try {
//             value = arr[index];
//         } catch (ArrayIndexOutOfBoundsException exception) {
//             System.out.println(exception.getMessage());
//             // finalResult = index 4 is out of bounds for length 3
//         }
//         return value;
//     }
// }