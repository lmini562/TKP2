/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change
this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
*/
package javalaba1;
import javax.swing.JOptionPane;
/**
*
* @author azaly
*/
public class JavaLaba1 {
/**
* @param args the command line arguments
*/
public static void main(String[] args) {
// TODO code application logic here
JOptionPane.showMessageDialog(null, "Guten Abend");
String name;
name=JOptionPane.showInputDialog("Hallo, Wie heißt du?");
JOptionPane.showMessageDialog(null, "Sehr angenehm,\n"+name+"!");
JOptionPane.showMessageDialog(null, name);
byte x=10, y=50;
x=(byte)(x+1);
byte z=(byte)(x+y);
JOptionPane.showMessageDialog(null, z);
}
}

