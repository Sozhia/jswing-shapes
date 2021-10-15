package main;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Main extends JPanel {
	private JTextField circleRadiusValue;
	private JTextField ellipseMajAxValue;
	private JTextField ellipseMinAxValue;
	private JTextField sideValue;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Create the panel.
	 */
	public Main() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 450, 300);
		add(panel);
		panel.setLayout(null);
		
		JButton objectGeneratorBtn = new JButton("Generate Object");
		objectGeneratorBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		objectGeneratorBtn.setBounds(238, 263, 200, 25);
		panel.add(objectGeneratorBtn);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(238, 12, 200, 221);
		panel.add(tabbedPane);
		
		JPanel circleJPanel = new JPanel();
		tabbedPane.addTab("Circle", null, circleJPanel, null);
		circleJPanel.setLayout(null);
		
		JLabel lblCircleRadius = new JLabel("Radius");
		lblCircleRadius.setBounds(12, 12, 66, 15);
		circleJPanel.add(lblCircleRadius);
		
		circleRadiusValue = new JTextField();
		circleRadiusValue.setBounds(96, 10, 87, 19);
		circleJPanel.add(circleRadiusValue);
		circleRadiusValue.setColumns(10);
		
		JLabel lblCircleDiameter = new JLabel("Diameter");
		lblCircleDiameter.setBounds(12, 39, 66, 15);
		circleJPanel.add(lblCircleDiameter);
		
		JLabel lblCirclePerimeter = new JLabel("Perimeter");
		lblCirclePerimeter.setBounds(12, 66, 76, 15);
		circleJPanel.add(lblCirclePerimeter);
		
		JLabel lblCircleArea = new JLabel("Area");
		lblCircleArea.setBounds(12, 93, 66, 15);
		circleJPanel.add(lblCircleArea);
		
		JLabel lblCircleDiamValue = new JLabel("New label");
		lblCircleDiamValue.setBounds(117, 39, 66, 15);
		circleJPanel.add(lblCircleDiamValue);
		
		JLabel lblCirclePerimValue = new JLabel("New label");
		lblCirclePerimValue.setBounds(117, 66, 66, 15);
		circleJPanel.add(lblCirclePerimValue);
		
		JLabel lblCircleAreaValue = new JLabel("New label");
		lblCircleAreaValue.setBounds(117, 93, 66, 15);
		circleJPanel.add(lblCircleAreaValue);
		
		JPanel ellipseJPanel = new JPanel();
		tabbedPane.addTab("Ellipse", null, ellipseJPanel, null);
		ellipseJPanel.setLayout(null);
		
		JLabel lblEllipseMajorAxis = new JLabel("Major axis");
		lblEllipseMajorAxis.setBounds(12, 12, 83, 15);
		ellipseJPanel.add(lblEllipseMajorAxis);
		
		JLabel lblEllipseMinorAxis = new JLabel("Minor axis");
		lblEllipseMinorAxis.setBounds(12, 38, 83, 15);
		ellipseJPanel.add(lblEllipseMinorAxis);
		
		ellipseMajAxValue = new JTextField();
		ellipseMajAxValue.setBounds(92, 10, 91, 19);
		ellipseJPanel.add(ellipseMajAxValue);
		ellipseMajAxValue.setColumns(10);
		
		ellipseMinAxValue = new JTextField();
		ellipseMinAxValue.setBounds(92, 36, 91, 19);
		ellipseJPanel.add(ellipseMinAxValue);
		ellipseMinAxValue.setColumns(10);
		
		JLabel lblEllipsePerimeter = new JLabel("Perimeter");
		lblEllipsePerimeter.setBounds(12, 65, 83, 15);
		ellipseJPanel.add(lblEllipsePerimeter);
		
		JLabel lblEllipseArea = new JLabel("Area");
		lblEllipseArea.setBounds(12, 92, 66, 15);
		ellipseJPanel.add(lblEllipseArea);
		
		JLabel lblEllipsePerVal = new JLabel("New label");
		lblEllipsePerVal.setBounds(117, 67, 66, 15);
		ellipseJPanel.add(lblEllipsePerVal);
		
		JLabel lblEllipseAreaVal = new JLabel("New label");
		lblEllipseAreaVal.setBounds(117, 92, 66, 15);
		ellipseJPanel.add(lblEllipseAreaVal);
		
		JPanel squareJPanel = new JPanel();
		tabbedPane.addTab("Square", null, squareJPanel, null);
		squareJPanel.setLayout(null);
		
		JLabel lblSquareSide = new JLabel("Side");
		lblSquareSide.setBounds(12, 12, 66, 15);
		squareJPanel.add(lblSquareSide);
		
		sideValue = new JTextField();
		sideValue.setBounds(59, 10, 124, 19);
		squareJPanel.add(sideValue);
		sideValue.setColumns(10);
		
		JLabel perimeterLbl_2 = new JLabel("Perimeter");
		perimeterLbl_2.setBounds(12, 39, 75, 15);
		squareJPanel.add(perimeterLbl_2);
		
		JLabel lblArea_2 = new JLabel("Area");
		lblArea_2.setBounds(12, 66, 66, 15);
		squareJPanel.add(lblArea_2);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setBounds(117, 41, 66, 15);
		squareJPanel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setBounds(117, 66, 66, 15);
		squareJPanel.add(lblNewLabel_8);
		
		JPanel triangleJPanel = new JPanel();
		tabbedPane.addTab("Triangle", null, triangleJPanel, null);
		triangleJPanel.setLayout(null);
		
		JLabel lblBase = new JLabel("Base");
		lblBase.setBounds(12, 12, 66, 15);
		triangleJPanel.add(lblBase);
		
		JLabel lblHeight = new JLabel("Height");
		lblHeight.setBounds(12, 39, 66, 15);
		triangleJPanel.add(lblHeight);
		
		JLabel lblPerimeter_3 = new JLabel("Perimeter");
		lblPerimeter_3.setBounds(12, 66, 77, 15);
		triangleJPanel.add(lblPerimeter_3);
		
		JLabel lblArea_3 = new JLabel("Area");
		lblArea_3.setBounds(12, 93, 66, 15);
		triangleJPanel.add(lblArea_3);
		
		textField_4 = new JTextField();
		textField_4.setBounds(96, 10, 87, 19);
		triangleJPanel.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(96, 39, 87, 19);
		triangleJPanel.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		lblNewLabel_9.setBounds(117, 66, 66, 15);
		triangleJPanel.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("New label");
		lblNewLabel_10.setBounds(117, 93, 66, 15);
		triangleJPanel.add(lblNewLabel_10);
		

	}
}
