
import javax.swing.JOptionPane;

public class TicTacToeGame extends javax.swing.JFrame {

    boolean playeroneturn=true;
    boolean winner=false;
    
    public TicTacToeGame() {
        initComponents();
        super.setSize(600,500);//size bdhane k lie
        super.setTitle("TicTacToe");
        
    }

                              
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        t1 = new javax.swing.JTextField();
        t9 = new javax.swing.JTextField();
        t4 = new javax.swing.JTextField();
        t7 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        t8 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        t5 = new javax.swing.JTextField();
        t6 = new javax.swing.JTextField();
        p1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tic Tac Toe");

        jLabel2.setText("Player 2:  X");

        jLabel3.setText("Player 1: O");

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));

        t1.setEditable(false);
        t1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        t1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t1MouseClicked(evt);
            }
        });
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });

        t9.setEditable(false);
        t9.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        t9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t9MouseClicked(evt);
            }
        });

        t4.setEditable(false);
        t4.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        t4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t4MouseClicked(evt);
            }
        });

        t7.setEditable(false);
        t7.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        t7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t7MouseClicked(evt);
            }
        });

        t2.setEditable(false);
        t2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        t2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t2MouseClicked(evt);
            }
        });

        t8.setEditable(false);
        t8.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        t8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t8MouseClicked(evt);
            }
        });
        t8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t8ActionPerformed(evt);
            }
        });

        t3.setEditable(false);
        t3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        t3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t3MouseClicked(evt);
            }
        });

        t5.setEditable(false);
        t5.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        t5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t5MouseClicked(evt);
            }
        });

        t6.setEditable(false);
        t6.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        t6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(t7, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(t1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                        .addComponent(t4, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t8, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(t9)
                    .addComponent(t6, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                    .addComponent(t3))
                .addGap(59, 59, 59))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t6, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t7, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t8, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t9, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        p1.setBackground(new java.awt.Color(102, 0, 51));
        p1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        p1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p1.setText("Player 1: Your turn");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(119, 119, 119)
                        .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(59, 59, 59)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        pack();
    }                       

    private void checkwinner()
    {
        if(t1.getText().equals(t2.getText()) && t2.getText().equals(t3.getText()) && t1.getText().isEmpty()==false)
        {
            if(playeroneturn)
            {
                JOptionPane.showMessageDialog(this, "player 2 is winner");
            }
            else
            {
                JOptionPane.showMessageDialog(this, "player 1 is winner");
            }
            winner=true;
        }
        if(t4.getText().equals(t5.getText()) && t5.getText().equals(t6.getText()) && t4.getText().isEmpty()==false)
        {
            if(playeroneturn)
            {
                JOptionPane.showMessageDialog(this, "player 2 is winner");
            }
            else
            {
                JOptionPane.showMessageDialog(this, "player 1 is winner");
            }
            winner=true;
        }
        if(t7.getText().equals(t8.getText()) && t8.getText().equals(t9.getText()) && t7.getText().isEmpty()==false)
        {
            if(playeroneturn)
            {
                JOptionPane.showMessageDialog(this, "player 2 is winner");
            }
            else
            {
                JOptionPane.showMessageDialog(this, "player 1 is winner");
            }
            winner=true;
        }
        if(t1.getText().equals(t4.getText()) && t4.getText().equals(t7.getText()) && t1.getText().isEmpty()==false)
        {
            if(playeroneturn)
            {
                JOptionPane.showMessageDialog(this, "player 2 is winner");
            }
            else
            {
                JOptionPane.showMessageDialog(this, "player 1 is winner");
            }
            winner=true;
        }
        if(t2.getText().equals(t5.getText()) && t5.getText().equals(t8.getText()) && t8.getText().isEmpty()==false)
        {
            if(playeroneturn)
            {
                JOptionPane.showMessageDialog(this, "player 2 is winner");
            }
            else
            {
                JOptionPane.showMessageDialog(this, "player 1 is winner");
            }
            winner=true;
        }
        if(t3.getText().equals(t6.getText()) && t6.getText().equals(t9.getText()) && t9.getText().isEmpty()==false)
        {
            if(playeroneturn)
            {
                JOptionPane.showMessageDialog(this, "player 2 is winner");
            }
            else
            {
                JOptionPane.showMessageDialog(this, "player 1 is winner");
            }
            winner=true;
        }
        if(t1.getText().equals(t5.getText()) && t5.getText().equals(t9.getText()) && t1.getText().isEmpty()==false)
        {
            if(playeroneturn)
            {
                JOptionPane.showMessageDialog(this, "player 2 is winner");
            }
            else
            {
                JOptionPane.showMessageDialog(this, "player 1 is winner");
            }
            winner=true;
        }
        if(t3.getText().equals(t5.getText()) && t5.getText().equals(t7.getText()) && t3.getText().isEmpty()==false)
        {
            if(playeroneturn)
            {
                JOptionPane.showMessageDialog(this, "player 2 is winner");
            }
            else
            {
                JOptionPane.showMessageDialog(this, "player 1 is winner");
            }
            winner=true;
        }
        if(winner)
        {
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
            t5.setText("");
            t6.setText("");
            t7.setText("");
            t8.setText("");
            t9.setText("");
            winner=false;
            playeroneturn=true;
            p1.setText("Player 1: Your turn");
        }
            }
    
    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        
    }                                  

    private void t1MouseClicked(java.awt.event.MouseEvent evt) {                                
        
        if(t1.getText().equals(""))
        {
        if(playeroneturn)
        {
            t1.setText("O");
            playeroneturn=false;
            p1.setText("Player 2:Your turn");
            
        }
        else
        {
            t1.setText("x");
            playeroneturn=true;
             p1.setText("Player 1:Your turn");
        }
        }
        else
        {
            JOptionPane.showMessageDialog(this,"This area is occupied");
        }
       checkwinner();
        
    }                               

    private void t2MouseClicked(java.awt.event.MouseEvent evt) {                                
        
        
        if(t2.getText().equals(""))
        {
        if(playeroneturn)
        {
            t2.setText("O");/ 
            playeroneturn=false;
            p1.setText("Player 2:Your turn");
            
        }
        else
        {
            t2.setText("x");
            playeroneturn=true;
             p1.setText("Player 1:Your turn");
        }
        }
         else
        {
            JOptionPane.showMessageDialog(this,"This area is occupied");
        }
          checkwinner();
    }                               

    private void t3MouseClicked(java.awt.event.MouseEvent evt) {                                
        
        if(t3.getText().equals(""))
        {
      if(playeroneturn)
        {
            t3.setText("O");
            playeroneturn=false;
            p1.setText("Player 2:Your turn");
            
        }
        else
        {
            t3.setText("x"); 
            playeroneturn=true;
             p1.setText("Player 1:Your turn");
        }
        }
         else
        {
            JOptionPane.showMessageDialog(this,"This area is occupied");
        }
          checkwinner();
    }                               

    private void t4MouseClicked(java.awt.event.MouseEvent evt) {                                
        // TODO add your handling code here:
        if(t4.getText().equals(""))
        {
        if(playeroneturn)
        {
            t4.setText("O");
            playeroneturn=false;
            p1.setText("Player 2:Your turn");
            
        }
        else
        {
            t4.setText("x");
            playeroneturn=true;
             p1.setText("Player 1:Your turn");
        }
        }
         else
        {
            JOptionPane.showMessageDialog(this,"This area is occupied");
        }
          checkwinner();
       
    }                               

    private void t5MouseClicked(java.awt.event.MouseEvent evt) {                                
        /
        if(t5.getText().equals(""))
        {
        if(playeroneturn)
        {
            t5.setText("O");
            playeroneturn=false;
            p1.setText("Player 2:Your turn");
            

        }
        else
        {
            t5.setText("x");//player one chale 
            playeroneturn=true;
             p1.setText("Player 1:Your turn");//jo player likha wha change hote jayga
        }
        }
          checkwinner();
        
    }                               

    private void t8ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
       
        
    }                                  

    private void t7MouseClicked(java.awt.event.MouseEvent evt) {                                
        // TODO add your handling code here:
        if(t7.getText().equals(""))
        {
        if(playeroneturn)
        {
            t7.setText("O");
            playeroneturn=false;
            p1.setText("Player 2:Your turn");
            
        }
        else
        {
            t7.setText("x");
            playeroneturn=true;
             p1.setText("Player 1:Your turn");
        }
        }
         else
        {
            JOptionPane.showMessageDialog(this,"This area is occupied");
        }
          checkwinner();
        
    }                               

    private void t6MouseClicked(java.awt.event.MouseEvent evt) {                                
        // TODO add your handling code here:
        if(t6.getText().equals(""))
        {
        if(playeroneturn)
        {
            t6.setText("O");
            playeroneturn=false;
            p1.setText("Player 2:Your turn");
            
        }
        else
        {
            t6.setText("x");
            playeroneturn=true;
             p1.setText("Player 1:Your turn");
        }
        }
          checkwinner();
        
    }                               

    private void t9MouseClicked(java.awt.event.MouseEvent evt) {                                
        // TODO add your handling code here:
        if(t9.getText().equals(""))
        {
        if(playeroneturn)
        {
            t9.setText("O");
            playeroneturn=false;
            p1.setText("Player 2:Your turn");
            
        }
        else
        {
            t9.setText("x");
            playeroneturn=true;
             p1.setText("Player 1:Your turn");
        }
        }
         else
        {
            JOptionPane.showMessageDialog(this,"This area is occupied");
        }
          checkwinner();
        
    }                               

    private void t8MouseClicked(java.awt.event.MouseEvent evt) {                                
        
         if(t8.getText().equals(""))
        {
        if(playeroneturn)
        {
            t8.setText("O");
            playeroneturn=false;
            p1.setText("Player 2:Your turn");
            
        }
        else
        {
            t8.setText("x");
            playeroneturn=true;
            p1.setText("Player 1:Your turn");
            
        }
        }
         else
        {
            JOptionPane.showMessageDialog(this,"This area is occupied");
        }
          checkwinner();
    }                               

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TicTacToeGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToeGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToeGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToeGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToeGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel p1;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    private javax.swing.JTextField t7;
    private javax.swing.JTextField t8;
    private javax.swing.JTextField t9;
    // End of variables declaration                   
}
