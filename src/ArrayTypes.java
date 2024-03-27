// In Java, there are several types of arrays, each with its own characteristics and use cases. Here
// are some commonly used types of arrays:

import java.util.Arrays;

public class ArrayTypes {
  public static void main(String[] args){
    /*
  1. **One-Dimensional Array**: A one-dimensional array is a collection of elements of the same type arranged in a single row. It is the simplest form
  of an array in Java.

  */

    int[] numbers = {1, 2, 3, 4, 5}; // Declaration and initialization of a one-dimensional array
    System.out.println(Arrays.toString(numbers));

    /* 2. **Two-Dimensional Array**: A two-dimensional array is an array of arrays, where each element is itself an array. It represents a tabular or matrix-like structure.
     */
    int[][] matrix = {
            {1, 2, 3}, {4, 5, 6}, {7, 8, 9}
    }; // Declaration and initialization of a two-dimensional array
    System.out.println(Arrays.deepToString(matrix));


  /*
  3. **Multi-Dimensional Array**: Java supports arrays with more than two
  dimensions. These are known as multi-dimensional arrays.
  */
    int[][][] cube = {
            {{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}
    }; // Declaration and initialization of three-dimensional array
    System.out.println(Arrays.deepToString(cube));

  /* 4. **Jagged Array**: A jagged array is an array of arrays where the subarrays can have different lengths. It is
  also known as a ragged array.
   */
    int[][] jaggedArray = {
            {1, 2, 3}, {4, 5}, {6, 7, 8, 9}
    }; // Declaration and initialization of a jagged array
    System.out.println(Arrays.deepToString(jaggedArray));

    /* 5. **Array of Objects**: Java arrays can also hold objects of any class type. For example, an array of Strings:
     */ String[] names = {
            "Alice", "Bob", "Charlie"
    }; // Declaration and initialization of an array of Strings
    System.out.println(Arrays.toString(names));

  /* 6. **Array of Primitive Types**: Java arrays can hold elements of primitive data types such as int, char, double,
  etc.
  */ char[] vowels = {
            'a', 'e', 'i', 'o', 'u'
    }; // Declaration and initialization of an array of characters
    System.out.println(Arrays.toString(vowels));
  }
}
