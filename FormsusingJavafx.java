/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package formsusingjavafx;


import javafx.scene.paint.Color;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author vpran
 */
public class FormsusingJavafx extends Application 
{
    
    @Override
    public void start(Stage primaryStage) throws FileNotFoundException 
    {
        
        
        primaryStage.setTitle("Forms using Javafx");
        
       
        
        Text name=new Text("Enter your name");
        TextField tname=new TextField();
        
        
        
        Text regno=new Text("Enter your registration number");
        TextField rno=new TextField();
        
        ToggleGroup tg = new ToggleGroup();
        Text gender=new Text("Enter your Gender:");
        RadioButton r1 = new RadioButton("male");
        RadioButton r2 = new RadioButton("female");
        RadioButton r3 = new RadioButton("others");
        r1.setToggleGroup(tg);
        r2.setToggleGroup(tg);
        r3.setToggleGroup(tg);
        
        Text Marks=new Text("Enter your marks out of 100: ");
        Text m1=new Text("Java");
        TextField mark1=new TextField();
        mark1.setPrefWidth(30);
        
        Text m2=new Text("DBMS");
        TextField mark2=new TextField();
        mark2.setPrefWidth(30);
        
        Text m3=new Text("Mathematics");
        TextField mark3=new TextField();
        mark3.setPrefWidth(30);
        
        Text m4=new Text("Physics");
        TextField mark4=new TextField();
        mark4.setPrefWidth(30);
        
        Button submit=new Button("Submit form");
        Text disp=new Text();
        Text showperc=new Text();
        
        GridPane gp=new GridPane();
        gp.setHgap(10);
        gp.setVgap(10);
        gp.setAlignment(Pos.CENTER);
        
        gp.add(name,0,0);
        gp.add(tname,1,0);
        
        gp.add(regno,0,2);
        gp.add(rno,1,2);
        
        gp.add(gender,0,6);
        gp.add(r1,0,8);
        gp.add(r2,0,10);
        gp.add(r3,0,12);
        
        gp.add(Marks,0,14);
        gp.add(m1,0,16);
        gp.add(mark1,1,16);
        gp.add(m2,0,18);
        gp.add(mark2,1,18);
        gp.add(m3,0,20);
        gp.add(mark3,1,20);
        gp.add(m4,0,22);
        gp.add(mark4,1,22);
        gp.add(submit,2,24);
        gp.add(disp,2,26);
        gp.add(showperc,2,28);
        Scene sc=new Scene(gp);
        primaryStage.setScene(sc);
        primaryStage.show();
         
        submit.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent e)
            {
                if(mark1.getText().isEmpty() || mark2.getText().isEmpty() || mark3.getText().isEmpty()||mark4.getText().isEmpty())
                {
                    disp.setText("Please Enter all the marks....");
                    disp.setFill(Color.CHOCOLATE);
                }
                else
                {
                    disp.setText("Hello and welcome "+tname.getText());
                    disp.setFill(Color.CHOCOLATE);
                    String a=mark1.getText();
                    String b=mark2.getText();
                    String c=mark3.getText();
                    String d=mark4.getText();
                    int total = Integer.parseInt(a)+Integer.parseInt(b)+Integer.parseInt(c)+Integer.parseInt(d);
                    int avg=total/4;
                    if(avg>=85)
                    {    
                        showperc.setText("Congratulations!! Your percentage of all 4 subjects is: "+avg+"%"+"... You have an A grade");
                        showperc.setFill(Color.CHOCOLATE);
                    }
                    else if(avg<85 && avg>=70)
                    {
                        showperc.setText("Congratulations!! Your percentage of all 4 subjects is: "+avg+"%"+"... You have a B grade..."
                                + "Can be improved!!");
                        showperc.setFill(Color.CHOCOLATE);
                    }
                    else if(avg<70 && avg >=40)
                    {
                        showperc.setText("Congratulations!! Your percentage of all 4 subjects is: "+avg+"%"+"... You have a C grade..."
                                + "Work harder and you'll succeed!!");
                        showperc.setFill(Color.CHOCOLATE);
                    }
                    else 
                    {
                        showperc.setText(" Your percentage of all 4 subjects is: "+avg+"%"+"... You have an F grade...I am sorry but "
                                + "you have failed..Better luck next Time!!");
                        showperc.setFill(Color.CHOCOLATE);
                    }
                }
            }
        });
    }
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
