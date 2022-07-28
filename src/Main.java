import Abstract.ASellManager;
import Abstract.BaseGamerManager;
import Concrete.CampaignManager;
import Concrete.GamerCheckManager;
import Concrete.GamerManager;
import Concrete.SellManager;
import Entity.Campaign;
import Entity.Gamer;

public class Main {
    public static void main(String[] args) throws Exception {
        Gamer gamer = new Gamer(1, "Enes", "Büyükbaş", "12345678912", 2000);
        Campaign campaign = new Campaign(1, "Yaz geldi", 10);

        BaseGamerManager gamerManager = new GamerManager(new GamerCheckManager());
        gamerManager.save(gamer);

        ASellManager sellManager = new SellManager();
        sellManager.sell(gamer, campaign);

        CampaignManager campaignManager = new CampaignManager();
        campaignManager.addCampaign(campaign);
    }
}
