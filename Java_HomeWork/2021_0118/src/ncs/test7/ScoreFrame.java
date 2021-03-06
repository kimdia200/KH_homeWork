package ncs.test7;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ScoreFrame extends JFrame{
	
	private JTextField javaScore;
	private JTextField sqlScore;
	private JTextField total;
	private JTextField average;
	

	public ScoreFrame() {
		
		setTitle("문제7");
		setLayout(null);
		setSize(400, 300);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel title = new JLabel("점수를 입력하세요");
		title.setBounds(0, 0, 400, 40);
		title.setHorizontalAlignment(SwingConstants.CENTER);
		Font f = new Font("HY견고딕", Font.BOLD, 27);
		title.setFont(f);
		
		JLabel t1 = new JLabel("자바:");
		JLabel t2 = new JLabel("SQL:");
		JLabel t3 = new JLabel("총점:");
		JLabel t4 = new JLabel("평균:");
		javaScore = new JTextField();
		sqlScore = new JTextField();
		total = new JTextField();
		average = new JTextField();
		JButton calcBtn = new JButton("계산하기");
		
		t1.setBounds(10, 70, 40, 20);
		javaScore.setBounds(50, 70, 110, 20);
		t2.setBounds(200, 70, 40, 20);
		sqlScore.setBounds(240, 70, 110, 20);
		t3.setBounds(10, 200, 40, 20);
		total.setBounds(50, 200, 110, 20);
		t4.setBounds(200, 200, 40, 20);
		average.setBounds(240, 200, 110, 20);
		
		calcBtn.setBounds(155, 135, 90, 30);
		calcBtn.addActionListener(new ActionHandler());
		
		add(t1);
		add(javaScore);
		add(t2);
		add(sqlScore);
		add(t3);
		add(total);
		add(t4);
		add(average);
		add(calcBtn);
		
		add(title);
		setVisible(true);
	}
	
	class ActionHandler implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			int java = Integer.parseInt(javaScore.getText());
			int sql = Integer.parseInt(sqlScore.getText());
			
			total.setText(String.valueOf(java+sql));
			average.setText(String.valueOf((java+sql)/2));
		}
	}
}
