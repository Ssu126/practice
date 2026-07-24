package Practice2;

import aQute.bnd.annotation.jpms.Open;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MemberRepository extends MemberAbstractRepository {

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
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 id : " + id));

        System.out.println(current());
        return nMember;
    }

    @Override
    public List<Member> read() {
        List<Member> mList = database.values().stream()
                .filter(m -> !m.getIsDeleted())
                .collect(Collectors.toList());

        System.out.println(current());
        return mList;
    }

    @Override
    public Member update(Integer id, Member entity) {
        Member nMember = this.read(id);
        entity.setId(id);
        database.put(id, entity);

        System.out.println(current());
        return database.get(id);
    }

    @Override
    public void delete(Integer id) {
        Member nMember = this.read(id);
        database.get(id).setIsDeleted(true);

        System.out.println(current());
    }
}
