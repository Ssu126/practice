package demo.ex1.common;

public interface HeroRepository<T extends Hero, F>{
    T findById(F id);
}
