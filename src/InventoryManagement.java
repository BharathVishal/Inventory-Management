import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;
class InventoryManagement
{
JFrame f;
JPanel p0,p1,own,pnew,wel,cus;
JTabbedPane tp;
int abc=0;
ImageIcon btnimg1,btnimg2;
JLabel l000,l00,l01,l02,l1,l2,l3,l4,l44,l45,l46,l47,l48,l5,l6,l7,l8,l9,l10,l31,l32,l33,l34,l35,l36,l37;
JTextField tf00,tf01,tf1,tf2,tf3,tf4,tf44,tf45,tf46,tf47,tf5,tf6,tf7,tf8,tf9,tf10;
JScrollPane sp1;
JButton login,newagent,savebtn,resetbtn,logout,customer,owner,modify;
static ResultSet res;
static Connection conn;
static Statement stat;

JTextField tf31,tf32,tf33,tf34,tf35;
JLabel l311;
JButton addcus,rescus,findcus,modcus;

JLabel l51,l52,l53,l54,l55,l56,l57,l58,l59;
JTextField tf51,tf52,tf53,tf54,tf55,tf56,tf57,tf58,tf59;


JLabel l61,l62,l63,l64,l65,l66,l67;
JTextField tf61,tf62,tf63,tf64,tf65,tf66,tf67;
JButton findown,modown;


InventoryManagement()
{
f=new JFrame("Inventory Management system");
f.setSize(1024,768);
p0=new JPanel(new GridLayout(3,2));
wel=new JPanel(new GridLayout(9,2));
p1=new JPanel(new GridLayout(9,2));
cus=new JPanel(new GridLayout(12,2));
own=new JPanel(new GridLayout(8,2));
tp=new JTabbedPane();


l000=new JLabel(":");
l00=new JLabel("Agent Login");
l01=new JLabel("User name :");
l02=new JLabel("Password:");

l311=new JLabel("Welcome ");
l1=new JLabel("New Agent:");
l2=new JLabel("Name:");
l3=new JLabel("Address:");
l4=new JLabel("Username:");
l31=new JLabel("Name:");
l32=new JLabel("Address:");
l33=new JLabel("username:");
l34=new JLabel("Password:");
l35=new JLabel("Earnings:");
l36=new JLabel("Last Transaction:");
l37=new JLabel("Total earnings:");
l44=new JLabel("password:");
l45=new JLabel("Earnings:");
l46=new JLabel("Last Transaction:");
l47=new JLabel("Total items(no):");


l51=new JLabel("Name :");
l52=new JLabel("Address :");
l53=new JLabel("Order Date :");
l54=new JLabel("Item 1:");
l55=new JLabel("Item 2:");
l56=new JLabel("Quantity 1 :");
l57=new JLabel("Quantity 2:");
l58=new JLabel("Clerk assigned :");
l59=new JLabel("Money paid:");

l5=new JLabel("Enter Employee ID to delete record:");
l7=new JLabel("Employee ID:");
l8=new JLabel("Employee Name:");
l9=new JLabel("Employee Address:");
l10=new JLabel("Salary:");


l61=new JLabel("Owner name:");
l62=new JLabel("Stock Type:");
l63=new JLabel("Provider:");
l64=new JLabel("Previous balance:");
l65=new JLabel("Quantity max:");
l66=new JLabel("Credit:");
l67=new JLabel("Total Transaction:");

tf00=new JTextField(12);
tf01=new JTextField(12);
tf1=new JTextField(12);
tf2=new JTextField(12);
tf3=new JTextField(12);
tf4=new JTextField(12);
tf44=new JTextField(12);
tf44=new JTextField(12);
tf45=new JTextField(12);
tf46=new JTextField(12);
tf47=new JTextField(12);
tf5=new JTextField(12);
tf6=new JTextField(12);
tf7=new JTextField(12);
tf8=new JTextField(12);
tf9=new JTextField(12);
tf10=new JTextField(12);
tf31=new JTextField(12);
tf32=new JTextField(12);
tf33=new JTextField(12);
tf34=new JTextField(12);
tf35=new JTextField(12);
tf51=new JTextField(12);
tf52=new JTextField(12);
tf53=new JTextField(12);
tf54=new JTextField(12);
tf55=new JTextField(12);
tf56=new JTextField(12);
tf57=new JTextField(12);
tf58=new JTextField(12);
tf59=new JTextField(12);



tf61=new JTextField(12);
tf62=new JTextField(12);
tf63=new JTextField(12);
tf64=new JTextField(12);
tf65=new JTextField(12);
tf66=new JTextField(12);
tf67=new JTextField(12);


login=new JButton(" Login ");
logout=new JButton(" Logout ");
customer=new JButton(" Customer ");
owner=new JButton(" Owner ");
modify=new JButton(" Modify ");
newagent=new JButton(" New Agent?Register");
savebtn=new JButton(" Add ");
resetbtn=new JButton(" Reset");
addcus=new JButton("Add new Customer");
modcus=new JButton("Modify details");
findcus=new JButton("Find");
rescus=new JButton("Reset fields");

findown=new JButton("Find Owner");
modown=new JButton("Modify Owner");





modown.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent ae){
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
conn = DriverManager.getConnection("jdbc:odbc:mydsn2");
int x=JOptionPane.showConfirmDialog(own,"Confirm edit? All data will be replaced");
if(x==0){
try{
String value1=tf61.getText();
String value2=tf62.getText();
String value3=tf63.getText();
String value4=tf64.getText();
String value5=tf65.getText();
String value6=tf66.getText();
String value7=tf67.getText();
Statement st=conn.createStatement();
st.executeUpdate("update owner set oname='"+value1+"',stocktype='"+value2+"',pname='"+value3+"',previousbalance='"+value4+"',quantitymax='"+value5+"',credit='"+value6+"',totaltransaction='"+value7+"' where oname='"+value1+"'");
JOptionPane.showMessageDialog(own,"Updated successfully");
conn.close();
}
catch(Exception ex)
{
JOptionPane.showMessageDialog(own,"Error in updating edit fields");
}
}
}//try1
catch(Exception ex)
{
JOptionPane.showMessageDialog(own,"Error");
}
}
});





