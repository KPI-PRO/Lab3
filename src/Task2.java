/**
 * ---------------------------------
 * ���� ��� ���������� �������:
 * F2: MM = MF * (MO * MN)
 *
 * �������: ��� ���������
 * �����: ��-34
 * ����: 08.10.2015
 * ---------------------------------
 */
public class Task2 extends Thread {

    private double[][] MF;
    private double[][] MO;
    private double[][] MN;
    private int n;
    private int sleep;

    public Task2(int n, int priority, int sleep, String name) {
        this.n = n;
        this.setPriority(priority);
        this.sleep = sleep;
        this.setName(name);
    }

    @Override
    public void run() {
        System.out.println(this.getName() + " is started!");

        MF = Calculation.readMatrix(n);
        MO = Calculation.readMatrix(n);
        MN = Calculation.readMatrix(n);
        //������������ ������ �� �������� ���� "sleep"
        try {
            Thread.sleep(sleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        double[][] MM = Calculation.multMatrix(MF, Calculation.multMatrix(MO, MN));

        if (n <= 4)
            Calculation.showMatrix(MM);

        System.out.println(this.getName() + " is finished!");
    }
}
