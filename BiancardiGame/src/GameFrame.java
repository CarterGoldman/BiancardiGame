import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;

public class GameFrame extends JFrame
{
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					GameFrame frame = new GameFrame();
					frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GameFrame()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1150, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.WEST);
		
		JButton btnNewButton = new JButton("New button");
		panel.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		
		JLabel questionNumLabel = new JLabel("insert question num here");
		questionNumLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		questionNumLabel.setHorizontalAlignment(SwingConstants.CENTER);
		questionNumLabel.setBounds(10, 11, 1092, 52);
		panel_1.add(questionNumLabel);
		
		JLabel lblInsertQuestionHere = new JLabel("insert question here");
		lblInsertQuestionHere.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblInsertQuestionHere.setHorizontalAlignment(SwingConstants.CENTER);
		lblInsertQuestionHere.setVerticalAlignment(SwingConstants.TOP);
		lblInsertQuestionHere.setBounds(10, 88, 1092, 146);
		panel_1.add(lblInsertQuestionHere);
		
		JButton btnAnswer = new JButton("answer 1");
		btnAnswer.setBounds(10, 264, 266, 127);
		panel_1.add(btnAnswer);
		
		JButton button = new JButton("answer 1");
		button.setBounds(10, 475, 266, 127);
		panel_1.add(button);
		
		JButton button_1 = new JButton("answer 1");
		button_1.setBounds(836, 264, 266, 127);
		panel_1.add(button_1);
		
		JButton button_2 = new JButton("answer 1");
		button_2.setBounds(836, 475, 266, 127);
		panel_1.add(button_2);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.EAST);
	}
}
