package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


public class InsuranceTest {
    Insurance insurance;

    @BeforeEach
    public void setupEachTest() {
        insurance = new Insurance();
    }

    @ValueSource(ints = {18, 19, 28, 29})
    @ParameterizedTest
    public void testInsuranceGroupOne(int age) {
        int result = insurance.calculateCost(age);
        Assertions.assertEquals(120, result);
    }

    @ValueSource(ints = {30, 31, 64, 65})
    @ParameterizedTest
    public void testInsuranceGroupTwo(int age) {
        int result = insurance.calculateCost(age);
        Assertions.assertEquals(100, result);
    }

    @ValueSource(ints = {66, 67, 78, 79})
    @ParameterizedTest
    public void testInsuranceGroupThree(int age) {
        int result = insurance.calculateCost(age);
        Assertions.assertEquals(130, result);
    }

    @ValueSource(ints = {17, 80})
    @ParameterizedTest
    public void testAgeNotApplicable(int age) {
        int result = insurance.calculateCost(age);
        Assertions.assertEquals(0, result);
    }
}
