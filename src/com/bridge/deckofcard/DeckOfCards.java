package com.bridge.deckofcard;

public class DeckOfCards {

    //Deck parts
    public void deck(){

    }

    //Shuffle The Cards
    public void ShuffleTheCards(){


    }

    public static void main(String[] args) {


        // Initialize Arrays
        int[] deck = new int[52];
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        // Initialize cards
        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }
    }

}
