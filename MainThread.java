import java.util.Scanner;

class Table extends Thread {
    public void run() {
        System.out.println("\nTable of 5:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
        }
    }
}

class Prime extends Thread {
    int num;

    Prime(int num) {
        this.num = num;
    }

    public void run() {
        System.out.println("\nFirst " + num + " Primes:");
        int count = 0;
        int val = 2;

        while (count < num) {
            if (check(val)) {
                System.out.print(val + " ");
                count++;
            }
            val++;
        }
        System.out.println();
    }

    boolean check(int x) {
        if (x < 2) return false;
        for (int i = 2; i <= x / 2; i++) {
            if (x % i == 0) return false;
        }
        return true;
    }
}

public class MainThread {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many primes? ");
        int n = sc.nextInt();

        Table t1 = new Table();
        Prime t2 = new Prime(n);

        t1.start();
        t2.start();
    }
}

