package chaptersCodes.chapterTen;

//class MyThread extends Thread
//{
//    MyThread() {}
//    MyThread(Runnable r) {
//        super(r);
//    }
//    public void run()
//    {
//        System.out.print("Inside Thread ");
//    }
//}
//class MyRunnable implements Runnable {
//    public void run()
//    {
//        System.out.print(" Inside Runnable");
//    }
//}
//class whatIsTheOutPut {
//    public static void main(String[] args) {
//        new MyThread().start();
//        new MyThread(new MyRunnable()).start();
//    }
//}

class whatIsTheOutPut implements Runnable
{
    int x = 0, y = 0;
    int addX() {x++; return x;}
    int addY() {y++; return y;}
    public void run() {
        for(int i = 0; i < 10; i++)
            System.out.print(addX() + " " + addY());
    }
    public static void main(String args[])
    {
        whatIsTheOutPut run1 = new whatIsTheOutPut();
        whatIsTheOutPut run2 = new whatIsTheOutPut();
        Thread t1 = new Thread(run1);
        Thread t2 = new Thread(run2);
        t1.start();
        t2.start();
    }
}