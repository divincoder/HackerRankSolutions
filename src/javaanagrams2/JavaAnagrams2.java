/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


//        double epsilon = 0.001;
//        public int compare(Student st1, Student st2){
//            if (Math.abs(st1.getCgpa() - st2.getCgpa()) > epsilon) {
//            return st1.getCgpa() < st2.getCgpa() ? 1 : -1; // descending order
//        } else if (!st1.getFname().equals(st2.getFname())) {
//            return st1.getFname().compareTo(st2.getFname());
//        } else {
//            return st1.getId() - st2.getId();
//        }
//    }
package javaanagrams2;

import java.io.*;
import java.util.*;

public class JavaAnagrams2 {

    static boolean isAnagram(String a, String b) {
        if (a == null || b == null || a.length() != b.length()) {
            return false;
        }
        
        a = a.toLowerCase();
        b = b.toLowerCase();
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        /* Filling the HashMap with 1st String */
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        
        /* Comparing 2nd String to 1st String's HashMap */
        for (int i = 0; i < b.length(); i++) {
            char ch = b.charAt(i);
            if (map.containsKey(ch) && map.get(ch) > 0) {
                map.put(ch, map.get(ch) - 1);
            } else {
                return false;
            }
        }
        return true;
    }

  public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