modcus.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent ae){
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
conn = DriverManager.getConnection("jdbc:odbc:mydsn1");
int x=JOptionPane.showConfirmDialog(cus,"Confirm edit? All data will be replaced");
if(x==0){
try{
String value1=tf51.getText();
String value2=tf52.getText();
String value3=tf53.getText();
String value4=tf54.getText();
String value5=tf55.getText();
String value6=tf56.getText();
String value7=tf57.getText();
String value8=tf58.getText();
String value9=tf59.getText();
Statement st=conn.createStatement();
st.executeUpdate("update customer set cname='"+value1+"', address='"+value2+"',orderdate='"+value3+"',item1='"+value4+"',item2='"+value5+"',quantity1='"+value6+"',quantity2='"+value7+"',clerkassigned='"+value8+"',moneypaid='"+value9+"' where cname='"+value1+"'");
JOptionPane.showMessageDialog(cus,"Updated successfully");
conn.close();
}
catch(Exception ex)
{
JOptionPane.showMessageDialog(cus,"Error in updating edit fields");
}
}
}//try1
catch(Exception ex)
{
JOptionPane.showMessageDialog(cus,"Error");
}
}
});





addcus.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent ae){
String value1=tf51.getText();
String value2=tf52.getText();
String value3=tf53.getText();
String value4=tf54.getText();
String value5=tf55.getText();
String value6=tf56.getText();
String value7=tf57.getText();
String value8=tf58.getText();
String value9=tf59.getText();
try{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
conn = DriverManager.getConnection("jdbc:odbc:mydsn1");
PreparedStatement st=conn.prepareStatement("insert into customer(cname,address,orderdate,item1,item2,quantity1,quantity2,clerkassigned,moneypaid) values(?,?,?,?,?,?,?,?,?)");
st.setString(1,value1);
st.setString(2,value2);
st.setString(3,value3);
st.setString(4,value4);
st.setString(5,value5);
st.setString(6,value6);
st.setString(7,value7);
st.setString(8,value8);
st.setString(9,value9);
st.executeUpdate();
JOptionPane.showMessageDialog(cus,"Data is successfully inserted into database.");
conn.close();
}
catch(Exception e){
JOptionPane.showMessageDialog(cus,"Error in submitting data!");
}
}
});

