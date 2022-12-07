package p01_sparse_array;

public class test01 {
    public static void main(String[] args) {
        // 创建一个 init array， 11*11
        // 0: empty    1: black    2: blue
        int chestArr1[][] = new int[11][11];
        chestArr1[1][2] = 1;
        chestArr1[2][3] = 2;
        chestArr1[4][5] = 3;
        // 输出原始的 二维数组
        System.out.println("the original array:");
        for(int[] row : chestArr1) {  //  这个 row 是个 一位数组， 相当于 取到了 每一行
            for(int item : row) {
                System.out.printf("%d\t", item);
            }
            System.out.println();
        }

        // the ideas: convert array to sparsearray
        // 01. 遍历数组， 得到 非 0 数据的个数
        int sum = 0;
        for (int i = 0; i < chestArr1.length; i++) {
            for(int j = 0; j < chestArr1[0].length; j++) {
                if(chestArr1[i][j] != 0) {
                    sum++;
                }
            }
        }

        //  知道了 非 0 的 个数： sparsearray  的 行数 就确定了， 列数 固定为3
        System.out.println("sum: " + sum);
        int sparseArr[][] = new int[sum+1][3];
        // 给 sparseArr  赋值：  第一行是 ： 原始数组 有 多少行 多少列
        // 这是 行数
        sparseArr[0][0] = chestArr1.length;
        // 第0 行有 多少数据 --》 列数
        sparseArr[0][1] = chestArr1[0].length;
        // 一共 有多少有效 数据
        sparseArr[0][1] = sum;

        // loop the chestArr again, and put the position and value into the sparseArr
        int k = 1;
        for (int i = 0; i < chestArr1.length; i++) {
            for(int j = 0; j < chestArr1[0].length; j++) {
                if(chestArr1[i][j] != 0) {
                    sparseArr[k][0] = i;
                    sparseArr[k][1] = j;
                    sparseArr[k][2] = chestArr1[i][j];
                    k++;
                }
            }
        }

        // loop the sparseArr
        System.out.println("the sparseArr: \n");
        for(int[] row : sparseArr) {
            for(int item : row) {
                System.out.printf("%d\t", item);
            }
            System.out.println();
        }


        // 现在 要把sporseArr回转成  normal array

    }
}
