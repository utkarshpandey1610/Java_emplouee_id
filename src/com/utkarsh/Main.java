package com.utkarsh;

import java.awt.*;
import java.awt.event.*;
class Main extends Frame implements ItemListener, ActionListener
{
    Label l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
    TextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16;
    Button b1, b2;
    private ActionEvent e;

    Main()
    {
        setVisible(true);
        setSize(200,200);
        setBackground(Color.LIGHT_GRAY);
        l1=new Label("Enter the first employee id  ");
        t1=new TextField(20);
        l2=new Label("Enter the first employee name ");
        t2=new TextField(20);
        l7=new Label("Age");
        t6=new TextField(20);
        l5=new Label("present-");
        t7=new TextField(20);

        l3=new Label("enter the second employee id ");
        t3=new TextField(20);
        l4=new Label("enter the second employee name ");
        t4=new TextField (20);
        l8=new Label("Age");
        t8=new TextField(20);
        l6=new Label("present-");
        t9=new TextField(20);

        t5=new TextField(20);
        t10=new TextField(20);
        t11=new TextField(20);
        t12=new TextField(20);
        t13=new TextField(20);
        t14=new TextField(20);
        t15=new TextField(20);
        t16=new TextField(20);

        l9=new Label("First Employee info ");
        l10=new Label("Second Employee info");

        b1=new Button("Finish");
        b2=new Button("Close");

        setLayout(new FlowLayout());

        add(l1);add(t1);add(l2);add(t2);add(l7);add(t6);add(l5);add(t7);add(l3);add(t3);add(l4);add(t4);add(l8);add(t8);
        add(l6);add(t9);add(b1);add(l9);add(t5);add(t10);add(t11);add(t12);add(l10);add(t13);add(t14);add(t15);add(t16);add(b2);

        b1.addActionListener(this);
        b2.addActionListener(this);


    }
    public void actionPerformed(ActionEvent obj)
    {

        if(obj.getSource()==b1){
            t5.setText(t1.getText());
            t10.setText((t2.getText()));
            t11.setText((t6.getText()));
            t12.setText((t7.getText()));
            t13.setText(t3.getText());
            t14.setText(t4.getText());
            t15.setText(t8.getText());
            t16.setText(t9.getText());



        }


        if(obj.getSource()==b2){dispose();}
    }

    public static void main(String args[])
    {
        Main obj1=new Main();

    }


    @Override
    public void itemStateChanged(ItemEvent e) {

    }
}
