package org.decembrist.controllerspractice;

import java.util.HashSet;

public class leetCode {

    public static void main(String[] args) {

        String x = "dvdf";
        String y = "aab";
        String xx = "bbbbb";
        String yy = "pwwkew";
        String zz = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(x));
//        System.out.println(lengthOfLongestSubstring(y));
//        System.out.println(lengthOfLongestSubstring(xx));
//        System.out.println(lengthOfLongestSubstring(yy));
//        System.out.println(lengthOfLongestSubstring(zz));
    }
    public static int lengthOfLongestSubstring(String s) {

        if (s.length() == 1) {
            return 1;
        }
        byte[] bytes = s.getBytes();
        HashSet hashSet = new HashSet();
        int maxSize = 0;
        int size = 0;
        int count = 0;
        int z = 0;
        for (int i = 0; i < bytes.length; i++) {
            size = hashSet.size();
            hashSet.add(bytes[i]);
            int newSize = hashSet.size();
            if (maxSize < newSize){
                maxSize = newSize;
            }

//            if (newSize == size) {
//                hashSet.clear();
//
//                if (bytes[i] == bytes[i - 1]) {
//                    hashSet.add(byte[i]);
//
//            }
//            }

        }
        return maxSize;
    }

}
