package fakhredinne.calculator;

import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

public class ControllerCalculator {
    private InterfaceCalculator interfaceCal=new InterfaceCalculator();
    private BorderPane root =new BorderPane();

    public BorderPane launchCalculator(){
        this.root.setCenter(interfaceCal.getcenter());
        this.root.setTop(interfaceCal.getTop());
        this.root.setBottom(interfaceCal.getButtom());
        this.root.setRight(interfaceCal.getRight());
        onClick();
        return root;

    }
    public void onClick(){
        for (int i = 0; i < 10; i++) {
            Button b=interfaceCal.getButtonsN()[i];
            final int ii=i;
            b.setOnAction(
                    event->interfaceCal.setExpression(ii)
            );
        }
        for (int i = 0; i < 4; i++) {
            Button b=interfaceCal.getButtonsO()[i];
            final String expr=interfaceCal.getOperatos()[i];
            final int ii=i;
            b.setOnAction(
                    event->interfaceCal.setExpression(expr)
            );

        }

    }

}