findcus.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent ae){
String value1=tf51.getText();
try{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
conn = DriverManager.getConnection("jdbc:odbc:mydsn1"); 
stat = conn.createStatement();
res = stat.executeQuery("Select * from customer where cname='"+value1+"'");  
res.next();
tf51.setText(res.getString(1));
tf52.setText(res.getString(2));
tf53.setText(res.getString(3));
tf54.setText(res.getString(4));
tf55.setText(res.getString(5));
tf56.setText(res.getString(6));
tf57.setText(res.getString(7));
tf58.setText(res.getString(8));
tf59.setText(res.getString(9));
JOptionPane.showMessageDialog(cus,"Record found");  
}
catch(Exception e)  {}
}
});


findown.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent ae){
String value1=tf61.getText();
try{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
conn = DriverManager.getConnection("jdbc:odbc:mydsn2"); 
stat = conn.createStatement();
res = stat.executeQuery("Select * from owner where oname='"+value1+"'");  
res.next();
tf61.setText(res.getString(1));
tf62.setText(res.getString(2));
tf63.setText(res.getString(3));
tf64.setText(res.getString(4));
tf65.setText(res.getString(5));
tf66.setText(res.getString(6));
tf67.setText(res.getString(7));
JOptionPane.showMessageDialog(own,"Record found");  
}
catch(Exception e)  {}
}
});


p0.add(l01);
p0.add(tf00);
p0.add(l02);
p0.add(tf01);
p0.add(login);
p0.add(newagent);

p1.add(l33);
p1.add(l000);
p1.add(l31);
p1.add(tf2);
p1.add(l32);
p1.add(tf3);
p1.add(l33);
p1.add(tf4);
p1.add(l34);
p1.add(tf44);
p1.add(l35);
p1.add(tf45);
p1.add(l36);
p1.add(tf46);
p1.add(l37);
p1.add(tf47);
p1.add(savebtn);
p1.add(resetbtn);

wel.add(l311);
wel.add(l000);
wel.add(l2);
wel.add(tf31);
wel.add(l4);
wel.add(tf32);
wel.add(l45);
wel.add(tf33);
wel.add(l46);
wel.add(tf34);
wel.add(l47);
wel.add(tf35);
wel.add(logout);
wel.add(customer);
wel.add(owner);
wel.add(modify);


cus.add(l51);
cus.add(tf51);
cus.add(l52);
cus.add(tf52);
cus.add(l53);
cus.add(tf53);
cus.add(l54);
cus.add(tf54);
cus.add(l55);
cus.add(tf55);
cus.add(l56);
cus.add(tf56);
cus.add(l57);
cus.add(tf57);
cus.add(l58);
cus.add(tf58);
cus.add(l59);
cus.add(tf59);
cus.add(addcus);
cus.add(rescus);
cus.add(findcus);
cus.add(modcus);

own.add(l61);
own.add(tf61);
own.add(l62);
own.add(tf62);
own.add(l63);
own.add(tf63);
own.add(l64);
own.add(tf64);
own.add(l65);
own.add(tf65);
own.add(l66);
own.add(tf66);
own.add(l67);
own.add(tf67);
own.add(findown);
own.add(modown);


rescus.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent ae){
tf51.setText("");
tf52.setText("");
tf53.setText("");
tf54.setText("");
tf55.setText("");
tf56.setText("");
tf57.setText("");
tf58.setText("");
tf59.setText("");
}
});


