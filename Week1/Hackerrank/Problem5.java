package com.vinh.coderschool;

import java.util.HashMap;
import java.util.Scanner;

public class Problem5 {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {

            String s = scanner.nextLine();

            if (s.length() % 2 != 0) {
                System.out.println(-1);
            } else {
                System.out.println(solve(s));
            }
        }

        scanner.close();
    }

    private static int solve(String s) {

        HashMap<Character, Integer> first = new HashMap<>();

        for (int i = 0; i < s.length() / 2; i++) {
            char character = s.charAt(i);
            if (first.containsKey(character)) {
                int value = first.get(character);
                first.put(character, value + 1);
            } else {
                first.put(character, 1);
            }
        }

        int diff = 0;
        for (int i = s.length() / 2; i < s.length(); i++) {
            char character = s.charAt(i);
            if (first.containsKey(character) && first.get(character) > 0) {
                int value = first.get(character);
                first.put(character, value - 1);
            } else {
                diff++;
            }
        }

        return diff;
    }
}
