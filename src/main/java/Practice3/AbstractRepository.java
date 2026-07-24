package Practice3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class AbstractRepository<T extends Human, ID> implements IRepository<T, ID>{
    protected final Map<ID, T> database = new HashMap<>();
    private Integer idCount = 0;

    protected Integer idGenerator() {
        return ++idCount;
    }

    protected List<T> current() {
        return new ArrayList<>(database.values());
    }
}
