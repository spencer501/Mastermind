package com.spencerpease.mastermind;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * DESCRIPTION
 * <p>
 * Created by: Spencer Pease
 * Created on: 2015-12-21
 */
public class GameMain {
    public static final String COMBINATION_FILE = "resources/combinations.txt";

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Welcome to Mastermind!");

        Scanner input = new Scanner(new File(COMBINATION_FILE));
        CodeMaker codeMaker = new CodeMaker(input);

        System.out.println("A code will now be chosen.");
        codeMaker.chooseCode();
        System.out.println("Chosen code is: " + codeMaker.viewCode());

    }

}
