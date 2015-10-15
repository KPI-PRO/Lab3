/**
 * ---------------------------------
 * ���� ��� ���������� ������� �������
 *
 * �������: ��� ���������
 * �����: ��-34
 * ����: 08.10.2015
 * ---------------------------------
 */
public class Calculation {

    public static double[] addVector(double[] A, double[] B) {
        for (int i = 0; i < A.length; i++) {
            A[i] += B[i];
        }
        return A;
    }

    public static double[] addVectorAndNumber(double[] A, double k) {
        double[] result = new double[A.length];
        for (int i = 0; i < A.length; i++) {
            result[i] = k + A[i];
        }
        return result;
    }

    public static double[] multMatrixOnVector(double[] A, double[][] MA) {
        double[] result = new double[A.length];
        double temp;
        for (int i = 0; i < MA.length; i++) {
            temp = 0;
            for (int j = 0; j < result.length; j++) {
                temp += A[i] * MA[j][i];
            }
            result[i] = temp;
        }
        return result;
    }

    public static double[][] multMatrix(double[][] MA, double[][] MB) {
        double temp;
        double[][] result = new double[MA.length][MA[1].length];
        for (int i = 0; i < MA.length; i++) {
            for (int j = 0; j < MA[i].length; j++) {
                temp = 0;
                for (int k = 0; k < MB.length; k++) {
                    temp += MA[i][k] * MB[k][j];
                }
                result[i][j] = temp;
            }
        }
        return result;
    }

    public static double[][] transpon(double[][] MA) {
        double[][] result = new double[MA[0].length][MA.length];
        for (int i = 0; i < MA.length; i++) {
            for (int j = 0; j < MA[i].length; j++) {
                result[i][j] = MA[j][i];
            }
        }
        return MA;
    }

    public static double[] sortVector(double[] A) {
        double temp;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < (i - 1); j++) {
                if (A[j] > A[j + 1]) {
                    temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }
            }
        }
        return A;
    }

    public static double minVector(double[] A) {
        double min = A[0];
        for (int i = 0; i < A.length; i++) {
            if (A[i] < min) {
                min = A[i];
            }
        }
        return min;
    }

    public static double multVector(double[] A, double[] B) {
        double result = 0;
        for (int i = 0; i < A.length; i++) {
            result += A[i] * B[i];
        }
        return result;
    }

    public static synchronized double[] readVector(int n) {
        double[] vector = new double[n];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = 1;
        }
        return vector;
    }

    public static synchronized double[][] readMatrix(int n) {
        double[][] matrix = new double[n][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = 1;
            }
        }
        return matrix;
    }

    public static synchronized void showVector(double[] vector) {
        System.out.print("F1 : E = { ");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.print("}");
    }

    public static synchronized void showMatrix(double[][] matrix) {
        System.out.println("F2 : MM = ");

        for (int i = 0; i < matrix.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("|");
            System.out.println();
        }
    }

}
