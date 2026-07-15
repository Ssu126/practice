package com.example.demo_0710.hero1;

import com.example.demo_0710.hero1.Hero_interface.Hero;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@RequiredArgsConstructor
public class Player {
    private final int id;
    private final String name;
    private final Side side;
    private final int kill;
    private final int assist;
    private final int death;
    private final Hero pickedHero;
}
