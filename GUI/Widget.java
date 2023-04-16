package GUI;


import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

public class Widget {  
    public JButton dackButton = new JButton("Уточка");
    public JLabel dackLabel = new JLabel("колличество: ");
    public JButton catButton = new JButton("Котик");
    public JLabel catLabel = new JLabel("колличество: "); 
    public JButton elButton = new JButton("Слоник");  
    public JLabel elLabel = new JLabel("колличество: ");
    public JButton carButton = new JButton("Машинка");
    public JLabel carLabel = new JLabel("колличество: ");
    public JButton myGame = new JButton("Играть");

    public JButton cart = new JButton("Выгрыш: ");

    public JButton back = new JButton("<-");

    public Font BigFontTR = new Font("TimesRoman", Font.BOLD, 15);//Тут все про шрифт)
    public JButton catalogButton = new JButton("Каталог игрушек");
    public JButton raffleButton = new JButton("Розыгрыш Призов");

    public Widget() {

        catalogButton.setBounds(5, 5, 200, 50);
        catalogButton.setBackground(Color.pink);
        catalogButton.setForeground(Color.darkGray);
        catalogButton.setFont(BigFontTR);

        
        raffleButton.setBounds(5, 55, 200, 50);
        raffleButton.setBackground(Color.pink);
        raffleButton.setForeground(Color.darkGray);
        raffleButton.setFont(BigFontTR);

        
        dackButton.setBackground(Color.YELLOW);
        dackButton.setForeground(Color.darkGray);
        dackButton.setFont(BigFontTR);

                      
        catButton.setBackground(Color.CYAN);
        catButton.setForeground(Color.darkGray);
        catButton.setFont(BigFontTR);
                
        elButton.setBackground(Color.gray);
        elButton.setForeground(Color.darkGray);
        elButton.setFont(BigFontTR);

        carButton.setBackground(Color.RED);
        carButton.setForeground(Color.darkGray);
        carButton.setFont(BigFontTR);

        
        myGame.setBounds(100, 350, 300, 100);
        myGame.setBackground(Color.green);
        myGame.setForeground(Color.darkGray);
        myGame.setFont(BigFontTR);
        
        back.setBounds(100, 350, 300, 100);
        back.setBackground(Color.WHITE);
        back.setForeground(Color.darkGray);
        back.setFont(BigFontTR);

        cart.setBounds(5, 200, 200, 100);
        cart.setBackground(Color.WHITE);
        cart.setForeground(Color.darkGray);
        cart.setFont(BigFontTR);
    }

}
