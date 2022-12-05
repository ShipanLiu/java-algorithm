package p01_sparse_array;

public class test01 {
    public static void main(String[] args) {
        // 创建一个 init array， 11*11
        // 0: empty    1: black    2: blue
        int chestArr1[][] = new int[11][11];
        chestArr1[1][2] = 1;
        chestArr1[2][3] = 2;
        // 输出原始的 二维数组
        System.out.println("the original array:");
        for(int[] row : chestArr1) {  //  这个 row 是个 一位数组， 相当于 取到了 每一行
            for(int item : row) {
                System.out.printf("%d\t", item);
            }
            System.out.println();
        }
    }
}
