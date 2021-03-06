package oop.interfaces.newbiementalist.controller;

import oop.interfaces.newbiementalist.model.AceOfSpades;
import oop.interfaces.newbiementalist.model.Card;
import oop.interfaces.newbiementalist.model.KingOfDiamonds;
import oop.interfaces.newbiementalist.model.QueenOfHearts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Deck {

    private List<Card> cards;

    public Deck() {
        cards = Stream.of(
                new AceOfSpades(),
                new QueenOfHearts(),
                new KingOfDiamonds()
        ).collect(Collectors.toList());
    }

    public List<Card> getCards() {
        return new ArrayList<>(cards);
    }
}
