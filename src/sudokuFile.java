/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
//package com.mycompany.sudoko_project;

import static java.awt.Color.black;
import static java.awt.Color.blue;
import static java.awt.Color.red;
import static java.awt.Color.white;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;

/**
 *
 * @author ASUS
 */
public class sudokuFile extends javax.swing.JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * Creates new form sudokuFile
     */
    private String turn = "1";
    
    private boolean globalFlag = true;
    
    private String solvedBoard [][] = {
        
        {"2","9","8","5","1","6","7","3","4"},
        {"4","1","3","2","7","8","5","6","9"},
        {"7","5","6","3","4","9","1","2","8"},
        {"8","2","1","4","3","5","6","9","7"},
        {"5","3","4","6","9","7","2","8","1"},
        {"9","6","7","1","8","2","3","4","5"},
        {"1","4","2","8","5","3","9","7","6"},
        {"3","7","5","9","6","4","8","1","2"},
        {"6","8","9","7","2","1","4","5","3"} 
    };
    
    private void AssignTurn(JButton btn){
        selectionbtn1.setBackground(black);
        selectionbtn2.setBackground(black);
        selectionbtn3.setBackground(black);
        selectionbtn4.setBackground(black);
        selectionbtn5.setBackground(black);
        selectionbtn6.setBackground(black);
        selectionbtn7.setBackground(black);
        selectionbtn8.setBackground(black);
        selectionbtn9.setBackground(black);
        
        btn.setBackground(blue);
    }
    
    private void ResetGame(){
        
        JButton predefinedBtns [] = {r2c1,r3c1,r3c3,r1c4,r2c5,r2c6,r3c5,r1c7,r1c8,r1c9,r2c7,r2c9,r3c8,r5c2,r5c3,r6c2,r4c5,r4c6,r6c4,r6c5,
                                       r4c8,r5c8,r5c7,r7c2,r8c1,r9c1,r9c2,r9c3,r7c5,r8c5,r9c6,r8c4,r7c7,r7c9,r8c9};
        
        JButton btns[][] = {
            {r1c1,r1c2,r1c3,r1c4,r1c5,r1c6,r1c7,r1c8,r1c9},
            {r2c1,r2c2,r2c3,r2c4,r2c5,r2c6,r2c7,r2c8,r2c9},
            {r3c1,r3c2,r3c3,r3c4,r3c5,r3c6,r3c7,r3c8,r3c9},
            {r4c1,r4c2,r4c3,r4c4,r4c5,r4c6,r4c7,r4c8,r4c9},
            {r5c1,r5c2,r5c3,r5c4,r5c5,r5c6,r5c7,r5c8,r5c9},
            {r6c1,r6c2,r6c3,r6c4,r6c5,r6c6,r6c7,r6c8,r6c9},
            {r7c1,r7c2,r7c3,r7c4,r7c5,r7c6,r7c7,r7c8,r7c9},
            {r8c1,r8c2,r8c3,r8c4,r8c5,r8c6,r8c7,r8c8,r8c9},
            {r9c1,r9c2,r9c3,r9c4,r9c5,r9c6,r9c7,r9c8,r9c9},     
        };
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                boolean flag = true;
                for(int k=0; k<predefinedBtns.length; k++){
                    if(btns[i][j]==predefinedBtns[k]){
                        flag = false;
                    }
                }
                if(flag == true){
                    btns[i][j].setText("");
                    btns[i][j].setForeground(black);
                    btns[i][j].setBackground(white);
                }
            }
        }
    }
    
    private void SeeSolution(){
        JButton predefinedBtns [] = {r2c1,r3c1,r3c3,r1c4,r2c5,r2c6,r3c5,r1c7,r1c8,r1c9,r2c7,r2c9,r3c8,r5c2,r5c3,r6c2,r4c5,r4c6,r6c4,r6c5,
                                       r4c8,r5c8,r5c7,r7c2,r8c1,r9c1,r9c2,r9c3,r7c5,r8c5,r9c6,r8c4,r7c7,r7c9,r8c9};
        
        JButton btns[][] = {
            {r1c1,r1c2,r1c3,r1c4,r1c5,r1c6,r1c7,r1c8,r1c9},
            {r2c1,r2c2,r2c3,r2c4,r2c5,r2c6,r2c7,r2c8,r2c9},
            {r3c1,r3c2,r3c3,r3c4,r3c5,r3c6,r3c7,r3c8,r3c9},
            {r4c1,r4c2,r4c3,r4c4,r4c5,r4c6,r4c7,r4c8,r4c9},
            {r5c1,r5c2,r5c3,r5c4,r5c5,r5c6,r5c7,r5c8,r5c9},
            {r6c1,r6c2,r6c3,r6c4,r6c5,r6c6,r6c7,r6c8,r6c9},
            {r7c1,r7c2,r7c3,r7c4,r7c5,r7c6,r7c7,r7c8,r7c9},
            {r8c1,r8c2,r8c3,r8c4,r8c5,r8c6,r8c7,r8c8,r8c9},
            {r9c1,r9c2,r9c3,r9c4,r9c5,r9c6,r9c7,r9c8,r9c9},     
        };
        if(globalFlag==true){
            globalFlag = false;
            solbtn.setText("Hide Solution");
            for(int i=0; i<9; i++){
                for(int j=0; j<9; j++){
                    boolean flag = true;
                    for(int k=0; k<predefinedBtns.length; k++){
                        if(btns[i][j]==predefinedBtns[k]){
                            flag = false;
                        }
                    }
                    if(flag == true){
                        btns[i][j].setText(solvedBoard[i][j]);
                        btns[i][j].setForeground(black);
                        btns[i][j].setBackground(white);
                    }
                }
            }
        }
        else{
            solbtn.setText("Solution");
            globalFlag = true;
            ResetGame();
        }
    }
    
    private void CheckMoves(){
       
        JButton btns[][] = {
            {r1c1,r1c2,r1c3,r1c4,r1c5,r1c6,r1c7,r1c8,r1c9},
            {r2c1,r2c2,r2c3,r2c4,r2c5,r2c6,r2c7,r2c8,r2c9},
            {r3c1,r3c2,r3c3,r3c4,r3c5,r3c6,r3c7,r3c8,r3c9},
            {r4c1,r4c2,r4c3,r4c4,r4c5,r4c6,r4c7,r4c8,r4c9},
            {r5c1,r5c2,r5c3,r5c4,r5c5,r5c6,r5c7,r5c8,r5c9},
            {r6c1,r6c2,r6c3,r6c4,r6c5,r6c6,r6c7,r6c8,r6c9},
            {r7c1,r7c2,r7c3,r7c4,r7c5,r7c6,r7c7,r7c8,r7c9},
            {r8c1,r8c2,r8c3,r8c4,r8c5,r8c6,r8c7,r8c8,r8c9},
            {r9c1,r9c2,r9c3,r9c4,r9c5,r9c6,r9c7,r9c8,r9c9},     
        };
        
        if(globalFlag==true){
            globalFlag = false;
            checkbtn.setText("Remove Checks");
            for(int i=0; i<9; i++){
                for(int j=0; j<9; j++){
                   if(btns[i][j].getText()!=solvedBoard[i][j] && btns[i][j].getText()!=""){ 
                       btns[i][j].setBackground(red);
                   }
                }
            }
        }
        else{
            checkbtn.setText("Check Moves");
            globalFlag = true;
            ResetGame();
        }
        
    }
    public sudokuFile() {
    	setBackground(new Color(91, 174, 191));
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel1.setBackground(new Color(104, 160, 179));
        r1c1 = new javax.swing.JButton();
        r1c1.setBackground(new Color(160, 201, 205));
        r2c1 = new javax.swing.JButton();
        r3c1 = new javax.swing.JButton();
        r1c2 = new javax.swing.JButton();
        r1c2.setBackground(new Color(160, 201, 205));
        r2c2 = new javax.swing.JButton();
        r2c2.setBackground(new Color(160, 201, 205));
        r3c2 = new javax.swing.JButton();
        r3c2.setBackground(new Color(160, 201, 205));
        r1c3 = new javax.swing.JButton();
        r1c3.setBackground(new Color(160, 201, 205));
        r2c3 = new javax.swing.JButton();
        r2c3.setBackground(new Color(160, 201, 205));
        r3c3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel2.setBackground(new Color(104, 160, 179));
        r4c1 = new javax.swing.JButton();
        r4c1.setBackground(new Color(160, 201, 205));
        r5c1 = new javax.swing.JButton();
        r5c1.setBackground(new Color(160, 201, 205));
        r6c1 = new javax.swing.JButton();
        r6c1.setBackground(new Color(160, 201, 205));
        r4c2 = new javax.swing.JButton();
        r4c2.setBackground(new Color(160, 201, 205));
        r5c2 = new javax.swing.JButton();
        r6c2 = new javax.swing.JButton();
        r4c3 = new javax.swing.JButton();
        r4c3.setBackground(new Color(160, 201, 205));
        r5c3 = new javax.swing.JButton();
        r6c3 = new javax.swing.JButton();
        r6c3.setBackground(new Color(160, 201, 205));
        jPanel3 = new javax.swing.JPanel();
        jPanel3.setBackground(new Color(104, 160, 179));
        r7c1 = new javax.swing.JButton();
        r7c1.setBackground(new Color(160, 201, 205));
        r8c1 = new javax.swing.JButton();
        r9c1 = new javax.swing.JButton();
        r7c2 = new javax.swing.JButton();
        r8c2 = new javax.swing.JButton();
        r8c2.setBackground(new Color(160, 201, 205));
        r9c2 = new javax.swing.JButton();
        r7c3 = new javax.swing.JButton();
        r7c3.setBackground(new Color(160, 201, 205));
        r8c3 = new javax.swing.JButton();
        r8c3.setBackground(new Color(160, 201, 205));
        r9c3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel4.setBackground(new Color(104, 160, 179));
        r1c4 = new javax.swing.JButton();
        r2c4 = new javax.swing.JButton();
        r2c4.setBackground(new Color(160, 201, 205));
        r3c4 = new javax.swing.JButton();
        r3c4.setBackground(new Color(160, 201, 205));
        r1c5 = new javax.swing.JButton();
        r1c5.setBackground(new Color(160, 201, 205));
        r2c5 = new javax.swing.JButton();
        r3c5 = new javax.swing.JButton();
        r1c6 = new javax.swing.JButton();
        r1c6.setBackground(new Color(160, 201, 205));
        r2c6 = new javax.swing.JButton();
        r3c6 = new javax.swing.JButton();
        r3c6.setBackground(new Color(160, 201, 205));
        jPanel5 = new javax.swing.JPanel();
        jPanel5.setBackground(new Color(104, 160, 179));
        r4c4 = new javax.swing.JButton();
        r4c4.setBackground(new Color(160, 201, 205));
        r5c4 = new javax.swing.JButton();
        r5c4.setBackground(new Color(160, 201, 205));
        r6c4 = new javax.swing.JButton();
        r4c5 = new javax.swing.JButton();
        r5c5 = new javax.swing.JButton();
        r5c5.setBackground(new Color(160, 201, 205));
        r6c5 = new javax.swing.JButton();
        r4c6 = new javax.swing.JButton();
        r5c6 = new javax.swing.JButton();
        r5c6.setBackground(new Color(160, 201, 205));
        r6c6 = new javax.swing.JButton();
        r6c6.setBackground(new Color(160, 201, 205));
        jPanel6 = new javax.swing.JPanel();
        jPanel6.setBackground(new Color(104, 160, 179));
        r7c4 = new javax.swing.JButton();
        r7c4.setBackground(new Color(160, 201, 205));
        r8c4 = new javax.swing.JButton();
        r9c4 = new javax.swing.JButton();
        r9c4.setBackground(new Color(160, 201, 205));
        r7c5 = new javax.swing.JButton();
        r8c5 = new javax.swing.JButton();
        r9c5 = new javax.swing.JButton();
        r9c5.setBackground(new Color(160, 201, 205));
        r7c6 = new javax.swing.JButton();
        r7c6.setBackground(new Color(160, 201, 205));
        r8c6 = new javax.swing.JButton();
        r8c6.setBackground(new Color(160, 201, 205));
        r9c6 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel7.setBackground(new Color(104, 160, 179));
        r1c7 = new javax.swing.JButton();
        r2c7 = new javax.swing.JButton();
        r3c7 = new javax.swing.JButton();
        r3c7.setBackground(new Color(160, 201, 205));
        r1c8 = new javax.swing.JButton();
        r2c8 = new javax.swing.JButton();
        r2c8.setBackground(new Color(160, 201, 205));
        r3c8 = new javax.swing.JButton();
        r1c9 = new javax.swing.JButton();
        r2c9 = new javax.swing.JButton();
        r3c9 = new javax.swing.JButton();
        r3c9.setBackground(new Color(160, 201, 205));
        jPanel8 = new javax.swing.JPanel();
        jPanel8.setBackground(new Color(104, 160, 179));
        r4c7 = new javax.swing.JButton();
        r4c7.setBackground(new Color(160, 201, 205));
        r5c7 = new javax.swing.JButton();
        r6c7 = new javax.swing.JButton();
        r6c7.setBackground(new Color(160, 201, 205));
        r4c8 = new javax.swing.JButton();
        r5c8 = new javax.swing.JButton();
        r6c8 = new javax.swing.JButton();
        r6c8.setBackground(new Color(160, 201, 205));
        r4c9 = new javax.swing.JButton();
        r4c9.setBackground(new Color(160, 201, 205));
        r5c9 = new javax.swing.JButton();
        r5c9.setBackground(new Color(160, 201, 205));
        r6c9 = new javax.swing.JButton();
        r6c9.setBackground(new Color(160, 201, 205));
        jPanel9 = new javax.swing.JPanel();
        jPanel9.setBackground(new Color(104, 160, 179));
        r7c7 = new javax.swing.JButton();
        r8c7 = new javax.swing.JButton();
        r8c7.setBackground(new Color(160, 201, 205));
        r9c7 = new javax.swing.JButton();
        r9c7.setBackground(new Color(160, 201, 205));
        r7c8 = new javax.swing.JButton();
        r7c8.setBackground(new Color(160, 201, 205));
        r8c8 = new javax.swing.JButton();
        r8c8.setBackground(new Color(160, 201, 205));
        r9c8 = new javax.swing.JButton();
        r9c8.setBackground(new Color(160, 201, 205));
        r7c9 = new javax.swing.JButton();
        r8c9 = new javax.swing.JButton();
        r9c9 = new javax.swing.JButton();
        r9c9.setBackground(new Color(160, 201, 205));
        selectionbtn1 = new javax.swing.JButton();
        selectionbtn2 = new javax.swing.JButton();
        selectionbtn3 = new javax.swing.JButton();
        selectionbtn4 = new javax.swing.JButton();
        selectionbtn5 = new javax.swing.JButton();
        selectionbtn6 = new javax.swing.JButton();
        selectionbtn7 = new javax.swing.JButton();
        selectionbtn8 = new javax.swing.JButton();
        selectionbtn9 = new javax.swing.JButton();
        Resetbtn = new javax.swing.JButton();
        checkbtn = new javax.swing.JButton();
        Exitbtn = new javax.swing.JButton();
        solbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        r1c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1c1ActionPerformed(evt);
            }
        });

        r2c1.setBackground(new Color(131, 171, 194));
        r2c1.setText("4");
        r2c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2c1ActionPerformed(evt);
            }
        });

        r3c1.setBackground(new Color(131, 171, 194));
        r3c1.setText("7");
        r3c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3c1ActionPerformed(evt);
            }
        });

        r1c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1c2ActionPerformed(evt);
            }
        });

        r2c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2c2ActionPerformed(evt);
            }
        });

        r3c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3c2ActionPerformed(evt);
            }
        });

        r1c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1c3ActionPerformed(evt);
            }
        });

        r2c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2c3ActionPerformed(evt);
            }
        });

        r3c3.setBackground(new Color(131, 171, 194));
        r3c3.setText("6");
        r3c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3c3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addComponent(r1c1, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(r1c2, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(r1c3, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addComponent(r2c1, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(r2c2, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(r2c3, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addComponent(r3c1, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(r3c2, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(r3c3, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(r1c1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
        				.addComponent(r1c2, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
        				.addComponent(r1c3, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(r2c1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
        				.addComponent(r2c2, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
        				.addComponent(r2c3, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(r3c1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
        				.addComponent(r3c2, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
        				.addComponent(r3c3, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel1.setLayout(jPanel1Layout);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        r4c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4c1ActionPerformed(evt);
            }
        });

        r5c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5c1ActionPerformed(evt);
            }
        });

        r6c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r6c1ActionPerformed(evt);
            }
        });

        r4c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4c2ActionPerformed(evt);
            }
        });

        r5c2.setBackground(new Color(131, 171, 194));
        r5c2.setText("3");
        r5c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5c2ActionPerformed(evt);
            }
        });

        r6c2.setBackground(new Color(131, 171, 194));
        r6c2.setText("6");
        r6c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r6c2ActionPerformed(evt);
            }
        });

        r4c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4c3ActionPerformed(evt);
            }
        });

        r5c3.setBackground(new Color(131, 171, 194));
        r5c3.setText("4");
        r5c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5c3ActionPerformed(evt);
            }
        });

        r6c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r6c3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2Layout.setHorizontalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addComponent(r4c1, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(r4c2, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(r4c3, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addComponent(r5c1, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(r5c2, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(r5c3, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addComponent(r6c1, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(r6c2, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(r6c3, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(r4c1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
        				.addComponent(r4c2, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
        				.addComponent(r4c3, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(r5c1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
        				.addComponent(r5c2, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
        				.addComponent(r5c3, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(r6c1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
        				.addComponent(r6c2, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
        				.addComponent(r6c3, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel2.setLayout(jPanel2Layout);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        r7c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r7c1ActionPerformed(evt);
            }
        });

        r8c1.setBackground(new Color(131, 171, 194));
        r8c1.setText("3");
        r8c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r8c1ActionPerformed(evt);
            }
        });

        r9c1.setBackground(new Color(131, 171, 194));
        r9c1.setText("6");
        r9c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r9c1ActionPerformed(evt);
            }
        });

        r7c2.setBackground(new Color(131, 171, 194));
        r7c2.setText("4");
        r7c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r7c2ActionPerformed(evt);
            }
        });

        r8c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r8c2ActionPerformed(evt);
            }
        });

        r9c2.setBackground(new Color(131, 171, 194));
        r9c2.setText("8");
        r9c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r9c2ActionPerformed(evt);
            }
        });

        r7c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r7c3ActionPerformed(evt);
            }
        });

        r8c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r8c3ActionPerformed(evt);
            }
        });

        r9c3.setBackground(new Color(131, 171, 194));
        r9c3.setText("9");
        r9c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r9c3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3Layout.setHorizontalGroup(
        	jPanel3Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel3Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel3Layout.createSequentialGroup()
        					.addComponent(r7c1, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(r7c2, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(r7c3, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
        				.addGroup(jPanel3Layout.createSequentialGroup()
        					.addComponent(r8c1, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(r8c2, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(r8c3, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
        				.addGroup(jPanel3Layout.createSequentialGroup()
        					.addComponent(r9c1, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(r9c2, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(r9c3, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
        	jPanel3Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel3Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(r7c1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
        				.addComponent(r7c2, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
        				.addComponent(r7c3, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(r8c1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
        				.addComponent(r8c2, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
        				.addComponent(r8c3, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(r9c1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
        				.addComponent(r9c2, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
        				.addComponent(r9c3, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel3.setLayout(jPanel3Layout);

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        r1c4.setBackground(new Color(131, 171, 194));
        r1c4.setText("5");
        r1c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1c4ActionPerformed(evt);
            }
        });

        r2c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2c4ActionPerformed(evt);
            }
        });

        r3c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3c4ActionPerformed(evt);
            }
        });

        r1c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1c5ActionPerformed(evt);
            }
        });

        r2c5.setBackground(new Color(131, 171, 194));
        r2c5.setText("7");
        r2c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2c5ActionPerformed(evt);
            }
        });

        r3c5.setBackground(new Color(131, 171, 194));
        r3c5.setText("4");
        r3c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3c5ActionPerformed(evt);
            }
        });

        r1c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1c6ActionPerformed(evt);
            }
        });

        r2c6.setBackground(new Color(131, 171, 194));
        r2c6.setText("8");
        r2c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2c6ActionPerformed(evt);
            }
        });

        r3c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3c6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4Layout.setHorizontalGroup(
        	jPanel4Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel4Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel4Layout.createSequentialGroup()
        					.addComponent(r1c4, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(r1c5, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(r1c6, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
        				.addGroup(jPanel4Layout.createSequentialGroup()
        					.addComponent(r2c4, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(r2c5, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(r2c6, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
        				.addGroup(jPanel4Layout.createSequentialGroup()
        					.addComponent(r3c4, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(r3c5, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(r3c6, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
        	jPanel4Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel4Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel4Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(r1c4, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
        				.addComponent(r1c5, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
        				.addComponent(r1c6, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(jPanel4Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(r2c4, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
        				.addComponent(r2c5, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
        				.addComponent(r2c6, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(jPanel4Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(r3c4, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
        				.addComponent(r3c5, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
        				.addComponent(r3c6, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel4.setLayout(jPanel4Layout);

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        r4c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4c4ActionPerformed(evt);
            }
        });

        r5c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5c4ActionPerformed(evt);
            }
        });

        r6c4.setBackground(new Color(131, 171, 194));
        r6c4.setText("1");
        r6c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r6c4ActionPerformed(evt);
            }
        });

        r4c5.setBackground(new Color(131, 171, 194));
        r4c5.setText("3");
        r4c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4c5ActionPerformed(evt);
            }
        });

        r5c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5c5ActionPerformed(evt);
            }
        });

        r6c5.setBackground(new Color(131, 171, 194));
        r6c5.setText("8");
        r6c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r6c5ActionPerformed(evt);
            }
        });

        r4c6.setBackground(new Color(131, 171, 194));
        r4c6.setText("5");
        r4c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4c6ActionPerformed(evt);
            }
        });

        r5c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5c6ActionPerformed(evt);
            }
        });

        r6c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r6c6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5Layout.setHorizontalGroup(
        	jPanel5Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel5Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel5Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel5Layout.createSequentialGroup()
        					.addComponent(r4c4, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(r4c5, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(r4c6, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
        				.addGroup(jPanel5Layout.createSequentialGroup()
        					.addComponent(r5c4, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(r5c5, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(r5c6, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
        				.addGroup(jPanel5Layout.createSequentialGroup()
        					.addComponent(r6c4, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(r6c5, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(r6c6, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
        	jPanel5Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel5Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel5Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(r4c4, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
        				.addComponent(r4c5, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
        				.addComponent(r4c6, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(jPanel5Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(r5c4, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
        				.addComponent(r5c5, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
        				.addComponent(r5c6, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(jPanel5Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(r6c4, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
        				.addComponent(r6c5, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
        				.addComponent(r6c6, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel5.setLayout(jPanel5Layout);

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        r7c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r7c4ActionPerformed(evt);
            }
        });

        r8c4.setBackground(new Color(131, 171, 194));
        r8c4.setText("9");
        r8c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r8c4ActionPerformed(evt);
            }
        });

        r9c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r9c4ActionPerformed(evt);
            }
        });

        r7c5.setBackground(new Color(131, 171, 194));
        r7c5.setText("5");
        r7c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r7c5ActionPerformed(evt);
            }
        });

        r8c5.setBackground(new Color(131, 171, 194));
        r8c5.setText("6");
        r8c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r8c5ActionPerformed(evt);
            }
        });

        r9c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r9c5ActionPerformed(evt);
            }
        });

        r7c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r7c6ActionPerformed(evt);
            }
        });

        r8c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r8c6ActionPerformed(evt);
            }
        });

        r9c6.setBackground(new Color(131, 171, 194));
        r9c6.setText("1");
        r9c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r9c6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6Layout.setHorizontalGroup(
        	jPanel6Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel6Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel6Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel6Layout.createSequentialGroup()
        					.addComponent(r7c4, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(r7c5, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(r7c6, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
        				.addGroup(jPanel6Layout.createSequentialGroup()
        					.addComponent(r8c4, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(r8c5, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(r8c6, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
        				.addGroup(jPanel6Layout.createSequentialGroup()
        					.addComponent(r9c4, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(r9c5, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(r9c6, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
        	jPanel6Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel6Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel6Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(r7c4, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
        				.addComponent(r7c5, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
        				.addComponent(r7c6, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(jPanel6Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(r8c4, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
        				.addComponent(r8c5, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
        				.addComponent(r8c6, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(jPanel6Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(r9c4, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
        				.addComponent(r9c5, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
        				.addComponent(r9c6, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel6.setLayout(jPanel6Layout);

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        r1c7.setBackground(new Color(131, 171, 194));
        r1c7.setText("7");
        r1c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1c7ActionPerformed(evt);
            }
        });

        r2c7.setBackground(new Color(131, 171, 194));
        r2c7.setText("5");
        r2c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2c7ActionPerformed(evt);
            }
        });

        r3c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3c7ActionPerformed(evt);
            }
        });

        r1c8.setBackground(new Color(131, 171, 194));
        r1c8.setText("3");
        r1c8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1c8ActionPerformed(evt);
            }
        });

        r2c8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2c8ActionPerformed(evt);
            }
        });

        r3c8.setBackground(new Color(131, 171, 194));
        r3c8.setText("2");
        r3c8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3c8ActionPerformed(evt);
            }
        });

        r1c9.setBackground(new Color(131, 171, 194));
        r1c9.setText("4");
        r1c9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1c9ActionPerformed(evt);
            }
        });

        r2c9.setBackground(new Color(131, 171, 194));
        r2c9.setText("9");
        r2c9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2c9ActionPerformed(evt);
            }
        });

        r3c9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3c9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7Layout.setHorizontalGroup(
        	jPanel7Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel7Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel7Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel7Layout.createSequentialGroup()
        					.addComponent(r1c7, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(r1c8, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(r1c9, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
        				.addGroup(jPanel7Layout.createSequentialGroup()
        					.addComponent(r2c7, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(r2c8, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(r2c9, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
        				.addGroup(jPanel7Layout.createSequentialGroup()
        					.addComponent(r3c7, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(r3c8, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(r3c9, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
        	jPanel7Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel7Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel7Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(r1c7, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
        				.addComponent(r1c8, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
        				.addComponent(r1c9, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(jPanel7Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(r2c7, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
        				.addComponent(r2c8, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
        				.addComponent(r2c9, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(jPanel7Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(r3c7, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
        				.addComponent(r3c8, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
        				.addComponent(r3c9, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel7.setLayout(jPanel7Layout);

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        r4c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4c7ActionPerformed(evt);
            }
        });

        r5c7.setBackground(new Color(131, 171, 194));
        r5c7.setText("2");
        r5c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5c7ActionPerformed(evt);
            }
        });

        r6c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r6c7ActionPerformed(evt);
            }
        });

        r4c8.setBackground(new Color(131, 171, 194));
        r4c8.setText("9");
        r4c8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4c8ActionPerformed(evt);
            }
        });

        r5c8.setBackground(new Color(131, 171, 194));
        r5c8.setText("8");
        r5c8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5c8ActionPerformed(evt);
            }
        });

        r6c8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r6c8ActionPerformed(evt);
            }
        });

        r4c9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4c9ActionPerformed(evt);
            }
        });

        r5c9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5c9ActionPerformed(evt);
            }
        });

        r6c9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r6c9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8Layout.setHorizontalGroup(
        	jPanel8Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel8Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel8Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel8Layout.createSequentialGroup()
        					.addComponent(r4c7, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(r4c8, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(r4c9, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
        				.addGroup(jPanel8Layout.createSequentialGroup()
        					.addComponent(r5c7, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(r5c8, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(r5c9, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
        				.addGroup(jPanel8Layout.createSequentialGroup()
        					.addComponent(r6c7, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(r6c8, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(r6c9, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
        	jPanel8Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel8Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel8Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(r4c7, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
        				.addComponent(r4c8, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
        				.addComponent(r4c9, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(jPanel8Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(r5c7, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
        				.addComponent(r5c8, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
        				.addComponent(r5c9, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(jPanel8Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(r6c7, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
        				.addComponent(r6c8, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
        				.addComponent(r6c9, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel8.setLayout(jPanel8Layout);

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        r7c7.setBackground(new Color(131, 171, 194));
        r7c7.setText("9");
        r7c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r7c7ActionPerformed(evt);
            }
        });

        r8c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r8c7ActionPerformed(evt);
            }
        });

        r9c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r9c7ActionPerformed(evt);
            }
        });

        r7c8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r7c8ActionPerformed(evt);
            }
        });

        r8c8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r8c8ActionPerformed(evt);
            }
        });

        r9c8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r9c8ActionPerformed(evt);
            }
        });

        r7c9.setBackground(new Color(131, 171, 194));
        r7c9.setText("6");
        r7c9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r7c9ActionPerformed(evt);
            }
        });

        r8c9.setBackground(new Color(131, 171, 194));
        r8c9.setText("2");
        r8c9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r8c9ActionPerformed(evt);
            }
        });

        r9c9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r9c9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9Layout.setHorizontalGroup(
        	jPanel9Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel9Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel9Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel9Layout.createSequentialGroup()
        					.addComponent(r7c7, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(r7c8, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(r7c9, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
        				.addGroup(jPanel9Layout.createSequentialGroup()
        					.addComponent(r8c7, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(r8c8, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(r8c9, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
        				.addGroup(jPanel9Layout.createSequentialGroup()
        					.addComponent(r9c7, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(r9c8, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(r9c9, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
        	jPanel9Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel9Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel9Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(r7c7, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
        				.addComponent(r7c8, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
        				.addComponent(r7c9, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(jPanel9Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(r8c7, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
        				.addComponent(r8c8, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
        				.addComponent(r8c9, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(jPanel9Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(r9c7, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
        				.addComponent(r9c8, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
        				.addComponent(r9c9, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel9.setLayout(jPanel9Layout);

        selectionbtn1.setBackground(new java.awt.Color(102, 102, 102));
        selectionbtn1.setForeground(new java.awt.Color(255, 255, 255));
        selectionbtn1.setText("1");
        selectionbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectionbtn1ActionPerformed(evt);
            }
        });

        selectionbtn2.setBackground(new java.awt.Color(102, 102, 102));
        selectionbtn2.setForeground(new java.awt.Color(255, 255, 255));
        selectionbtn2.setText("2");
        selectionbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectionbtn2ActionPerformed(evt);
            }
        });

        selectionbtn3.setBackground(new java.awt.Color(102, 102, 102));
        selectionbtn3.setForeground(new java.awt.Color(255, 255, 255));
        selectionbtn3.setText("3");
        selectionbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectionbtn3ActionPerformed(evt);
            }
        });

        selectionbtn4.setBackground(new java.awt.Color(102, 102, 102));
        selectionbtn4.setForeground(new java.awt.Color(255, 255, 255));
        selectionbtn4.setText("4");
        selectionbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectionbtn4ActionPerformed(evt);
            }
        });

        selectionbtn5.setBackground(new java.awt.Color(102, 102, 102));
        selectionbtn5.setForeground(new java.awt.Color(255, 255, 255));
        selectionbtn5.setText("5");
        selectionbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectionbtn5ActionPerformed(evt);
            }
        });

        selectionbtn6.setBackground(new java.awt.Color(102, 102, 102));
        selectionbtn6.setForeground(new java.awt.Color(255, 255, 255));
        selectionbtn6.setText("6");
        selectionbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectionbtn6ActionPerformed(evt);
            }
        });

        selectionbtn7.setBackground(new java.awt.Color(102, 102, 102));
        selectionbtn7.setForeground(new java.awt.Color(255, 255, 255));
        selectionbtn7.setText("7");
        selectionbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectionbtn7ActionPerformed(evt);
            }
        });

        selectionbtn8.setBackground(new java.awt.Color(102, 102, 102));
        selectionbtn8.setForeground(new java.awt.Color(255, 255, 255));
        selectionbtn8.setText("8");
        selectionbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectionbtn8ActionPerformed(evt);
            }
        });

        selectionbtn9.setBackground(new java.awt.Color(102, 102, 102));
        selectionbtn9.setForeground(new java.awt.Color(255, 255, 255));
        selectionbtn9.setText("9");
        selectionbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectionbtn9ActionPerformed(evt);
            }
        });

        Resetbtn.setBackground(new Color(195, 166, 255));
        Resetbtn.setText("RESET");
        Resetbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetbtnActionPerformed(evt);
            }
        });

        checkbtn.setBackground(new Color(160, 232, 175));
        checkbtn.setText("Check Moves");
        checkbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkbtnActionPerformed(evt);
            }
        });

        Exitbtn.setBackground(new Color(217, 83, 79));
        Exitbtn.setText("EXIT");
        Exitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitbtnActionPerformed(evt);
            }
        });

        solbtn.setBackground(new Color(255, 235, 153));
        solbtn.setText("SOLUTION");
        solbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        						.addComponent(Resetbtn, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addGroup(layout.createSequentialGroup()
        							.addGap(11)
        							.addComponent(selectionbtn1, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.UNRELATED)
        							.addComponent(selectionbtn2, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)))
        					.addGap(18)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(selectionbtn3, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        							.addComponent(selectionbtn4, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
        							.addGap(10)
        							.addComponent(selectionbtn5, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
        							.addGap(18)
        							.addComponent(selectionbtn6, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(Exitbtn, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
        							.addGap(18)
        							.addComponent(solbtn, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)))
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(layout.createSequentialGroup()
        							.addGap(18)
        							.addComponent(checkbtn, GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
        							.addContainerGap())
        						.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(selectionbtn7, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.UNRELATED)
        							.addComponent(selectionbtn8, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.UNRELATED)
        							.addComponent(selectionbtn9, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
        							.addGap(25))))
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(jPanel7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(jPanel5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(jPanel8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(jPanel6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(jPanel9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        						.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jPanel7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jPanel8, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        				.addComponent(jPanel5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jPanel6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jPanel9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(18)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(selectionbtn1, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
        						.addComponent(selectionbtn2, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
        						.addComponent(selectionbtn3, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(18)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(selectionbtn6, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
        						.addComponent(selectionbtn4, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
        						.addComponent(selectionbtn5, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(18)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(selectionbtn7, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
        						.addComponent(selectionbtn8, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
        						.addComponent(selectionbtn9, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))))
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(Resetbtn, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
        				.addComponent(Exitbtn, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
        				.addComponent(checkbtn, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
        				.addComponent(solbtn, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(41, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void r7c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r7c4ActionPerformed
        // TODO add your handling code here:
        r7c4.setText(turn);
        r7c4.setBackground(white);
    }//GEN-LAST:event_r7c4ActionPerformed

    private void r1c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1c1ActionPerformed
        // TODO add your handling code here:
        r1c1.setText(turn);
        r1c1.setBackground(white);
    }//GEN-LAST:event_r1c1ActionPerformed

    private void r1c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1c2ActionPerformed
        // TODO add your handling code here:
        r1c2.setText(turn);
        r1c2.setBackground(white);
    }//GEN-LAST:event_r1c2ActionPerformed

    private void r1c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1c3ActionPerformed
        // TODO add your handling code here:
        r1c3.setText(turn);
        r1c3.setBackground(white);
    }//GEN-LAST:event_r1c3ActionPerformed

    private void r1c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1c4ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"this place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r1c4ActionPerformed

    private void r1c5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1c5ActionPerformed
        // TODO add your handling code here:
        r1c5.setText(turn);
        r1c5.setBackground(white);
    }//GEN-LAST:event_r1c5ActionPerformed

    private void r1c6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1c6ActionPerformed
        // TODO add your handling code here:
        r1c6.setText(turn);
        r1c6.setBackground(white);
        
    }//GEN-LAST:event_r1c6ActionPerformed

    private void r1c7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1c7ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"this place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r1c7ActionPerformed

    private void r1c8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1c8ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"this place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r1c8ActionPerformed

    private void r1c9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1c9ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"this place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r1c9ActionPerformed

    private void r2c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2c1ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"this place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r2c1ActionPerformed

    private void r2c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2c2ActionPerformed
        // TODO add your handling code here:
        r2c2.setText(turn);
        r2c2.setBackground(white);
    }//GEN-LAST:event_r2c2ActionPerformed

    private void r2c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2c3ActionPerformed
        // TODO add your handling code here:
        r2c3.setText(turn);
        r2c3.setBackground(white);
    }//GEN-LAST:event_r2c3ActionPerformed

    private void r2c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2c4ActionPerformed
        // TODO add your handling code here:
        r2c4.setText(turn);
        r2c4.setBackground(white);
    }//GEN-LAST:event_r2c4ActionPerformed

    private void r2c5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2c5ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"this place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r2c5ActionPerformed

    private void r2c6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2c6ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"this place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r2c6ActionPerformed

    private void r2c7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2c7ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"this place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r2c7ActionPerformed

    private void r2c8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2c8ActionPerformed
        // TODO add your handling code here:
        r2c8.setText(turn);
        r2c8.setBackground(white);
    }//GEN-LAST:event_r2c8ActionPerformed

    private void r2c9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2c9ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"this place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r2c9ActionPerformed

    private void r3c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3c1ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"this place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);

        
    }//GEN-LAST:event_r3c1ActionPerformed

    private void r3c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3c2ActionPerformed
        // TODO add your handling code here:
        r3c2.setText(turn);
        r3c2.setBackground(white);
    }//GEN-LAST:event_r3c2ActionPerformed

    private void r3c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3c3ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"this place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_r3c3ActionPerformed

    private void r3c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3c4ActionPerformed
        // TODO add your handling code here:
        r3c4.setText(turn);
        r3c4.setBackground(white);
    }//GEN-LAST:event_r3c4ActionPerformed

    private void r3c5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3c5ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"this place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r3c5ActionPerformed

    private void r3c6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3c6ActionPerformed
        // TODO add your handling code here:
        r3c6.setText(turn);
        r3c6.setBackground(white);
    }//GEN-LAST:event_r3c6ActionPerformed

    private void r3c7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3c7ActionPerformed
        // TODO add your handling code here:
        r3c7.setText(turn);
        r3c7.setBackground(white);
    }//GEN-LAST:event_r3c7ActionPerformed

    private void r3c8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3c8ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"this place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r3c8ActionPerformed

    private void r3c9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3c9ActionPerformed
        // TODO add your handling code here:
        r3c9.setText(turn);
        r3c9.setBackground(white);
    }//GEN-LAST:event_r3c9ActionPerformed

    private void r4c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4c1ActionPerformed
        // TODO add your handling code here:
        r4c1.setText(turn);
        r4c1.setBackground(white);
    }//GEN-LAST:event_r4c1ActionPerformed

    private void r4c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4c2ActionPerformed
        // TODO add your handling code here:
        r4c2.setText(turn);
        r4c2.setBackground(white);
    }//GEN-LAST:event_r4c2ActionPerformed

    private void r4c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4c3ActionPerformed
        // TODO add your handling code here:
        r4c3.setText(turn);
        r4c3.setBackground(white);
    }//GEN-LAST:event_r4c3ActionPerformed

    private void r4c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4c4ActionPerformed
        // TODO add your handling code here:
        r4c4.setText(turn);
        r4c4.setBackground(white);
    }//GEN-LAST:event_r4c4ActionPerformed

    private void r4c5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4c5ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"this place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r4c5ActionPerformed

    private void r4c6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4c6ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"this place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r4c6ActionPerformed

    private void r4c7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4c7ActionPerformed
        // TODO add your handling code here:
        r4c7.setText(turn);
        r4c7.setBackground(white);
    }//GEN-LAST:event_r4c7ActionPerformed

    private void r4c8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4c8ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"this place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r4c8ActionPerformed

    private void r4c9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4c9ActionPerformed
        // TODO add your handling code here:
        r4c9.setText(turn);
        r4c9.setBackground(white);
    }//GEN-LAST:event_r4c9ActionPerformed

    private void r5c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r5c1ActionPerformed
        // TODO add your handling code here:
        r5c1.setText(turn);
        r5c1.setBackground(white);
    }//GEN-LAST:event_r5c1ActionPerformed

    private void r5c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r5c2ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"this place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r5c2ActionPerformed

    private void r5c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r5c3ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"this place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r5c3ActionPerformed

    private void r5c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r5c4ActionPerformed
        // TODO add your handling code here:
        r5c4.setText(turn);
        r5c4.setBackground(white);
    }//GEN-LAST:event_r5c4ActionPerformed

    private void r5c5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r5c5ActionPerformed
        // TODO add your handling code here:
        r5c5.setText(turn);
        r5c5.setBackground(white);
    }//GEN-LAST:event_r5c5ActionPerformed

    private void r5c6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r5c6ActionPerformed
        // TODO add your handling code here:
        r5c6.setText(turn);
        r5c6.setBackground(white);
    }//GEN-LAST:event_r5c6ActionPerformed

    private void r5c7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r5c7ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"this place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r5c7ActionPerformed

    private void r5c8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r5c8ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"this place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r5c8ActionPerformed

    private void r5c9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r5c9ActionPerformed
        // TODO add your handling code here:
        r5c9.setText(turn);
        r5c9.setBackground(white);
    }//GEN-LAST:event_r5c9ActionPerformed

    private void r6c6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r6c6ActionPerformed
        // TODO add your handling code here:
        r6c6.setText(turn);
        r6c6.setBackground(white);
        
    }//GEN-LAST:event_r6c6ActionPerformed

    private void r6c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r6c1ActionPerformed
        // TODO add your handling code here:
        r6c1.setText(turn);
        r6c1.setBackground(white);
    }//GEN-LAST:event_r6c1ActionPerformed

    private void r6c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r6c2ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"this place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r6c2ActionPerformed

    private void r6c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r6c3ActionPerformed
        // TODO add your handling code here:
        r6c3.setText(turn);
        r6c3.setBackground(white);
    }//GEN-LAST:event_r6c3ActionPerformed

    private void r6c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r6c4ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"this place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r6c4ActionPerformed

    private void r6c5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r6c5ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"this place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r6c5ActionPerformed

    private void r6c7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r6c7ActionPerformed
        // TODO add your handling code here:
        r6c7.setText(turn);
        r6c7.setBackground(white);
    }//GEN-LAST:event_r6c7ActionPerformed

    private void r6c8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r6c8ActionPerformed
        // TODO add your handling code here:
        r6c8.setText(turn);
        r6c8.setBackground(white);
    }//GEN-LAST:event_r6c8ActionPerformed

    private void r6c9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r6c9ActionPerformed
        // TODO add your handling code here:
        r6c9.setText(turn);
        r6c9.setBackground(white);
    }//GEN-LAST:event_r6c9ActionPerformed

    private void r7c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r7c1ActionPerformed
        // TODO add your handling code here:
        r7c1.setText(turn);
        r7c1.setBackground(white);
    }//GEN-LAST:event_r7c1ActionPerformed

    private void r7c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r7c2ActionPerformed
        // TODO add your handling code here:
       JOptionPane.showMessageDialog(this,"this place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r7c2ActionPerformed

    private void r7c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r7c3ActionPerformed
        // TODO add your handling code here:
        r7c3.setText(turn);
        r7c3.setBackground(white);
       
    }//GEN-LAST:event_r7c3ActionPerformed

    private void r7c5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r7c5ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"this place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r7c5ActionPerformed

    private void r7c6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r7c6ActionPerformed
        // TODO add your handling code here:
        r7c6.setText(turn);
        r7c6.setBackground(white);
       
       
    }//GEN-LAST:event_r7c6ActionPerformed

    private void r7c7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r7c7ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"this place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_r7c7ActionPerformed

    private void r7c8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r7c8ActionPerformed
        // TODO add your handling code here:
        r7c8.setText(turn);
        r7c8.setBackground(white);
       
        
    }//GEN-LAST:event_r7c8ActionPerformed

    private void r7c9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r7c9ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"this place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_r7c9ActionPerformed

    private void r8c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r8c1ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"this place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r8c1ActionPerformed

    private void r8c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r8c2ActionPerformed
        // TODO add your handling code here:
        r8c2.setText(turn);
        r8c2.setBackground(white);
        
    }//GEN-LAST:event_r8c2ActionPerformed

    private void r8c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r8c3ActionPerformed
        // TODO add your handling code here:
        r8c3.setText(turn);
        r8c3.setBackground(white);
        
    }//GEN-LAST:event_r8c3ActionPerformed

    private void r8c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r8c4ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"this place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r8c4ActionPerformed

    private void r8c5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r8c5ActionPerformed
        // TODO add your handling code here:
       JOptionPane.showMessageDialog(this,"this place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r8c5ActionPerformed

    private void r8c6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r8c6ActionPerformed
        // TODO add your handling code here:
        r8c6.setText(turn);
        r8c6.setBackground(white);
    }//GEN-LAST:event_r8c6ActionPerformed

    private void r8c7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r8c7ActionPerformed
        // TODO add your handling code here:
        r8c7.setText(turn);
        r8c7.setBackground(white);
    }//GEN-LAST:event_r8c7ActionPerformed

    private void r8c8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r8c8ActionPerformed
        // TODO add your handling code here:
        r8c8.setText(turn);
        r8c8.setBackground(white);
    }//GEN-LAST:event_r8c8ActionPerformed

    private void r8c9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r8c9ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"this place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r8c9ActionPerformed

    private void r9c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r9c1ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"this place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r9c1ActionPerformed

    private void r9c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r9c2ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"this place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r9c2ActionPerformed

    private void r9c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r9c3ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"this place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r9c3ActionPerformed

    private void r9c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r9c4ActionPerformed
        // TODO add your handling code here:
        r9c4.setText(turn);
        r9c4.setBackground(white);
    }//GEN-LAST:event_r9c4ActionPerformed

    private void r9c5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r9c5ActionPerformed
        // TODO add your handling code here:
        r9c5.setText(turn);
        r9c5.setBackground(white);
    }//GEN-LAST:event_r9c5ActionPerformed

    private void r9c6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r9c6ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"this place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r9c6ActionPerformed

    private void r9c7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r9c7ActionPerformed
        // TODO add your handling code here:
        r9c7.setText(turn);
        r9c7.setBackground(white);
    }//GEN-LAST:event_r9c7ActionPerformed

    private void r9c8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r9c8ActionPerformed
        // TODO add your handling code here:
        r9c8.setText(turn);
        r9c8.setBackground(white);
    }//GEN-LAST:event_r9c8ActionPerformed

    private void r9c9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r9c9ActionPerformed
        // TODO add your handling code here:
        r9c9.setText(turn);
        r9c9.setBackground(white);
    }//GEN-LAST:event_r9c9ActionPerformed

    private void selectionbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectionbtn1ActionPerformed
        // TODO add your handling code here:
        AssignTurn(selectionbtn1);
        turn="1";
    }//GEN-LAST:event_selectionbtn1ActionPerformed

    private void selectionbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectionbtn2ActionPerformed
        // TODO add your handling code here:
        AssignTurn(selectionbtn2);
        turn="2";
    }//GEN-LAST:event_selectionbtn2ActionPerformed

    private void selectionbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectionbtn3ActionPerformed
        // TODO add your handling code here:
        AssignTurn(selectionbtn3);
        turn="3";
    }//GEN-LAST:event_selectionbtn3ActionPerformed

    private void selectionbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectionbtn4ActionPerformed
        // TODO add your handling code here:
        AssignTurn(selectionbtn4);
        turn="4";
    }//GEN-LAST:event_selectionbtn4ActionPerformed

    private void selectionbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectionbtn5ActionPerformed
        // TODO add your handling code here:
        AssignTurn(selectionbtn5);
        turn="5";
    }//GEN-LAST:event_selectionbtn5ActionPerformed

    private void selectionbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectionbtn6ActionPerformed
        // TODO add your handling code here:
        AssignTurn(selectionbtn6);
        turn="6";
    }//GEN-LAST:event_selectionbtn6ActionPerformed

    private void selectionbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectionbtn7ActionPerformed
        // TODO add your handling code here:
        AssignTurn(selectionbtn7);
        turn="7";
    }//GEN-LAST:event_selectionbtn7ActionPerformed

    private void selectionbtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectionbtn8ActionPerformed
        // TODO add your handling code here:
        AssignTurn(selectionbtn8);
        turn="8";
    }//GEN-LAST:event_selectionbtn8ActionPerformed

    private void selectionbtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectionbtn9ActionPerformed
        // TODO add your handling code here:
        AssignTurn(selectionbtn9);
        turn="9";
    }//GEN-LAST:event_selectionbtn9ActionPerformed

    private void ResetbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetbtnActionPerformed
        // TODO add your handling code here:
        JFrame frame = new JFrame("Reset");
        
        if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to reset the game",
        "Sudoku Puzzle",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
            ResetGame();
        }
    }//GEN-LAST:event_ResetbtnActionPerformed

    private void ExitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitbtnActionPerformed
        // TODO add your handling code here:
        JFrame frame = new JFrame("Exit");
        
        if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to reset the game",
        "Sudoku Puzzle",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_ExitbtnActionPerformed

    private void solbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solbtnActionPerformed
        // TODO add your handling code here:
        SeeSolution();
    }//GEN-LAST:event_solbtnActionPerformed

    private void checkbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkbtnActionPerformed
        // TODO add your handling code here:
        CheckMoves();
    }//GEN-LAST:event_checkbtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(sudokuFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sudokuFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sudokuFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sudokuFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sudokuFile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exitbtn;
    private javax.swing.JButton Resetbtn;
    private javax.swing.JButton checkbtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JButton r1c1;
    private javax.swing.JButton r1c2;
    private javax.swing.JButton r1c3;
    private javax.swing.JButton r1c4;
    private javax.swing.JButton r1c5;
    private javax.swing.JButton r1c6;
    private javax.swing.JButton r1c7;
    private javax.swing.JButton r1c8;
    private javax.swing.JButton r1c9;
    private javax.swing.JButton r2c1;
    private javax.swing.JButton r2c2;
    private javax.swing.JButton r2c3;
    private javax.swing.JButton r2c4;
    private javax.swing.JButton r2c5;
    private javax.swing.JButton r2c6;
    private javax.swing.JButton r2c7;
    private javax.swing.JButton r2c8;
    private javax.swing.JButton r2c9;
    private javax.swing.JButton r3c1;
    private javax.swing.JButton r3c2;
    private javax.swing.JButton r3c3;
    private javax.swing.JButton r3c4;
    private javax.swing.JButton r3c5;
    private javax.swing.JButton r3c6;
    private javax.swing.JButton r3c7;
    private javax.swing.JButton r3c8;
    private javax.swing.JButton r3c9;
    private javax.swing.JButton r4c1;
    private javax.swing.JButton r4c2;
    private javax.swing.JButton r4c3;
    private javax.swing.JButton r4c4;
    private javax.swing.JButton r4c5;
    private javax.swing.JButton r4c6;
    private javax.swing.JButton r4c7;
    private javax.swing.JButton r4c8;
    private javax.swing.JButton r4c9;
    private javax.swing.JButton r5c1;
    private javax.swing.JButton r5c2;
    private javax.swing.JButton r5c3;
    private javax.swing.JButton r5c4;
    private javax.swing.JButton r5c5;
    private javax.swing.JButton r5c6;
    private javax.swing.JButton r5c7;
    private javax.swing.JButton r5c8;
    private javax.swing.JButton r5c9;
    private javax.swing.JButton r6c1;
    private javax.swing.JButton r6c2;
    private javax.swing.JButton r6c3;
    private javax.swing.JButton r6c4;
    private javax.swing.JButton r6c5;
    private javax.swing.JButton r6c6;
    private javax.swing.JButton r6c7;
    private javax.swing.JButton r6c8;
    private javax.swing.JButton r6c9;
    private javax.swing.JButton r7c1;
    private javax.swing.JButton r7c2;
    private javax.swing.JButton r7c3;
    private javax.swing.JButton r7c4;
    private javax.swing.JButton r7c5;
    private javax.swing.JButton r7c6;
    private javax.swing.JButton r7c7;
    private javax.swing.JButton r7c8;
    private javax.swing.JButton r7c9;
    private javax.swing.JButton r8c1;
    private javax.swing.JButton r8c2;
    private javax.swing.JButton r8c3;
    private javax.swing.JButton r8c4;
    private javax.swing.JButton r8c5;
    private javax.swing.JButton r8c6;
    private javax.swing.JButton r8c7;
    private javax.swing.JButton r8c8;
    private javax.swing.JButton r8c9;
    private javax.swing.JButton r9c1;
    private javax.swing.JButton r9c2;
    private javax.swing.JButton r9c3;
    private javax.swing.JButton r9c4;
    private javax.swing.JButton r9c5;
    private javax.swing.JButton r9c6;
    private javax.swing.JButton r9c7;
    private javax.swing.JButton r9c8;
    private javax.swing.JButton r9c9;
    private javax.swing.JButton selectionbtn1;
    private javax.swing.JButton selectionbtn2;
    private javax.swing.JButton selectionbtn3;
    private javax.swing.JButton selectionbtn4;
    private javax.swing.JButton selectionbtn5;
    private javax.swing.JButton selectionbtn6;
    private javax.swing.JButton selectionbtn7;
    private javax.swing.JButton selectionbtn8;
    private javax.swing.JButton selectionbtn9;
    private javax.swing.JButton solbtn;
    // End of variables declaration//GEN-END:variables
}
