package game.engine.cards;

public class ConfusionCard extends Card{
    private final int duration;

    public ConfusionCard(String name,String description,int rarity,boolean lucky,int duration)
    {
        super(name,description,rarity,lucky);
        this.duration=duration;
    }

    public int getDuration() {
        return this.duration;
    }
}
