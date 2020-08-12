package main;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class ConversionApplet extends Frame implements ActionListener {

	Label conversion1Label = new Label("Select 1st convertor");
	Label conversion2Label = new Label("Select 2nd convertor");
		Button genButton2 = new Button("Convert");
	Button genButton = new Button("Convert");
	TextArea scrollTxtArea = new TextArea(5,60);
	String[] choices1 = {"select", "KG","LTR", "KM","CM"};
    final JComboBox<String> c1 = new JComboBox<String>(choices1);
    String[] choices2 = {"select", "GRAMS","ML", "M","MM"};
    final JComboBox<String> c2 = new JComboBox<String>(choices2);
    Label loggerLabel = new Label("Output ");
    Label loggerLabeldummy = new Label(" ");
    
	public static void main(String s[]) {
		ConversionApplet l = new ConversionApplet();
		l.setSize(new Dimension(700, 500));
		l.setTitle("Convertor UI");
		l.setVisible(true);
	}

	public ConversionApplet()
	{
		add(conversion1Label);
	    add(c1);
	    add(c2);
		add(conversion2Label);
		add(genButton);
		add(loggerLabel);
		add(scrollTxtArea);
		add(loggerLabeldummy);
		
		
		conversion1Label.setBounds(20, 90, 130, 20);
	    c1.setBounds(160, 90, 130, 20);
		conversion2Label.setBounds(20, 135, 130, 20);
		c2.setBounds(160, 135, 130, 20);
		genButton.setBounds(160, 170, 130, 20);
		loggerLabel.setBounds(20, 200, 130, 20);
		scrollTxtArea.setBounds(160, 200, 500, 200);
		loggerLabeldummy.setBounds(100, 300, 500, 200);
		genButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				System.out.println("button get1Button pressed.... ");
				if (c1.getSelectedItem().toString().equals("") || c1.getSelectedItem().toString().equals("select")) {
					JOptionPane.showMessageDialog(null, "Please select 1st convertor",
							"Error", JOptionPane.ERROR_MESSAGE);

				} else if (c2.getSelectedItem().toString().equals("") || c2.getSelectedItem().toString().equals("select")) {
					JOptionPane.showMessageDialog(null, "Please select 2nd convertor ",
							"Error", JOptionPane.ERROR_MESSAGE);

				}
				
				else {
					String c1selected = c1.getSelectedItem().toString();
					String c2selected = c2.getSelectedItem().toString();
					StringBuffer cases= new StringBuffer(c1selected+" to "+c2selected);
					try {
						
					System.out.print(cases);
					
					switch(cases.toString()) {
					  case "KG to GRAMS":
					    // code block
						  System.out.print(cases);
					  cases.append(" conversion : 1 Kilogram = 1000 miligrams");
					    break;
					  case "KG to ML":
						    // code block
					  cases.append(" : Invalid convertor parameter");
						  JOptionPane.showMessageDialog(null, "Please select proper convertor ",
									"Error", JOptionPane.ERROR_MESSAGE);
						    break;
					  case "KG to M":
						    // code block
						  cases.append(" : Invalid convertor parameter");
						  JOptionPane.showMessageDialog(null, "Please select proper convertor ",
									"Error", JOptionPane.ERROR_MESSAGE);
						    break;
					  case "KG to MM":
						    // code block
						  cases.append(" : Invalid convertor parameter");
						  JOptionPane.showMessageDialog(null, "Please select proper convertor ",
									"Error", JOptionPane.ERROR_MESSAGE);
						    break;
						    
						    
					  case "LTR to ML":
					    // code block
						  System.out.print(cases);
						  cases.append(" conversion : 1 litre = 1000 mililitre");
						  break;
					  case "LTR to M":
						    // code block
						  cases.append(" : Invalid convertor parameter");
						  JOptionPane.showMessageDialog(null, "Please select proper convertor ",
									"Error", JOptionPane.ERROR_MESSAGE);
						    break;
					  case "LTR to GRAMS":
						    // code block
						  cases.append(" : Invalid convertor parameter");
						  JOptionPane.showMessageDialog(null, "Please select proper convertor ",
									"Error", JOptionPane.ERROR_MESSAGE);
						    break;
					  case "LTE to MM":
						    // code block
						  cases.append(" : Invalid convertor parameter");
						  JOptionPane.showMessageDialog(null, "Please select proper convertor ",
									"Error", JOptionPane.ERROR_MESSAGE);
						    break;
						    
					  case "KM to M":
						    // code block
						  System.out.print(cases);
						  cases.append(" conversion : 1 Kilometer = 1000 meter");
						 break;
					  case "KM to GRAMS":
						    // code block
						  cases.append(" : Invalid convertor parameter");
						  JOptionPane.showMessageDialog(null, "Please select proper convertor ",
									"Error", JOptionPane.ERROR_MESSAGE);
						    break;
					  case "KM to ML":
						    // code block
						  cases.append(" : Invalid convertor parameter");
						  JOptionPane.showMessageDialog(null, "Please select proper convertor ",
									"Error", JOptionPane.ERROR_MESSAGE);
						    break;
					  case "KM to MM":
						    // code block
						  cases.append(" : Invalid convertor parameter");
						  JOptionPane.showMessageDialog(null, "Please select proper convertor ",
									"Error", JOptionPane.ERROR_MESSAGE);
						    break;
						    
						    
					  case "CM to MM":
						    // code block
						  System.out.print(cases);
						  cases.append(" conversion : 1 centimeter = 10 milimeter");
					    break;
					  case "CM to GRAMS":
						    // code block
						  cases.append(" : Invalid convertor parameter");
						  JOptionPane.showMessageDialog(null, "Please select proper convertor ",
									"Error", JOptionPane.ERROR_MESSAGE);
						    break;
					  case "CM to ML":
						    // code block
						  cases.append(" : Invalid convertor parameter");
						  JOptionPane.showMessageDialog(null, "Please select proper convertor ",
									"Error", JOptionPane.ERROR_MESSAGE);
						    break;
					  case "CM to M":
						    // code block
						  cases.append(" : Invalid convertor parameter");
						  JOptionPane.showMessageDialog(null, "Please select proper convertor ",
									"Error", JOptionPane.ERROR_MESSAGE);
						    break;
						    
						    
					}
					updateJtextArea(cases);

					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

				}

			}
		});
		
		addWindowListener(new mwat());
		
	}

	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	

	private void updateJtextArea(final StringBuffer clientSentence) {
		scrollTxtArea.append(clientSentence + "\n");
	}
	
}

class mwat extends WindowAdapter {
	public mwat() {
	}

	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
}