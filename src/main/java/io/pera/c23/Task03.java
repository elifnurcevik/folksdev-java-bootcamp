package io.pera.c23;

public class Task03 {
    public static void main(String[] args) {
        String cardTypes[] = {"Hearts", "Spade", "Diamonds", "Clubs"};
        String cardNumbers[] = {"As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        int deck[] = new int[52];

        createTheDeck(deck);
        shuffleTheDeck(deck);
        showTheDeck(deck, cardTypes, cardNumbers);

    }

    private static void shuffleTheDeck(int[] deck) {
        for (int i = 0; i < deck.length; i++) {

            int randomIndex = (int) (Math.random() * deck.length);
            int temporary = deck[i];

            deck[i] = deck[randomIndex];
            deck[randomIndex] = temporary;
        }
    }

    private static void showTheDeck(int[] deck, String[] cardTypes, String[] cardNumbers) {
        for (int i = 0; i < 4; i++) {

            String cardType = cardTypes[deck[i] / 13];
            String cardNumber = cardNumbers[deck[i] % 13];

            System.out.println(cardType + " " + cardNumber + " ");
        }
    }


    private static void createTheDeck(int[] deck) {
        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }
    }
}
