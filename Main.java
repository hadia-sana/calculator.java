import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static JFrame frame;
    static JButton []scientificbtn;
    static JButton []numbarray;
    static JButton addbtn;
    static JButton subbtn;
    static JButton []inv;
    static JButton multbtn;
    static JButton divbtn;
    static JButton decbtn;
    static JButton equbtn;
    static JPanel p1;
    static JPanel p2;
    static JPanel p3;
    static JPanel p4;

    static JTextField txt;
    static JButton dlt;
    static JButton clr;
    static Double numb1=0.0,numb2=0.0;
    static char operator=' ';
    static int txtlen=0;
    static String fun=" ";

static Double res=0.0;
    public static void main(String[]args){
        ImageIcon im=new ImageIcon("img.png");

         frame=new JFrame("calculator");
        frame.setBounds(200,100,450,600);
       // frame.setBackground(Color.cyan);
        frame.setLayout(null);
        frame.setIconImage(im.getImage());
        frame.setVisible(true);
        Font myfont=new Font("myfont",Font.BOLD,30);
         txt=new JTextField();
        txt.setBounds(22,20,400,50);
        txt.setLayout(null);
        txt.setVisible(true);
        scientificbtn=new JButton[9];
        scientificbtn[0]=new JButton("sin");
        scientificbtn[1]=new JButton("cosin");
        scientificbtn[2]=new JButton("tan");
        scientificbtn[3]=new JButton("ln");
        scientificbtn[4]=new JButton("log");
        scientificbtn[5]=new JButton("^");
        scientificbtn[6]=new JButton("%");
        scientificbtn[7]=new JButton("\u221A");
        scientificbtn[8]=new JButton("\u221B");

      scientificbtn[0].addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
              txt.setText(txt.getText()+"sin");
              fun="sin";
              txtlen=txt.getText().length();
          }
      });
        scientificbtn[1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.setText(txt.getText()+"cosin");
                fun="cosin";
                txtlen=txt.getText().length();

            }
        });
        scientificbtn[2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.setText(txt.getText()+"tan");
                fun="tan";
                txtlen=txt.getText().length();
            }
        });
        scientificbtn[3].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.setText(txt.getText()+"ln");
                fun="ln";
                txtlen=txt.getText().length();
            }
        });
        scientificbtn[4].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.setText(txt.getText()+"log");
                fun="log";
                txtlen=txt.getText().length();
            }
        });
        scientificbtn[5].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numb1=Double.parseDouble(txt.getText());
                txt.setText(txt.getText()+"^");
                operator='^';
                txtlen=txt.getText().length();
            }
        });
        scientificbtn[6].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numb1=Double.parseDouble(txt.getText());
                txt.setText(txt.getText()+"%");
                operator='%';
                txtlen=txt.getText().length();
            }
        });
        scientificbtn[7].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.setText(txt.getText()+"\u221A");
                fun="\u221A";
                txtlen=txt.getText().length();
            }
        });
        scientificbtn[8].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.setText(txt.getText()+"\u221B");
                fun="\u221B";
                txtlen=txt.getText().length();
            }
        });


        for(int i=0;i<9;i++){
           // scientificbtn[i].setText("sin");
            scientificbtn[i].setFont(myfont);
            scientificbtn[i].setForeground(Color.BLACK);
            scientificbtn[i].setBackground(Color.lightGray);
            scientificbtn[i].setVisible(true);
        }

        p1=new JPanel();
        p1.setBounds(22,100,390,100);
        p1.setVisible(true);
        p1.setLayout(new GridLayout(3,3));
        for(int i=0;i<9;i++){
            p1.add(scientificbtn[i]);
        }
        numbarray=new JButton[10];
        for(int i=0;i<10;i++){
            numbarray[i]=new JButton(String.valueOf(i));
            numbarray[i].setFont(myfont);
            numbarray[i].setForeground(Color.BLACK);
            numbarray[i].setBackground(Color.lightGray);
            numbarray[i].setVisible(true);
        }
        for(int i=0;i<10;i++){
            int finali=i;
            numbarray[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    txt.setText(txt.getText()+numbarray[finali].getText());
                }
            });
        }
        addbtn=new JButton("+");
        subbtn=new JButton("-");
        multbtn=new JButton("*");
        divbtn=new JButton("/");
        decbtn=new JButton(".");
        equbtn=new JButton("=");
        //********************************************
        addbtn.setFont(myfont);
        addbtn.setForeground(Color.BLACK);
        addbtn.setBackground(Color.lightGray);
        addbtn.setVisible(true);
        subbtn.setFont(myfont);
        subbtn.setForeground(Color.BLACK);
        subbtn.setBackground(Color.lightGray);
        subbtn.setVisible(true);
        multbtn.setFont(myfont);
        multbtn.setForeground(Color.BLACK);
        multbtn.setBackground(Color.lightGray);
        multbtn.setVisible(true);
        divbtn.setFont(myfont);
        divbtn.setForeground(Color.BLACK);
        divbtn.setBackground(Color.lightGray);
        divbtn.setVisible(true);
        decbtn.setFont(myfont);
        decbtn.setForeground(Color.BLACK);
        decbtn.setBackground(Color.lightGray);
        decbtn.setVisible(true);
        equbtn.setFont(myfont);
        equbtn.setForeground(Color.BLACK);
        equbtn.setBackground(Color.lightGray);
        equbtn.setVisible(true);
        addbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numb1=Double.parseDouble(txt.getText());
                operator='+';
                txt.setText(txt.getText()+"+");
                txtlen=txt.getText().length();

            }
        });
        subbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numb1=Double.parseDouble(txt.getText());
                operator='-';
                txt.setText(txt.getText()+"-");
                txtlen=txt.getText().length();

            }
        });
        multbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numb1=Double.parseDouble(txt.getText());
                operator='*';
                txt.setText(txt.getText()+"*");
                txtlen=txt.getText().length();

            }
        });
        divbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numb1=Double.parseDouble(txt.getText());
                operator='/';
                txt.setText(txt.getText()+"/");
                txtlen=txt.getText().length();

            }
        });
        decbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //numb1=Double.parseDouble(txt.getText());
                operator='.';
                txt.setText(txt.getText()+".");
                txtlen=txt.getText().length();

            }
        });





        //p1.setBackground(Color.GRAY);
        inv=new JButton[3];
        inv[0]=new JButton("asin");
        inv[1]=new JButton("acos");
        inv[2]=new JButton("atan");
        for(int i=0;i<3;i++){
            inv[i].setFont(myfont);
            inv[i].setForeground(Color.BLACK);
            inv[i].setBackground(Color.lightGray);
            inv[i].setVisible(true);
        }
        inv[0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.setText(txt.getText()+"asin");
                fun="asin";
                txtlen=txt.getText().length();
            }
        });
        inv[1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.setText(txt.getText()+"acos");
                fun="acos";
                txtlen=txt.getText().length();
            }
        });
        inv[2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.setText(txt.getText()+"atan");
                fun="atan";
                txtlen=txt.getText().length();
            }
        });
        p4=new JPanel();
        p4.setBackground(Color.GRAY);
        p4.setBounds(22,210,390,40);
        p4.setLayout(new GridLayout(1,3));


        p4.setVisible(true);
        for(int i=0;i<3;i++){
            p4.add(inv[i]);
        }
        //********************************************second panel****************
        p2=new JPanel();
        p2.setBackground(Color.darkGray);
        p2.setBounds(22,265,300,150);//190
        p2.setLayout(new GridLayout(4,3));
        p2.setVisible(true);
        for(int i=1;i<=9;i++){
            p2.add(numbarray[i]);
        }
        p2.add(decbtn);
        p2.add(numbarray[0]);
        p2.add(equbtn);
        p3=new JPanel();
        p3.setBounds(328,265,80,150);
        p3.setLayout(new GridLayout(4,0));
        p3.setBackground(Color.darkGray);
        p3.setVisible(true);
        p3.add(addbtn);
        p3.add(multbtn);
        p3.add(divbtn);
        p3.add(subbtn);
        dlt=new JButton("dlt");
        clr=new JButton("clr");
        dlt.setBounds(22,430,100,50);
        dlt.setFont(myfont);
        dlt.setForeground(Color.BLACK);
        dlt.setBackground(Color.lightGray);
        dlt.setVisible(true);
        clr.setFont(myfont);
        clr.setBounds(310,430,100,50);
        clr.setForeground(Color.BLACK);
        clr.setBackground(Color.lightGray);
        clr.setVisible(true);
        dlt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.setText(txt.getText().substring(0,txt.getText().length()-1));
            }
        });
        clr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.setText("");
            }
        });
        //*******************panel 4


        //*****************************scientific buttons****************



        /*JFrame j=new JFrame();
        j.setBounds(500,250,500,450);
        j.setLayout(null);
        j.setVisible(true);
        JTextField tx=new JTextField();
        tx.setBounds(80,20,330,50);
        JTextField tst=new JTextField(12);
        //tx.setHorizontalAlignment(JTextField.CENTER);
        tx.setVisible(true);
        tx.setLayout(null);
        JButton b=new JButton();
        JButton bb=new JButton();
        JButton addbtn=new JButton();
       b.setHorizontalAlignment(SwingConstants.CENTER);
       b.setBounds(80,90,40,40);
       b.setBackground(Color.DARK_GRAY);
       b.setForeground(Color.lightGray);
        bb.setHorizontalAlignment(SwingConstants.CENTER);
        bb.setBounds(85,90,40,40);
        bb.setBackground(Color.DARK_GRAY);
        bb.setForeground(Color.lightGray);
        addbtn.setHorizontalAlignment(SwingConstants.CENTER);
        addbtn.setBounds(200,90,40,40);
        addbtn.setBackground(Color.DARK_GRAY);
        addbtn.setForeground(Color.lightGray);
   b.setText("1");
        b.setLayout(null);
   b.setVisible(true);
        bb.setText("2");
        bb.setLayout(null);
        bb.setVisible(true);
        addbtn.setText("+");
        addbtn.setLayout(null);
        addbtn.setVisible(true);
JTextField j1=new JTextField();
j1.setBounds(50,150,120,90);
j1.setVisible(true);
        JTextField j2=new JTextField();
        j2.setBounds(155,150,120,90);
        j2.setVisible(true);
        //JLabel l=new JLabel()
//tx.getText();
        addbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               /* int numb1=Integer.parseInt(j1.getText());
                int numb2=Integer.parseInt(j2.getText());
                int res=numb1+numb2;
                JOptionPane.showMessageDialog(null,"result"+res);*/

           /* tx.setText("clixk");}
        });

j.add(tst);
        j.add(tx);
        j.add(b);
        j.add(bb);
        j.add(addbtn);
        j.add(j1);
        j.add(j2);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);*/


        //*********************************calculator functions***********************

        equbtn.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
                /*String s=txt.getText();
                String ss="";
                for(int i=txtlen+1;i<=txt.getText().length();i++){
                    ss+=s.charAt(i);
                }
                numb2=Double.parseDouble(ss);*/
        //numb2=Double.parseDouble(txt.getText().substring(txt.getText().indexOf(operator)+1,txt.getText().length()));
        numb2=Double.parseDouble(txt.getText().substring(txtlen,txt.getText().length()));
        switch(fun){
            case "sin":
                res=Math.sin(numb2);
                break;
            case "cosin":
                res=Math.cos(numb2);
                break;
            case "tan":
                res=Math.tan(numb2);
                break;
            case "ln":
                res=Math.log10(numb2);
                break;
            case "log":
                res=Math.log(numb2);
                break;
            case "\u221A":
                res=Math.sqrt(numb2);
                break;
            case "\u221B":
                res=Math.cbrt(numb2);
                break;
            case "asin":
                res=Math.asin(numb2);
                break;
            case "acos":
                res=Math.acos(numb2);
                break;
            case "atan":
                res=Math.atan(numb2);
                break;

        }


        switch(operator){
            case '+':
                res=numb1+numb2;
                txt.setText("hello");
                break;

            case '-':
                res=numb1-numb2;
                break;

            case '*':
                res=numb1*numb2;
                break;

            case '/':
                res=numb1/numb2;
                break;
            case '^':
                res=Math.pow(numb1,numb2);
                break;
            case '%':
                res=numb1%numb2;
                break;

        }
        txt.setText(String.valueOf(res));
        numb1=res;
        numb2=0.0;
        txtlen=0;
    }
        });

        frame.add(p3);
        frame.add(p2);
        frame.add(txt);
        frame.add(p1);
        frame.add(p4);
        frame.add(dlt);
        frame.add(clr);
        }
    }
