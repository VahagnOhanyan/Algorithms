package org.example.array_string;

public class Main {

    public static int sortedSquares(int n) {
        int max = -1;
        int indexR = 0;
        int indexL = 0;
        char chRight;
        char currChRight = 0;
        char chLeft;
        char currChLeft = 0;
        
        boolean found = false;
        StringBuilder sb = new StringBuilder(String.valueOf(n));
        int length = sb.length();
        outer: for (int left = length - 2; left >= 0; left--) {
            for (int right = left + 1; right < length; right++) {
                chRight = sb.charAt(right);
                chLeft = sb.charAt(left);
                if (chRight > chLeft) {
                    if (left >= max) {
                        max = left;
                        indexR = right;
                        currChRight = chRight;
                        indexL = left;
                        currChLeft = chLeft;
                        found = true;
                        if(indexR - indexL == 1 && indexR == length - 1) {
                            break outer;
                        }
                    }
                }
            }
        }
        if (found) {
            sb.setCharAt(indexR, currChLeft);
            sb.setCharAt(indexL, currChRight);
        }

        int limit = indexL + 1;
        indexR = length - 1;
        indexL = indexR - 1;
        while (indexL >= limit) {
            chRight = sb.charAt(indexR);
            chLeft = sb.charAt(indexL);
            if (chRight < chLeft) {
                sb.setCharAt(indexR, chLeft);
                sb.setCharAt(indexL, chRight);
                indexR = sb.length() - 1;
                indexL = indexR - 1;
            } else {
                indexL--;
                indexR--;
            }
        }
        long result = Long.parseLong(sb.toString());
        if (n >= result) {
            return -1;
        }
        if (result > Integer.MAX_VALUE) {
          return -1;
        }
        return Integer.parseInt(sb.toString());
    }


    public static void main(String[] args) {
        int n = 12443322;
        System.out.println(sortedSquares(n));

    }

}