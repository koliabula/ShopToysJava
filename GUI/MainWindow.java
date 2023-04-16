package GUI;

import java.io.IOException;

import javax.swing.*;

public class MainWindow extends Widget{

    
    public static JFrame window = new JFrame("Магазин Игрушек");

    public MainWindow() {

        window.setBounds(5, 5, 500, 500);
        window.setLayout(null);
       
        setWidgetMain();
        
    }

    
    public void childWindow(){
        
        dackButton.setBounds(50, 30, 150, 150);
        dackLabel.setBounds(50, 180, 150, 30);
        catButton.setBounds(250, 30, 150, 150);
        catLabel.setBounds(250, 180, 150, 30);
        elButton.setBounds(50, 250, 150, 150);
        elLabel.setBounds(50, 400, 150, 30);
        carButton.setBounds(250, 250, 150, 150);
        carLabel.setBounds(250, 400, 150, 30);
        back.setBounds(405, 417, 80, 45);
    }
    
    public void raffleWindow(){
        dackButton.setBounds(5, 20, 100, 100);
        dackLabel.setBounds(5, 120, 100, 30);
        catButton.setBounds(120, 20, 100, 100);
        catLabel.setBounds(120, 120, 100, 30);
        elButton.setBounds(235, 20, 100, 100);
        elLabel.setBounds(235, 120, 100, 30);
        carButton.setBounds(350, 20, 100, 100);
        carLabel.setBounds(350, 120, 100, 30);
        back.setBounds(405, 417, 80, 45);

        window.add(myGame);
        window.add(cart);
    }

    public void setWidget(){
        window.add(dackButton);
        window.add(dackLabel);
        window.add(catButton);
        window.add(catLabel);
        window.add(elButton);
        window.add(elLabel);
        window.add(carButton);
        window.add(carLabel);
        window.add(back);

        window.setVisible(true);
    }

    public void setWidgetMain(){
        catalogButton.setVisible(true);
        raffleButton.setVisible(true);
        window.add(catalogButton);
        window.add(raffleButton);

        window.setVisible(true);
    }

    public void clearMainWindow(){
        window.setVisible(false);
        window.remove(catalogButton);
        window.remove(raffleButton);
    }

    public void clearWindow(){
        window.setVisible(false);

        window.remove(dackButton);
        window.remove(dackLabel);
        window.remove(catButton);
        window.remove(catLabel);
        window.remove(elButton);
        window.remove(elLabel);
        window.remove(carButton);
        window.remove(carLabel);
        window.remove(back);
        window.remove(myGame);
        window.remove(cart);

    }


}
