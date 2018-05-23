import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener{

	private JLabel label = new JLabel();
	private JTextField textField = new JTextField();
	private JRadioButton on = new JRadioButton("on");
	private JRadioButton off= new JRadioButton("off");
	
	//private JButton[] buttons = new JButton[19];
	private JButton zero = new JButton("0");
	private JButton one = new JButton("1");
	private JButton two = new JButton("2");
	private JButton three = new JButton("3");
	private JButton four = new JButton("4");
	private JButton five = new JButton("5");
	private JButton six = new JButton("6");
	private JButton seven = new JButton("7");
	private JButton eight = new JButton("8");
	private JButton nine = new JButton("9");
	private JButton dot = new JButton(",");
	private JButton clear = new JButton("clc");
	private JButton backspace = new JButton("<--");
	private JButton equals = new JButton("=");
	private JButton multiply = new JButton("x");
	private JButton divide = new JButton("/");
	private JButton plus = new JButton("+");
	private JButton minus = new JButton("-");
	private JButton sqroot = new JButton("sqrt");
	private JFrame frame = new JFrame("Calculator");
	private JPanel mainPanel;
	private JPanel northPanel;
	private JPanel radioPanel;
	private double num, ans;
	private int calculation;
	Font font = new Font("Calibri", Font.BOLD,18);
	Font font2 = new Font("Calibri", Font.BOLD,25);
	
	
	public void run(){
		
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(on);
		buttonGroup.add(off);
		on.setSelected(true);
		on.setEnabled(false);
		off.setEnabled(true);
		
		setFonts(font);
		
		GridLayout grid = new GridLayout(5,4);
		grid.setHgap(15);
		grid.setVgap(15);
		
		GridLayout radioGrid = new GridLayout(2,1);
		//grid.setHgap(10);
		//grid.setVgap(10);
		
		mainPanel = new JPanel(grid);
		radioPanel = new JPanel(radioGrid);
		radioPanel.add(on);
		radioPanel.add(off);
		
		mainPanel.add(radioPanel);
		mainPanel.add(clear);
		mainPanel.add(backspace);
		mainPanel.add(plus);
		mainPanel.add(seven);
		mainPanel.add(eight);
		mainPanel.add(nine);
		mainPanel.add(minus);
		mainPanel.add(four);
		mainPanel.add(five);
		mainPanel.add(six);
		mainPanel.add(multiply);
		mainPanel.add(one);
		mainPanel.add(two);
		mainPanel.add(three);
		mainPanel.add(divide);
		mainPanel.add(dot);
		mainPanel.add(zero);
		mainPanel.add(equals);
		mainPanel.add(sqroot);
		




		
		label.setText(" ");
		northPanel = new JPanel();
		northPanel.setLayout(new BoxLayout(northPanel, BoxLayout.PAGE_AXIS));
		northPanel.add(label);
		northPanel.add(textField);
		northPanel.setPreferredSize(new Dimension(300,75));
		
		//mainPanel.setBackground(Color.DARK_GRAY);
		//radioPanel.setBackground(Color.DARK_GRAY);
		//northPanel.setBackground(Color.DARK_GRAY);
		//textField.setBackground(Color.blue);
		
		frame.add(mainPanel, BorderLayout.CENTER);
		frame.add(northPanel, BorderLayout.NORTH);
		
		on.addActionListener(this);
		off.addActionListener(this);
		seven.addActionListener(this);
		eight.addActionListener(this);
		nine.addActionListener(this);
		four.addActionListener(this);
		five.addActionListener(this);
		six.addActionListener(this);
		one.addActionListener(this);
		two.addActionListener(this);
		three.addActionListener(this);
		dot.addActionListener(this);
		zero.addActionListener(this);
		equals.addActionListener(this);
		plus.addActionListener(this);
		minus.addActionListener(this);
		multiply.addActionListener(this);
		divide.addActionListener(this);
		clear.addActionListener(this);
		backspace.addActionListener(this);
		sqroot.addActionListener(this);
		
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(350,500);
		frame.setResizable(false);
		frame.setVisible(true);
	}
	
	public void setFonts(Font fo){
		textField.setFont(font2);
		seven.setFont(font);
		eight.setFont(font);
		nine.setFont(font);
		four.setFont(font);
	    five.setFont(font);
		six.setFont(font);
		one.setFont(font);
		two.setFont(font);
		three.setFont(font);
		dot.setFont(font);
		zero.setFont(font);
		equals.setFont(font);
		plus.setFont(font);
		minus.setFont(font);
		multiply.setFont(font);
		divide.setFont(font);
		clear.setFont(font);
		sqroot.setFont(font);
		backspace.setFont(font);
		label.setFont(font2);
	}
	
	public void actionPerformed(ActionEvent e){
		
		if(e.getSource()==on)
		{
			enable();
		}
		
		else if(e.getSource()==off)
		{
			disable();
		}
		else if(e.getSource()==clear)
		{
			textField.setText(" ");
			label.setText(" ");
		}
		
		else if(e.getSource()==backspace)
		{
			int length=textField.getText().length();
				int number=length-1;
				
				
				if(length>0)
				{
					StringBuilder back=new StringBuilder(textField.getText());
					back.deleteCharAt(number);
					textField.setText(back.toString());
					
				}
			
		}
		else if(e.getSource()==zero)
		{
			textField.setText(textField.getText()+"0");
		}
		
		
		else if(e.getSource()==one)
		{
			textField.setText(textField.getText()+"1");
		}
		
		else if(e.getSource()==two)
		{
			textField.setText(textField.getText()+"2");
		}
		
		else if(e.getSource()==three)
		{
			textField.setText(textField.getText()+"3");
		}
		
		else if(e.getSource()==four)
		{
			textField.setText(textField.getText()+"4");
		}
		
		else if(e.getSource()==five)
		{
			textField.setText(textField.getText()+"5");
		}
		
		else if(e.getSource()==six)
		{
			textField.setText(textField.getText()+"6");
		}
		
		else if(e.getSource()==seven)
		{
			textField.setText(textField.getText()+"7");
		}
		
		else if(e.getSource()==eight)
		{
			textField.setText(textField.getText()+"8");
		}
		else if(e.getSource()==nine)
		{
			textField.setText(textField.getText()+"9");
				
		}
		
		else if(e.getSource()==dot)
		{
			textField.setText(textField.getText()+".");
		}
		else if(e.getSource()==plus)
		{
			num=Double.parseDouble(textField.getText());
			textField.setText(" ");
				label.setText(num+"+");
				calculation=1;
		}
		else if(e.getSource()==minus)
		{
			num=Double.parseDouble(textField.getText());
			textField.setText(" ");
				label.setText(num+"-");
				calculation=2;
		}
		else if(e.getSource()==multiply)
		{
			num=Double.parseDouble(textField.getText());
			textField.setText(" ");
				label.setText(num+"x");
				calculation=3;
		}
		
		else if(e.getSource()==divide)
		{
			num=Double.parseDouble(textField.getText());
			textField.setText(" ");
				label.setText(num+"/");
				calculation=4;
		}
		else if(e.getSource()==sqroot)
		{
			num=Double.parseDouble(textField.getText());
			ans=Math.sqrt(Double.parseDouble(textField.getText()));
			textField.setText(Double.toString(ans));
		}
		else if(e.getSource()==equals)
		{
			switch(calculation)
				{
					case 1:
					        ans=num + Double.parseDouble(textField.getText());
					        textField.setText(Double.toString(ans));
							label.setText(" ");
							break;
					case 2:
							ans=num - Double.parseDouble(textField.getText());
							textField.setText(Double.toString(ans));
							label.setText(" ");
							break;
					case 3:
							ans=num * Double.parseDouble(textField.getText());
							textField.setText(Double.toString(ans));
							label.setText(" ");
							break;
					case 4:
							ans=num / Double.parseDouble(textField.getText());
							textField.setText(Double.toString(ans));
							label.setText(" ");
							break;
								
				}
			num=0;
		
		}
		
	}
	
	public void enable()
	{
		on.setEnabled(false);
		off.setEnabled(true);
		textField.setEnabled(true);
		dot.setEnabled(true);
		zero.setEnabled(true);
		one.setEnabled(true);
		two.setEnabled(true);
		three.setEnabled(true);
		four.setEnabled(true);
		five.setEnabled(true);
		six.setEnabled(true);
		seven.setEnabled(true);
		eight.setEnabled(true);
		nine.setEnabled(true);
		plus.setEnabled(true);
		minus.setEnabled(true);
		multiply.setEnabled(true);
		divide.setEnabled(true);
		equals.setEnabled(true);
		clear.setEnabled(true);
		backspace.setEnabled(true);
		sqroot.setEnabled(true);
	
	}
	
	public void disable()
	{
		textField.setText(" ");
		label.setText(" ");
		off.setEnabled(false);
		on.setEnabled(true);
		textField.setEnabled(false);
		dot.setEnabled(false);
		zero.setEnabled(false);
		one.setEnabled(false);
		two.setEnabled(false);
		three.setEnabled(false);
		four.setEnabled(false);
		five.setEnabled(false);
		six.setEnabled(false);
		seven.setEnabled(false);
		eight.setEnabled(false);
		nine.setEnabled(false);
		plus.setEnabled(false);
		minus.setEnabled(false);
		multiply.setEnabled(false);
		divide.setEnabled(false);
		equals.setEnabled(false);
		clear.setEnabled(false);
		backspace.setEnabled(false);
		sqroot.setEnabled(false);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Calculator().run();
		
	}

}
