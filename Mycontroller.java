import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import GUI.MainWindow;
import logics.Toy;
import logics.WorkFiles;
import logics.Logic;

public class Mycontroller {

    public static void refresh(MainWindow mw) {
        mw.dackLabel.setText("колличество:"+ Integer.toString(logics.Logic.listDack.size()));
        mw.catLabel.setText("колличество:"+ Integer.toString(logics.Logic.listCat.size()));
        mw.elLabel.setText("колличество:"+ Integer.toString(logics.Logic.listEl.size()));
        mw.carLabel.setText("колличество:"+ Integer.toString(logics.Logic.listCar.size()));
    }
    
    
   
    public static void step() throws IOException{   

        logics.Logic.dataLoading();
        
        MainWindow mw = new MainWindow();
        
        ActionListener aListenerCatalog = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mw.dackButton.setEnabled(true);
                mw.carButton.setEnabled(true);
                mw.catButton.setEnabled(true);
                mw.elButton.setEnabled(true);
                mw.clearMainWindow();
                mw.childWindow();
                mw.setWidget();
                refresh(mw);
            } 
        };
        
        ActionListener aListenerRaffle = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mw.clearMainWindow();
                mw.raffleWindow();
                mw.setWidget();
                refresh(mw);
                mw.dackButton.setEnabled(false);
                mw.carButton.setEnabled(false);
                mw.catButton.setEnabled(false);
                mw.elButton.setEnabled(false);                
            } 
        };
        
        ActionListener aListenerBack = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mw.clearWindow();
                mw.setWidgetMain();
                               
            } 
        };

        ActionListener aListenerAddDack = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                logics.Logic.downloadToys("Уточка", 1, 0.2,  logics.Logic.listDack);
                logics.Logic.countDack++;
                mw.dackLabel.setText("колличество:"+ Integer.toString(logics.Logic.listDack.size()));
                
                try {
                    logics.WorkFiles.myWriteFile(logics.WorkFiles.filePathDack, Integer.toString(logics.Logic.listDack.size()));
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            } 
        };

        ActionListener aListenerAddCat = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                logics.Logic.downloadToys("Котик", 1, 0.4, logics.Logic.listCat);
                mw.catLabel.setText("колличество:"+ Integer.toString(logics.Logic.listCat.size()));
                logics.Logic.countCat++;
                try {
                    logics.WorkFiles.myWriteFile(logics.WorkFiles.filePathCat, Integer.toString(logics.Logic.listCat.size()));
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            } 
        };

        ActionListener aListenerAddEl = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                logics.Logic.downloadToys("Слоник", 1, 0.6, logics.Logic.listEl);
                mw.elLabel.setText("колличество:"+ Integer.toString(logics.Logic.listEl.size()));
                logics.Logic.countEl++;
                try {
                    logics.WorkFiles.myWriteFile(logics.WorkFiles.filePathEl, Integer.toString(logics.Logic.listEl.size()));
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            } 
        };

        ActionListener aListenerAddCar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                logics.Logic.downloadToys("Машинка", 1, 0.8, logics.Logic.listCar);
                mw.carLabel.setText("колличество:"+ Integer.toString(logics.Logic.listCar.size()));
                logics.Logic.countCar++;
                try {
                    logics.WorkFiles.myWriteFile(logics.WorkFiles.filePathCar, Integer.toString(logics.Logic.listCar.size()));
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            } 
        };
        
        ActionListener aListenerAddGame = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                logics.Logic.createListChange();
                try {
                    logics.Logic.geneateChangeToy();
                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
                mw.cart.setText("выгрыш: "+ Integer.toString(logics.Logic.listCart.size()));
                refresh(mw);

            } 
        };
        
        ActionListener aListenerAddCart = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int[] array = logics.Logic.cart();
            
                JOptionPane.showMessageDialog(GUI.MainWindow.window, "Уточки: " + Integer.toString(array[0]) + 
                                                                    "\nКотики: " + Integer.toString(array[1]) + 
                                                                    "\nСлоники: " + Integer.toString(array[2]) + 
                                                                    "\nMашинки: " + Integer.toString(array[3]));
            } 
        };
        
        mw.catalogButton.addActionListener(aListenerCatalog);
        mw.raffleButton.addActionListener(aListenerRaffle);
        mw.back.addActionListener(aListenerBack);
        mw.dackButton.addActionListener(aListenerAddDack);
        mw.catButton.addActionListener(aListenerAddCat);
        mw.elButton.addActionListener(aListenerAddEl);
        mw.carButton.addActionListener(aListenerAddCar);
        mw.myGame.addActionListener(aListenerAddGame);
        mw.cart.addActionListener(aListenerAddCart);

        

    }

}
