/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package resistors;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author jacra1226
 */
public class Resistors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        String Input = JOptionPane.showInputDialog("What is your restistor colour code?"  + "\nSeperate each colour ny hyphens" + "\nEx: Red-Orange-Black");
       String Input1 = Input.toUpperCase();
        ArrayList<String> Colours = new ArrayList<String>();
        ArrayList<String> res2 = new ArrayList<String>();
        double res3;  
        
        Colours.add("BLACK");
        Colours.add("BROWN");
        Colours.add("RED");
        Colours.add("ORANGE");
        Colours.add("YELLOW");
        Colours.add("GREEN");
        Colours.add("BLUE");
        Colours.add("VIOLET");
        Colours.add("GREY");
        Colours.add("WHITE");
        
      for( String s : Input1.split("-")) {
          
      
        
       
                            
                            if (s.equals("BLACK")){
                           
                                res2.add("0");
                            }
                            else if (s.equals("BROWN")){
                      
                                res2.add("1");
                            }
                            else if (s.equals("RED")){
                               
                                res2.add("2");
                                
                            }
                            else if (s.equals("ORANGE")){
                                
                                res2.add("3");
                            }
                            else if (s.equals("YELLOW")){
                                
                                res2.add("4");
                            }
                            else if (s.equals("GREEN")){
                                
                                res2.add("5");
                            }
                            else if (s.equals("BLUE")){
                                
                                res2.add("6");
                            }
                            else if (s.equals("VIOLET")){
                                
                                res2.add("7");
                            }
                            else if (s.equals("GREY")){
                                
                                res2.add("8");
                            }
                            else if (s.equals("WHITE")){
                                
                                res2.add("9");
                                
                            }
        
      }
      String two = res2.get(0);
     double numberDb =  Double.parseDouble(res2.get(0)); 
     double numberDb1 =  Double.parseDouble(res2.get(1));
         double numberDb2 =  Double.parseDouble(res2.get(2));  
         
         double numberDb3 = numberDb1*10;
         double sum = Math.pow(numberDb3,numberDb2);//numberDb1*10(Math.pow(numberDb2));
          
         System.out.println(sum);
         System.out.println(two);
         System.out.println(res2);
         System.out.println(numberDb);
         System.out.println(numberDb1);
         System.out.println(numberDb2);
         System.out.println(numberDb3);
         
      
      
              
              
      }
    }
    

