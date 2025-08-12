package LabSession02;

 class EvenOddThreads {
    static class EvenThread extends Thread {
        public void run() {
            for (int i = 2; i <= 10; i += 2) {
                System.out.println("Even: " + i);
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class OddThread extends Thread {
        public void run() {
            for (int i = 1; i <= 10; i += 2) {
                System.out.println("Odd: " + i);
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        EvenThread e = new EvenThread();
        OddThread o = new OddThread();

        e.start();
        o.start();
    }
}