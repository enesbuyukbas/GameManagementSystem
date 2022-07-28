package Abstract;

import Entity.Gamer;

public abstract class BaseGamerManager implements BaseGamerService{

    @Override
    public void save(Gamer gamer) throws Exception {
        System.out.println("Kullanıcı kaydedildi : "+ gamer.getFirstName());
    }

    @Override
    public void delete(Gamer gamer) {
        System.out.println("Kullanıcı silindi : "+ gamer.getFirstName());
    }

    @Override
    public void update(Gamer gamer) {
        System.out.println("Kullanıcı güncellendi : "+ gamer.getFirstName());
    }
}
