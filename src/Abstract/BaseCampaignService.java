package Abstract;

import Entity.Campaign;

public interface BaseCampaignService {
    void addCampaign(Campaign campaign);
    void deleteCampaign(Campaign campaign );
    void updateCampaign(Campaign campaign);
}
