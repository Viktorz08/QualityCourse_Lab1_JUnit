package lab1.task23;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TaskVar23Test {

    @Test(expected = NullPointerException.class)
    public void testMinAbovePassDiagonalNULLException() {
        int[][] matrix = null;

        TaskVar23 instance = new TaskVar23();
        instance.minAbovePassDiagonal(matrix);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinAbovePassDiagonalIllegalArgumentExceptionEmpty() {
        int[][] matrix = {};

        TaskVar23 instance = new TaskVar23();
        instance.minAbovePassDiagonal(matrix);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinAbovePassDiagonalIllegalArgumentExceptionWrongSize() {
        int[][] matrix = {{1, 3}, {2, 4}, {3, 5}};

        TaskVar23 instance = new TaskVar23();
        instance.minAbovePassDiagonal(matrix);
    }

    @Test
    public void testMinAbovePassDiagonalSimple() {
        int[][] matrix = {{1, 3, 6},
                {2, 4, 0},
                {3, 5, 1}};
        int expResult = 0;

        TaskVar23 instance = new TaskVar23();
        int result = instance.minAbovePassDiagonal(matrix);

        assertEquals(expResult, result);
    }

    @Test
    public void testMinAbovePassDiagonal() {
        int[][] matrix = {{-1, -3, -6, 5, 7},
                {2, -4, -0, 13, -47},
                {3, -5, -1, -26, 15},
                {-30, 9, 8, -42, 3},
                {-3, 4, 43, -15, 29}};
        int expResult = -47;

        TaskVar23 instance = new TaskVar23();
        int result = instance.minAbovePassDiagonal(matrix);

        assertEquals(expResult, result);
    }

    @Test(expected = NullPointerException.class)
    public void testMaxAbovePassDiagonalNULLException() {
        int[][] matrix = null;

        TaskVar23 instance = new TaskVar23();
        instance.maxAbovePassDiagonal(matrix);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxAbovePassDiagonalIllegalArgumentExceptionEmpty() {
        int[][] matrix = {};

        TaskVar23 instance = new TaskVar23();
        instance.maxAbovePassDiagonal(matrix);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxAbovePassDiagonalIllegalArgumentExceptionWrongSize() {
        int[][] matrix = {{1, 3}, {2, 4}, {3, 5}};

        TaskVar23 instance = new TaskVar23();
        instance.maxAbovePassDiagonal(matrix);
    }

    @Test
    public void testMaxAbovePassDiagonalSimple() {
        int[][] matrix = {{1, 3, 6},
                {2, 4, 0},
                {3, 5, 1}};
        int expResult = 6;

        TaskVar23 instance = new TaskVar23();
        int result = instance.maxAbovePassDiagonal(matrix);

        assertEquals(expResult, result);
    }

    @Test
    public void testMaxAbovePassDiagonal() {
        int[][] matrix = {{-1, -3, -6, 5, 7},
                {2, -4, -0, 13, -47},
                {3, -5, -1, -26, 15},
                {-30, 9, 8, -42, 3},
                {-3, 4, 43, -15, 29}};
        int expResult = 15;

        TaskVar23 instance = new TaskVar23();
        int result = instance.maxAbovePassDiagonal(matrix);

        assertEquals(expResult, result);
    }

    @Test(expected = NullPointerException.class)
    public void testMeanBetweenMinMaxAbovePassDiagonalNULLException() {
        int[][] matrix = null;

        TaskVar23 instance = new TaskVar23();
        instance.meanBetweenMinMaxAbovePassDiagonal(matrix);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMeanBetweenMinMaxAbovePassDiagonalIllegalArgumentExceptionEmpty() {
        int[][] matrix = {};

        TaskVar23 instance = new TaskVar23();
        instance.meanBetweenMinMaxAbovePassDiagonal(matrix);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMeanBetweenMinMaxAbovePassDiagonalIllegalArgumentExceptionWrongSize() {
        int[][] matrix = {{1, 3}, {2, 4}, {3, 5}};

        TaskVar23 instance = new TaskVar23();
        instance.meanBetweenMinMaxAbovePassDiagonal(matrix);
    }

    @Test
    public void testMeanBetweenMinMaxAbovePassDiagonalSimple() {
        int[][] matrix = {{1, 3, 6},
                {2, 4, 0},
                {3, 5, 1}};
        int expResult = 3;

        TaskVar23 instance = new TaskVar23();
        int result = instance.meanBetweenMinMaxAbovePassDiagonal(matrix);

        assertEquals(expResult, result);
    }

    @Test
    public void testMeanBetweenMinMaxAbovePassDiagonal() {
        int[][] matrix = {{-1, -3, -6, 5, 7},
                {2, -4, -0, 13, -47},
                {3, -5, -1, -26, 15},
                {-30, 9, 8, -42, 3},
                {-3, 4, 43, -15, 29}};
        int expResult = -16;

        TaskVar23 instance = new TaskVar23();
        int result = instance.meanBetweenMinMaxAbovePassDiagonal(matrix);

        assertEquals(expResult, result);
    }
}