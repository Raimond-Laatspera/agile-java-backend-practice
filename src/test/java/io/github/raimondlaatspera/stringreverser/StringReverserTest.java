package io.github.raimondlaatspera.stringreverser;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringReverserTest {

    @Test
    void shouldReverseLetters() {
        StringReverser stringReverser = new StringReverser();

        assertEquals("olleH", stringReverser.reverseString("Hello"));
    }

    @Test
    void shouldReverseStringContainingDigits() {
        StringReverser stringReverser = new StringReverser();

        assertEquals("125", stringReverser.reverseString("521"));
    }

    @Test
    void shouldReverseEmptyString() {
        StringReverser stringReverser = new StringReverser();

        assertEquals("", stringReverser.reverseString(""));
    }

    @Test
    void shouldReverseSpecialCharacters() {
        StringReverser stringReverser = new StringReverser();

        assertEquals("!@#$%^", stringReverser.reverseString("^%$#@!"));
    }

    @Test
    void shouldReverseWhitespace() {
        StringReverser stringReverser = new StringReverser();

        assertEquals("b   a ", stringReverser.reverseString(" a   b"));
    }

    @Test
    void shouldReverseLongString() {
        StringReverser stringReverser = new StringReverser();

        assertEquals(".muspI meroL fo snoisrev gnidulcni rekaMegaP sudlA ekil erawtfos gnihsilbup potksed htiw yltnecer erom dna ,segassap muspI meroL gniniatnoc steehs tesarteL fo esaeler eht htiw s0691 eht ni desiralupop saw tI .degnahcnu yllaitnesse gniniamer ,gnittesepyt cinortcele otni pael eht osla tub ,seirutnec evif ylno ton devivrus sah tI .koob nemiceps epyt a ekam ot ti delbmarcs dna epyt fo yellag a koot retnirp nwonknu na nehw ,s0051 eht ecnis reve txet ymmud dradnats s'yrtsudni eht neeb sah muspI meroL .yrtsudni gnittesepyt dna gnitnirp eht fo txet ymmud ylpmis si muspI meroL", stringReverser.reverseString("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."));
    }

    @Test
    void shouldThrowIllegalArgumentExceptionWhenInputIsNull() {
        StringReverser stringReverser = new StringReverser();
        assertThrows(IllegalArgumentException.class, () -> stringReverser.reverseString(null));
    }
}
