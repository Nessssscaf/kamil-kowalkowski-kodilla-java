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

            //When
            shapeCollector.addFigure(shapeCollector.circle);

            //Then
            Assertions.assertEquals(1, shapeCollector.getFigureQuantity());
        }
        @Test
        void testRemoveFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(shapeCollector.circle);

            //When
            boolean result = shapeCollector.removeFigure(shapeCollector.circle);

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
            Circle theShape = new Circle(3.8);
            shapeCollector.addFigure(shapeCollector.circle);

            //When

            Circle retrievedShape;
            retrievedShape = (Circle) shapeCollector.getFigure(0);

            //Then
            Assertions.assertEquals(theShape, retrievedShape);
        }

        @Test
        void testShowFigures() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(shapeCollector.circle);

            ShapeCollector shapeCollector2 = new ShapeCollector();
            shapeCollector2.addFigure(shapeCollector2.square);

            ShapeCollector shapeCollector3 = new ShapeCollector();
            shapeCollector3.addFigure(shapeCollector3.triangle);

            //When

            String showAll = shapeCollector.showFigures();

            //Then
            Assertions.assertEquals("circle square triangle", showAll);
        }
    }
}
