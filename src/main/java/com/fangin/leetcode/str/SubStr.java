package com.fangin.leetcode.str;

public class SubStr {

    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) return 0;
        int w_l = 0;
        int w_r = needle.length() - 1;

        while (w_r < haystack.length()) {
            boolean match = true;
            int index = 0;
            for (int j = w_l; j <= w_r; j++) {
                if (haystack.charAt(j) != needle.charAt(index++)) {
                    match = false;
                    break;
                }
            }


            if (match) {
                return w_l;
            }
            w_l++;
            w_r++;
        }

        return -1;

    }
}
