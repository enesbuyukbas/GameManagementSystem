package Abstract;

import Entity.Gamer;

public interface BaseGamerService {
    void save(Gamer gamer) throws Exception;
    void delete(Gamer gamer);
    void update(Gamer gamer);
}
