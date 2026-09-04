package task4_2.task03;

public class Matrix {
    int row;
    int cols;
    int[][] data;

    public Matrix(int row, int cols) {
        this.row = row;
        this.cols = cols;
        data = new int[row][cols];
    }

    public Matrix(int[][] data) {
        this.data = data;
        this.row = data.length;
        this.cols = data[0].length;
    }

    public int getElement(int i, int j) {
        return data[i][j];
    }

    public void setElement(int i, int j, int element) {
        data[i][j] = element;
    }

    public void printMatrix() {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int[][] addMatrix(int[][] newMatrix) {
        int[][] copyMatrix = new int[data.length][];

        for (int i = 0; i < data.length; i++) {
            copyMatrix[i] = data[i].clone();
        }

        for (int i = 0; i < copyMatrix.length; i++) {
            for (int j = 0; j < copyMatrix[i].length; j++) {
                copyMatrix[i][j] += newMatrix[i][j];
            }
        }

        return copyMatrix;
    }

    public int[][] multiplyMatrix(int[][] newMatrix) {
        int[][] copyMatrix = new int[data.length][];

        for (int i = 0; i < data.length; i++) {
            copyMatrix[i] = data[i].clone();
        }

        for (int i = 0; i < copyMatrix.length; i++) {
            for (int j = 0; j < copyMatrix[i].length; j++) {
                copyMatrix[i][j] *= newMatrix[i][j];
            }
        }

        return copyMatrix;
    }

    public static void main(String[] args) {

        Matrix matrix = new Matrix(2, 3);

        matrix.setElement(0, 0, 1);
        matrix.setElement(0, 1, 2);
        matrix.setElement(0, 2, 3);
        matrix.setElement(1, 0, 4);
        matrix.setElement(1, 1, 5);
        matrix.setElement(1, 2, 6);

        System.out.println("Исходная матрица: ");
        matrix.printMatrix();

        System.out.println();
        System.out.println("Элемент [1][2]: " + matrix.getElement(1, 2));

        int[][] matrixForAdd = {{10, 20, 30}, {40, 50, 60}};

        int[][] resultAdd = matrix.addMatrix(matrixForAdd);

        System.out.println();
        System.out.println("Результат сложения: ");
        printArray(resultAdd);

        int[][] resultMultiply = matrix.multiplyMatrix(matrixForAdd);

        System.out.println();
        System.out.println("Результат умножения: ");
        printArray(resultMultiply);

        int[][] array = {{7, 8}, {9, 10}};

        Matrix matrix2 = new Matrix(array);

        System.out.println();
        System.out.println("Матрица, созданная через копирующий конструктор: ");
        matrix2.printMatrix();
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
