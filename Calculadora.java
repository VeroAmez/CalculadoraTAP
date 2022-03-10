import javax.swing.*;
import java.awt.event.*;//paquete para controlar los eventos
import java.awt.*;
import java.awt.Color;

public class Calculadora extends JFrame {
  JLabel Letrero;//Reserva el espacio en memoria
  JButton btn0, btnPunto, btnIgual, btn1, btn2, btn3, btn4, btn5, 
  btn6, btn7, btn8, btn9, btnDiv, btnSuma, btnResta, btnMult, btnCE,
  btnA1, btnA2, btnA3;
  JTextField txtCalculadora;
  JPanel panel, panelBtn;
  private Object objTextField;
  String operacion;
  float ope1, ope2;
  public Calculadora()
  {
   initComponents();
   setLocationRelativeTo(null);
 
  }
  
  private void initComponents()
  {
    setSize(400, 450);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    txtCalculadora = new JTextField(30);//instanciación del objeto
      
    Letrero = new JLabel("Calculadora");
    txtCalculadora.setFont(new Font("arial", 0,50));
    txtCalculadora.setBorder(javax.swing.BorderFactory.createEmptyBorder());
    btnA1 = new JButton();
    btnA2 = new JButton();
    btnA3 = new JButton();
    btn0 = new JButton("0");
    btn1 = new JButton("1");
    btn2 = new JButton("2");
    btn3 = new JButton("3");
    btn4 = new JButton("4");
    btn5 = new JButton("5");
    btn6 = new JButton("6");
    btn7 = new JButton("7");
    btn8 = new JButton("8");
    btn9 = new JButton("9");
    btnPunto = new JButton(".");
    btnSuma = new JButton("+");
    btnResta = new JButton("-");
    btnDiv = new JButton("/");
    btnMult = new JButton("*");
    btnIgual = new JButton("=");
    btnCE = new JButton("CE");
    
    btnA1.setContentAreaFilled(false);
    btnA1.setBorder(null);
    
    btnA2.setContentAreaFilled(false);
    btnA2.setBorder(null);
    
    btnA3.setContentAreaFilled(false);
    btnA3.setBorder(null);
    
    btnCE.setBackground(Color.RED);
    btnCE.setFont(new Font("arial", 0,20));
    txtCalculadora.setBackground(null);
    btn0.setBorder(null);
    btn0.setFont(new Font("arial", 0,20));
    btn0.setBackground(Color.WHITE);
    btn1.setBorder(null);
    btn1.setBackground(Color.WHITE);
    btn1.setFont(new Font("arial", 0,20));
    btn2.setBorder(null);
    btn2.setBackground(Color.WHITE);
    btn2.setFont(new Font("arial", 0,20));
    btn3.setBorder(null);
    btn3.setBackground(Color.WHITE);
    btn3.setFont(new Font("arial", 0,20));
    btn4.setBorder(null);
    btn4.setBackground(Color.WHITE);
    btn4.setFont(new Font("arial", 0,20));
    btn5.setBorder(null);
    btn5.setBackground(Color.WHITE);
    btn5.setFont(new Font("arial", 0,20));
    btn6.setBorder(null);
    btn6.setBackground(Color.WHITE);
    btn6.setFont(new Font("arial", 0,20));
    btn7.setBorder(null);
    btn7.setBackground(Color.WHITE);
    btn7.setFont(new Font("arial", 0,20));
    btn8.setFont(new Font("arial", 0,20));
    btn8.setBorder(null);
    btn8.setBackground(Color.WHITE);
    btn9.setBorder(null);
    btn9.setBackground(Color.WHITE);
    btn9.setFont(new Font("arial", 0,20));
    btnDiv.setBorder(null);
    btnDiv.setBackground(Color.green);
    btnDiv.setFont(new Font("arial", 0,20));
    btnMult.setBorder(null);
    btnMult.setBackground(Color.green);
    btnMult.setFont(new Font("arial", 0,20));
    btnSuma.setBorder(null);
    btnSuma.setBackground(Color.green);
    btnSuma.setFont(new Font("arial", 0,20));
    btnResta.setBorder(null);
    btnResta.setBackground(Color.green);
    btnResta.setFont(new Font("arial", 0,20));
    btnCE.setBorder(null);
    btnPunto.setBorder(null);
    btnPunto.setBackground(Color.green);
    btnPunto.setFont(new Font("arial", 0,20));
    btnIgual.setBorder(null);
    btnIgual.setBackground(Color.green);
    btnIgual.setFont(new Font("arial", 0,20));
    //btnSalir.addMouseListener(new MyListener());
    
    
    panel = new JPanel();
    panel.setBackground(Color.cyan);
    panel.setLayout(new BorderLayout());
    panel.add("North", txtCalculadora);
    txtCalculadora.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    txtCalculadora.setEditable(false);
    panelBtn = new JPanel();
    panelBtn.setBackground(Color.cyan);
    panelBtn.setLayout(new GridLayout(5,4,10,10));
    panel.add("Center", panelBtn);
    getContentPane().add(panel);
    
    //Quintos
    panelBtn.add(btnCE);
    btnCE.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent evt) {
    btnCEActionPerformed(evt);
    }
    }); 

    panelBtn.add(btnA1);
    panelBtn.add(btnA2);
    panelBtn.add(btnA3);
    
    //Cuartos
    panelBtn.add(btn7);
    btn7.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent evt) {
    btn7ActionPerformed(evt);
    }
    }); 
    
    panelBtn.add(btn8);
    btn8.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent evt) {
    btn8ActionPerformed(evt);
    }
    }); 
    
    panelBtn.add(btn9);
    btn9.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent evt) {
    btn9ActionPerformed(evt);
    }
    });
    
    panelBtn.add(btnDiv);
    btnDiv.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent evt) {
    btnDivActionPerformed(evt);
    }
    });     
    
    //Terceros 
    panelBtn.add(btn4);
    btn4.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent evt) {
    btn4ActionPerformed(evt);
    }
    });
    
    panelBtn.add(btn5);
    btn5.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent evt) {
    btn5ActionPerformed(evt);
    }
    });
    
    panelBtn.add(btn6);
    btn6.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent evt) {
    btn6ActionPerformed(evt);
    }
    });
    
    panelBtn.add(btnMult);
    btnMult.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent evt) {
    btnMultActionPerformed(evt);
    }
    }); 

    
    //Segundos
    panelBtn.add(btn1);
    btn1.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent evt) {
    btn1ActionPerformed(evt);
    }
    });
    
    panelBtn.add(btn2);
    btn2.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent evt) {
    btn2ActionPerformed(evt);
    }
    });
    
    panelBtn.add(btn3);
    btn3.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent evt) {
    btn3ActionPerformed(evt);
    }
    });
    
    panelBtn.add(btnResta);
    btnResta.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent evt) {
    btnRestaActionPerformed(evt);
    }
    }); 

    
    //Primeros
    
    panelBtn.add(btn0);
    btn0.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent evt) {
    btn0ActionPerformed(evt);
    }
    });
    
    panelBtn.add(btnPunto);
    btnPunto.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent evt) {
    btnPuntoActionPerformed(evt);
    }
    }); 

    panelBtn.add(btnIgual);
    btnIgual.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent evt) {
    btnIgualActionPerformed(evt);
    }
    }); 

    panelBtn.add(btnSuma);
    btnSuma.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent evt) {
    btnSumaActionPerformed(evt);
    }
    }); 
    
    setTitle("Calculadora");
    setContentPane(panel);
    setVisible(true);
   
   }
   private void btn0ActionPerformed(ActionEvent evt) {
      txtCalculadora.setText(this.txtCalculadora.getText() + "0");
   }
   private void btn1ActionPerformed(ActionEvent evt) {
      txtCalculadora.setText(this.txtCalculadora.getText() + "1");
   }
   private void btn2ActionPerformed(ActionEvent evt) {
      txtCalculadora.setText(this.txtCalculadora.getText() + "2");
   }
   private void btn3ActionPerformed(ActionEvent evt) {
      txtCalculadora.setText(this.txtCalculadora.getText() + "3");
   }
   private void btn4ActionPerformed(ActionEvent evt) {
      txtCalculadora.setText(this.txtCalculadora.getText() + "4");
   }
   private void btn5ActionPerformed(ActionEvent evt) {
      txtCalculadora.setText(this.txtCalculadora.getText() + "5");
   }
   private void btn6ActionPerformed(ActionEvent evt) {
      txtCalculadora.setText(this.txtCalculadora.getText() + "6");
   }
   private void btn7ActionPerformed(ActionEvent evt) {
      txtCalculadora.setText(this.txtCalculadora.getText() + "7");
   }
   private void btn8ActionPerformed(ActionEvent evt) {
      txtCalculadora.setText(this.txtCalculadora.getText() + "8");
   }
   private void btn9ActionPerformed(ActionEvent evt) {
      txtCalculadora.setText(this.txtCalculadora.getText() + "9");
   }
   
   private void btnSumaActionPerformed(ActionEvent evt) {
      VerificadorOpe1(this.ope1);
      this.operacion = "suma";
      this.txtCalculadora.setText("");
   }
   
   private void btnRestaActionPerformed(ActionEvent evt) {
      VerificadorOpe1(this.ope1);
      this.operacion = "resta";
      this.txtCalculadora.setText("");
   }
   
   private void btnMultActionPerformed(ActionEvent evt) {
      VerificadorOpe1(this.ope1);
      this.operacion = "multiplicacion";
      this.txtCalculadora.setText("");
   }
   
   private void btnDivActionPerformed(ActionEvent evt) {
      VerificadorOpe1(this.ope1);
      this.operacion = "division";
      this.txtCalculadora.setText("");
   }
   
   private void btnCEActionPerformed(ActionEvent evt) {
      ope1 = 0;
      ope2 = 0;
      operacion = "";
      this.txtCalculadora.setText("");
   }
   
   private void btnPuntoActionPerformed(ActionEvent evt) {
      if(!this.txtCalculadora.getText().contains(".")){
            txtCalculadora.setText(this.txtCalculadora.getText()+"."); 
        }

   }
   
   private void btnIgualActionPerformed(ActionEvent evt) {
      VerificadorOpe2(this.ope2);
      if (operacion != null) {
      switch(operacion) {
         case "division":
            if(this.ope1 == 0 || this.ope2 == 0) {
               this.txtCalculadora.setText("Indefinido");
            } else {
               this.txtCalculadora.setText(Cambio(this.ope1 / this.ope2));
            }
            break;
         case "multiplicacion": 
            this.txtCalculadora.setText(Cambio(this.ope1 * this.ope2));
            break;
         case "resta":
            this.txtCalculadora.setText(Cambio(this.ope1 - this.ope2));
            break;
         case "suma":
            this.txtCalculadora.setText(Cambio(this.ope1 + this.ope2));
            break;
      }
      } else {
         
      }
   }
   
   public double VerificadorOpe1(float ope1) {
      try {
         this.ope1 = Float.parseFloat(this.txtCalculadora.getText());
      } catch (Exception e) {
         this.ope1 = 0;
      }
      return this.ope1;
   }
   
   public double VerificadorOpe2(float ope2) {
      try {
         this.ope2 = Float.parseFloat(this.txtCalculadora.getText());
      } catch (Exception e) {
         this.ope2 = 0;
      }
      return this.ope2;
   }
   
   public String Cambio(float aux) {
      String resultado = "";
      resultado = Float.toString(aux);
      if (aux % 1 == 0){
            resultado = resultado.substring(0, resultado.length()-2);
        }
      return resultado;
   }
   
   
}