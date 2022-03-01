
public class MatrixOperations implements ICalculate {

    private int[][] matrix1;
    private int[][] matrix2;
    public int matrixDimension;
    private int[][] resultMatrix ;

    public MatrixOperations(int[][] matrix1, int[][] matrix2, int dimension) {

        this.matrix1 = matrix1;
        this.matrix2 = matrix2;
        this.matrixDimension = dimension;
        this.resultMatrix = new int[matrixDimension][matrixDimension];

    }

    public int[][] getMatrix1() {
        return matrix1;
    }

    public void setMatrix1(int[][] matrix1) {
        this.matrix1 = matrix1;
    }

    public int[][] getMatrix2() {
        return matrix2;
    }

    public void setMatrix2(int[][] matrix2) {
        this.matrix2 = matrix2;
    }

    public int[][] getResultMatrix() {
        return resultMatrix;
    }

    public void setResultMatrix(int[][] resultMatrix) {
        this.resultMatrix = resultMatrix;
    }

    @Override
    public int[][] multipleMatrix() {
        resetMatrix();
        for (int i = 0; i < matrixDimension; i++) {
            for (int j = 0; j < matrixDimension; j++) {
                resultMatrix[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    resultMatrix[i][j] += this.matrix1[i][k] * this.matrix2[k][j];
                }
            }
        }
        return resultMatrix;
    }

    @Override
    public int[][] sumMatrix() {

        resetMatrix();
        for (int i = 0; i < this.matrixDimension; i++) {
            for (int j = 0; j < this.matrixDimension; j++) {

                resultMatrix[i][j] = this.matrix1[i][j] + this.matrix2[i][j];
            }
        }

        return resultMatrix;
    }

    public void resetMatrix() {

        for (int i = 0; i < matrixDimension; i++) {
            for (int j = 0; j < matrixDimension; j++) {
                resultMatrix[i][j] = 0;
            }
        }

    }

    public void showResults(int[][] mat, int dimension) {
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                System.out.print(mat[i][j] + ",");
            }
            System.out.println();
        }

    }

}
