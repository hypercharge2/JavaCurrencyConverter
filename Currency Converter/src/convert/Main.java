 package convert;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
	JFrame mainframe = new JFrame("Currency Converter");
	mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	mainframe.setVisible(true);
	
	//image icon will be put here when i get to it
	
	JPanel mainpnl = new JPanel(new FlowLayout(FlowLayout.RIGHT));
	
	String[] currencies = new String[] { "United States Dollar", "Euro", "Japnese Yen", "Pound Sterling", "Australian Dollar", "Canadian Dolllar", "Swiss Franc", "Chinese Renminbi", "Hong Kong Dollar", "New Zeland Dollar"};     
	
	JLabel inpCurL = new JLabel();
	inpCurL.setText("Input currency:");
	JComboBox<Object> inputc = new JComboBox<Object>(currencies);
	
	
	JLabel inpamountL = new JLabel("Input Currency Amount:");
	JFormattedTextField inpamount = new JFormattedTextField();
	inpamount.setColumns(5);
	
	JLabel outputcurrencyL = new JLabel("Currency to convert to: (No dropdown yet)");
	JComboBox<Object> outputc = new JComboBox<Object>(currencies);
	
	JButton submit = new JButton();
	JLabel output = new JLabel("Output: (No output function yet)");
	
	
	
	
	
	
	
	
	mainframe.add(mainpnl);
	mainpnl.add(inpCurL);
	mainpnl.add(inputc);
	mainpnl.add(inpamountL);
	mainpnl.add(inpamount);
	mainpnl.add(outputcurrencyL);
	mainpnl.add(outputc);
	mainpnl.add(submit);
	mainpnl.add(output);
	mainframe.pack();
	
	}

}
