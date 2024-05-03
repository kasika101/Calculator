package application;

import javafx.event.ActionEvent;

//import java.awt.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private Button devide;

    @FXML
    private Button eight;

    @FXML
    private Button equals;

    @FXML
    private Button five;

    @FXML
    private Button four;

    @FXML
    private Button minus;

    @FXML
    private Button modulo;

    @FXML
    private Button multiply;

    @FXML
    private Button nine;

    @FXML
    private Button one;

    @FXML
    private Button plus;

    @FXML
    private Button point;

    @FXML
    private Button power;

    @FXML
    private Button seven;

    @FXML
    private Button six;

    @FXML
    private TextField textb;
    
    @FXML
    private TextField texta;

    @FXML
    private Button three;

    @FXML
    private Button two;

    @FXML
    private Button sqrt;
    
    
    	
    String nums = "";
    
    public void one(ActionEvent event) {
    	textb.setText(textb.getText() + "1");
    }
    public void two(ActionEvent event) {
    	textb.setText(textb.getText() + "2");
    }
    public void three(ActionEvent event) {
    	textb.setText(textb.getText() + "3");
    }
    public void four(ActionEvent event) {
    	textb.setText(textb.getText() + "4");
    }
    public void five(ActionEvent event) {
    	textb.setText(textb.getText() + "5");
    }
    public void six(ActionEvent event) {
    	textb.setText(textb.getText() + "6");
    }
    public void seven(ActionEvent event) {
    	textb.setText(textb.getText() + "7");
    }
    public void eight(ActionEvent event) {
    	textb.setText(textb.getText() + "8");
    }
    public void nine(ActionEvent event) {
    	textb.setText(textb.getText() + "9");
    }
    public void zero(ActionEvent event) {
    	textb.setText(textb.getText() + "0");
    }
    public void point(ActionEvent event) {
    	textb.setText(textb.getText() + ".");
    }
    public void plus(ActionEvent event) {
    	textb.setText(textb.getText() + "+");	
    }
    public void minus(ActionEvent event) {
    	textb.setText(textb.getText() + "-");
    }
    public void multiply(ActionEvent event) {
    	textb.setText(textb.getText() + "*");
    }
    public void devide(ActionEvent event) {
    	textb.setText(textb.getText() + "/");
    }
    
    public void del(ActionEvent event) {
    	 String currentText = textb.getText();
    	    if (!currentText.isEmpty()) {
    	    	String newText = currentText.substring(0, currentText.length() - 1);
    	        textb.setText(newText);   	 
    	  }
    }
    public void mod(ActionEvent event) {
    	textb.setText(textb.getText() + "%");
    }
    public void power(ActionEvent event) {
    	textb.setText(textb.getText() + "^");
    }
    public void equals(ActionEvent event) {
    	 nums = textb.getText();
    	// System.out.println(nums);
    	 double result = calculate(nums);
    	 String res = String.valueOf(result);
    	 texta.setText("ANS " +res);
    		 
    }
    public void sqrt(ActionEvent event) {
    	textb.setText("");
    	texta.setText("");
    }
    public static double calculate(String nums) {
    	String[] tokens = nums.split("(?<=\\d)(?=\\D)|(?<=\\D)(?=\\d)");

        double result = Double.parseDouble(tokens[0]);
        char operator = ' ';

        for (int i = 1; i < tokens.length; i++) {
            if (tokens[i].matches("[+\\-*/%^]")) {
                operator = tokens[i].charAt(0);
            } else {
                double operand = Double.parseDouble(tokens[i]);
                switch (operator) {
                    case '+':
                        result += operand;
                        break;
                    case '-':
                        result -= operand;
                        break;
                    case '*':
                        result *= operand;
                        break;
                    case '/':
                        result /= operand;
                        break;
                    case '%':
                        result %= operand;
                        break;
                        
                    case '^':
                        result = Math.pow(result, operand);
                        break;
                }
                
            }
        }

        return result;
     }

}
