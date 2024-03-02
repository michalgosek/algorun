package com.michalgosek.algorithms.twopointers;

import java.util.HashMap;
import java.util.List;

/*
Least Consecutive Cards to Match
A bunch of cards is laid out in front of you in a line, where the value of each card ranges from 0 to 10^6.
A pair of cards are matching if they have the same number value.

Given a list of integer cards, your goal is to match a pair of cards, but you can only pick up cards in a
consecutive manner. What's the minimum number of cards that you need to pick up to make a pair?
If there is no matching pairs, return -1.

For example, given cards = [3, 4, 2, 3, 4, 7], then picking up [3, 4, 2, 3] makes a pair of 3s and picking up [4, 2, 3, 4]
matches two 4s. We need 4 consecutive cards to match a pair of 3s and 4 consecutive cards to match 4s,
so you need to pick up at least 4 cards to make a match.
 */

public class LeastConsecutiveCardsToMatch {
    public static int leastConsecutiveCardsToMatch(List<Integer> cards) {
        var N = cards.size();
        var minimumDeckSizeWithPair = N + 1;
        var left = 0;
        var currentDeck = new HashMap<Integer, Integer>();
        for (var right = 0; right < N; ++right) {

            currentDeck.put(cards.get(right), currentDeck.getOrDefault(cards.get(right), 0) + 1);
            while (currentDeck.get(cards.get(right)) == 2) {
                minimumDeckSizeWithPair = Math.min(minimumDeckSizeWithPair, right - left + 1);
                currentDeck.put(cards.get(left), currentDeck.get(cards.get(left)) - 1);
                ++left;
            }
        }

        return minimumDeckSizeWithPair == N + 1 ? -1 : minimumDeckSizeWithPair;
    }
}
