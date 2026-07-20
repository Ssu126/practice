package demo.ex1;

import demo.ex1.common.AgilityHeroRepository;
import demo.ex1.common.Hero;
import demo.ex1.common.StrengthHeroRepository;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import java.util.HashMap;
import java.util.Map;

@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class DemoApplication {
    public static void createMessage(MessageType type){
        System.out.println("당신에게 메세지를 보냅니다. : " + type.getMessage());
        System.out.println("다음으로부터 전송되었습니다. : " + type.getMedia().getSender());
    }

    public static void main(String[] args) {
        createMessage(MessageType.LOVE);
        createMessage(MessageType.THANKS);
    }

    public static void backup() {
        StrengthHeroRepository strRepository = new StrengthHeroRepository();
        strRepository.save(new StrengthHero("Dragon Ragger"));
        strRepository.save(new StrengthHero("Pudge"));

        AgilityHeroRepository aglReponsitory = new AgilityHeroRepository();
        aglReponsitory.save(new AgilityHero("Weaver"));
        aglReponsitory.save(new AgilityHero("Slark"));

        Hero strHero = strRepository.findById("Slardar");
        Hero aglHero = aglReponsitory.findById("Slark");

        System.out.println("힘 속성 영웅");
        strHero.getName();
        strHero.heroAttack();
        strHero.heroUltimate();

        System.out.println("민첩 속성 영웅");
        aglHero.getName();
        aglHero.heroAttack();
        aglHero.heroUltimate();
    }
}
