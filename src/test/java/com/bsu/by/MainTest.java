package com.bsu.by;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {


    @Test
    void newText() {
        ArrayList<String> inputText = new ArrayList<String>(Arrays.asList("123aaaa,k", "hhhh.kn"));
        ArrayList<String> expectedText = new ArrayList<String>(Arrays.asList("aaaa,k", "hhhh.kn"));
        Main.makeNewText(inputText);
        int k = 0;
        for (int i = 0; i < 2; i++) {
            assertEquals(inputText.get(i),expectedText.get(i));
        }

        }




    }


