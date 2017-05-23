import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
import javax.swing.border.LineBorder;

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
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(GameFrame.class.getResource("/pictures/Michael-Biancardi.JPG")));
		setTitle("Biancardi Dating Sim");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1142, 644);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel contestantPanel = new JPanel();
		contestantPanel.setOpaque(false);

		contestantPanel.setBorder(null);
		contestantPanel.setBounds(0, 5, 195, 618);

		contentPane.add(contestantPanel);
		contestantPanel.setLayout(null);
		
		JLabel lblIwemaScore = new JLabel("Iwema: score");
		lblIwemaScore.setForeground(Color.WHITE);
		lblIwemaScore.setHorizontalAlignment(SwingConstants.CENTER);
		lblIwemaScore.setBounds(8, 201, 179, 28);
		lblIwemaScore.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		contestantPanel.add(lblIwemaScore);
		
		JLabel lblBegleyScore = new JLabel("Begley: score");
		lblBegleyScore.setForeground(Color.WHITE);
		lblBegleyScore.setHorizontalAlignment(SwingConstants.CENTER);
		lblBegleyScore.setBounds(8, 401, 179, 28);
		lblBegleyScore.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		contestantPanel.add(lblBegleyScore);
		
		JLabel playerScoreLabel = new JLabel("Player: score");
		playerScoreLabel.setForeground(Color.WHITE);
		playerScoreLabel.setHorizontalAlignment(SwingConstants.CENTER);
		playerScoreLabel.setBounds(8, 11, 179, 28);
		playerScoreLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		contestantPanel.add(playerScoreLabel);
		
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
		gamePanel.setOpaque(false);

		gamePanel.setBorder(null);
		gamePanel.setBounds(199, 5, 736, 618);

		contentPane.add(gamePanel);
		gamePanel.setLayout(null);
		
		JLabel questionNumLabel = new JLabel("");
		questionNumLabel.setForeground(Color.WHITE);
		questionNumLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		questionNumLabel.setHorizontalAlignment(SwingConstants.CENTER);
		questionNumLabel.setBounds(0, 24, 736, 52);
		gamePanel.add(questionNumLabel);
		
		JLabel questionLabel = new JLabel("click next question to start");
		questionLabel.setForeground(Color.WHITE);
		questionLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		questionLabel.setHorizontalAlignment(SwingConstants.CENTER);
		questionLabel.setVerticalAlignment(SwingConstants.TOP);
		questionLabel.setBounds(10, 62, 716, 111);
		gamePanel.add(questionLabel);
		
		JButton buttonA = new JButton("answer A");
		buttonA.setForeground(Color.WHITE);
		buttonA.setBackground(Color.BLACK);
		buttonA.setBorder(null);
		buttonA.setOpaque(false);
		buttonA.setEnabled(false);
		buttonA.setBounds(79, 394, 202, 75);
		gamePanel.add(buttonA);
		
		JButton buttonC = new JButton("answer C");
		buttonC.setForeground(Color.WHITE);
		buttonC.setBackground(Color.BLACK);
		buttonC.setBorder(null);
		buttonC.setOpaque(false);
		buttonC.setEnabled(false);
		buttonC.setBounds(79, 504, 202, 75);
		gamePanel.add(buttonC);
		
		JButton buttonB = new JButton("answer B");
		buttonB.setForeground(Color.WHITE);
		buttonB.setBackground(Color.BLACK);
		buttonB.setBorder(null);
		buttonB.setOpaque(false);
		buttonB.setEnabled(false);
		buttonB.setBounds(453, 394, 202, 75);
		gamePanel.add(buttonB);
		
		JButton buttonD = new JButton("answer D");
		buttonD.setForeground(Color.WHITE);
		buttonD.setBackground(Color.BLACK);
		buttonD.setBorder(null);
		buttonD.setOpaque(false);
		buttonD.setEnabled(false);
		buttonD.setBounds(453, 501, 202, 83);
		gamePanel.add(buttonD);
		
		JButton nextQuestionButton = new JButton("Next Question");
		nextQuestionButton.setBounds(297, 466, 141, 41);
		gamePanel.add(nextQuestionButton);
		
		JLabel pictureBox = new JLabel("");
		pictureBox.setBorder(new LineBorder(new Color(0, 255, 255), 4, true));
		pictureBox.setBackground(Color.BLACK);
		pictureBox.setBounds(243, 127, 250, 250);
		gamePanel.add(pictureBox);
		
		JPanel biancardiPanel = new JPanel();
		biancardiPanel.setOpaque(false);
		biancardiPanel.setBorder(null);
		biancardiPanel.setBounds(940, 5, 195, 618);

		contentPane.add(biancardiPanel);
		biancardiPanel.setLayout(null);
		
		JLabel biancardiPicture = new JLabel();
		biancardiPicture.setIcon(new ImageIcon(GameFrame.class.getResource("/pictures/Biancardi-full-small.png")));
		biancardiPicture.setBounds(19, 27, 175, 580);

		biancardiPanel.add(biancardiPicture);
		
		JLabel backgroundPicture = new JLabel("");
		backgroundPicture.setIcon(new ImageIcon(GameFrame.class.getResource("/pictures/bianparty_background.png")));
		backgroundPicture.setBounds(0, 0, 1144, 623);
		contentPane.add(backgroundPicture);
		
		player = new Self();
		sean = new Sean("Sean");
		todd = new Todd("Toodddd");
		
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
						questionNumLabel.setText(Integer.toString(Question.getQuestionNumber() - 1));
						
						pictureBox.setIcon(new ImageIcon(GameFrame.class.getResource("/pictures/memes/" + Integer.toString(Question.getQuestionNumber()-1) +".jpg")));
						
						buttonA.setEnabled(true);
						buttonB.setEnabled(true);
						buttonC.setEnabled(true);
						buttonD.setEnabled(true);
						nextQuestionButton.setEnabled(false);
						
						//Multiline button stuff to eventually display answers
						
						String aText = player.getAnswers(Question.getQuestionNumber() - 1)[0];
						buttonA.setText("<html>" + aText.replaceAll("\\n", "<br>") + "</html>");
						
						String bText = player.getAnswers(Question.getQuestionNumber() - 1)[1];
						buttonB.setText("<html>" + bText.replaceAll("\\n", "<br>") + "</html>");
						
						String cText = player.getAnswers(Question.getQuestionNumber() - 1)[2];
						buttonC.setText("<html>" + cText.replaceAll("\\n", "<br>") + "</html>");
						
						String dText = player.getAnswers(Question.getQuestionNumber() - 1)[3];
						buttonD.setText("<html>" + dText.replaceAll("\\n", "<br>") + "</html>");
					}
					else
					{
						//TODO: add stuff to get to battle
					}
				}				
				else if (event.getSource().equals(buttonA))
				{
					player.addPoints(Question.assignSelfPoints('a'));
					buttonA.setEnabled(false);
					buttonB.setEnabled(false);
					buttonC.setEnabled(false);
					buttonD.setEnabled(false);
					nextQuestionButton.setEnabled(true);
					
					sean.addPoints(Question.assignNPCPoints());
					todd.addPoints(Question.assignNPCPoints());
					
					JOptionPane.showMessageDialog(rootPane, "Sean says: " + sean.answer(Question.getQuestionNumber() - 1));
					JOptionPane.showMessageDialog(rootPane, "Todd says: " + todd.answer(Question.getQuestionNumber() - 1));
				}
				else if (event.getSource().equals(buttonB))
				{
					player.addPoints(Question.assignSelfPoints('b'));
					buttonA.setEnabled(false);
					buttonB.setEnabled(false);
					buttonC.setEnabled(false);
					buttonD.setEnabled(false);
					nextQuestionButton.setEnabled(true);
					
					sean.addPoints(Question.assignNPCPoints());
					todd.addPoints(Question.assignNPCPoints());
					
					JOptionPane.showMessageDialog(rootPane, "Sean says: " + sean.answer(Question.getQuestionNumber() - 1));
					JOptionPane.showMessageDialog(rootPane, "Todd says: " + todd.answer(Question.getQuestionNumber() - 1));
				}
				else if (event.getSource().equals(buttonC))
				{
					player.addPoints(Question.assignSelfPoints('c'));
					buttonA.setEnabled(false);
					buttonB.setEnabled(false);
					buttonC.setEnabled(false);
					buttonD.setEnabled(false);
					nextQuestionButton.setEnabled(true);
					
					sean.addPoints(Question.assignNPCPoints());
					todd.addPoints(Question.assignNPCPoints());
					
					JOptionPane.showMessageDialog(rootPane, "Sean says: " + sean.answer(Question.getQuestionNumber() - 1));
					JOptionPane.showMessageDialog(rootPane, "Todd says: " + todd.answer(Question.getQuestionNumber() - 1));
				}
				else if (event.getSource().equals(buttonD))
				{
					player.addPoints(Question.assignSelfPoints('d'));
					buttonA.setEnabled(false);
					buttonB.setEnabled(false);
					buttonC.setEnabled(false);
					buttonD.setEnabled(false);
					nextQuestionButton.setEnabled(true);
					
					sean.addPoints(Question.assignNPCPoints());
					todd.addPoints(Question.assignNPCPoints());					
					
					JOptionPane.showMessageDialog(rootPane, "Sean says: " + sean.answer(Question.getQuestionNumber() - 1));
					JOptionPane.showMessageDialog(rootPane, "Todd says: " + todd.answer(Question.getQuestionNumber() - 1));
				}
				
				playerScoreLabel.setText("Player: " + Integer.toString(player.getPoints()));
				lblIwemaScore.setText("Iwema: " + Integer.toString(todd.getPoints()));
				lblBegleyScore.setText("Sean: " + Integer.toString(sean.getPoints()));
			}
		};
		
		nextQuestionButton.addActionListener(action);
		buttonA.addActionListener(action);
		buttonB.addActionListener(action);
		buttonC.addActionListener(action);
		buttonD.addActionListener(action);
	}
}