package com.company;

public class SearchTerms {
        public static int findSolution(int[] array) {
            int counterMax = 1;
            int counter = 1;

            for (int i = 1; i < array.length; i++) {
                if (array[i] > array [i - 1]) {
                    counter += 1;
                    if (counter > counterMax) {
                        counterMax = counter;
                    }
                } else {
                    counter = 1;
                }
            }
            return counterMax;
        }
    }
