class ArrayOperations {
    public static void printCorners(int[][] twoDimArray) {
        // First corner
        System.out.print(twoDimArray[0][0]);
        System.out.print(" ");
        // Second corner
        System.out.print(twoDimArray[0][twoDimArray[0].length - 1]);
        System.out.println();
        // Third corner
        System.out.print(twoDimArray[twoDimArray.length - 1][0]);
        System.out.print(" ");
        // Fourth corner
        System.out.print(twoDimArray[twoDimArray.length - 1][twoDimArray[twoDimArray.length - 1].length - 1]);
        System.out.println();
    }
}