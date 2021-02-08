class Main {
    public static void main(String[] args) {
        int row = 2;
        int col = 2;
        int arr[][] = { { 1, 0 }, { 0, 1 } };
        int cost = 3;
        String res = isPathPossible(arr, row, col, cost);
        System.out.print(res);
    }

    static String isPathPossible(int arr[][], int row, int col, int cost) {
        boolean dp[][] = new boolean[row][col];

        for (int i = 0; i < row; i++)
            dp[i][0] = arr[i][0] == 1 ? true : false;

        for (int i = 0; i < col; i++)
            dp[0][i] = arr[0][i] == 1 ? true : false;

        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                dp[i][j] = (arr[i][j] == 1 ? true : false) && (dp[i][j - 1] || dp[i - 1][j]);
            }
        }
        return dp[row - 1][col - 1] ? "Yes" : "No";
    }
}
