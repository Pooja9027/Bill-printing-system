import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class restaurant{
    public static void main(String[] args) {
        JFrame f1 = new JFrame();

        //*************************  RESTAURANT  *********************************

        JLabel l1 = new JLabel("ROYAL RESTAURANT",SwingConstants.CENTER);
        l1.setBounds(0,0,1600,80);
        l1.setBackground(Color.DARK_GRAY);
        l1.setForeground(Color.white);
        l1.setFont(new Font("MV Boli",Font.PLAIN,70));
        l1.setOpaque(true);

        //****************************** DAY TIME DATE  ***************************************************

        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatterObj = DateTimeFormatter.ofPattern("E , dd-MM-yy , HH:mm:ss");
        String formattedDate = myDateObj.format(myFormatterObj);

        //*******************************  DAY TIME DATE  **************************************************

        JLabel l2 = new JLabel(formattedDate,SwingConstants.CENTER);
        l2.setBounds(0,80,1600,40);
        l2.setBackground(Color.pink);
        l2.setForeground(Color.white);
        l2.setFont(new Font("MV Boli",Font.PLAIN,45));
        l2.setOpaque(true);

        //***********************************  CHAI  ***********************************************

        JLabel l3 = new JLabel("CHAI",SwingConstants.CENTER);
        l3.setBounds(40,140,160,40);
        l3.setBackground(Color.gray);
        l3.setForeground(Color.white);
        l3.setFont(new Font("MV Boli",Font.PLAIN,22));
        l3.setOpaque(true);

        JTextField e3 = new JTextField();
        e3.setBounds(220,140,160,40);
        e3.setBackground(Color.white);
        e3.setForeground(Color.black);
        e3.setFont(new Font("MV Boli",Font.PLAIN,22));
        e3.setOpaque(true);
        e3.setText("0");

        //*******************************  DRINKS  ******************************************************

        JLabel l4 = new JLabel("DRINKS",SwingConstants.CENTER);
        l4.setBounds(40,200,160,40);
        l4.setBackground(Color.gray);
        l4.setForeground(Color.white);
        l4.setFont(new Font("MV Boli",Font.PLAIN,22));
        l4.setOpaque(true);

        JTextField e4 = new JTextField();
        e4.setBounds(220,200,160,40);
        e4.setBackground(Color.white);
        e4.setForeground(Color.black);
        e4.setFont(new Font("MV Boli",Font.PLAIN,22));
        e4.setOpaque(true);
        e4.setText("0");

        //*******************************  ICE CREAM  ******************************************************

        JLabel l5 = new JLabel("ICE CREAM",SwingConstants.CENTER);
        l5.setBounds(40,260,160,40);
        l5.setBackground(Color.gray);
        l5.setForeground(Color.white);
        l5.setFont(new Font("MV Boli",Font.PLAIN,22));
        l5.setOpaque(true);

        JTextField e5 = new JTextField();
        e5.setBounds(220,260,160,40);
        e5.setBackground(Color.white);
        e5.setForeground(Color.black);
        e5.setFont(new Font("MV Boli",Font.PLAIN,22));
        e5.setOpaque(true);
        e5.setText("0");
        //***********************************  IDLY  ***********************************************

        JLabel l6 = new JLabel("IDLY",SwingConstants.CENTER);
        l6.setBounds(40,320,160,40);
        l6.setBackground(Color.gray);
        l6.setForeground(Color.white);
        l6.setFont(new Font("MV Boli",Font.PLAIN,22));
        l6.setOpaque(true);

        JTextField e6 = new JTextField();
        e6.setBounds(220,320,160,40);
        e6.setBackground(Color.white);
        e6.setForeground(Color.black);
        e6.setFont(new Font("MV Boli",Font.PLAIN,22));
        e6.setOpaque(true);
        e6.setText("0");

        //*******************************  DOSA  ******************************************************

        JLabel l7 = new JLabel("DOSA",SwingConstants.CENTER);
        l7.setBounds(40,380,160,40);
        l7.setBackground(Color.gray);
        l7.setForeground(Color.white);
        l7.setFont(new Font("MV Boli",Font.PLAIN,22));
        l7.setOpaque(true);

        JTextField e7 = new JTextField();
        e7.setBounds(220,380,160,40);
        e7.setBackground(Color.white);
        e7.setForeground(Color.black);
        e7.setFont(new Font("MV Boli",Font.PLAIN,22));
        e7.setOpaque(true);
        e7.setText("0");

        //*******************************  PASTA  ******************************************************

        JLabel l8 = new JLabel("PASTA",SwingConstants.CENTER);
        l8.setBounds(40,440,160,40);
        l8.setBackground(Color.gray);
        l8.setForeground(Color.white);
        l8.setFont(new Font("MV Boli",Font.PLAIN,22));
        l8.setOpaque(true);

        JTextField e8 = new JTextField();
        e8.setBounds(220,440,160,40);
        e8.setBackground(Color.white);
        e8.setForeground(Color.black);
        e8.setFont(new Font("MV Boli",Font.PLAIN,22));
        e8.setOpaque(true);
        e8.setText("0");
        //***********************************  REFERENCE  ***********************************************

        JLabel l9 = new JLabel("REFERENCE",SwingConstants.CENTER);
        l9.setBounds(420,140,180,40);
        l9.setBackground(Color.gray);
        l9.setForeground(Color.white);
        l9.setFont(new Font("MV Boli",Font.PLAIN,22));
        l9.setOpaque(true);

        JTextField e9 = new JTextField();
        e9.setBounds(620,140,180,40);
        e9.setBackground(Color.white);
        e9.setForeground(Color.black);
        e9.setFont(new Font("MV Boli",Font.PLAIN,22));
        e9.setOpaque(true);
        //e9.setText("0");

        //*******************************  COST OF MEAL  ******************************************************

        JLabel l10 = new JLabel("COST OF MEAL",SwingConstants.CENTER);
        l10.setBounds(420,200,180,40);
        l10.setBackground(Color.gray);
        l10.setForeground(Color.white);
        l10.setFont(new Font("MV Boli",Font.PLAIN,22));
        l10.setOpaque(true);

        JTextField e10 = new JTextField();
        e10.setBounds(620,200,180,40);
        e10.setBackground(Color.white);
        e10.setForeground(Color.black);
        e10.setFont(new Font("MV Boli",Font.PLAIN,22));
        e10.setOpaque(true);
        //e10.setText("0");

        //*******************************  SGST  ******************************************************

        JLabel l11 = new JLabel("SGST",SwingConstants.CENTER);
        l11.setBounds(420,260,180,40);
        l11.setBackground(Color.gray);
        l11.setForeground(Color.white);
        l11.setFont(new Font("MV Boli",Font.PLAIN,22));
        l11.setOpaque(true);

        JTextField e11 = new JTextField();
        e11.setBounds(620,260,180,40);
        e11.setBackground(Color.white);
        e11.setForeground(Color.black);
        e11.setFont(new Font("MV Boli",Font.PLAIN,22));
        e11.setOpaque(true);
        //  e11.setText("0");

        //***********************************  CGST  ***********************************************

        JLabel l12 = new JLabel("CGST",SwingConstants.CENTER);
        l12.setBounds(420,320,180,40);
        l12.setBackground(Color.gray);
        l12.setForeground(Color.white);
        l12.setFont(new Font("MV Boli",Font.PLAIN,22));
        l12.setOpaque(true);

        JTextField e12 = new JTextField();
        e12.setBounds(620,320,180,40);
        e12.setBackground(Color.white);
        e12.setForeground(Color.black);
        e12.setFont(new Font("MV Boli",Font.PLAIN,22));
        e12.setOpaque(true);
        // e12.setText("0");

        //*******************************  TOTAL COST  ******************************************************

        JLabel l13 = new JLabel("TOTAL COST",SwingConstants.CENTER);
        l13.setBounds(420,380,180,40);
        l13.setBackground(Color.gray);
        l13.setForeground(Color.white);
        l13.setFont(new Font("MV Boli",Font.PLAIN,22));
        l13.setOpaque(true);

        JTextField e13 = new JTextField();
        e13.setBounds(620,380,180,40);
        e13.setBackground(Color.white);
        e13.setForeground(Color.black);
        e13.setFont(new Font("MV Boli",Font.PLAIN,22));
        e13.setOpaque(true);
        // e13.setText("0");

        //*******************************  TOTAL  ******************************************************

        JButton b1 = new JButton("TOTAL");
        b1.setBounds(120,520,180,50);
        b1.setBackground(Color.darkGray);
        b1.setForeground(Color.white);
        b1.setFont(new Font("MV Boli",Font.PLAIN,35));
        b1.setOpaque(true);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Random random =new Random();
                int x = random.nextInt(1000,9000);
                String x1 = Integer.toString(x);
                e9.setText(x1);

                String q3 = e3.getText();
                String q4 = e4.getText();
                String q5 = e5.getText();
                String q6 = e6.getText();
                String q7 = e7.getText();
                String q8 = e8.getText();

                int CHAI = 10 * (Integer.valueOf(q3));
                int DRINKS = 30 * (Integer.valueOf(q4));
                int ICECREAM = 40 * (Integer.valueOf(q5));
                int IDLY = 50 * (Integer.valueOf(q6));
                int DOSA = 120 * (Integer.valueOf(q7));
                int PASTA = 70 * (Integer.valueOf(q8));

                int TOTAL = CHAI + DRINKS + ICECREAM + IDLY + DOSA + PASTA;
                System.out.println(TOTAL);
                String q10 = Integer.toString(TOTAL);
                e10.setText(q10);

                int SGST =  (TOTAL*2)/100;
                String q11 = Integer.toString(SGST);
                e11.setText(q11);

                int CGST =  (TOTAL*2)/100;
                String q12 = Integer.toString(CGST);
                e12.setText(q12);

                int TOTAL_COST = TOTAL+SGST+CGST;
                String q13 = Integer.toString(TOTAL_COST);
                e13.setText(q13);


            }
        });

        //*******************************  RESET  ******************************************************

        JButton b2 = new JButton("RESET");
        b2.setBounds(340,520,180,50);
        b2.setBackground(Color.darkGray);
        b2.setForeground(Color.white);
        b2.setFont(new Font("MV Boli",Font.PLAIN,35));
        b2.setOpaque(true);

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                e3.setText("0");
                e4.setText("0");
                e5.setText("0");
                e6.setText("0");
                e7.setText("0");
                e8.setText("0");
                e9.setText("");
                e10.setText("");
                e11.setText("");
                e12.setText("");
                e13.setText("");

            }});

        //*******************************  EXIT  ******************************************************

        JButton b3 = new JButton("EXIT");
        b3.setBounds(560,520,180,50);
        b3.setBackground(Color.darkGray);
        b3.setForeground(Color.white);
        b3.setFont(new Font("MV Boli",Font.PLAIN,35));
        b3.setOpaque(true);

        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f1.dispose();
            }
        });

