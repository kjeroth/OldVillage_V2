package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main extends JFrame implements ActionListener {

    //Jmenü
    private JMenuBar jmb;

    private JMenu identifizieren;
    private JMenu einfügen;
    private JMenu chipp;

    private JMenuItem identyfy;
    private JMenuItem insItem;
    private JMenuItem insSkill;
    private JMenuItem zuweisen;
    private JMenuItem löschen;

    //JPanel
    private JPanel karteWilkommen;
    private JPanel karteIdentification;
    private JPanel karteObjektEinfügen;
    private JPanel karteChippLöschen;
    private JPanel karteChippZuweisen;

    //Textfelder
    private JTextField name;
    private JTextField beschreibung;
    private JTextField HidBeschreibung;
    private JTextField Heilung;

    //Label
    private JLabel labelChip;

    //Bilder
    ImageIcon iconChipp;

    //Radio Button
    private JRadioButton rbStatus;

    //Button
    private JButton btnIdentifizieren;
    private JButton btnEnter;
    private JButton btnLöschen;

    //Combo Box
    private JComboBox BoxBerechtiegung;
    private JComboBox boxArt;
    private JComboBox boxWahlLöschen;
    private JComboBox boxLöschenLöchen;
    private JComboBox boxzuweisen;

    //Panel und cardlayout
    private JPanel kartenPanel;
    private CardLayout test;

    //Variablen Deklarationen
    private int btPressed;
    private int zahl;
    private int mainCount;
    private int[] arrayZahl = new int[10];
    private boolean mEnter;

    private int numberWorld;

    private static Map<String,Integer> data = new HashMap<>();

    public static void main(String[] args) {
        // write your code here

        Main main = new Main();
        Helper helper = new Helper();

        // Chipp chipp =new Main().new Chipp();
        // Chipp chipp1=new Main().new Chipp(); //??
        Handler handler = new Handler();


        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        main.pack();
        main.setSize(600, 600);

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

        createFrame.createFrame();

        main.btnIdentifizieren.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent e){
                data.put("hallo", 1123);
                System.out.println(main.getZahl());
            }
        });

        //@TODO add the Button declarations here (like above) ->

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

        //radioButton erstellen
        rbStatus= new JRadioButton("Status");
        JLabel label =new JLabel("test label");

        //Bilder erstellen
        iconChipp =new ImageIcon("iconChipp.png");

        //Label ertsellen
        labelChip =new JLabel("ich bin ein Label");
        labelChip.setIcon(iconChipp);



        //action listenere hinzufügen
        btnIdentifizieren.addActionListener(this);


        // ItemIdentification -->Panel Inhalt
        karteIdentification.add(new JLabel("Identifikation"));
        karteIdentification.setPreferredSize(content.getSize());
        karteIdentification.setBackground(Color.red);
        karteIdentification.add(btnIdentifizieren);
        karteIdentification.add(rbStatus);
        karteIdentification.add(labelChip);

        //rbStatus.setSelected(true);






        // karteIdentification.add(name);
        //  karteIdentification.add(new JTextField("Beschreibung",20));

        //neues JPanel enthält das CardLayout, enthältdie Karten
        kartenPanel = new JPanel(new CardLayout());
        kartenPanel.setSize(content.getSize());


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

    //@TODO rework every button to this one above in line 139
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
            System.out.println("das ist der Chipp"+ Arrays.toString(this.getArrayZahl()));
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
            setBtPressed(1);
            this.getContentPane().requestFocus();
            System.out.println("getBtPressed:" + getBtPressed());
        }
    }

    public void übergabe(int avg, int count, boolean enter) {
        this.setZahl(avg);
        this.setMainCount(count);
        this.setmEnter(enter);

        if (this.getMainCount() < 10) {
            this.setArrayZahl(this.getMainCount(), this.getZahl());
            System.out.println("count: " + this.getMainCount() + "zahl " + this.getZahl());
        }

        if (this.getMainCount() >= 9 & this.getmEnter()) {
            for (int value : this.getArrayZahl()) {
                System.out.print(value);
            }
            JOptionPane.showMessageDialog(null, getArrayZahl());
            System.out.println("ende "+ getBtPressed());
            // data = Hashmap test value
            System.out.println("Testers test worked fine heheh " + data.get("hallo"));
        }
    }

    public JRadioButton getRbStatus() {
        return rbStatus;
    }

    public void setRbStatus(JRadioButton rbStatus) {
        this.rbStatus = rbStatus;
    }
    public  void setmEnter(boolean avg){
        this.mEnter=avg;
    }
    public boolean getmEnter(){
        return this.mEnter;
    }

    public void setArrayZahl(int avg, int zahl) {
        arrayZahl[avg] = zahl;
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

    public int getMainCount() {
        return mainCount;
    }

    public void setMainCount(int avg) {
        mainCount = avg;
    }

    public int getBtPressed() {
        return btPressed;
    }

    public void setBtPressed(int pressed) {
        this.btPressed = pressed;
    }

    public int getNumberWorld() {
        return this.numberWorld;
    }

    public void setNumberWorld(int numberWorld) {
        this.numberWorld = numberWorld;
    }
}