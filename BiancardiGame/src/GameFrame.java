import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class GameFrame extends JFrame
{
	private JPanel contentPane;
	private JLabel iwemaLabel;

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
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(5, 5, 195, 601);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblIwemaScore = new JLabel("Iwema: Score");
		lblIwemaScore.setHorizontalAlignment(SwingConstants.CENTER);
		lblIwemaScore.setBounds(10, 122, 179, 45);
		lblIwemaScore.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(lblIwemaScore);
		
		JLabel lblBegleyScore = new JLabel("Begley: Score");
		lblBegleyScore.setHorizontalAlignment(SwingConstants.CENTER);
		lblBegleyScore.setBounds(10, 376, 179, 52);
		lblBegleyScore.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(lblBegleyScore);
		
		JLabel lblPlayerScore = new JLabel("Player: Score");
		lblPlayerScore.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlayerScore.setBounds(10, 11, 179, 45);
		lblPlayerScore.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(lblPlayerScore);
		
		JLabel iwemaLabel = new JLabel("Error");
		BufferedImage image;
		try 
		{
			image = ImageIO.read(new File("Todd-Iwema.jpg"));
			iwemaLabel = new JLabel(new ImageIcon(image));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		iwemaLabel.setBounds(10, 159, 179, 228);
		panel.add(iwemaLabel);
		
		JLabel begleyLabel = new JLabel("Error");
		try 
		{
			image = ImageIO.read(new File("Sean-Begley.jpg"));
			begleyLabel = new JLabel(new ImageIcon(image));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		begleyLabel.setBounds(10, 392, 179, 228);
		panel.add(begleyLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(207, 5, 736, 601);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel questionNumLabel = new JLabel("insert question num here");
		questionNumLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		questionNumLabel.setHorizontalAlignment(SwingConstants.CENTER);
		questionNumLabel.setBounds(10, 11, 716, 52);
		panel_1.add(questionNumLabel);
		
		JLabel lblInsertQuestionHere = new JLabel("insert question here");
		lblInsertQuestionHere.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblInsertQuestionHere.setHorizontalAlignment(SwingConstants.CENTER);
		lblInsertQuestionHere.setVerticalAlignment(SwingConstants.TOP);
		lblInsertQuestionHere.setBounds(10, 101, 778, 146);
		panel_1.add(lblInsertQuestionHere);
		
		JButton buttonA = new JButton("answer A");
		buttonA.setBounds(10, 264, 266, 127);
		panel_1.add(buttonA);
		
		JButton buttonC = new JButton("answer C");
		buttonC.setBounds(10, 475, 266, 127);
		panel_1.add(buttonC);
		
		JButton buttonB = new JButton("answer B");
		buttonB.setBounds(462, 264, 266, 127);
		panel_1.add(buttonB);
		
		JButton buttonD = new JButton("answer D");
		buttonD.setBounds(462, 475, 266, 127);
		panel_1.add(buttonD);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(941, 5, 195, 601);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblBiancardiStuff = new JLabel("Biancardi Stuff");
		lblBiancardiStuff.setBounds(32, 201, 129, 25);
		lblBiancardiStuff.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_2.add(lblBiancardiStuff);
	}
}
