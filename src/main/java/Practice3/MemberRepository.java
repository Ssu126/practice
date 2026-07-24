package Practice3;

import aQute.bnd.annotation.jpms.Open;

import java.util.List;
import java.util.Optional;

public class MemberRepository extends AbstractRepository<Member, Integer>{
    @Override
    public Member create(Member entity) {
        Integer newId = idGenerator();
        entity.setId(newId);
        database.put(newId, entity);

        System.out.println(current());
        return database.get(newId);
    }

    @Override
    public Member read(Integer id) {
        Member nMember = Optional.ofNullable(database.get(id))
                .filter(m -> !m.getIsDeleted())
                .orElseThrow(() -> )
    }

    @Override
    public List<Member> read() {}

    @Override
    public Member update(Integer id, Member entity) {}

    @Override
    public void delete(Integer id) {}
}