//*********************************  BILL RECEIPT  ********************************************************

        JLabel l14 = new JLabel("BILL RECEIPT",SwingConstants.CENTER);
        l14.setBounds(870,140,530,50);
        l14.setBackground(Color.gray);
        l14.setForeground(Color.white);
        l14.setFont(new Font("MV Boli",Font.PLAIN,35));
        l14.setOpaque(true);

        JTextArea ta = new JTextArea();
        ta.setBounds(870,190,500,450);
        ta.setFont(new Font("MV Boli",Font.PLAIN,18));
        f1.add(ta);
  //******************* print slip *****************************************

        JButton b4 = new JButton("PRINT SLIP");
        b4.setBounds(1000,650,250,50);
        b4.setBackground(Color.darkGray);
        b4.setForeground(Color.white);
        b4.setFont(new Font("MV Boli",Font.PLAIN,35));
        b4.setOpaque(true);

        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String g1 = l2.getText();
                String g7 = e3.getText();
                String g8 = e4.getText();
                String g9 = e5.getText();
                String g10 = e6.getText();
                String g11= e7.getText();
                String g12= e8.getText();
                String g2 = e9.getText();
                String g3 = e10.getText();
                String g4 = e11.getText();
                String g5 = e12.getText();
                String g6 = e13.getText();
                ta.setText("  ROYAL RESTAURANT,ROORKEE,HARIDWAR"+"\n"+"        UTTRAKHAND,PIN NO.-247667"+"\n"+"DATE AND TIME = "+g1+"\n"+
                                "     REFERENCE = "+g2+"\n"+" CHAI = "+g7+"\n"+" DRINKS = "+g8+"\n" +" ICECREAM = "+g9+"\n" +" IDLY= "+g10+"\n"+ "PASTA ="+g11+"\n" +"DOSA = "+g11+"\n"+ "COST OF MEAL = "+g3+"\n"+"           SGST = "+g4+"\n"+"           CGST = "+g5+
                        "\n"+"   TOTAL COST = "+g6+"\n "+ "THANKS FOR VISITING OUR RESTAURANT......");
            }
        });

