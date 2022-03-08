
public class Main {

    public static void main(String[] args) {
       
        int[][] mat = {{1, 22, 3},
        {3, 4, 5},
        {6, 7, 8}};
        int[][] mat2 = {{9, 8, 7},
        {6, 5, 4},
        {3, 2, 1}};

        MatrixOperations mo = new MatrixOperations(mat, mat2, 3);

        mo.showResults(mo.sumMatrix(), 3);

        System.out.println("*****************************************************");
        mo.showResults(mo.multipleMatrix(), 3);

    }

}
