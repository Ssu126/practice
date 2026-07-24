package Practice1;

import java.util.HashMap;
import java.util.Map;

public class MemberRepository implements IRepository {
    protected Map<Integer, Member> database = new HashMap<>();
    private Integer idCount = 0;

    private Integer idGenerator() {
        return ++idCount;
    }

    @Override
    public Member create(Member entity) {
        Integer newId = idGenerator();
        entity.setId(newId);
        database.put(newId, entity);

        return database.get(newId);
    }

    @Override
    public Member read(Integer id) {
        return database.get(id);
    }

    @Override
    public Member update(Member entity) {
        database.put(entity.getId(), entity);
        return database.get(entity.getId());
    }
    @Override
    public void delete(Integer id) {
        database.remove(id);
    }
}
