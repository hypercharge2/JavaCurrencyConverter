 package convert;

import java.awt.FlowLayout;

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
	
	JLabel inpCurL = new JLabel();
	inpCurL.setText("Input currency:(no dropdown yet)");
	
	JLabel inpamountL = new JLabel("Input Currency Amount:");
	JFormattedTextField inpamount = new JFormattedTextField();
	inpamount.setColumns(5);
	
	JLabel outputcurrency = new JLabel("Output currency: (No dropdown yet)");
	JLabel output = new JLabel("Output: (No output function yet)");
	mainframe.add(mainpnl);
	mainpnl.add(inpCurL);
	//placeholder for when i make the currency dropdown
	mainpnl.add(inpamountL);
	mainpnl.add(inpamount);
	mainpnl.add(outputcurrency);
	//placeholder for when i make the output currency dropdown
	mainpnl.add(output);
	mainframe.pack();
	
	}

}
