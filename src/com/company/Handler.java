package com.company;

// import com.company.Main.InnereKlasse;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Handler implements KeyListener {
    private int count=0;

    public Handler() {

    }
    Main.CardReader reader =new Main.CardReader();

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("taste gedrückt " + this.getCount());
        if(this.getCount() <10) {
            switch (e.getKeyCode()) {
                case KeyEvent.VK_0:
                    System.out.println("0");
                    reader.übergabe(0, this.getCount());
                    this.count++;
                    break;

                case KeyEvent.VK_1:
                    System.out.println("1");
                    reader.übergabe(1, this.getCount());
                    this.count++;
                    break;

                case KeyEvent.VK_2:
                    System.out.println("2");
                    reader.übergabe(2, this.getCount());
                    this.count++;
                    break;

                case KeyEvent.VK_3:
                    System.out.println("3");
                    reader.übergabe(3, this.getCount());
                    this.count++;
                    break;

                case KeyEvent.VK_4:
                    System.out.println("4");
                    reader.übergabe(4, this.getCount());
                    this.count++;
                    break;

                case KeyEvent.VK_5:
                    System.out.println("5");
                    reader.übergabe(5, this.getCount());
                    this.count++;
                    break;

                case KeyEvent.VK_6:
                    System.out.println("6");
                    reader.übergabe(6, this.getCount());
                    this.count++;
                    break;

                case KeyEvent.VK_7:
                    System.out.println("7");
                    reader.übergabe(7, this.getCount());
                    this.count++;
                    break;

                case KeyEvent.VK_8:
                    System.out.println("8");
                    reader.übergabe(8, this.getCount());
                    this.count++;
                    break;

                case KeyEvent.VK_9:
                    System.out.println("9");
                    reader.übergabe(9, this.getCount());
                    this.count++;
                    break;


                // default?!?!?!??!?!?!?!??!?!?!??!?!?!?

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
        this.count=0;
    }
}
