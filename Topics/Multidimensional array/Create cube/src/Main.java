import java.util.Arrays;

class ArrayOperations {

   // public static void main(String[] args) {
    //    int[][][] cube = createCube();
    //    for (int i = 0; i < cube.length; i++) {
   //
            //         for (int j = 0; j < cube[i].length; j++) {
   //             System.out.print(Arrays.toString(cube[i][j]) + " ");
   //         }
  //          System.out.println();
 //       }
 //   }


    public static int[][][] createCube() {
        // write your code here
        int[][][] dataCube = new int[3][3][3];
        int element = -1;
        for (int i = 0; i < dataCube.length; i++) {
            for (int j = 0; j < dataCube[i].length; j++) {
                for (int k = 0; k < dataCube[i][j].length; k++) {
                    dataCube[i][j][k] = ++element;
                    if (element == 8) {
                        element = -1;
                    }
                }
            }
        }
        return dataCube;
    }
}