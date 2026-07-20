package demo.ex1;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@Getter
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public enum SendMediaType {
    SMS("010-0000-0000"),
    EMAIL("example@email.com");

    String sender;
}
