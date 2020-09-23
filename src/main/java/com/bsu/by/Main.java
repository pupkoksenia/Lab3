package com.bsu.by;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<String> newList;

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Write strings");
            ArrayList<String> text = new ArrayList<String>();
            String tmp = "a";
            while (!tmp.equals("")) {
                tmp = input.nextLine();
                text.add(tmp);
            }

            makeNewText(text);

            outText(text);

        } catch (Exception e) {
            System.out.println("all okay");
        } finally {
            System.err.println("All done");
        }

    }

    public static void makeNewText(ArrayList<String> text) {

        for (int j = 0; j < text.size(); j++) {
            StringBuilder tmp = new StringBuilder();

            int i = 0;
            while (i < text.get(j).length()) {
                if (!(Character.isDigit(text.get(j).charAt(i)))) {
                    tmp.append(text.get(j).charAt(i));
                }
                i++;
            }
            text.set(j, tmp.toString());
        }
    }

    public static void outText(ArrayList<String> newList) {
        for (String sentences : newList) {
            System.out.println(sentences);
        }

    }
}
