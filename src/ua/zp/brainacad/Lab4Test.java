package ua.zp.brainacad;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Lab4Test {
    public static void main(String[] args) {
        // PART 1
        // 1.1)
        //TODO:TODO init it's array by new with size 4.
        float[] firstArray = new float [4];
        firstArray[0] = 21.11f;
        firstArray[3] = 10.10f;
        // TODO init and fill it's array with any values. Use {} syntax.
        int[] intArray =  {8,3,9,7};

        // 1.2)
        // TODO copy "intArray". Use copyOf...
     //   int[] intArrayCopy = Arrays.copyOf(intArray, intArray.length);
     //   System.out.println(java.util.Arrays.toString(intArray));
    //    System.out.println(java.util.Arrays.toString(intArrayCopy));

        // 1.3)
        // TODO sort "intArrayCopy", use Arrays sort.
     //  Arrays.sort(intArrayCopy);

        // 1.4)
        // TODO print "intArrayCopy", use Arrays toString.
      //  System.out.println(java.util.Arrays.toString(intArrayCopy));

        // 1.5)
        // TODO compare "intArray"  and "intArrayCopy", use Arrays equals. Print "Arrays equals" or "Arrays not equals".
      //  System.out.println(java.util.Arrays.equals(intArray,intArrayCopy));

        // PART 2
        // Print array values in cycle.
   //     int[] testArray = {1, 3, 5, 7, 8, 6, 4, 2, 0};
        // Print array values in cycle.
        //for (int value: testArray) {
          //  System.out.print(value + " ");}
        // 2.1)
        // TODO calc sum of all array elements and print result.
      //  int sum = 0;
      //  for (int i = 0; i < testArray.length; i++)
          {
          //  sum = sum + testArray[i];
              }
          //  System.out.println(sum);
        // 2.2)
        // TODO calc sum of all numbers with odd indexes and print result.
       // int sum2 = 0;
       // for (int i = 0; i < testArray.length; i++) {
        //    if (testArray[i] % 2 != 0)
         //   sum2 += testArray[i];}
       // System.out.println(sum2);
        // 2.3)
        // TODO find max value in array.
     //    int max = Integer.MIN_VALUE;
      //  for (int i = 0; i < testArray.length; i++) {
      //     max = Math.max(max, testArray[i]);

     //   System.out.println("Максимальное значение в массиве testArray: " + max);

        // PART 3
         //3.1
         // TODO create two-dimensional array with size [3][4]
      //   int [][] newArray = new int[3][4];

        //3.2
        // TODO fill array with any numbers in cycles.
//        newArray [0][0] = 1;
//        newArray [0][1] = 2;
//        newArray [0][2] = 3;
//        newArray [0][3] = 4;
//        newArray [1][0] = 5;
//        newArray [1][1] = 6;
//        newArray [1][2] = 7;
//        newArray [1][3] = 8;
//        newArray [2][0] = 9;
//        newArray [2][1] = 10;
//        newArray [2][2] = 11;
//        newArray [2][3] = 12;
//        for (int i = 0; i < newArray.length; i++) {
//            for (int j = 0; j < newArray[i].length; j++) {
//                System.out.print(newArray[i][j] + " ");
//            }
//           System.out.println();
//        }
        //3.3
        // TODO calc sum of all array elements and print result.
//        int sum1 = 0;
//        for (int i = 0; i < newArray.length; i++) {
//            for (int j = 0; j < newArray[i].length; j++) {
//                sum1 += newArray[i][j];
//            }
//        }
//       System.out.println("Сумма всех элементов двумерного массива = "+sum1);
//
        // PART 4*
        long[][] matrix = new long[9][9];
//        System.out.println(Arrays.toString(matrix));
//        System.out.println(matrix.length);
        int ratio = 0;
        for (long[] row: matrix ) {
            Arrays.fill(row, ++ratio);
        }
        for (long[] longs : matrix) {
//          System.out.println(longs);
            System.out.println(Arrays.toString(longs));
        }
        int sum = 0;
        // TODO* calc sum only max and min values of matrix by expression: 2 < i <= 5 and only every third j value.
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (2 < i && i <= 5 && (j + 1) % 3 == 0){
                    sum += matrix [i][j];
                    System.out.println(j + " = " + matrix[i][j]);
                }
            }
        }
        System.out.println(sum);

        }
        }












