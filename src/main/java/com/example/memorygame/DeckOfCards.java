package com.example.memorygame;

import java.util.ArrayList;
import java.util.List;

public class DeckOfCards {
    private ArrayList<Card> deck;

    public DeckOfCards() {
        this.deck = new ArrayList<>();
        List<String> suits = Card.getValidSuits();
        List<String> faceName = Card.getValidFaceNames();


    }

}
