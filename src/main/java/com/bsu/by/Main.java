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

            newText(text);

            outText(text);


        } catch (Exception ignored) {

        } finally {
            System.err.println("All done");
        }

    }

    public static void newText(ArrayList<String> newList) {


        for (int j = 0; j < newList.size(); j++) {
            StringBuilder tmp = new StringBuilder();

            int i = 0;
            while (i < newList.get(j).length()) {
                if (!(Character.isDigit(newList.get(j).charAt(i)))) {
                    tmp.append(newList.get(j).charAt(i));

                }
                i++;
            }
            newList.set(j, tmp.toString());
        }
    }

    public static void outText(ArrayList<String> newList) {
        for (String sentences : newList) {
            System.out.println(sentences);
        }

    }
}
