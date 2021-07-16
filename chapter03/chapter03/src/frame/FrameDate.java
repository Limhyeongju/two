package frame;

import java.awt.Button;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JPanel;

import busVO.Bus;

public class FrameDate extends JPanel{

	public FrameDate(Bus b){
		setBackground(new Color(255, 241, 54));
		setLayout(null);
		setSize(600, 800);
		
		JPanel bottomSet = new JPanel();
		bottomSet.setBounds(0, 660, 600, 100);
		bottomSet.setBackground(Color.yellow);
		bottomSet.setLayout(null);
		
		JButton btnPrev = new JButton("< PREV");
		btnPrev.setBackground(new Color(183, 240, 117));
		btnPrev.setSize(200, 150);
		btnPrev.setLocation(0, 620);
		btnPrev.setFont(new Font("굴림", Font.BOLD, 26));
		bottomSet.add(btnPrev);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setBackground(new Color(183, 240, 117));
		btnExit.setSize(200, 150);
		btnExit.setLocation(196, 620);
		btnExit.setFont(new Font("굴림", Font.BOLD, 26));
		bottomSet.add(btnExit);
		
		JButton btnNext = new JButton("NEXT >");
		btnNext.setBackground(new Color(183, 240, 117));
		btnNext.setSize(200, 150);
		btnNext.setLocation(395, 620);
		btnNext.setFont(new Font("굴림", Font.BOLD, 26));
		bottomSet.add(btnNext);
		
		add(bottomSet);
	
		btnPrev.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.getInstance(new FrameBusSelect());
			}
		});
   		
		btnExit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.getInstance(new FrameMyPage());
			}
		});
		
		btnNext.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.getInstance(new FrameReserve(b));
			}
		});
		
		Frame frame = new Frame("달력");
		int frameWidth= 500;
		int frameHeight=300;
		
		ArrayList<Integer> calArr= new ArrayList<Integer>();
		Calendar cal = Calendar.getInstance();
		int year =cal.get(Calendar.YEAR);
		int month=cal.get(Calendar.MONTH);
		int date =cal.get(Calendar.DATE);
		int lastDay=cal.getActualMaximum(Calendar.DATE);
		
		for(int i=0;i<lastDay;i++) {
			calArr.add(i+1);
		}
		cal.set(Calendar.DATE, 1);
		int yoil=cal.get(Calendar.DAY_OF_WEEK);//1일요일 ~7토요일
		int numOfpreMonth=yoil-1;
		cal.add(Calendar.MONTH, -1);
		lastDay = cal.getActualMaximum(Calendar.DATE);
		for(int i =0;i<numOfpreMonth;i++) {
			calArr.add(0,lastDay);
			lastDay--;
		}
		cal.add(Calendar.MONTH, 1);
		lastDay = cal.getActualMaximum(Calendar.DATE);
		cal.set(Calendar.DATE, lastDay);
		yoil = cal.get(Calendar.DAY_OF_WEEK);
		int numOfNextMonth=7-yoil;
		for(int i=0;i<numOfNextMonth;i++) {
			calArr.add(i+1);
		}
		GridLayout gridLayout = new GridLayout(calArr.size()/7,7);
		frame.setLayout(gridLayout);
		for(int i=0;i<calArr.size();i++){
			Button tempBtn = new Button(calArr.get(i)+"");
			if(i%7==0) {
				tempBtn.setForeground(Color.red);
			}else if(i%7==6){
				tempBtn.setForeground(Color.blue);
			}
			frame.add(tempBtn);
			tempBtn.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					FrameBase.getInstance(new FrameBegin());
					
				}
			});
		}
		
		setFrame(frameWidth,frameHeight,frame);
	}
	
	private static void setFrame(int frameWidth, int frameHeight,Frame frame ) {
		frame.setSize(frameWidth, frameHeight);
		frame.setResizable(false);
		
		Dimension scr = Toolkit.getDefaultToolkit().getScreenSize();
		
		int width = (int)scr.getWidth();
		int height = (int)scr.getHeight();
		frame.setLocation((width/2)-(frameWidth/2),(height/2)-(frameHeight/2));
		frame.setVisible(true);
		
		frame.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
		
		
	}
}
