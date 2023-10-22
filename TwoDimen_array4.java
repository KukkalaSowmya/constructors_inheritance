public class TwoDimen_array4{
  public static void main(String[] args) {
    int[][] a = {
      {1,-2,3},
      {-4,5,-6,-7},
      {9,5},
    };
    for(int i = 0;i <a.length;i++) {
      for(int j = 0;j<a[i].length;++j) {
        System.out.println(a[i][j]);
      }
    }
  }
}