 
// import javax.swing.*;
// import java.awt.event.*;

// /**
//  * @author aryan
//  */
// public class Calculator implements ActionListener {

//     JTextField t1, t2, t3;
//     JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bAdd, bSub, bMul, bDiv, bLog, bSin, bCos, bTan, bClear, bBack, bDot;
//     JButton bXp2, bXpy, bXp3, bInverse, bFact, bEpower, bOn, bOff, bAS, broot, bSinh, bTanh, bCosh;
//     JButton bp, bequal;

//     JLabel l1;

//     Calculator() {
//         JFrame f = new JFrame("SCIENCETIFIC CALCULATOR");

//         t1 = new JTextField();
//         t1.setBounds(40, 50, 350, 50);
//         //Fist Row in calculator

//         broot = new JButton("r");
//         broot.setBounds(50, 200, 60, 50);
//         bEpower = new JButton("e^x");
//         bEpower.setBounds(115, 200, 60, 50);
//         bSin = new JButton("Sin");
//         bSin.setBounds(180, 200, 60, 50);
//         bCos = new JButton("Cos");
//         bCos.setBounds(245, 200, 60, 50);
//         bTan = new JButton("Tan");
//         bTan.setBounds(310, 200, 60, 50);

//         //Second row//
//         bInverse=new JButton("1/x");
//         bInverse.setBounds(50, 220, 60, 50);
//         bLog=new JButton("Log");
//         bLog.setBounds(115, 220, 60, 50);
//         bSinh = new JButton("Sinh");
//         bSinh.setBounds(180, 220, 60, 50);
//         bCosh = new JButton("Cosh");
//         bCosh.setBounds(245, 220, 60, 50);
//         bTanh = new JButton("Tanh");
//         bTanh.setBounds(310, 220, 60, 50);
        
        
        
//         //3rd Row in calculator

//         bXpy = new JButton("x^y");
//         bXpy.setBounds(50, 240, 60, 50);
//         bp = new JButton("%");
//         bp.setBounds(115, 240, 60, 50);
//         bClear = new JButton("C");
//         bClear.setBounds(180, 240, 60, 50);
//         bBack = new JButton("B");
//         bBack.setBounds(245, 240, 60, 50);
//         bAdd = new JButton("+");
//         bAdd.setBounds(310, 240, 60, 50);

//         //4th row//
//         bXp3=new JButton("x^3");
//         bXp3.setBounds(50, 260, 60, 50);
//         b7=new JButton("7");
//         b7.setBounds(115, 260, 60, 50);
//         b8 = new JButton("8");
//         b8.setBounds(180, 260, 60, 50);
//         b9 = new JButton("9");
//         b9.setBounds(245, 260, 60, 50);
//         bSub = new JButton("-");
//         bSub.setBounds(310, 260, 60, 50);
        
        
        
        
//         //5th Row in calculator

//         bXp2 = new JButton("x^2");
//         bXp2.setBounds(50, 280, 60, 50);
//         b4 = new JButton("4");
//         b4.setBounds(115, 280, 60, 50);
//         b5 = new JButton("5");
//         b5.setBounds(180, 280, 60, 50);
//         b6 = new JButton("6");
//         b6.setBounds(245, 280, 60, 50);
//         bMul = new JButton("*");
//         bMul.setBounds(310, 280, 60, 50);

//         //6th row//
//         bFact=new JButton("n!");
//         bFact.setBounds(50,300, 60, 50);
//         b1=new JButton("1");
//         b1.setBounds(115, 300, 60, 50);
//         b2 = new JButton("2");
//         b2.setBounds(180, 300, 60, 50);
//         b3 = new JButton("3");
//         b3.setBounds(245, 300, 60, 50);
//         bDiv = new JButton("/");
//         bDiv.setBounds(310, 300, 60, 50);
        
//          //7th row//
//         bAS=new JButton("+/-");
//         bAS.setBounds(50, 320, 60, 50);
//         b0=new JButton("0");
//         b0.setBounds(115, 320, 60, 50);
//         bDot = new JButton(".");
//         bDot.setBounds(180, 320, 60, 50);
//         bequal = new JButton("=");
//         bequal.setBounds(245, 320, 60, 50);
         
        
        
//         //Action Listener 1st row//
//         b1.addActionListener(this);
//         b2.addActionListener(this);
//         broot.addActionListener(this);
//         bEpower.addActionListener(this);
//         bSin.addActionListener(this);
//         bCos.addActionListener(this);
//         bTan.addActionListener(this);
        
//          //Action Listener 2nd row//
//         bInverse.addActionListener(this);
//         bLog.addActionListener(this);
//         bSinh.addActionListener(this);
//         bCosh.addActionListener(this);
//         bTanh.addActionListener(this);
        
         
//         //Action Listener 3rd row//
//         bXpy.addActionListener(this);
//         bp.addActionListener(this);
//         bClear.addActionListener(this);
//         bBack.addActionListener(this);
//         bAdd.addActionListener(this);
        
        
//         //Action Listener 4th row//
//         bXp3.addActionListener(this);
//         b7.addActionListener(this);
//         b8.addActionListener(this);
//         b9.addActionListener(this);
//         bSub.addActionListener(this);
        
        
//         //Action Listener 5th row//
//         bXp2.addActionListener(this);
//         b4.addActionListener(this);
//         b5.addActionListener(this);
//         b6.addActionListener(this);
//         bMul.addActionListener(this);
        
        
//         //Action Listener 6th row//
//         bFact.addActionListener(this);
//         b1.addActionListener(this);
//         b2.addActionListener(this);
//         b3.addActionListener(this);
//         bDiv.addActionListener(this);
        
//         //Action Listener 7th row//
//         bAS.addActionListener(this);
//         b0.addActionListener(this);
//         bDot.addActionListener(this);
//         bequal.addActionListener(this);
        
        
//         //Add
//         f.add(t1);
//         f.add(b0);
//         f.add(b1);
//         f.add(b2);
//         f.add(b3);
//         f.add(b4);
//         f.add(b5);
//         f.add(b6);
//         f.add(b7);
//         f.add(b8);
//         f.add(b9);
//         f.add(bDot);
//         f.add(bAdd);
//         f.add(bSub);
//         f.add(bMul);
//         f.add(bDiv);
//         f.add(bClear);
//         f.add(bBack);
//         f.add(bSin);
//         f.add(bCos);
//         f.add(bTan);
//         f.add(bSinh);
//         f.add(bCosh);
//         f.add(bTanh);
//         f.add(bXp2);
//         f.add(bXp3);
//         f.add(bXpy);
//         f.add(bFact);
//         f.add(bLog);
//         f.add(bEpower);
//         f.add(bOn);
//         f.add(bOff);
//         f.add(bInverse);
//         f.add(bequal);
//         f.add(bAS);
//         f.add(bp);
//         f.add(broot);
//         f.setSize(650, 950);
//         f.setLayout(null);
//         f.setVisible(true);
//     }

//     /**
//      *
//      * @param e
//      */
    
//     public void actionPerformed(ActionEvent e) {
//         String s1 = t1.getText();

//         int a = Integer.parseInt(s1);
//         int b = Integer.parseInt(s1);
//         int c = 0;
// //        if (e.getSource() == b1) {
// //            c = a + b;
// //        } else if (e.getSource() == b2) {
// //            c = a - b;
// //        }
// //        String result = String.valueOf(c);
// //        t1.setText(result);
//     }

//     /**
//      * @param args the command line arguments
//      */
//     public static void main(String[] args) {
//         // Constuctors here??
//         new Calculator();

//     }

// }
