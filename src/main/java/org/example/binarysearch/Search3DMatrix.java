package org.example.binarysearch;

public class Search3DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
      int left = 0;
      int right = matrix.length * matrix[0].length -1;
        System.out.println();
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int base = mid/matrix[0].length;
            int rest = mid%matrix[0].length;
            if (matrix[base][rest] == target) {
                return true;
            } else if (matrix[base][rest] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }


        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 20;
        var s = new Search3DMatrix();
        System.out.println(s.searchMatrix(matrix, target));
    }
}
