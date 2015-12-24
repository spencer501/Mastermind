package com.spencerpease.mastermind;

import java.util.*;

/**
 * DESCRIPTION
 * <p>
 * Created by: Spencer Pease
 * Created on: 2015-12-21
 */
public class CodeMaker {

    private List<ArrayList<Integer>> comboList;
    private ArrayList<Integer> chosenCode;

    private Random random = new Random();

    public CodeMaker(Scanner comboList) {
        this.comboList = new ArrayList<ArrayList<Integer>>();
        int rawCombo;

        while (comboList.hasNextInt()) {
            rawCombo = comboList.nextInt();
            this.comboList.add(intToDigits(rawCombo));
        }
    }

    /**
     * Description
     *
     * @param number
     * @return
     */
    private ArrayList<Integer> intToDigits(int number) {
        ArrayList<Integer> digits = new ArrayList<Integer>();
        Stack<Integer> reorder = new Stack<>();

        for (int i = 0; i < digits.size(); i++) {
            reorder.push(number % 10);
            number = number / 10;
        }

        while (!reorder.empty()) {
            digits.add(reorder.pop());
        }

        return digits;
    }

    public void chooseCode() {
        int randIndex = random.nextInt(this.comboList.size());
        this.chosenCode = this.comboList.get(randIndex);
    }
}
