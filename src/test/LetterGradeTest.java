package test;

import modules.LetterGrade;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LetterGradeTest {

    LetterGrade grade;

    @BeforeEach
    void setUp() {
        grade = new LetterGrade("Jane", "Science", 'A');
    }

    @AfterEach
    void tearDown() {
        grade = null;
    }

    @Test
    void testConstructorAndGetters() {
        assertEquals("Jane", grade.getStudentName());
        assertEquals("Science", grade.getModuleName());
        assertEquals(1, grade.getGrade()); // A → 1
        assertEquals('A', grade.getLetterGrade());
    }

    @Test
    void testClassifyGradeDistinction() {
        assertEquals("Distinction", grade.classifyGrade()); // A
        grade.setGrade('B');
        assertEquals("Distinction", grade.classifyGrade()); // B
    }

    @Test
    void testClassifyGradeMerit() {
        grade.setGrade('C');
        assertEquals("Merit", grade.classifyGrade());
    }

    @Test
    void testClassifyGradePass() {
        grade.setGrade('D');
        assertEquals("Pass", grade.classifyGrade());
    }

    @Test
    void testClassifyGradeFail() {
        grade.setGrade('E');
        assertEquals("Fail", grade.classifyGrade());
    }

    @Test
    void testGetGradeReturnsInt() {
        grade.setGrade('B');
        assertEquals(2, grade.getGrade());
        grade.setGrade('C');
        assertEquals(3, grade.getGrade());
    }

    @Test
    void testInvalidGrade() {
        assertThrows(IllegalArgumentException.class, () -> {
            grade.setGrade('Q');
        });
    }

    @Test
    void testLowercaseGrade() {
        grade.setGrade('b'); // маленькая буква
        assertEquals('B', grade.getLetterGrade()); // должна стать заглавной
        assertEquals("Distinction", grade.classifyGrade());
    }
}
