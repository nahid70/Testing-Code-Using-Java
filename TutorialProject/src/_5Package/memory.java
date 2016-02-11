package _5Package;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.Timer;
import java.util.Random;
import java.awt.GridLayout;
//import java.awt.Image;

import javax.swing.JLabel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.BorderLayout;

public class memory extends JFrame implements MouseListener, ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JPanel Panel, Panel1;
	int random;
	static ImageIcon [] icon = {new ImageIcon("la.jpg"),
			new ImageIcon("lai.jpg"),	new ImageIcon("la1.jpeg"),	new ImageIcon("la2.jpg"), new ImageIcon("lai.jpg"), 
			new ImageIcon("la5.jpg"),new ImageIcon("la1.jpeg"), new ImageIcon("la6.jpg"),	new ImageIcon("la7.jpg"),
		  new ImageIcon("la2.jpg"), new ImageIcon("la9.jpg"),new ImageIcon("la5.jpg"), new ImageIcon("la10.jpg"),
			 new ImageIcon("la12.jpg"), new ImageIcon("la13.jpg"), new ImageIcon("la6.jpg"), new ImageIcon("la7.jpg"),
			 new ImageIcon("la9.jpg"),new ImageIcon("la10.jpg"), new ImageIcon("la12.jpg"), new ImageIcon("la13.jpg")};
			
	/*, icon1, icon2, icon3, icon4, icon5, icon6, icon7, icon8,
			icon9, icon10, icon11, icon12, icon13, icon14, icon15, icon16,
			icon17, icon18, icon19, icon20;*/
	ImageIcon iconPanel;
	JLabel [] label;
	
	/*, label1, label2, label3, label4, label5, label6, label7,
			label8, label9, label10, label11, label12, label13, label14,
			label15, label16, label17, label18, label19;*/
	private JButton reset;
	private JButton exit;
	private JButton result;
	private int add;
	static int a;
	static int i;
	static  Random change;
    private Timer timer = new Timer(50,this);
	private long startTime;
    static allowbutton allow;
	public static void main(String[] args) {
		allow = new allowbutton();
		new MemoryGame();
	
	}


	public memory() {
		setLayout(new BorderLayout());
		Panel = new JPanel();
		//iconPanel = new ImageIcon("PanelImage.png");
		
		// Panel.getBorder(iconPanel);
		Panel.setLayout(new GridLayout(5, 4));
		// Labels icon
		
		// Labels images
		
		label[0] = new JLabel();
		label[0].setIcon(icon[0]);
		label[0].addMouseListener(this);
		// label.setSize(new Dimension(200,200));
		Panel.add(label[0]);
		// label1
		label[1] = new JLabel();
		label[1].setIcon(icon[0]);
		label[1].addMouseListener(this);
		Panel.add(label[1]);
		// label2
		label[2] = new JLabel();
		label[2].setIcon(icon[0]);
		label[2].addMouseListener(this);
		Panel.add(label[2]);
		// label3
		label[3] = new JLabel();
		label[3].setIcon(icon[0]);
		label[3].addMouseListener(this);
		Panel.add(label[3]);
		// label4
		label[4] = new JLabel();
		label[4].setIcon(icon[0]);
		label[4].addMouseListener(this);
		Panel.add(label[4]);
		// label5
		label[5] = new JLabel();
		label[5].setIcon(icon[0]);
		label[5].addMouseListener(this);
		Panel.add(label[5]);
		// label6
		label[6] = new JLabel();
		label[6].setIcon(icon[0]);
		label[6].addMouseListener(this);
		Panel.add(label[6]);
		// label7
		label[7] = new JLabel();
		label[7].setIcon(icon[0]);
		label[7].addMouseListener(this);
		Panel.add(label[7]);
		// label8
		label[8] = new JLabel();
		label[8].setIcon(icon[0]);
		label[8].addMouseListener(this);
		Panel.add(label[8]);
		// label9
		label[9] = new JLabel();
		label[9].setIcon(icon[0]);
		label[9].addMouseListener(this);
		Panel.add(label[9]);
		// label10
		label[10] = new JLabel();
		label[10].setIcon(icon[0]);
		label[10].addMouseListener(this);
		Panel.add(label[10]);
		// label11
		label[11] = new JLabel();
		label[11].setIcon(icon[0]);
		label[11].addMouseListener(this);
		Panel.add(label[11]);
		// label12
		label[12] = new JLabel();
		label[12].setIcon(icon[0]);
		label[12].addMouseListener(this);
		Panel.add(label[12]);
		// label13
		label[13] = new JLabel();
		label[13].setIcon(icon[0]);
		label[13].addMouseListener(this);
		Panel.add(label[13]);
		// label14
		label[14] = new JLabel();
		label[14].setIcon(icon[0]);
		label[14].addMouseListener(this);
		Panel.add(label[14]);
		// label15
		label[15] = new JLabel();
		label[15].setIcon(icon[0]);
		label[15].addMouseListener(this);
		Panel.add(label[15]);
		// label16
		label[16] = new JLabel();
		label[16].setIcon(icon[0]);
		label[16].addMouseListener(this);
		Panel.add(label[16]);
		// label17
		label[17] = new JLabel();
		label[17].setIcon(icon[0]);
		label[17].addMouseListener(this);
		Panel.add(label[17]);
		// label18
		label[18] = new JLabel();
		label[18].setIcon(icon[0]);
		label[18].addMouseListener(this);
		Panel.add(label[18]);
		// label19
		label[19] = new JLabel();
		label[19].setIcon(icon[0]);
		label[19].addMouseListener(this);
		Panel.add(label[19]);
		// Panel images
		add(Panel, BorderLayout.CENTER);
		// panel button
		Panel1 = new JPanel();

		reset = new JButton("Reset");
		reset.addMouseListener(this);
		Panel1.add(reset);
		exit = new JButton("Eixt");
		exit.addMouseListener(this);
		Panel1.add(exit);
		result = new JButton("result");
		result.addActionListener(new ActionListener(){
			@SuppressWarnings("unused")
			public void ActionPerformed(ActionEvent e){
				if(e.getSource()== reset){
					init();
				}
			}
		

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}});
		Panel1.add(result);
		add(Panel1, BorderLayout.SOUTH);
        change = new Random();
		// Frame
		setTitle("Memory Game");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(580, 580);
		setVisible(true);
		setLocationRelativeTo(null);
		
	}

	public void init(){
	timer.start();
    startTime = System.currentTimeMillis();
	}
	
	public void mouseClicked(MouseEvent e) {
		
		  if (e.getSource() == label[0]) {
			  label[0].setIcon(icon[1]); 
			  add+=2;
		   } 
		  
		  else if (e.getSource() == label[1]){
		  label[1].setIcon(icon[2]); add+=2; }
		  
		   else if (e.getSource() == label[2]) {
		  label[2].setIcon(icon[3]); add+=2; }
		  
		   else if (e.getSource() == label[3]) {
		 label[3].setIcon(icon[4]); add+=2; }
		  
		   else if (e.getSource() == label[4]) {
		 label[4].setIcon(icon[5]); add+=2; } 
		  
		   else if (e.getSource() == label[5]) {
		  label[5].setIcon(icon[6]); add+=2; } 
		  
		   else if (e.getSource() == label[6]) {
		  label[6].setIcon(icon[7]); add+=2; } 
		  
		   else if (e.getSource() == label[7]) {
		  label[7].setIcon(icon[8]); add+=2; }
		  
		   else if (e.getSource() == label[8]) {
		  label[8].setIcon(icon[9]); add+=2; 
		  }
		   else if(e.getSource()== label[9]){
		  label[9].setIcon(icon[10]); add+=2; }
		  
		  else if(e.getSource() == label[10]){
		  label[10].setIcon(icon[11]); add+=2; }
		  
		  else if(e.getSource() == label[11]){
		  label[11].setIcon(icon[12]); add+=2; }
		  
		  else if(e.getSource() == label[12]){
		  label[12].setIcon(icon[13]); add+=2; }
		  
		  else if(e.getSource() == label[13]){
		  label[13].setIcon(icon[14]); add+=2; }
		  
		  else if(e.getSource() == label[14]){
		  label[14].setIcon(icon[15]); add+=2; }
		  
		  else if(e.getSource() == label[15]){
		  label[15].setIcon(icon[16]); add+=2; }
		  
		  else if(e.getSource() == label[16]){
		  label[16].setIcon(icon[17]); add+=2; 
		  }
		  
		  else if(e.getSource() == label[17]){
		  label[17].setIcon(icon[18]); add+=2; }
		  
		  else if(e.getSource() == label[18]){
		  label[18].setIcon(icon[19]); add+=2; 
		  }
		  
		  else if(e.getSource() == label[19]){
		  label[19].setIcon(icon[20]); add+=2;
		  
		  }else if(e.getSource() == label[a]){	
		  for(int a =0 ;a<20;a++){
				if(label[a] != null){
					for(int i =1;i<icon.length;i++ ){
						for(int j =1;j<i;j++){
							if(icon[i].equals(icon[j])){
								label[a].setIcon(null);
							} if(icon[j].equals(icon[i])){
								label[a].setIcon(null);
							}
							
						}
					}
				}
			}}
		  else 	if(e.getSource() == reset){
				for(int a = 0;a<20;a++){ 
					if(label[a].equals(null)){
					label[a].setIcon(icon[0]);
				}}
				
				}
		  else if (e.getSource() == exit) {
			setVisible(false);
		}

		  else if (e.getSource() == result) {
			if (add <= 30) {
				JOptionPane.showMessageDialog(null, "You give " + add
						+ " you are win");
			} else
				JOptionPane.showMessageDialog(null, " You give " + add
						+ " you lose");
		  }
	}	@Override
	public void actionPerformed(ActionEvent e) {

	
		}
		
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}


}
