import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.BadLocationException;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JMenuBar;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.TransferHandler;

import java.awt.TextField;
import java.awt.TextArea;
import java.awt.Panel;

import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JToolBar;
import javax.swing.JSplitPane;

import java.awt.Component;

import javax.swing.Box;
import javax.swing.JSeparator;

import java.awt.Dimension;
import java.io.File;
import java.io.IOException;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.SwingConstants;

import java.awt.Font;

import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.media.*;


public class yazılım extends JFrame{
	
	private char w;
	private char s;
	private char a;
	private char d;
	private int ax;
	private int ay;
	private JPanel contentPane;

	private int dekorx;
	private int dekory;
	private int imageX;
	private int imageY;
	private String x;
	private String y;
	private Object[] options = { "YES","NO" };
	koordinat k=new koordinat();
	private BufferedImage myPicture=null;
	private BufferedImage myPicture1=null;
	private JTextField textField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					yazılım frame = new yazılım("CHİLD&CODİNG");
					frame.pack();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws IOException 
	 */
	public yazılım(String title) {
		setBackground(UIManager.getColor("CheckBox.foreground"));
		getContentPane().setBackground(Color.BLACK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1084,700);
		final JPanel panel = new JPanel();
		
		panel.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(5,5,5,5), BorderFactory.createTitledBorder("Hareket Alanı")));
		
		
		try{
			myPicture1 = ImageIO.read(new File("/Users/kemal/Desktop/kepler/YazılımMüh/src/mama.gif"));
		}catch(IOException e2){
			System.out.println("mama yok"+e2);
		}
		
		final JLabel picLabel1 = new JLabel(new ImageIcon(myPicture1));
		
	
	
		
		try {
			myPicture = ImageIO.read(new File("/Users/kemal/Desktop/kepler/YazılımMüh/src/tom.gif"));
		} catch (IOException e1) {
			
			System.out.println("noFileImage"+e1);
		}
		final JLabel picLabel = new JLabel(new ImageIcon(myPicture));
		picLabel.getX();
		picLabel.getY();
		picLabel.addKeyListener(new KeyAdapter(){
			 public void keyPressed(KeyEvent e) {
				if(e.getKeyChar()==w){
					ay=ay+5;
					picLabel.setLocation(ax, ay);
				}
				
			if(e.getKeyChar()==s){
					ay=ay-5;
					picLabel.setLocation(ax, ay);
				}
			
			
			if(e.getKeyChar()==a){
				ax=ax-5;
				picLabel.setLocation(ax, ay);
			}
			
			
			if(e.getKeyChar()==d){
				ax=ax+5;
				picLabel.setLocation(ax, ay);
			}
				
		}
			 
			 });
		
		picLabel.setBackground(Color.BLACK);
		picLabel.setLayout(null);
		
		panel.setBackground(Color.WHITE);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(5,5,5,5),BorderFactory.createTitledBorder("Hareket Seçim Alanı")));
		panel_1.setBackground(Color.WHITE);
		
		MouseAdapter ml=new MouseAdapter(){
			@Override
			public void mousePressed(MouseEvent e) {
			JComponent jc=(JComponent)e.getSource();
			TransferHandler th=jc.getTransferHandler();
			th.exportAsDrag(jc, e, TransferHandler.COPY);
				
				
			}
		};
		//----------------------------------------
		//panel_2.setLocation(null);
		

		
		
		JButton btnKoduGster = new JButton("Kodu Göster");
		btnKoduGster.addMouseListener(new MouseAdapter(){
				public void mousePressed(MouseEvent e) {
					JOptionPane.showOptionDialog(null, "YUKARI=moveUp();\n"
							+ "ASAGI=moveDown();\n"
							+ "SAG=moveRight();\n"
							+ "SOL=moveLeft();", "KODU",
							JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
							null, options, options[0]);
		    }
		});
		
		JButton btnYukar = new JButton("Yukarı");
		btnYukar.addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e) {
				
				ay=ay-1;
				picLabel.setLocation(ax, ay);
				
		    }
		});
		btnYukar.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		btnYukar.addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e) {
				
		    }
			
		});
		
		JButton btnAa = new JButton("Aşağı");
		btnAa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		btnAa.addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e) {
				ay=ay-1;
				picLabel.setLocation(ax, ay);
		    }
		});
		
		
		
		JButton btnSa = new JButton("Sağ");
		btnSa.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				ax=ax+1;
				picLabel.setLocation(ax, ay);
			
			}
		});
		
		
		JButton btnSol = new JButton("Sol");
		btnSol.addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e) {
				ax=ax-1;
				picLabel.setLocation(ax, ay);
			
			}
		});
		  final int x1;
		   final int y1;
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
			
		});
		
		textField.setColumns(20);
		 
		
			
		
		
		
		
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(114)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(btnYukar)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(btnSol)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnAa)))
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
									.addComponent(btnKoduGster)
									.addGap(54))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(18)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(btnSa)
										.addComponent(textField, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE)))))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(18)
							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 418, GroupLayout.PREFERRED_SIZE)))
					.addGap(10))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 634, Short.MAX_VALUE)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 489, GroupLayout.PREFERRED_SIZE)
							.addGap(13)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(18)
									.addComponent(btnYukar)
									.addGap(28)
									.addComponent(btnAa))
								.addGroup(groupLayout.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnKoduGster)
									.addGap(18)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(btnSol)
										.addComponent(btnSa))
									.addGap(18)
									.addComponent(textField, GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)))
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGap(16))
		);
		int a=picLabel.getX();
		int b=picLabel.getY();
		
		JButton btnAdmGit = new JButton("1 Adım Git");
		btnAdmGit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAdmGit.addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e) {
				 ax=picLabel.getX();
				 ay=picLabel.getY();
				 System.out.println(ax);
				 System.out.println(ay);
			
				
		ax=ax+3;
		picLabel.setLocation(ax, ay);
		
		
		if(ax==350 && ay==300){
			
			ax=240;
			ay=240;
			picLabel.setLocation(ax, ay);
			System.out.println("SINIR HATASI");
			
		}
				
		    }

			
		});
		btnAdmGit.setForeground(Color.GREEN);
		
		JButton btnAdmGit_1 = new JButton("10 x ekseninde Adım Git");
		btnAdmGit_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
		});
		
		
		btnAdmGit_1.addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e) {
				
				ax=ax+10;
				ay=240;
				picLabel.setLocation(ax, ay);
				
				if(ax==350 && ay==300){
					
					ax=240;
					ay=240;
					picLabel.setLocation(ax, ay);
					System.out.println("SINIR HATASI");
					
				}
				
			}
		});
		btnAdmGit_1.setForeground(Color.ORANGE);
		
		JButton btnNewButton = new JButton("-Y ekseninde ilerle");
		btnNewButton.setForeground(UIManager.getColor("CheckBox.select"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		
		btnNewButton.addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e) {
				ay=ay+1;
				picLabel.setLocation(ax, ay);
				
				if(ax==350 && ay==300){
					
					ax=240;
					ay=240;
					picLabel.setLocation(ax, ay);
					System.out.println("SINIR HATASI");
					
				}
			}
		});
		btnNewButton.setBackground(Color.RED);
		
		JButton btnNewButton_1 = new JButton("X ekseninde ilerle");
		btnNewButton_1.setForeground(Color.GRAY);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBackground(Color.YELLOW);
		
		btnNewButton_1.addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e) {
			      
				ax=ax+5;
				
				picLabel.setLocation(ax, ay);
				
				
				
				if(ax==350 && ay==300){
					
					ax=240;
					ay=240;
					picLabel.setLocation(ax, ay);
					System.out.println("SINIR HATASI");
					
				}
			    }
			

		});
		
		JButton btnNewButton_2 = new JButton("- X ekseninde ilerle");
		btnNewButton_2.setForeground(new Color(102, 204, 51));
		btnNewButton_2.addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e) {
				ax=ax-1;
				picLabel.setLocation(ax, ay);
				
				if(ax==350 && ay==300){
					
					ax=240;
					ay=240;
					picLabel.setLocation(ax, ay);
					System.out.println("SINIR HATASI");
					
				}
				
			}
		});
		
		JButton btnNewButton_3 = new JButton("45 derece asagı zıpla");
		btnNewButton_3.setForeground(UIManager.getColor("Button.light"));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		btnNewButton_3.addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e){
				ax=380;
				ay=380;
				picLabel.setLocation(ax, ay);
				
				
				if(ax==350 && ay==300){
					
					ax=240;
					ay=240;
					picLabel.setLocation(ax, ay);
					System.out.println("SINIR HATASI");
					
				}
			}
		});
		
		
		JButton btnNewButton_4 = new JButton("60 derece yukarı zıpla");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		
		btnNewButton_4.addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e){
				
				ax=300;
				ay=100;
				
				
				picLabel.setLocation(ax, ay);
				
				
				
				
				
				if(ax==350 && ay==300){
					
					ax=240;
					ay=240;
					picLabel.setLocation(ax, ay);
					System.out.println("SINIR HATASI");
					
				}
			}
		});
		
		JButton btnNewButton_5 = new JButton("Zıpla");
		btnNewButton_5.setForeground(new Color(255, 51, 0));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		btnNewButton_5.addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e) {
				ax=240;
				ay=140;
				picLabel.setLocation(ax, ay);
				if(ay==140){
					
					
					picLabel.setLocation(ax, ay);
				}
				if(ax==350 && ay==300){
					
					ax=240;
					ay=240;
					picLabel.setLocation(ax, ay);
					System.out.println("SINIR HATASI");
					
				}
				
				
			}
		});
		
		
		JButton btnNewButton_6 = new JButton("Reset");
		btnNewButton_6.setForeground(Color.RED);
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		btnNewButton_6.addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e) {
				ax=240;
				ay=240;
				picLabel.setLocation(ax, ay);
				JOptionPane.showMessageDialog(panel,
					    "Hareketler Silindi.");
				if(ax==350 && ay==300){
					
					ax=240;
					ay=240;
					picLabel.setLocation(ax, ay);
					System.out.println("SINIR HATASI");
					
				}
				
				
			}
		});
		
		JButton btnNewButton_7 = new JButton("x:150 y:100 konumuna git");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_7.addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e) {
				ax=150;
				ay=100;
				picLabel.setLocation(ax, ay);
				
				if(ax==350 && ay==300){
					
					ax=240;
					ay=240;
					picLabel.setLocation(ax, ay);
					System.out.println("SINIR HATASI");
					
				}
				
			}
		});
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(btnNewButton_7, GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
							.addContainerGap())
						.addComponent(btnNewButton_6, GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
										.addComponent(btnNewButton)
										.addComponent(btnAdmGit))
									.addGap(18)
									.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
										.addComponent(btnAdmGit_1)
										.addComponent(btnNewButton_1)))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(btnNewButton_2)
									.addGap(18)
									.addComponent(btnNewButton_3))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(btnNewButton_4)
									.addGap(18)
									.addComponent(btnNewButton_5)))
							.addContainerGap(10, Short.MAX_VALUE))))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnAdmGit_1)
						.addComponent(btnAdmGit))
					.addGap(30)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton)
						.addComponent(btnNewButton_1))
					.addGap(28)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton_2)
						.addComponent(btnNewButton_3))
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton_4)
						.addComponent(btnNewButton_5))
					.addGap(62)
					.addComponent(btnNewButton_7)
					.addPreferredGap(ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
					.addComponent(btnNewButton_6))
		);
		panel_1.setLayout(gl_panel_1);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addGap(231)
					.addComponent(picLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(225))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(217)
					.addComponent(picLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(281))
		);
		panel.setLayout(gl_panel);
		
		
		getContentPane().setLayout(groupLayout);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(Color.WHITE);
		menuBar.setFont(new Font("Libian SC", Font.PLAIN, 14));
		setJMenuBar(menuBar);
		
		JMenu menu = new JMenu("Dosya");
		menu.setFont(new Font("Marker Felt", Font.PLAIN, 14));
		menuBar.add(menu);
		
		JMenuItem menuItem = new JMenuItem("Yeni");
		menuItem.addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e) {
				ax=240;
				ay=240;
				picLabel.setLocation(ax, ay);
				JOptionPane.showMessageDialog(panel,
					    "Yeni Sayfa Açıldı.");
				
				
			}
		});
		menuItem.setFont(new Font("Luminari", Font.BOLD | Font.ITALIC, 14));
		menu.add(menuItem);
		
		JMenuItem mntmA = new JMenuItem("Aç");
		mntmA.setFont(new Font("Luminari", Font.BOLD | Font.ITALIC, 14));
		menu.add(mntmA);
		
		JMenuItem mntmKaydet = new JMenuItem("Kaydet");
		mntmKaydet.setFont(new Font("Luminari", Font.BOLD | Font.ITALIC, 14));
		menu.add(mntmKaydet);
		
		JMenuItem mntmk = new JMenuItem("Çıkış");
		mntmk.setFont(new Font("Luminari", Font.BOLD | Font.ITALIC, 14));
		mntmk.addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e) {
				  System.exit(0);
		    }
		});
		menu.add(mntmk);
		
		JMenu mnDzen = new JMenu("Düzen");
		mnDzen.setFont(new Font("Marker Felt", Font.PLAIN, 14));
		menuBar.add(mnDzen);
		
		JMenuItem mntmEkle = new JMenuItem("Ekle");
		mntmEkle.setFont(new Font("Luminari", Font.BOLD | Font.ITALIC, 14));
		mnDzen.add(mntmEkle);
		
		JMenuItem mntmSil = new JMenuItem("Sil");
		mntmSil.setFont(new Font("Luminari", Font.BOLD | Font.ITALIC, 14));
		mnDzen.add(mntmSil);
		
		JMenu mnIpucu = new JMenu("İpucu");
		mnIpucu.setFont(new Font("Marker Felt", Font.PLAIN, 14));
		
		mnIpucu.addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e) {
			      
			    }

		});
		menuBar.add(mnIpucu);
		
		JMenu mnHakknda = new JMenu("Hakkında");
		mnHakknda.setFont(new Font("Marker Felt", Font.PLAIN, 14));
		mnHakknda.addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e) {
				JOptionPane.showInputDialog(null,"",null,JOptionPane.INFORMATION_MESSAGE,new ImageIcon("/Users/kemal/Desktop/kepler/YazılımMüh/src/kodlama.gif"),null,"");
			    }

});
		menuBar.add(mnHakknda);
		
		JMenu menuDekor = new JMenu("Şikayet");
		menuDekor.addMouseListener(new MouseAdapter(){
			public void MousePressed(MouseEvent e){
				Font font=new Font("Times New Roman",Font.PLAIN,100);
				final JTextArea text=new JTextArea();
				
				text.setFont(font);
				add(new JScrollPane(text));
				
				ActionListener al=new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						
						//("Son".equals(e.getActionCommand())) System.exit(0);
						
						
						setSize(200,300);
					}
					
				
				
			};
				
			}
			
		});
		menuDekor.setFont(new Font("Marker Felt", Font.PLAIN, 14));
		menuBar.add(menuDekor);
		
		JMenu mnBizeUlan = new JMenu("Bize Ulaşın");
		mnBizeUlan.addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e) {
				JOptionPane.showInputDialog(null,"",null,JOptionPane.INFORMATION_MESSAGE,new ImageIcon("/Users/kemal/Desktop/kepler/YazılımMüh/src/bizeulasın.gif"),null,"Bize Buradan Ulaşabilirisniz.");
		    }
			
		});
		mnBizeUlan.setBackground(Color.WHITE);
		mnBizeUlan.setFont(new Font("Marker Felt", Font.PLAIN, 14));
		menuBar.add(mnBizeUlan);
		
		addMouseListener(new koordinat());
		
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(Color.BLACK);
		
	}
	
	
	
	
	//mouseun koordinat düzlemi için
	class koordinat extends java.awt.event.MouseAdapter{
		private  int x;
		 private int y;
		public void mouse(java.awt.event.MouseEvent me){ 
	         x=me.getPoint().x; // tıklanan nesne üzerindeki fare imlecinin x koordinatı 
	        y=me.getPoint().y; // tıklanan nesne üzerindeki fare imlecinin y koordinatı 
	        System.out.print("x koordinati: "+x); 
	       System.out.println("\ty koordinati: "+y);
	       
	       textField.setText(Integer.toString(x));
	       System.out.println(textField.getText());
	      
	       
	       
	    }
		
	
	}
}
