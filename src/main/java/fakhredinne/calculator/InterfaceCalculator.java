package fakhredinne.calculator;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

public class InterfaceCalculator {
    private  Button[] buttonsN =new Button[10];
    private  Button[] buttonsO =new Button[10];
   private  String[] Operatos =new String[4];


  private  BorderPane bd=new BorderPane();
  private  Scene scene=new Scene(bd,300,200);
  private Button b1=new Button("Lancer");
    private GridPane grid1 = new GridPane();
   private GridPane grid2 = new GridPane();
   private Label lab=new Label("Calculator");
    public Button getButtom(){
        return  new Button("Calculer");
    }
    public Label getTop(){
       return lab;
    }

    public Button[] getButtonsN() {
        return buttonsN;
    }

    public Button[] getButtonsO() {
        return buttonsO;
    }

    public GridPane getcenter(){



        for (int i = 0; i <10; i++) {
            int row = i/3; // Calculate row based on 7 buttons per row
            int col = i %3; // Calculate column based on 7 buttons per row
            Button bt = new Button(""+i);
            buttonsN[i]=bt;
            grid1.add(bt,col,row);

        }
        return grid1;
    }
    public GridPane getRight(){
        int row = 1; // Calculate row based on 7 buttons per row
        int col = 1; // Calculate column based on 7 buttons per row
        Button bt1 = new Button("+");
        grid2.add(bt1,col,row);
        buttonsO[0]=bt1;
         row = 2; // Calculate row based on 7 buttons per row
         col = 1; // Calculate column based on 7 buttons per row
        Button bt2 = new Button("-");
        grid2.add(bt2,col,row);
        buttonsO[1]=bt2;
        row = 3; // Calculate row based on 7 buttons per row
        col = 1; // Calculate column based on 7 buttons per row
        Button bt3 = new Button("*");
        grid2.add(bt3,col,row);
        buttonsO[2]=bt3;
        row = 4; // Calculate row based on 7 buttons per row
        col = 1; // Calculate column based on 7 buttons per row
        Button bt4 = new Button("/");
        buttonsO[3]=bt4;
        grid2.add(bt4,col,row);
        return grid2;
    }

    public String[] getOperatos() {
        return Operatos;
    }

    public void setExpression(int s){

        this.lab.setText(""+s);



    }
    public void setExpression(String s){
        this.lab.setText(s);
    }

}
