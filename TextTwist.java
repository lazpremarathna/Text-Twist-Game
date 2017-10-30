
import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Laz
 */
public class TextTwist extends javax.swing.JFrame {

    /**
     * Creates new form TextTwist
     */
    public TextTwist() {
        initComponents();
        pack();
        setLocationRelativeTo(null);
        setVisible(true);

        try {
            fReader = new FileReader("dictionary.gbg");
            bReader = new BufferedReader(fReader);

            String sCurrentLine;
            while ((sCurrentLine = bReader.readLine()) != null) {
                sCurrentLine = sCurrentLine.replace("\n", "");
                dict.add(sCurrentLine);
            }

        } catch (IOException ee) {
            ee.printStackTrace();
        } finally {
            try {
                if (bReader != null) {
                    bReader.close();
                }
                if (fReader != null) {
                    fReader.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    BufferedReader bReader = null;
    FileReader fReader = null;
    HashSet<String> dict = new HashSet<String>();
    HashSet<String> inputWords = new HashSet<String>();
    DefaultListModel model = new DefaultListModel<>();

    char a;
    char b;
    char c;
    char d;
    char e;
    char f;

    int points;
    int totalWords;

    List<String> wordList;
    List<String> enteredWordList;

    public void terminateGamebyPoints() {
        if (points == 5) {
            btnInput.setEnabled(false);
            lblResult.setText("Congratulation! You have Won the Game");

            for (String d : wordList) {
                model.addElement(d);
            }

            listPossibleWords.setModel(model);
        }
    }

    public void terminateGamebyBtn() {

        btnInput.setEnabled(false);
        lblResult.setText("You have Terminate the Game");

        for (String d : wordList) {
            model.addElement(d);
        }

        listPossibleWords.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnInput = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnClearLetters = new javax.swing.JButton();
        btnClearWord = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lblResult = new javax.swing.JLabel();
        lblPoints = new javax.swing.JLabel();
        txtLettersInput = new javax.swing.JTextField();
        btnTerminate = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        lblInputLetters = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listPossibleWords = new javax.swing.JList<>();
        txtWordInput = new javax.swing.JTextField();
        lblWordCounter = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Text Twist Game");
        setResizable(false);

        btnInput.setText("Input");
        btnInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInputActionPerformed(evt);
            }
        });

        jLabel2.setText("Guess a Word:");

        btnClearLetters.setText("Clear");
        btnClearLetters.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearLettersActionPerformed(evt);
            }
        });

        btnClearWord.setText("Clear");
        btnClearWord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearWordActionPerformed(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Points");

        lblResult.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblResult.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResult.setText("Result Goes Here");

        lblPoints.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblPoints.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPoints.setText("000");

        txtLettersInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLettersInputActionPerformed(evt);
            }
        });

        btnTerminate.setText("Terminate Game");
        btnTerminate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTerminateActionPerformed(evt);
            }
        });

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        lblInputLetters.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblInputLetters.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInputLetters.setText("Please Enter 6 Letters");

        jLabel1.setText("Please Enter 6 Letters:");

        jScrollPane1.setViewportView(listPossibleWords);

        lblWordCounter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWordCounter.setText("|");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblWordCounter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTerminate, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(128, 128, 128))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPoints, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2)
                            .addComponent(lblResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtWordInput, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnInput, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnClearWord, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtLettersInput, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClearLetters, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addComponent(lblInputLetters, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLettersInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch)
                    .addComponent(btnClearLetters))
                .addGap(7, 7, 7)
                .addComponent(lblInputLetters)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblWordCounter)
                .addGap(5, 5, 5)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtWordInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInput)
                    .addComponent(btnClearWord))
                .addGap(28, 28, 28)
                .addComponent(lblResult)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPoints)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTerminate)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInputActionPerformed
        String searchString = txtWordInput.getText();

        if (!inputWords.add(searchString)) {
            lblResult.setText("Word Already Tried!!! Try Another Word");
            return;
        }

        if (wordList.contains(searchString)) {
            System.out.println("****Found****");
            lblResult.setText("Correct!");
            points++;
            lblPoints.setText(Integer.toString(points));
            terminateGamebyPoints();
        } else {
            System.out.println("****Not Found****");
            lblResult.setText("Incorrect :(");
            points--;
            lblPoints.setText(Integer.toString(points));
        }

        System.out.println(searchString);
    }//GEN-LAST:event_btnInputActionPerformed

    private void btnClearLettersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearLettersActionPerformed
        txtLettersInput.setText("");
        lblInputLetters.setText("Please Enter 6 Letters");
    }//GEN-LAST:event_btnClearLettersActionPerformed

    private void btnClearWordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearWordActionPerformed
        txtWordInput.setText("");
    }//GEN-LAST:event_btnClearWordActionPerformed

    private void txtLettersInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLettersInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLettersInputActionPerformed

    private void btnTerminateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTerminateActionPerformed
        terminateGamebyBtn();
        txtWordInput.setText("");
        btnTerminate.setEnabled(false);
    }//GEN-LAST:event_btnTerminateActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        inputWords.clear();
        btnInput.setEnabled(true);
        btnTerminate.setEnabled(true);
        model.removeAllElements();
        points = 0;

        String inputLetters = txtLettersInput.getText();
        lblInputLetters.setText(inputLetters);
        lblResult.setText("Result Goes Here");
        lblPoints.setText("000");

        if (inputLetters.length() != 6) {
            JOptionPane.showMessageDialog(new JFrame(), "Please Enter Six(6) Letters.","Warning",JOptionPane.WARNING_MESSAGE);
        } else {

            a = inputLetters.charAt(0);
            b = inputLetters.charAt(1);
            c = inputLetters.charAt(2);
            d = inputLetters.charAt(3);
            e = inputLetters.charAt(4);
            f = inputLetters.charAt(5);

            WordSet ws = new WordSet(a, b, c, d, e, f, dict);
            wordList = ws.getWords();

            totalWords = 0;

            for (String j : wordList) {
                System.out.println(j);
                totalWords++;
            }
            System.out.println("Total Words: " + totalWords);
            System.out.println("'" + a + "'" + "'" + b + "'" + "'" + c + "'" + "'" + d + "'" + "'" + e + "'" + "'" + f + "'");
            lblWordCounter.setText("You can make " + totalWords + " words");
        }

    }//GEN-LAST:event_btnSearchActionPerformed

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
            java.util.logging.Logger.getLogger(TextTwist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TextTwist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TextTwist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TextTwist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new TextTwist().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClearLetters;
    private javax.swing.JButton btnClearWord;
    private javax.swing.JButton btnInput;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnTerminate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblInputLetters;
    private javax.swing.JLabel lblPoints;
    private javax.swing.JLabel lblResult;
    private javax.swing.JLabel lblWordCounter;
    private javax.swing.JList<String> listPossibleWords;
    private javax.swing.JTextField txtLettersInput;
    private javax.swing.JTextField txtWordInput;
    // End of variables declaration//GEN-END:variables
}