package Abstract;

import Entity.Campaign;
import Entity.Gamer;

public abstract class ASellManager {
    public void sell(Gamer gamer){
        System.out.println("Product sold to " + gamer.getFirstName());
    }

    public void sell(Gamer gamer, Campaign campaign){
        System.out.println("Product sold to "+ gamer.getFirstName() +" and "+ campaign.getCampaignName());
    }
}
