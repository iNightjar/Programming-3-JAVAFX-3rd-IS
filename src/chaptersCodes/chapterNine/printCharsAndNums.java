package chaptersCodes.chapterNine;


class printChars implements Runnable{
    private final char chartype;
    private final int times;
    public printChars(char charType, int times){
        this.chartype = charType;
        this.times = times;
    }
    public void run(){
        for (int i =0 ;i<times;i++)
        {
            System.out.print(chartype);
        }
    }
}
class printNums implements Runnable{
    private final int lastNum;
    public printNums(int lastNum){
        this.lastNum = lastNum;
    }


    @Override
    public void run() {
        for (int i =0 ;i<= lastNum ; i ++)
        {
            System.out.print(" " + i);
            //Thread.yield();
        }
    }
}
public class printCharsAndNums{
    public static void main(String[] args) {
        Runnable printA = new printChars('a', 10);
        Runnable printB = new printChars('b' ,10);
        Runnable print10 = new printNums(10);
        // create Threads
        Thread firstThread = new Thread(printA);
        Thread secondThread = new Thread(printB);
        Thread thirdThread = new Thread(print10);
        //Thread thirdThread = new Thread(printC);
        // starting Threads
        firstThread.start();
        secondThread.start();
        thirdThread.start();
    }
}
