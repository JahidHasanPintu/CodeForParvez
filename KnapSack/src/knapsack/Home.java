/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knapsack;

/**
 *
 * @author pin2
 */
import java.util.Arrays;
import java.util.Comparator;
import javax.swing.JOptionPane;
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
    }
    
    
    public void knapsackGreProc(int W[], int V[], int M, int n,String name[]) {
	KnapsackPackage[] packs = new KnapsackPackage[n];
        KnapsackPackage[] resulting = new KnapsackPackage[n];
	for (int i = 0; i < n; i ++) {
		packs[i] = new KnapsackPackage(W[i], V[i],name[i]);
	}
	
	Arrays.sort(packs, new Comparator<KnapsackPackage>() {
		@Override
		public int compare(KnapsackPackage kPackA, KnapsackPackage kPackB) {
			return kPackB.getCost().compareTo(kPackA.getCost());
		}
	});
	
	int remain = M;	
double result = 0d;
int quan[]= new int[]{0,0,0,0,0};
	
	int i = 0;
	boolean stopProc = false;
        String str="";
	while (!stopProc) {
		if (packs[i].getWeight() <= remain) {
			remain -= packs[i].getWeight();
			result += packs[i].getValue();
                        quan[i]++;
			str=str+packs[i].getName()+ " - Weight " + packs[i].getWeight() + " - Value " + packs[i].getValue()+"\n";
			System.out.println(packs[i].getName()+ " - Weight " + packs[i].getWeight() + " - Value " + packs[i].getValue());
		}
		
		if (packs[i].getWeight() > remain) {
			i ++;
		}
		
		if (i == n) {
			stopProc = true;
		}
	}
        JOptionPane.showMessageDialog(null,"You have to take:\n "+ str);
        
        /*
        Result res1=new Result();
        
        res1.firstF.setText(packs[0].getName());
        res1.secondF.setText(packs[1].getName());
        res1.thirdF.setText(packs[2].getName());
        res1.fourthF.setText(packs[3].getName());
        res1.fifthF.setText(packs[4].getName());
        
        res1.finCQ1.setText(Integer.toString(packs[0].getWeight()*quan[0]));
        res1.finIQ1.setText(Integer.toString(packs[1].getWeight()*quan[1]));
        res1.finMQ1.setText(Integer.toString(packs[2].getWeight()*quan[2]));
        res1.finBQ1.setText(Integer.toString(packs[3].getWeight()*quan[3]));
        res1.finPQ.setText(Integer.toString(packs[4].getWeight()*quan[4]));
        
        
        res1.finCP.setText(Integer.toString(packs[0].getValue()*quan[0]));
        res1.finIP.setText(Integer.toString(packs[1].getValue()*quan[1]));
        res1.finMP.setText(Integer.toString(packs[2].getValue()*quan[2]));
        res1.finBP.setText(Integer.toString(packs[3].getValue()*quan[3]));
      //  res1.finPP.setText(Integer.toString(packs[4].getValue()*quan[4]));
        
       // res1.tP.setText(Double.toString(result));
        */
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        AppQ = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        AppP = new javax.swing.JTextField();
        OraQ = new javax.swing.JTextField();
        OraP = new javax.swing.JTextField();
        MalP = new javax.swing.JTextField();
        GraP = new javax.swing.JTextField();
        MalQ = new javax.swing.JTextField();
        GraQ = new javax.swing.JTextField();
        SugQ = new javax.swing.JTextField();
        SugP = new javax.swing.JTextField();
        BagS = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        jButton1.setText("OK DONE !!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, -1, -1));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        jLabel1.setText("Hey Man!! ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/theeif.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 490, 480));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel3.setText("Help Me to Find MAX");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel4.setText("Food Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel5.setText("Quantity(Kg)");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, -1, -1));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel6.setText("Price TK");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, -1, -1));
        getContentPane().add(AppQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 70, 30));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel7.setText("Apple");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel8.setText("Orange");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel9.setText("Sugar");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel10.setText("Grape");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel13.setText("Malta");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        jLabel14.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel14.setText("Please tell my bag size : ");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));
        getContentPane().add(AppP, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 70, -1));
        getContentPane().add(OraQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 70, 30));
        getContentPane().add(OraP, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 70, -1));
        getContentPane().add(MalP, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 70, -1));
        getContentPane().add(GraP, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 70, -1));
        getContentPane().add(MalQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 70, 30));
        getContentPane().add(GraQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 70, -1));
        getContentPane().add(SugQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 70, -1));
        getContentPane().add(SugP, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, 70, -1));
        getContentPane().add(BagS, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 70, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         String[] pName = { "Apple", "Orange", "Malta","Grape","Sugar" };
        
         
         int W[] = new int[5];
         
        W[0]= Integer.parseInt(AppQ.getText());
        W[1]= Integer.parseInt(OraQ.getText());
        W[2]= Integer.parseInt(MalQ.getText());
        W[3]= Integer.parseInt(GraQ.getText());
        W[4]= Integer.parseInt(SugQ.getText());
        
        
        int V[] = new int[5];
        V[0]= Integer.parseInt(AppP.getText());
        V[1]= Integer.parseInt(OraP.getText());
        V[2]= Integer.parseInt(MalP.getText());
        V[3]= Integer.parseInt(GraP.getText());
        V[4]= Integer.parseInt(SugP.getText());
        
        int M = Integer.parseInt(BagS.getText());
	int n = 5;
	
        knapsackGreProc(W, V, M, n,pName);
         
       
        
         //new Result().setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField AppP;
    public static javax.swing.JTextField AppQ;
    public static javax.swing.JTextField BagS;
    public static javax.swing.JTextField GraP;
    public static javax.swing.JTextField GraQ;
    public static javax.swing.JTextField MalP;
    public static javax.swing.JTextField MalQ;
    public static javax.swing.JTextField OraP;
    public static javax.swing.JTextField OraQ;
    public static javax.swing.JTextField SugP;
    public static javax.swing.JTextField SugQ;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
