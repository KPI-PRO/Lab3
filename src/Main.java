/**
 * ---------------------------------
 * ����������� ������ �3
 * ������ � Java
 *
 * ��������:
 * F1: 1.23 E = A + B + C + D * (MA * MD)
 * F2: 2.26 MM = MF * (MO * MN)
 * F3: 3.17 s = Min(X * Trans (MX * MY) + Z * Sort(Z))
 *
 * �������� ���� ��������
 *
 * �������: ��� ���������
 * �����: ��-34
 * ����: 08.10.2015
 * шошшоо
 * ---------------------------------
 */

public class Main {

    public static void main(String[] args) throws InterruptedException {
        int n = 4;

        System.out.println("Main Thread is started");

        Task1 task1 = new Task1(n, 1, 1000, "Task #1");
        Task2 task2 = new Task2(n, 3, 1000, "Task #2");
        Task3 task3 = new Task3(n, 6, 1000, "Task #3");
        //������ ������ �� ���������
        task1.start();
        task2.start();
        task3.start();

        //���������� ���������� ���������� ������
        task1.join();
        task2.join();
        task3.join();

        System.out.println("Main Thread is finished");
    }
}
