package test;

import modules.PercentageGrade;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PercantageGradeTest {

    PercentageGrade grade;

    @BeforeEach
    void setUp() {
        grade = new PercentageGrade("John", "Maths", 85);
    }

    @AfterEach
    void tearDown() {
        grade = null;
    }

    @Test
    void testConstructorAndGetters() {
        assertEquals("John", grade.getStudentName());
        assertEquals("Maths", grade.getModuleName());
        assertEquals(85, grade.getGrade());
    }

    @Test
    void testClassifyGradeDistinction() {
        grade.setGrade(85);
        assertEquals("Distinction", grade.classifyGrade());
    }

    @Test
    void testClassifyGradeMerit() {
        grade.setGrade(60);
        assertEquals("Merit", grade.classifyGrade());
    }

    @Test
    void testClassifyGradePass() {
        grade.setGrade(45);
        assertEquals("Pass", grade.classifyGrade());
    }

    @Test
    void testClassifyGradeFail() {
        grade.setGrade(30);
        assertEquals("Fail", grade.classifyGrade());
    }

    @Test
    void testInvalidGradeTooHigh() {
        assertThrows(IllegalArgumentException.class, () -> {
            grade.setGrade(110);
        });
    }

    @Test
    void testInvalidGradeTooLow() {
        assertThrows(IllegalArgumentException.class, () -> {
            grade.setGrade(-5);
        });
    }

    @Test
    void testBoundaryDistinction() {
        grade.setGrade(70); // минимум для Distinction
        assertEquals("Distinction", grade.classifyGrade());
    }

    @Test
    void testBoundaryPass() {
        grade.setGrade(40); // минимум для Pass
        assertEquals("Pass", grade.classifyGrade());
    }

    @Test
    void testSetGradeValid() {
        grade.setGrade(50);
        assertEquals(50, grade.getGrade());
    }

}