package com.company;






import com.company.Main;


import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Handler extends Main implements KeyListener {
    private int count=0;


//    Main.CardReader reader =new Main.CardReader();

    @Override
    public void keyTyped(KeyEvent e) {

    }


    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("taste gedrückt " + this.getCount());
        if(this.getCount() <10) {
            switch (e.getKeyCode()) {
                case KeyEvent.VK_0 -> {
                    System.out.println("0");
                    übergabe(0, this.getCount(), false);
                    this.count++;
                }
                case KeyEvent.VK_1 -> {
                    System.out.println("1");
                    übergabe(1, this.getCount(), false);
                    this.count++;
                }
                case KeyEvent.VK_2 -> {
                    System.out.println("2");
                    übergabe(2, this.getCount(), false);
                    this.count++;
                }
                case KeyEvent.VK_3 -> {
                    System.out.println("3");
                    übergabe(3, this.getCount(), false);
                    this.count++;
                }
                case KeyEvent.VK_4 -> {
                    System.out.println("4");
                    übergabe(4, this.getCount(), false);
                    this.count++;
                }
                case KeyEvent.VK_5 -> {
                    System.out.println("5");
                    übergabe(5, this.getCount(), false);
                    this.count++;
                }
                case KeyEvent.VK_6 -> {
                    System.out.println("6");
                    übergabe(6, this.getCount(), false);
                    this.count++;
                }
                case KeyEvent.VK_7 -> {
                    System.out.println("7");
                    übergabe(7, this.getCount(), false);
                    this.count++;
                }
                case KeyEvent.VK_8 -> {
                    System.out.println("8");
                    übergabe(8, this.getCount(), false);
                    this.count++;
                }
                case KeyEvent.VK_9 -> {
                    System.out.println("9");
                    übergabe(9, this.getCount(), false);
                    this.count++;
                }
            }
        } else  {
            if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                System.out.println("enter" + " buttonstat " + getBtPressed());
                übergabe(0, this.getCount(), true);
            }
        }
    }



    @Override
    public void keyReleased(KeyEvent e) {

    }
    public int getCount() {
        return count;
    }
    public void clear (){
        this.count = 0;
    }
}
