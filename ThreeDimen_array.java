public class ThreeDimen_array {
  public static void main (String[] args) {
    //create a 3d array
    int[][][] test = {
      {
        {1,2,3},
        {-4,5,-6},
      },
      {
        {-4,-5,-6},
        {1,-8,-3},
        {3}
      }
    };
    //for..each loop to iterate through elements of 3d array
    for(int[][] array2D: test) {
      for (int[] array1D: array2D) {
        for(int item: array1D) {
          System.out.println(item);
        }
      }
    }
  }
}