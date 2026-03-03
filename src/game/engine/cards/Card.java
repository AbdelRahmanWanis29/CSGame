package game.engine.cards;

public class Card {
    private final String name;
    private final String description;
    private final int rarity;
    private final boolean lucky;

    public Card(String name,String description,int rarity,boolean lucky)
    {
        this.name=name;
        this.description=description;
        this.rarity=rarity;
        this.lucky=lucky;
    }


}
