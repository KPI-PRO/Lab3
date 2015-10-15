/**
 * ---------------------------------
 * ���� ��� ���������� �������:
 * F1: E = A + B + C + D * (MA * MD)
 *
 * �������: ��� ���������
 * �����: ��-34
 * ����: 08.10.2015
 *о
 * ---------------------------------
 */
public class Task1 extends Thread {

    private double[] A;
    private double[] B;
    private double[] C;
    private double[] D;
    private double[][] MA;
    private double[][] MD;
    private int n;
    private int sleep;

    public Task1(int n, int priority, int sleep, String name) {
        this.n = n;
        this.setPriority(priority);
        this.sleep = sleep;
        this.setName(name);
    }


    @Override
    public void run() {
        System.out.println(this.getName() + " is started!");
        A = Calculation.readVector(n);
        B = Calculation.readVector(n);
        C = Calculation.readVector(n);
        D = Calculation.readVector(n);
        MA = Calculation.readMatrix(n);
        MD = Calculation.readMatrix(n);

        try {
            Thread.sleep(sleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        double[] E = Calculation.addVector(Calculation.addVector(A, B), Calculation.addVector(C, Calculation.multMatrixOnVector(D, Calculation.multMatrix(MA, MD))));

        if (n <= 4)
            Calculation.showVector(E);


        System.out.println(this.getName() + " is finished!");

    }
}