//*****************************  FOR BACKGROUND IMAGE**********************************************

        ImageIcon background_image = new ImageIcon("C:\\Users\\ajeet\\Downloads\\bg.jpg");
        Image img = background_image.getImage();
        Image temp_img = img.getScaledInstance(1600,820,Image.SCALE_SMOOTH);
        background_image = new ImageIcon(temp_img);
        JLabel background = new JLabel("",background_image,JLabel.CENTER);
        background.setBounds(0,0,1600,820);
        background.setVisible(true);
        f1.add(background);

        //***********************  ADDING OF ALL BUTTONS AND LABEL **************************************
        JButton B = new JButton("RECORD");
        B.setBounds(340,600,180,50);
        B.setBackground(Color.darkGray);
        B.setForeground(Color.white);
        B.setFont(new Font("MV Boli",Font.PLAIN,35));
        B.setOpaque(true);

        B.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Mystore","root","");
                    Statement stmt = ((Connection) con).createStatement();
                    String sql =" CREATE TABLE IF NOT EXISTS RESTAURANT"+
                            "(CHAI VARCHAR(255),"+
                            "(DRINKS VARCHAR(255),"+
                            "(ICECREAM VARCHAR(255),"+
                            "(IDLY VARCHAR(255),"+
                            "(DOSA VARCHAR(255),"+
                            "(PASTA VARCHAR(255),";
                    stmt.executeUpdate(sql);
                    String g1 = l2.getText();
                    String g7 = e3.getText();
                    String g8 = e4.getText();
                    String g9 = e5.getText();
                    String g10 = e6.getText();
                    String g11= e7.getText();
                    String g12= e8.getText();
                    String g2 = e9.getText();
                    String g3 = e10.getText();
                    String g4 = e11.getText();
                    String g5 = e12.getText();
                    String g6 = e13.getText();
                    String sql1 ="INSERT INTO Restaurant VALUES('"+g1+"','"+g2+"','"+g3+"','"+g4+"','"+g5+"','"+g6+"'," +
                            "'"+g7+"','"+g8+"','"+g9+"','"+g10+"','"+g11+"','"+g12+"')";
                    stmt.executeUpdate(sql1);

                }catch(Exception ee){}
            }
        });
        background.add(l1);
        background.add(l2);
        background.add(l3);
        background.add(l4);
        background.add(l5);
        background.add(l6);
        background.add(l7);
        background.add(l8);
        background.add(l9);
        background.add(l10);
        background.add(l11);
        background.add(l12);
        background.add(l13);
        background.add(l14);
        background.add(e3);
        background.add(e4);
        background.add(e5);
        background.add(e6);
        background.add(e7);
        background.add(e8);
        background.add(e9);
        background.add(e10);
        background.add(e11);
        background.add(e12);
        background.add(e13);
        background.add(b1);
        background.add(b2);
        background.add(b3);
        background.add(b4);
        background.add(B);

        f1.setSize(1600,860);
        f1.setBackground(Color.BLACK);
        f1.setLayout(null);
        f1.setVisible(true);
    }
}


