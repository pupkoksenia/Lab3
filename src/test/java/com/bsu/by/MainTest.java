package com.bsu.by;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class MainTest {


    @Test
    void newText() {
        ArrayList<String> inputText = new ArrayList<String>(Arrays.asList("123aaaa,k", "hhhh.kn"));
        ArrayList<String> expectedText = new ArrayList<String>(Arrays.asList("aaaa,k", "hhhh.kn"));
        ArrayList<String> actualText =newText(inputText);//why we can't see?)
    }

    @Test
    void outText() {
    }
}


