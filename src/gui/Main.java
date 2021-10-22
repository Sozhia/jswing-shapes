package gui;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import main.Circle;
import main.Ellipse;
import main.Shape;
import main.Square;
import main.Triangle;

import javax.swing.JButton;
import java.awt.Canvas;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main {

	private JFrame frame;
	private JTextField txEllipseMajAxValue;
	private JTextField txEllipseMinAxValue;
	private JTextField txCircleRadValue;
	private JTextField txSquareSideValue;
	private JTextField txTriangleSideValue;

	static ArrayList<Shape> shapesArray = new ArrayList<Shape>();
	
	public JLabel lblTriangleAreaValue = new JLabel("-");
	public JLabel lblTrianglePerValue = new JLabel("-");
	public JLabel lblEllipsePerValue = new JLabel("-");
	public JLabel lblEllipseAreaValue = new JLabel("-");
	public JLabel lblCircleAreaValue = new JLabel("-");
	public JLabel lblCirclePerValue = new JLabel("-");
	public JLabel lblSquarePerValue = new JLabel("-");
	public JLabel lblSquareAreaValue = new JLabel("-");
	
	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 640, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 604, 191);
		frame.getContentPane().add(tabbedPane);
		
		JPanel ellipsePanel = new JPanel();
		tabbedPane.addTab("Ellipse", null, ellipsePanel, null);
		ellipsePanel.setLayout(null);
		
		JLabel lblEllipseMajAx = new JLabel("Major Axis");
		lblEllipseMajAx.setBounds(10, 11, 71, 14);
		ellipsePanel.add(lblEllipseMajAx);
		
		txEllipseMajAxValue = new JTextField();
		txEllipseMajAxValue.setHorizontalAlignment(SwingConstants.CENTER);
		txEllipseMajAxValue.setBounds(91, 11, 103, 20);
		ellipsePanel.add(txEllipseMajAxValue);
		txEllipseMajAxValue.setColumns(10);
		
		txEllipseMinAxValue = new JTextField();
		txEllipseMinAxValue.setHorizontalAlignment(SwingConstants.CENTER);
		txEllipseMinAxValue.setBounds(91, 42, 103, 20);
		ellipsePanel.add(txEllipseMinAxValue);
		txEllipseMinAxValue.setColumns(10);
		
		JLabel lblEllipseMinAx = new JLabel("Minor Axis");
		lblEllipseMinAx.setBounds(10, 45, 71, 14);
		ellipsePanel.add(lblEllipseMinAx);
		
		
		lblEllipsePerValue.setHorizontalAlignment(SwingConstants.CENTER);
		lblEllipsePerValue.setBounds(91, 73, 103, 14);
		ellipsePanel.add(lblEllipsePerValue);
		
		JLabel lblEllipsePerimeter = new JLabel("Perimeter");
		lblEllipsePerimeter.setBounds(10, 73, 71, 14);
		ellipsePanel.add(lblEllipsePerimeter);
		
		
		lblEllipseAreaValue.setHorizontalAlignment(SwingConstants.CENTER);
		lblEllipseAreaValue.setBounds(91, 98, 103, 14);
		ellipsePanel.add(lblEllipseAreaValue);
		
		JLabel lblEllipseArea = new JLabel("Area");
		lblEllipseArea.setBounds(10, 98, 71, 14);
		ellipsePanel.add(lblEllipseArea);
		
		JPanel circlePanel = new JPanel();
		tabbedPane.addTab("Circle", null, circlePanel, null);
		circlePanel.setLayout(null);
		
		JLabel lblCircleRadius = new JLabel("Radius");
		lblCircleRadius.setBounds(10, 11, 46, 14);
		circlePanel.add(lblCircleRadius);
		
		txCircleRadValue = new JTextField();
		txCircleRadValue.setBounds(91, 8, 103, 20);
		circlePanel.add(txCircleRadValue);
		txCircleRadValue.setColumns(10);
		
		
		lblCirclePerValue.setHorizontalAlignment(SwingConstants.CENTER);
		lblCirclePerValue.setBounds(91, 43, 103, 14);
		circlePanel.add(lblCirclePerValue);
		
		
		lblCircleAreaValue.setHorizontalAlignment(SwingConstants.CENTER);
		lblCircleAreaValue.setBounds(91, 68, 103, 14);
		circlePanel.add(lblCircleAreaValue);
		
		JLabel lblCirclePerimeter = new JLabel("Perimeter");
		lblCirclePerimeter.setBounds(10, 43, 46, 14);
		circlePanel.add(lblCirclePerimeter);
		
		JLabel lblCircleArea = new JLabel("Area");
		lblCircleArea.setBounds(10, 68, 46, 14);
		circlePanel.add(lblCircleArea);
		
		JPanel squarePanel = new JPanel();
		tabbedPane.addTab("Square", null, squarePanel, null);
		squarePanel.setLayout(null);
		
		txSquareSideValue = new JTextField();
		txSquareSideValue.setHorizontalAlignment(SwingConstants.CENTER);
		txSquareSideValue.setBounds(91, 11, 103, 20);
		squarePanel.add(txSquareSideValue);
		txSquareSideValue.setColumns(10);
		
		JLabel lblSquareSide = new JLabel("Side");
		lblSquareSide.setBounds(10, 14, 46, 14);
		squarePanel.add(lblSquareSide);
		
		
		lblSquarePerValue.setHorizontalAlignment(SwingConstants.CENTER);
		lblSquarePerValue.setBounds(91, 42, 103, 14);
		squarePanel.add(lblSquarePerValue);
		
		JLabel lblSquarePerimeter = new JLabel("Perimeter");
		lblSquarePerimeter.setBounds(10, 42, 46, 14);
		squarePanel.add(lblSquarePerimeter);
		
		lblSquareAreaValue.setHorizontalAlignment(SwingConstants.CENTER);
		lblSquareAreaValue.setBounds(91, 67, 103, 14);
		squarePanel.add(lblSquareAreaValue);
		
		JLabel lblSquareArea = new JLabel("Area");
		lblSquareArea.setBounds(10, 67, 46, 14);
		squarePanel.add(lblSquareArea);
		
		JPanel trianglePanel = new JPanel();
		tabbedPane.addTab("Triangle", null, trianglePanel, null);
		trianglePanel.setLayout(null);
		
		txTriangleSideValue = new JTextField();
		txTriangleSideValue.setBounds(89, 11, 105, 20);
		trianglePanel.add(txTriangleSideValue);
		txTriangleSideValue.setColumns(10);
		
		JLabel lblTriangleSide = new JLabel("Side");
		lblTriangleSide.setBounds(10, 14, 46, 14);
		trianglePanel.add(lblTriangleSide);
		
		lblTrianglePerValue.setHorizontalAlignment(SwingConstants.CENTER);
		lblTrianglePerValue.setBounds(89, 42, 105, 14);
		trianglePanel.add(lblTrianglePerValue);
		
		JLabel lblTrianglePerimeter = new JLabel("Perimeter");
		lblTrianglePerimeter.setBounds(10, 42, 79, 14);
		trianglePanel.add(lblTrianglePerimeter);
		
		
		lblTriangleAreaValue.setHorizontalAlignment(SwingConstants.CENTER);
		lblTriangleAreaValue.setBounds(89, 67, 105, 14);
		trianglePanel.add(lblTriangleAreaValue);
		
		JLabel lblTriangleArea = new JLabel("Area");
		lblTriangleArea.setBounds(10, 67, 79, 14);
		trianglePanel.add(lblTriangleArea);
		
		/**
		 * Generar el objeto previamente al seleccionar la figura
		 * y pasarselo a la funcion ejecutada llamada del actionP.
		 * Aplicar patron estrategia a este proyecto.
		 * 
		 */
		JButton btnShapeGenerator = new JButton("Generate Shape");
		btnShapeGenerator.setBounds(10, 407, 684, 23);
		btnShapeGenerator.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tabbedPane.getSelectedIndex() == 0) {
					createEllipse();		
				} else if (tabbedPane.getSelectedIndex() == 1) {
					createCircle();
				} else if (tabbedPane.getSelectedIndex() == 2) {
					createSquare();
				} else if (tabbedPane.getSelectedIndex() == 3) {
					createTriangle();	
				}	
			}
		});
		frame.getContentPane().add(btnShapeGenerator);
		
		Canvas canvas = new Canvas();
		canvas.setBounds(10, 208, 604, 193);
		frame.getContentPane().add(canvas);
	}
	
	public void createTriangle() {
		
		double side;
		
		side = Double.parseDouble(txTriangleSideValue.getText());
		
		Triangle triangle = new Triangle(side);
		triangle.calculateArea();
		triangle.calculatePerimeter();
		shapesArray.add(triangle);
		String area = Double.toString(triangle.getArea());
		String perimeter = Double.toString(triangle.getPerimeter());
		
		lblTriangleAreaValue.setText(area);
		lblTrianglePerValue.setText(perimeter);
	}
	
	public void createEllipse() {
		
		double majorax,minorax;
		
		majorax = Double.parseDouble(txEllipseMajAxValue.getText());
		minorax = Double.parseDouble(txEllipseMinAxValue.getText());
		
		Ellipse ellipse = new Ellipse(majorax, minorax);
		ellipse.calculateArea();
		ellipse.calculatePerimeter();
		shapesArray.add(ellipse);
		String area = Double.toString(ellipse.getArea());
		String perimeter = Double.toString(ellipse.getPerimeter());
		
		lblEllipseAreaValue.setText(area);
		lblEllipsePerValue.setText(perimeter);
		
	}

	public void createCircle() {
		
		double radius;
		
		radius = Double.parseDouble(txCircleRadValue.getText());
		
		Circle circle = new Circle(radius);
		circle.calculateArea();
		circle.calculatePerimeter();
		shapesArray.add(circle);
		String area = Double.toString(circle.getArea());
		String perimeter = Double.toString(circle.getPerimeter());
		
		lblCircleAreaValue.setText(area);
		lblCirclePerValue.setText(perimeter);
		
	}

	public void createSquare() {
		
		double side;
		
		side = Double.parseDouble(txSquareSideValue.getText());
		
		Square square = new Square(side);
		square.calculateArea();
		square.calculatePerimeter();
		shapesArray.add(square);
		String area = Double.toString(square.getArea());
		String perimeter = Double.toString(square.getPerimeter());
		
		lblSquareAreaValue.setText(area);
		lblSquarePerValue.setText(perimeter);
	}
}
