package com.example.helloworld;

// This program is a practice session on the use of HashSet and HashMap.
// Created by Sharon M. Ramsay on 10/8/22

// Import java utilities
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

public class WordCount {
    public static void main(String[] args) {
        // Create ArrayList to hold the sentences
        ArrayList<String> sentences = new ArrayList<>();
        sentences.add("Nothing is so necessary for a young man as the company of intellignet women");
        sentences.add("The strongest of all warriors are these two Time and Patience");
        sentences.add("If everyone fought for their own convictions there would be no war");
        sentences.add("There is no greatness where there is not simplicity goodness and truth");
        sentences.add("A limit has been set to human life which cannot be overstepped");
        sentences.add("Well what makes you go to war");

        // Use for loop to break sentences into words and count he number of words
        int wordCount = 0;
        ArrayList<String> wordList = new ArrayList<>();
        for (String line : sentences) {
            String [] words = line.split(" ");
            for (String word : words) {
                wordList.add(word);
                wordCount ++;
            }

        }

        System.out.println("The total number of words is: " + wordCount);

        // Create a HashMap of the number of occurrence of each unique word (case sensitive)
        HashMap<String, Integer> myWordCount = new HashMap<>();
        for (String word : wordList) {
            Integer myCount = myWordCount.get(word);
            if (myCount == null) {
                myCount = 0;
            }
            myCount += 1;
            myWordCount.put(word, myCount);
        }
        // Print each key : value pair in the HashMap
        //System.out.println("This is a list of the number of occurrence of each word:");
        //myWordCount.forEach((k, v) -> {
        //    System.out.println("Key: " + k + ", Value: " + v);
        //});

        // Create and manipulate a TreeSet
        TreeSet<String> alphaWordList = new TreeSet<>(wordList);
        System.out.println("This is an alphabetical list of the words (uppercase then lowercase):");
        System.out.println(alphaWordList);
        System.out.println("The first word is: " + alphaWordList.first());
        System.out.println("The last word is: " + alphaWordList.last());
        }

        }


