/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatormodel;

/**
 *
 * @author Michael
 */
public class Tester {
    public static void main(String[] args) {
        CalculatoView view = new CalculatoView();
        CalculatoModel model = new CalculatoModel();
        new ClaculateConroler(view, model);
        view.setVisible(true);
        System.out.prinln("What");
    }
}   
