package com.kodilla.testing.shape;
import org.junit.jupiter.api. *;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Nested
    @DisplayName("Tests add and remove figures")
    class TestAddAndRemove {
        @Test
        void testAddFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle = new Circle(5.2);

            //When
            shapeCollector.addFigure(circle);

            //Then
            Assertions.assertEquals(1, shapeCollector.getFigureQuantity());
        }
        @Test
        void testRemoveFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Square square = new Square(7.0);
            shapeCollector.addFigure(square);

            //When
            boolean result = shapeCollector.removeFigure(square);

            //Then
            Assertions.assertTrue(result);
            Assertions.assertEquals(0, shapeCollector.getFigureQuantity());
        }
    }

    @Nested
    @DisplayName("Tests get and show figures")
    class TestGetAndShow {
        @Test
        void testGetFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Triangle triangle = new Triangle(4.5, 7.2);
            shapeCollector.addFigure(triangle);

            //When

            Shape retrievedShape;
            retrievedShape = shapeCollector.getFigure(0);

            //Then
            Assertions.assertEquals(triangle, retrievedShape);
        }

        @Test
        void testShowFigures() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle = new Circle(5.2);
            Square square = new Square(7.0);
            Triangle triangle = new Triangle(4.5, 7.2);

            shapeCollector.addFigure(circle);
            shapeCollector.addFigure(square);
            shapeCollector.addFigure(triangle);

            //When

            String showAll = shapeCollector.showFigures();

            //Then
            Assertions.assertEquals("circle square triangle", showAll);
        }
    }
}
