import java.awt.Color;
import java.awt.Font;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {
    public static void main(String[] args) {

        JLabel title = new JLabel();
        title.setText("Investment Calculator");
        title.setForeground(new Color(0,0,0));
        title.setFont(new Font("Times New Roman",Font.BOLD, 32));
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setVerticalAlignment(JLabel.TOP);



        JFrame frame = new JFrame();
        frame.setTitle("365 Days");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(450,800);
        // frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(11,102,35, 200));
        frame.add(title);
        frame.setVisible(true); 



        Scanner input = new Scanner(System.in);

        System.out.println("How many years will you be saving?");
        double years = input.nextDouble();
        System.out.println("How much money is currently in your account?");
        double principal = input.nextDouble();
        System.out.println("How much money do you plan on investing monthly?");
        double monthlyInvestment = input.nextDouble();
        System.out.println("What do you estimate will be the yearly interest of this investment?(in percent e.x: 8)");
        double interest = (input.nextDouble() / 100);

        monthlyInvestment *= 12;
        double total = principal;

        for(int i = 0; i < years; i++)
        {
            total = (total + monthlyInvestment) * (1 + interest);
        }
        System.out.println(total);

        input.close();

    }

    




}