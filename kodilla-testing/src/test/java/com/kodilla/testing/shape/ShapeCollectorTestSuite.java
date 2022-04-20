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
            ShapeCollector shapeCollector = new ShapeCollector("circle", 3.8);

            //When
            shapeCollector.addFigure("circle", 3.8);

            //Then
            Assertions.assertEquals(1, shapeCollector.getFigureQuantity());
        }
        @Test
        void testRemoveFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector("square", 7.4);
            Circle theShape = new Circle("circle", 3.8);
            shapeCollector.addFigure(theShape.getShapeName(), theShape.getField());

            //When
            boolean result = shapeCollector.removeFigure("circle", 3.8);

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
            ShapeCollector shapeCollector = new ShapeCollector("square", 7.4);
            Circle theShape = new Circle("circle", 3.8);
            shapeCollector.addFigure(theShape.getShapeName(), theShape.getField());

            //When

            Circle retrievedShape;
            retrievedShape = (Circle) shapeCollector.getFigure(0);

            //Then
            Assertions.assertEquals(theShape, retrievedShape);
        }

        @Test
        void testShowFigures() {
            //Given
            Circle theShape = new Circle("circle", 3.8);
            ShapeCollector shapeCollector = new ShapeCollector(theShape.getShapeName(), theShape.getField());
            shapeCollector.addFigure(theShape.getShapeName(), theShape.getField());

            Square theShape2 = new Square("square", 4.2);
            ShapeCollector shapeCollector2 = new ShapeCollector(theShape2.getShapeName(), theShape2.getField());
            shapeCollector2.addFigure(theShape2.getShapeName(), theShape2.getField());

            Triangle theShape3 = new Triangle("triangle", 4.9);
            ShapeCollector shapeCollector3 = new ShapeCollector(theShape3.getShapeName(), theShape3.getField());
            shapeCollector3.addFigure(theShape3.getShapeName(), theShape3.getField());

            //When

            String showAll = shapeCollector.showFigures();

            //Then
            Assertions.assertEquals("circle square triangle", showAll);
        }
    }
}
