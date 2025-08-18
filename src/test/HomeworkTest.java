package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

class HomeworkTest {

    @Test
    void testPrintListViaSeparator() {
        List<String> list = new ArrayList<>(List.of("a", "b", "c", "d"));
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        main.Homework.printListViaSeparator(list);
        Assertions.assertEquals("a b c d", outputStream.toString().trim());
        outputStream.reset();
        main.Homework.printListViaSeparator(list, ",");
        Assertions.assertEquals("a,b,c,d", outputStream.toString().trim());
    }

    @Test
    void testReverseList() {
        List<String> list = new ArrayList<>(List.of("a", "b", "c"));
        Assertions.assertEquals("[c, b, a]", main.Homework.reverseList(list).toString());
    }

    @Test
    void testGetListByFirstSymbol() {
        List<String> list = new ArrayList<>(List.of("Архангельск", "Азербайджан", "Пенза", "Турция"));
        Assertions.assertEquals("[Архангельск, Азербайджан]", main.Homework.getListByFirstSymbol(list, 'А').toString());
    }
}