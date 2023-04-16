package logics;

import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Logic {


    public static int countDack = 0;
    public static int countCat = 0;
    public static int countEl = 0;
    public static int countCar = 0;

    public static ArrayList<Toy> listDack = new ArrayList<>();
    public static ArrayList<Toy> listCat = new ArrayList<>();
    public static ArrayList<Toy> listEl = new ArrayList<>();
    public static ArrayList<Toy> listCar = new ArrayList<>();

    public static ArrayList<Integer> listChange = new ArrayList<>();
    public static ArrayList<Toy> listCart = new ArrayList<>();



    



    public static void createListChange() {
        listChange.clear();
        cListChange(listDack, 1);
        cListChange(listCat, 2);
        cListChange(listEl, 3);
        cListChange(listCar, 4);
    }
    public static void cListChange(ArrayList<Toy> l, int a){
        if (l.isEmpty() == false){
            int n = (int) (l.get(0).change * 100);
            for (int i = 0; i < n; i++) {
                listChange.add(a);
            }
        }
    }
    public static void geneateChangeToy() throws IOException{
        int change = (int) (Math.random() * (listChange.size()+1));
        if(listChange.isEmpty() == false){
            if(listChange.get(change) == 1){
                listCart.add(listDack.get(0));
                listDack.remove(0);
                countDack = countDack - 1;
                WorkFiles.myWriteFile(WorkFiles.filePathDack, Integer.toString(countDack));
                JOptionPane.showMessageDialog(GUI.MainWindow.window, "Вы выграли Уточку!");
            }
            else if(listChange.get(change) == 2){
                listCart.add(listCat.get(0));
                listCat.remove(0);
                countCat = countCat - 1;
                WorkFiles.myWriteFile(WorkFiles.filePathCat, Integer.toString(countCat));
                JOptionPane.showMessageDialog(GUI.MainWindow.window, "Вы выграли Котика!");
            }
            else if(listChange.get(change) == 3){
                listCart.add(listEl.get(0));
                listEl.remove(0);
                countEl = countEl - 1;
                WorkFiles.myWriteFile(WorkFiles.filePathEl, Integer.toString(countEl));
                JOptionPane.showMessageDialog(GUI.MainWindow.window, "Вы выграли Слоника!");
            }
            else if(listChange.get(change) == 4){
                listCart.add(listCar.get(0));
                listCar.remove(0);
                countCar = countCar - 1;
                WorkFiles.myWriteFile(WorkFiles.filePathCar, Integer.toString(countCar));
                JOptionPane.showMessageDialog(GUI.MainWindow.window, "Вы выграли Машинку!");
            }
        }
        else{
            JOptionPane.showMessageDialog(GUI.MainWindow.window, "Игрушки закончились!");
        }
    }




    public static void downloadToys(String s, int n, double c, ArrayList<Toy> list) {
        for (int i = 0; i < n; i++) {
            list.add(new Toy(list.size(), s, c));
        }
    }

    
    public static void dataLoading() throws IOException{
        WorkFiles.createFiles();
        countDack = WorkFiles.myReaderFile(WorkFiles.filePathDack);
        countCat = WorkFiles.myReaderFile(WorkFiles.filePathCat);
        countEl = WorkFiles.myReaderFile(WorkFiles.filePathEl);
        countCar = WorkFiles.myReaderFile(WorkFiles.filePathCar);
        downloadToys("Уточка", countDack, 0.2, listDack);
        downloadToys("Котик", countCat, 0.4, listCat);
        downloadToys("Слоник", countEl, 0.6, listEl);
        downloadToys("Машинка", countCar, 0.8,  listCar);
    }

    public static int[] cart(){
        int [] array = {0, 0, 0, 0};
        for (Toy toy : listCart) {
            if(toy.name == "Уточка"){
                array[0]++;
            }
            if(toy.name == "Котик"){
                array[1]++;
            }
            if(toy.name == "Слоник"){
                array[2]++;
            }
            if(toy.name == "Машинка"){
                array[3]++;
            }
        }
        return array;
    }

}

