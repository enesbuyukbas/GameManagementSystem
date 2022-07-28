package Concrete;

import Abstract.BaseCampaignService;
import Entity.Campaign;

public class CampaignManager implements BaseCampaignService {
    @Override
    public void addCampaign(Campaign campaign) {
        System.out.println("Kampanya eklendi : "+campaign.getCampaignName());
    }

    @Override
    public void deleteCampaign(Campaign campaign) {
        System.out.println("Kampanya silindi : "+campaign.getCampaignName());
    }

    @Override
    public void updateCampaign(Campaign campaign) {
        System.out.println("Kampanya güncellendi : "+campaign.getCampaignName());
    }
}
