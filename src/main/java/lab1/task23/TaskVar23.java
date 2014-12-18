package lab1.task23;

/**
 * Created by Victor on 9/18/2014.
 */
public class TaskVar23 {

    protected void validateMatrix(int matrix[][]) {
        if (matrix == null) {
            throw new NullPointerException();
        }

        if (matrix.length == 0 || matrix.length != matrix[0].length) {
            throw new IllegalArgumentException("Argument is not matrix");
        }
    }

    protected int minAbovePassDiagonal(int matrix[][]) {
        validateMatrix(matrix);

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < matrix.length; i++)
            for (int j = i + 1; j < matrix.length; j++)
                if (min > matrix[i][j])
                    min = matrix[i][j];

        return min;
    }

    protected int maxAbovePassDiagonal(int matrix[][]) {
        validateMatrix(matrix);

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++)
            for (int j = i + 1; j < matrix.length; j++)
                if (max < matrix[i][j])
                    max = matrix[i][j];

        return max;
    }

    public int meanBetweenMinMaxAbovePassDiagonal(int matrix[][]) {
        validateMatrix(matrix);
        int min = minAbovePassDiagonal(matrix);
        int max = maxAbovePassDiagonal(matrix);

        return (min + max) / 2;
    }

}
