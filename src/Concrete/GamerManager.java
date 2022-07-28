package Concrete;

import Abstract.BaseGamerManager;
import Abstract.GamerCheckService;
import Entity.Gamer;

public class GamerManager extends BaseGamerManager {

    GamerCheckService gamerCheckService;

    public GamerManager(GamerCheckService gamerCheckService){
        this.gamerCheckService = gamerCheckService;
    }

    @Override
    public void save(Gamer gamer) throws Exception {
        if (this.gamerCheckService.checkIfRealPerson(gamer)) {
            super.save(gamer);
        }else{
            throw new Exception("Not a valid person");
        }
    }

}
