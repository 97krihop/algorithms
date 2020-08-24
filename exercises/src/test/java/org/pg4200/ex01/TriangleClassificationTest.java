package org.pg4200.ex01;


import org.junit.jupiter.api.Test;
import org.pg4200.ex01.TriangleClassification.Classification;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.pg4200.ex01.TriangleClassification.Classification.*;
import static org.pg4200.ex01.TriangleClassification.classify;

public class TriangleClassificationTest {
    @Test
    public void testNegativeValue() {
        Classification res = classify(-2,4,4);
        assertEquals(NOT_A_TRIANGLE, res);
    }
    @Test
    public void testPositiveValue() {
        Classification res = classify(4,4,4);
        assertEquals(EQUILATERAL, res);
    }

    @Test
    public void testNotValidValue() {
        Classification res = classify(20,4,4);
        assertEquals(NOT_A_TRIANGLE, res);
    }
    @Test
    public void testNegativeValue2() {
        Classification res = classify(3,4,5);
        assertEquals(SCALENE, res);
    }


}
