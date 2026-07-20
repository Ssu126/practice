package demo.ex1.common;

import demo.ex1.attack;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public abstract class Hero {
    private final String name;

    protected final void printHero(){
        System.out.println(this.name);
    }

    public final void heroAttack(){
        printHero();
        attack();
    }

    public final void heroUltimate(){
        printHero();
        attack();
    }

    protected abstract void attack();

    protected abstract void ultimate();
}
