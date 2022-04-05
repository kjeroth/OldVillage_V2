package com.company;

import javax.swing.*;
import java.awt.*;

public class createFrame {

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

    public static JFrame createFrame() {
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
    }

}
