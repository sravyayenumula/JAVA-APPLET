import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.lang.Math;
public class Calculator1 extends Applet implements ActionListener
{
TextField t;
Button b[]=new Button[15];
Button b1[]=new Button[20];
String op2[]={"*","/","+","-","%",".","^","sqrt","cbrt","clear","e^x","10^","a^b","In","log","sinx","cosx","tanx","1/x","="};
String str1="";
double p=0,q=0;
String oper;
public void init()
{
setLayout(new GridLayout(7,5));
t=new TextField(34);
setBackground(Color.gray);
setFont(new Font("Arial",Font.BOLD,20));
int k=0;
t.setEditable(false);
t.setBackground(Color.white);
t.setText("0");
for(int i=0;i<10;i++)
{
b[i]=new Button(""+k);
add(b[i]);
k++;
b[i].setBackground(Color.cyan);
b[i].addActionListener(this);
}
for (int i=0;i<20;i++)
{
b1[i]=new Button(""+op2[i]);
add(b1[i]);
b1[i].setBackground(Color.pink);
b1[i].addActionListener(this);
}
add(t);
}
public void actionPerformed(ActionEvent ae)
{
String str=ae.getActionCommand();
if(str.equals("+")){
p=Double.parseDouble(t.getText());
oper=str;
t.setText(str1="");
}
else if(str.equals("-")){ p=Double.parseDouble(t.getText());
oper=str;
t.setText(str1="");
}
else
if(str.equals("*")){
p=Double.parseDouble(t.getText());
oper=str;
t.setText(str1="");
}
else if(str.equals("%")){ p=Double.parseDouble(t.getText());
oper=str;
t.setText(str1="");
}
else if(str.equals("/")){ p=Double.parseDouble(t.getText());
oper=str;
t.setText(str1="");
}
else if(str.equals("^")){ p=Double.parseDouble(t.getText());
oper=str;
t.setText(str1="");
}
else if(str.equals("sqrt")){ p=Double.parseDouble(t.getText());
oper=str;
t.setText(str1="");
}
else
if(str.equals("10^")){ p=Double.parseDouble(t.getText());
oper=str;
t.setText(str1="");
}
else if(str.equals("e^x")){ p=Double.parseDouble(t.getText());
oper=str;
t.setText(str1="");
}
else if(str.equals("1/x")){ p=Double.parseDouble(t.getText());
oper=str;
t.setText(str1="");
}
else if(str.equals("sinx")) { p=Double.parseDouble(t.getText());
oper=str;
t.setText(str1="");
}
else if(str.equals("cosx")){ p=Double.parseDouble(t.getText());
oper=str;
t.setText(str1="");
}
else if(str.equals("tanx")){ p=Double.parseDouble(t.getText());
oper=str;
t.setText(str1="");}
else if (str.equals("cbrt")){ p=Double.parseDouble(t.getText());
oper=str;
t.setText(str1="");
}
else if(str.equals("log")){ p=Double.parseDouble(t.getText());
oper=str;
t.setText(str1="");
}
else if(str.equals("=")) { str1="";

if(oper.equals("+")) {
q=Double.parseDouble(t.getText());
t.setText(p+"+"+q+ String.valueOf((p+q)));}

else if(oper.equals("-")) {
q=Double.parseDouble(t.getText());
t.setText(p+"-"+q+"="+ String.valueOf((p-q)));
}
else if(oper.equals("*")){
q=Double.parseDouble(t.getText());
t.setText(p+"*"+q+"="+ String.valueOf((p*q)));
}
else if(oper.equals("%")){
q=Double.parseDouble(t.getText());
t.setText(p+"%"+q+"="+ String.valueOf((p%q)));}
else if(oper.equals("/")){
q=Double.parseDouble(t.getText());
t.setText(p+"/"+q+"="+ String.valueOf((p/q)));
}
else if(oper.equals("^")){
q=Double.parseDouble(t.getText());
t.setText(p+"^"+q+"=" +String.valueOf((Math.pow(p,q)))); }
else if(oper.equals("sqrt")){
q=Double.parseDouble(t.getText());
t.setText(String.valueOf((Math.sqrt(q))));}
else if(oper.equals("10^")){
q=Double.parseDouble(t.getText());
t.setText(String.valueOf((Math.pow(10,q)))); 
}
else if(oper.equals("ln")){
Double ops = Double.parseDouble(String.valueOf(t.getText()));
ops =Math.log(ops);
t.setText(String.valueOf (ops));
}
else if(oper.equals("a^3")){
q=Double.parseDouble(t.getText());
t.setText(String.valueOf((Math.pow(q,3)))); }
else if(oper.equals("e^x")){
q=Double.parseDouble(t.getText());
t.setText(String.valueOf((Math.pow(2.718,9)))); }
else if(oper.equals("1/x")){
q=Double.parseDouble(t.getText());
t.setText(String.valueOf(1/q));
}
else if(oper.equals("sinx")){
q=Double.parseDouble(t.getText());
t.setText(String.valueOf((Math.sin(q))));
}
else if(oper.equals("log")){
q=Double.parseDouble(t.getText());
t.setText(String.valueOf((Math.log10(q))));
}
else if(oper.equals("cosx"))
q=Double.parseDouble(t.getText());
t.setText(String.valueOf((Math.cos(q))));
}
else if(oper.equals("tanx")){
q=Double.parseDouble(t.getText());
t.setText(String.valueOf((Math.tan(q)))); }
else if(oper.equals("cbrt")){
q=Double.parseDouble(t.getText());
t.setText(String.valueOf((Math.cbrt(q))));
}
else if(str.equals("clear")){p=0;q=0;
t.setText("");
str1="";
t.setText("0");
}}}