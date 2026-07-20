package demo;

public interface HeroRepository<T, F> {
    T findById(F id);
}