logout.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent ae){
JOptionPane.showMessageDialog(wel,"Logged out sucessfully"); 
tf1.setText("");
tf2.setText("");
tf3.setText("");
tf4.setText("");
tf4.setText("");
tf44.setText("");
tf45.setText("");
tf46.setText("");
tf47.setText("");
tf31.setText("");
tf32.setText("");
tf33.setText("");
tf34.setText("");
tf35.setText("");
tf00.setText("");
tf01.setText("");
}
});


resetbtn.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent ae){
tf1.setText("");
tf2.setText("");
tf3.setText("");
tf4.setText("");
tf4.setText("");
tf44.setText("");
tf45.setText("");
tf46.setText("");
tf47.setText("");

}
});


login.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent ae){
String value1=tf00.getText();
String value2=tf01.getText();
try{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
conn = DriverManager.getConnection("jdbc:odbc:mydsn"); 
stat = conn.createStatement();
res = stat.executeQuery("Select * from agent1 where username='"+value1+"' and password='"+value2+"'"); 
res.next();
tf31.setText(res.getString(1));
tf32.setText(res.getString(3));
tf33.setText(res.getString(5));
tf34.setText(res.getString(6));
tf35.setText(res.getString(7));
JOptionPane.showMessageDialog(p0,"Logged on sucessfully");  
}
catch(Exception e)  {}
}
});



customer.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent ae){
JOptionPane.showMessageDialog(wel,"Click on the customer pane"); 
}
});

owner.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent ae){
JOptionPane.showMessageDialog(wel,"Click on the owner pane");  
}
});



newagent.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent ae){
JOptionPane.showMessageDialog(p0,"Click on the new agent pane");  
}
});


savebtn.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent ae){
String value1=tf2.getText();
String value2=tf3.getText();
String value3=tf4.getText();
String value4=tf44.getText();
String value5=tf45.getText();
String value6=tf46.getText();
String value7=tf47.getText();

try{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
conn = DriverManager.getConnection("jdbc:odbc:mydsn");
PreparedStatement st=conn.prepareStatement("insert into agent1(aname,address,username,password,earnings,lasttransaction,totalitems) values(?,?,?,?,?,?,?)");
st.setString(1,value1);
st.setString(2,value2);
st.setString(3,value3);
st.setString(4,value4);
st.setString(5,value5);
st.setString(6,value6);
st.setString(7,value7);
st.executeUpdate();
JOptionPane.showMessageDialog(p1,"Data is successfully inserted into database.");
conn.close();
}
catch(Exception e){
JOptionPane.showMessageDialog(p1,"Error in submitting data!");
}
}
});





modify.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent ae){
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
conn = DriverManager.getConnection("jdbc:odbc:mydsn");
int x=JOptionPane.showConfirmDialog(wel,"Confirm edit? All data will be replaced");
if(x==0){
try{
String value1=tf31.getText();
String value2=tf32.getText();
String value3=tf33.getText();
String value4=tf34.getText();
String value5=tf35.getText();
Statement st=conn.createStatement();
st.executeUpdate("update agent1 set aname='"+value1+"', earnings='"+value3+"',lasttransaction='"+value4+"',totalitems='"+value5+"' where username='"+value2+"'");
JOptionPane.showMessageDialog(wel,"Updated successfully");
conn.close();
}
catch(Exception ex)
{
JOptionPane.showMessageDialog(wel,"Error in updating edit fields");
}
}
}//try1
catch(Exception ex)
{
JOptionPane.showMessageDialog(wel,"Error");
}
}
});
}



void display()
{
 f.getContentPane().add(tp);
 tp.addTab("Login",p0);
 tp.addTab("New Agent",p1);
 tp.addTab("Welcome user",wel);
 tp.addTab("Customer",cus);
 tp.addTab("Owner and provider",own);
 f.setSize(1024,768);
 f.setVisible(true);
 f.setResizable(true);
}


 public static void main(String z[])
 {
  InventoryManagement pro=new InventoryManagement();
  pro.display();
 }
}

