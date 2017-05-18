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
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Toolkit;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;

public class GameFrame extends JFrame
{
	private JPanel contentPane;
	private JLabel iwemaLabel;
	
	//Declare contestant variables
	private Todd todd;
	private Sean sean;
	private Self player;
	
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
		setIconImage(Toolkit.getDefaultToolkit().getImage(GameFrame.class.getResource("/pictures/Michael-Biancardi.JPG")));
		setTitle("Biancardi Dating Sim");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1150, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel contestantPanel = new JPanel();
		contestantPanel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		contestantPanel.setBounds(0, 5, 195, 601);
		contentPane.add(contestantPanel);
		contestantPanel.setLayout(null);
		
		JLabel lblIwemaScore = new JLabel("Iwema: score");
		lblIwemaScore.setHorizontalAlignment(SwingConstants.CENTER);
		lblIwemaScore.setBounds(8, 201, 179, 28);
		lblIwemaScore.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		contestantPanel.add(lblIwemaScore);
		
		JLabel lblBegleyScore = new JLabel("Begley: score");
		lblBegleyScore.setHorizontalAlignment(SwingConstants.CENTER);
		lblBegleyScore.setBounds(8, 401, 179, 28);
		lblBegleyScore.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		contestantPanel.add(lblBegleyScore);
		
		JLabel lblPlayerScore = new JLabel("Player: score");
		lblPlayerScore.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlayerScore.setBounds(8, 11, 179, 28);
		lblPlayerScore.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		contestantPanel.add(lblPlayerScore);
		
		JLabel iwemaPicture = new JLabel("");
		iwemaPicture.setIcon(new ImageIcon(GameFrame.class.getResource("/pictures/Todd-Iwema.jpg")));
		iwemaPicture.setBounds(22, 240, 150, 150);
		contestantPanel.add(iwemaPicture);
		
		JLabel begleyPicture = new JLabel("");
		begleyPicture.setIcon(new ImageIcon(GameFrame.class.getResource("/pictures/Sean-Begley.jpg")));
		begleyPicture.setBounds(22, 440, 150, 150);
		contestantPanel.add(begleyPicture);
		
		JLabel playerPicture = new JLabel("");
		playerPicture.setIcon(new ImageIcon(GameFrame.class.getResource("/pictures/Michael-Biancardi.JPG")));
		playerPicture.setBounds(22, 51, 150, 150);
		contestantPanel.add(playerPicture);
		
		
		JPanel gamePanel = new JPanel();
		gamePanel.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		gamePanel.setBounds(199, 5, 736, 601);
		contentPane.add(gamePanel);
		gamePanel.setLayout(null);
		
		JLabel questionNumLabel = new JLabel("");
		questionNumLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		questionNumLabel.setHorizontalAlignment(SwingConstants.CENTER);
		questionNumLabel.setBounds(0, 11, 736, 52);
		gamePanel.add(questionNumLabel);
		
		JLabel questionLabel = new JLabel("click next question to start");
		questionLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		questionLabel.setHorizontalAlignment(SwingConstants.CENTER);
		questionLabel.setVerticalAlignment(SwingConstants.TOP);
		questionLabel.setBounds(5, 101, 726, 111);
		gamePanel.add(questionLabel);
		
		JButton buttonA = new JButton("answer A");
		buttonA.setBounds(98, 325, 266, 127);
		gamePanel.add(buttonA);
		
		JButton buttonC = new JButton("answer C");
		buttonC.setBounds(98, 463, 266, 127);
		gamePanel.add(buttonC);
		
		JButton buttonB = new JButton("answer B");
		buttonB.setBounds(374, 325, 266, 127);
		gamePanel.add(buttonB);
		
		JButton buttonD = new JButton("answer D");
		buttonD.setBounds(374, 463, 266, 127);
		gamePanel.add(buttonD);
		
		JPanel picturePanel = new JPanel();
		picturePanel.setBounds(317, 152, 100, 100);
		gamePanel.add(picturePanel);
		
		JButton nextQuestionButton = new JButton("Next Question");
		nextQuestionButton.setBounds(298, 263, 141, 41);
		gamePanel.add(nextQuestionButton);
		
		JPanel biancardiPanel = new JPanel();
		biancardiPanel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		biancardiPanel.setBounds(940, 5, 195, 601);
		contentPane.add(biancardiPanel);
		biancardiPanel.setLayout(null);
		
		JLabel biancardiPicture = new JLabel();
		biancardiPicture.setIcon(new ImageIcon(GameFrame.class.getResource("/pictures/Biancardi-full-small.png")));
		biancardiPicture.setBounds(10, 11, 175, 580);
		biancardiPanel.add(biancardiPicture);
		
		ActionListener action = new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent event) 
			{
				if (event.getSource().equals(nextQuestionButton))
				{
					if (Question.getQuestionNumber() < 41)
					{
						questionLabel.setText(Question.generateQuestion());
						questionNumLabel.setText(Integer.toString(Question.getQuestionNumber()));
					}
					else
					{
						//TODO: add end of game stuff
					}
				}
			}
		};
		
		nextQuestionButton.addActionListener(action);
	}
}
