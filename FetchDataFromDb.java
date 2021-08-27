package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class ViewBookedHotel extends JFrame implements ActionListener{

    JButton b1;

    JLabel l20, l21, l22, l23, l24, l25, l26, l27, l28, l29;
    ViewBookedHotel(String username) {
        setTitle("View Booked Hotel");
        setLayout(null);
        getContentPane().setBackground(Color.white);
        setBounds(450, 200, 900, 580);

        JLabel l1 = new JLabel("Details of Booked Hotel");
        l1.setBounds(250, 10, 500, 35);
        l1.setForeground(Color.red);
        l1.setFont(new Font("Verdana", Font.BOLD, 30));
        add(l1);

        JLabel l2 = new JLabel("Username");
        l2.setBounds(30, 60, 200, 20);
        l2.setFont(new Font("Verdana", Font.PLAIN, 15));
        add(l2);
        l20 = new JLabel();
        l20.setBounds(250, 60, 200, 20);
        l20.setFont(new Font("Verdana", Font.PLAIN, 15));
        add(l20);

        JLabel l3 = new JLabel("Select Hotel");
        l3.setBounds(30, 100, 200, 20);
        l3.setFont(new Font("Verdana", Font.PLAIN, 15));
        add(l3);

        l21 = new JLabel();
        l21.setBounds(250, 100, 200, 20);
        l21.setFont(new Font("Verdana", Font.PLAIN, 15));
        add(l21);

        JLabel l4 = new JLabel("Total Persons");
        l4.setBounds(30, 145, 200, 20);
        l4.setFont(new Font("Verdana", Font.PLAIN, 15));
        add(l4);
        l22 = new JLabel();
        l22.setBounds(250, 145, 200, 20);
        l22.setFont(new Font("Verdana", Font.PLAIN, 15));
        add(l22);

        JLabel l5 = new JLabel("No. Of Days ");
        l5.setBounds(30, 185, 200, 20);
        l5.setFont(new Font("Verdana", Font.PLAIN, 15));
        add(l5);
        l23 = new JLabel();
        l23.setBounds(250, 185, 200, 20);
        l23.setFont(new Font("Verdana", Font.PLAIN, 15));
        add(l23);

        JLabel l6 = new JLabel("AC/Non-AC");
        l6.setBounds(30, 225, 200, 20);
        l6.setFont(new Font("Verdana", Font.PLAIN, 15));
        add(l6);

        l24 = new JLabel();
        l24.setBounds(250, 225, 200, 20);
        l24.setFont(new Font("Verdana", Font.PLAIN, 15));
        add(l24);

        JLabel l7 = new JLabel("Food Included");
        l7.setBounds(30, 270, 200, 20);
        l7.setFont(new Font("Verdana", Font.PLAIN, 15));
        add(l7);

        l25 = new JLabel();
        l25.setBounds(250, 270, 200, 20);
        l25.setFont(new Font("Verdana", Font.PLAIN, 15));
        add(l25);

        JLabel l8 = new JLabel("Proof Of Name");
        l8.setBounds(30, 310, 200, 20);
        l8.setFont(new Font("Verdana", Font.PLAIN, 15));
        add(l8);
        l26 = new JLabel();
        l26.setBounds(250, 310, 200, 20);
        l26.setFont(new Font("Verdana", Font.PLAIN, 15));
        add(l26);

        JLabel l9 = new JLabel("Proof No");
        l9.setBounds(30, 350, 200, 20);
        l9.setFont(new Font("Verdana", Font.PLAIN, 15));
        add(l9);
        l27 = new JLabel();
        l27.setBounds(250, 350, 200, 20);
        l27.setFont(new Font("Verdana", Font.PLAIN, 15));
        add(l27);

        JLabel l10 = new JLabel("Phone No");
        l10.setBounds(30, 390, 200, 20);
        l10.setFont(new Font("Verdana", Font.PLAIN, 15));
        add(l10);
        l28 = new JLabel();
        l28.setBounds(250, 390, 200, 20);
        l28.setFont(new Font("Verdana", Font.PLAIN, 15));
        add(l28);

        JLabel l11 = new JLabel("Total Cost");
        l11.setBounds(30, 430, 200, 25);
        l11.setFont(new Font("Verdana", Font.PLAIN, 15));
        add(l11);
        l29 = new JLabel();
        l29.setBounds(250, 430, 200, 20);
        l29.setFont(new Font("Verdana", Font.PLAIN, 15));
        l29.setForeground(Color.red);
        add(l29);

        b1 = new JButton("Back");
        b1.setBounds(200, 490, 150, 25);
        b1.setForeground(Color.white);
        b1.setBackground(Color.black);
        b1.setBorder(BorderFactory.createEmptyBorder());
        b1.setFont(new Font("Verdana", Font.BOLD, 13));
        b1.addActionListener(this);
        add(b1);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/hotel5.jpg"));
        Image i2 = i1.getImage().getScaledInstance(460, 390, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l12 = new JLabel(i3);
        l12.setBounds(475, 50, 400, 400);
        add(l12);
        
        try {
        
            Conn con =new Conn();
            ResultSet rs=con.s.executeQuery("select * from bookhotel where username='"+username+"'");
            while(rs.next())
            {
               l20.setText(rs.getString(1));
               l21.setText(rs.getString(2));
               l22.setText(rs.getString(3));
               l23.setText(rs.getString(4));
               l24.setText(rs.getString(5));
               l25.setText(rs.getString(6));
               l26.setText(rs.getString(7));
               l27.setText(rs.getString(8));
               l28.setText(rs.getString(9));
               l29.setText(rs.getString(10));
               
            }
        }
        
        catch (Exception e){}

    }
   
    @Override
    public void actionPerformed(ActionEvent ae)
    {
        this.setVisible(false);
    }

    public static void main(String[] args) {
        new ViewBookedHotel("").setVisible(true);
    }

}
