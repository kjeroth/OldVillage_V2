package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends  JFrame  implements ActionListener {


    public int btPressed;
    public int zahl;
    public int count;
    public int[] arrayZahl = new int[10];
    public boolean mEnter;
    // Abfragen abfragen =new Abfragen();


    public void übergabe(int avg, int count, boolean enter) {


        this.setZahl(avg);
        this.setCount(count);
        this.mEnter = enter;



        if (this.getCount() < 10) {
            this.setArrayZahl(this.getCount(), this.getZahl());
            System.out.println("count: " + this.getCount() + "zahl " + this.getZahl());
        }
        if (this.getCount() >= 9 & this.mEnter) {
            for (int value : this.arrayZahl) {
                System.out.print(value);
                // abfragen.chippId(getArrayZahl());

            }
            JOptionPane.showMessageDialog(null, getArrayZahl());
            System.out.println("ende");

            // an dieser Stelle soll das Array an getChippId übergeben werden
            // oder direkt an chippID--> ausder eingebundenen klasse Abfragen in der Klasse Chipp
            //   chip1.chippId(this.arrayZahl,this.getBtPressed());

        }
    }


    public void setArrayZahl(int count, int zahl) {
        arrayZahl[count] = zahl;
    }

    public int[] getArrayZahl() {
        return arrayZahl;
    }

    public int getZahl() {
        return zahl;
    }

    public void setZahl(int avg) {
        zahl = avg;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int avg) {
        count = avg;
    }

    public int getBtPressed() {
        return btPressed;
    }

    public void setBtPressed(int pressed) {
        this.btPressed = pressed;
    }


    private JMenuBar jmb;

    private JMenu identifizieren;
    private JMenu einfügen;
    private JMenu chipp;

    private JMenuItem identyfy;
    private JMenuItem insItem;
    private JMenuItem insSkill;
    private JMenuItem zuweisen;
    private JMenuItem löschen;

    private JPanel karteWilkommen;
    private JPanel karteIdentification;
    private JPanel karteObjektEinfügen;
    private JPanel karteChippLöschen;
    private JPanel karteChippZuweisen;

    private JTextField name;
    private JTextField beschreibung;
    private JTextField HidBeschreibung;
    private JTextField Heilung;

    private JRadioButton status;

    private JButton btnIdentifizieren;
    private JButton btnEnter;
    private JButton btnLöschen;

    private JComboBox BoxBerechtiegung;
    private JComboBox boxArt;
    private JComboBox boxWahlLöschen;
    private JComboBox boxLöschenLöchen;
    private JComboBox boxzuweisen;


    private JPanel kartenPanel;
    private CardLayout test;

    public static void main(String[] args) {
        // write your code here

        Main main = new Main();

        // Chipp chipp =new Main().new Chipp();
        // Chipp chipp1=new Main().new Chipp(); //??
        Handler handler = new Handler();


        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        main.pack();
        main.setSize(500, 500);
        main.setLayout(new FlowLayout());

        main.getContentPane().addKeyListener(handler);
        main.kartedemFrameZuweisen(main.getContentPane());

        //erstelle neue menüBar
        main.jmb = new JMenuBar();

        //erstelle menü Reiter
        main.identifizieren = new JMenu("Identifizieren");
        main.einfügen = new JMenu("bearbeiten");
        main.chipp = new JMenu("Chipp ");

        //erstelle menü items
        main.identyfy = new JMenuItem("Identifizieren");
        main.insItem = new JMenuItem("Item");
        main.insSkill = new JMenuItem("skill");
        main.zuweisen = new JMenuItem("zuweisen");
        main.löschen = new JMenuItem("löschen");

        // //Action Listener für einzelne Items
        //        //-->
        main.identyfy.addActionListener(main);
        main.insItem.addActionListener(main);
        main.insSkill.addActionListener(main);
        main.zuweisen.addActionListener(main);
        main.löschen.addActionListener(main);

        // weise der menü Bar Reiter zu
        main.jmb.add(main.identifizieren);
        main.jmb.add(main.einfügen);
        main.jmb.add(main.chipp);

        //weise den reitern items zu
        //-->
        //reiter identifizieren
        main.identifizieren.add(main.identyfy);

        //reiter einfügen
        main.einfügen.add(main.insItem);
        main.einfügen.add(main.insSkill);

        //reiter chipp
        main.chipp.add(main.zuweisen);
        main.chipp.add(main.löschen);

        // erstelle menübar + Setze auf sichtbar
        main.setJMenuBar(main.jmb);
        main.setVisible(true);

    }

    private void kartedemFrameZuweisen(Container content) {
        //Karten erzeugen
        karteWilkommen = new JPanel();
        karteIdentification = new JPanel();
        karteObjektEinfügen = new JPanel();
        karteChippLöschen = new JPanel();
        karteChippZuweisen = new JPanel();

        //Wilkommen--> Pnael Inhalt
        karteWilkommen.add(new JLabel("Wilkommen Ödländer"));
        karteWilkommen.setBackground(Color.green);
        karteWilkommen.add(new JButton("Button"));

        //textfelder erstellen
        name = new JTextField();
        name.setPreferredSize(new Dimension(250, 80));

        //butten ersetellen
        btnIdentifizieren = new JButton("Identifizieren");

        //action listenere hinzufügen
        btnIdentifizieren.addActionListener(this);


        // ItemIdentification -->Panel Inhalt
        karteIdentification.add(new JLabel("Identifikation"));
        karteIdentification.setBackground(Color.red);
        karteIdentification.add(btnIdentifizieren);


        // karteIdentification.add(name);
        //  karteIdentification.add(new JTextField("Beschreibung",20));

        //neues JPanel enthält das CardLayout, enthältdie Karten
        kartenPanel = new JPanel(new CardLayout());

        //wichtig Objekt benötigt string zum Aufrufen
        kartenPanel.add(karteWilkommen, "1");
        kartenPanel.add(karteIdentification, "2");
        kartenPanel.add(karteObjektEinfügen, "3");
        kartenPanel.add(karteChippLöschen, "4");
        kartenPanel.add(karteChippZuweisen, "5");


        //zusammenfügen
        content.add(kartenPanel);

        // neues Cardlayout erstellen
        test = new CardLayout();
        test = (CardLayout) (kartenPanel).getLayout();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(identyfy)) {
            System.out.println("identyfy get pressed");
            //Karte anzeigen
            test.show(kartenPanel, "2");
        }
        if (e.getSource().equals(insItem)) {
            System.out.println("Item get pressed");
            test.show(kartenPanel, "3");
        }
        if (e.getSource() == insSkill) {
            System.out.println("skill get pressed");
        }
        if (e.getSource() == zuweisen) {
            System.out.println("zuweisen get pressed");
            test.show(kartenPanel, "5");
        }
        if (e.getSource() == löschen) {
            System.out.println("löschen get pressed");
            test.show(kartenPanel, "4");
        }
        if (e.getSource() == btnIdentifizieren) {
            this.getContentPane().requestFocus();
            setBtPressed(1);
            System.out.println("getBtPressed:" + getBtPressed());

        }
    }
}