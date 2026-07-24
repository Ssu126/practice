package Practice2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class MemberAbstractRepository implements IRepository {
    protected final Map<Integer, Member> database = new HashMap<>();
    private Integer idCount = 0;

    protected Integer idGenerator() {
        return ++idCount;
    }

    protected List<Member> current() {
        System.out.println("--current조회--");
        return new ArrayList<>(database.values());
    }
}
