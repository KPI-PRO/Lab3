/**
 * ---------------------------------
 * ���� ��� ���������� �������:
 * F3: s = Min(X * Trans (MX * MY) + Z * Sort(Z))
 *
 * �������: ��� ���������
 * �����: ��-34
 * ����: 08.10.2015
 * ---------------------------------
 */
public class Task3 extends Thread {

    private double[] X;
    private double[] Z;
    private double[][] MX;
    private double[][] MY;
    private int n;
    private int sleep;

    public Task3(int n, int priority, int sleep, String name) {
        this.n = n;
        this.setPriority(priority);
        this.sleep = sleep;
        this.setName(name);
    }

    @Override
    public void run() {
        System.out.println(this.getName() + " is started!");

        X = Calculation.readVector(n);
        Z = Calculation.readVector(n);
        MX = Calculation.readMatrix(n);
        MY = Calculation.readMatrix(n);

        try {
            Thread.sleep(sleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int s = (int) Calculation.minVector(Calculation.addVectorAndNumber(Calculation.multMatrixOnVector(X, Calculation.transpon(Calculation.multMatrix(MX, MY))), Calculation.multVector(Z, Calculation.sortVector(Z))));


        if (n <= 4)
            System.out.println("F3 : s = " + s);

        System.out.println(this.getName() + " is finished!");
    }
}
