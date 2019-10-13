package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculationsAdd() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring.calculator");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double result = calculator.add(7, 5);
        //Then
        Assert.assertEquals(12, result, 0.01);
    }

    @Test
    public void testCalculationsSub() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring.calculator");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double result = calculator.sub(7, 5);
        //Then
        Assert.assertEquals(2, result, 0.01);
    }

    @Test
    public void testCalculationsMul() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring.calculator");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double result = calculator.mul(7, 5);
        //Then
        Assert.assertEquals(35, result, 0.01);
    }

    @Test
    public void testCalculationsDiv() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring.calculator");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double result = calculator.div(12, 2);
        //Then
        Assert.assertEquals(6, result, 0.01);
    }
}
