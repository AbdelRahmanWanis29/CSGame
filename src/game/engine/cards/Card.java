package game.engine.cards;

public class Card {
    private String name;
    private String description;
    private int rarity;
    private boolean lucky;

    public Card(String name,String description,int rarity,boolean lucky)
    {
        this.name=name;
        this.description=description;
        this.rarity=rarity;
        this.lucky=lucky;
    }


}
