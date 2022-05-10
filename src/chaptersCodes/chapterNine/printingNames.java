package chaptersCodes.chapterNine;

import java.text.RuleBasedCollator;

class Names implements Runnable {
    String name;
    public Names(String msg)
    {
        this.name = msg;
    }
    public void run(){
        for (int i = 0 ;i < 5 ;i ++){
            System.out.println("Name: "  + name);
        }
    }
}
public class printingNames {
    public static void main(String[] args) {
        // create two instances of Priting class
        Names firstName = new Names("iNightjar");
        Names secondName = new Names("Hacker");
        Thread threadOne = new Thread(firstName);
        Thread threadTwo = new Thread(secondName);
        threadOne.start();
        threadTwo.start();
//        firstName.run();
//        secondName.run();
    }
}
