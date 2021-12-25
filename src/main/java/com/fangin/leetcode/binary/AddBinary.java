package com.fangin.leetcode.binary;

/**
 * 67. 二进制求和
 * 给你两个二进制字符串，返回它们的和（用二进制表示）。
 * <p>
 * 输入为 非空 字符串且只包含数字 1 和 0。
 * <p>
 * <p>
 * <p>
 * 示例 1:
 * <p>
 * 输入: a = "11", b = "1"
 * 输出: "100"
 * 示例 2:
 * <p>
 * 输入: a = "1010", b = "1011"
 * 输出: "10101"
 * <p>
 * <p>
 * 提示：
 * <p>
 * 每个字符串仅由字符 '0' 或 '1' 组成。
 * 1 <= a.length, b.length <= 10^4
 * 字符串如果不是 "0" ，就都不含前导零。
 */
public class AddBinary {

    public String addBinary(String a, String b) {
        StringBuffer sb = new StringBuffer();
        int l1 = a.length() - 1;
        int l2 = b.length() - 1;

        int carry = 0;
        while (l1 >= 0 || l2 >= 0) {
            int ca = l1 >= 0 ? a.charAt(l1) - '0' : 0;
            int cb = l2 >= 0 ? b.charAt(l2) - '0' : 0;

            int sum = ca + cb + carry;
            carry = sum / 2;
            sum = sum % 2;
            sb.append(sum);
            l1--;
            l2--;
        }
        if (carry == 1) {
            sb.append(1);
        }

        return sb.reverse().toString();
    }
}
