package brainexam1;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class View extends JFrame{
	
	Controller controller;//컨트롤러
    Model model;          //모델 
    JButton[] but = new JButton[12];
    JLabel label;
    Container cpane; 
    
    public View(Controller c, Model m) {
    	this.controller = c;
    	this.model= m;
    	c.view = this;
    	initDisplay();
    }
    
    
    public void initDisplay(){
    	cpane = getContentPane();
    	cpane.setLayout(null);
    	Color bg = new Color(230,230,250);
    	cpane.setBackground(bg);
    	//라벨
    	label = new JLabel();
    	
    	//버튼에 이미지 추가
    	for(int i = 0; i < 12; i++){
    		but[i] = new JButton(new ImageIcon("./img/back.jpg"));
    	}
    	
    	//버튼 위치 지정
		int suX = 0;
		int suY = 0;
		for(int k = 0; k < 12; k++){
			System.out.println(suX+","+suY);
		    but[k].setBounds(suX,suY,100,100);
		    suX += 100;
		    if(k == 5){
		    	suX = 0;
		        suY = 100;
		    }
		}//end for
		
		//버튼 이벤트 등록
		for(int h = 0; h < 12; h++){
			but[h].addActionListener(controller);
		}
		
		//컨테이너에 추가하기
		for(int j = 0; j < 12; j++){
			cpane.add(but[j]);
		}//end for
		
    }//end initDisplay();
    
    public void setDefaultCard(JButton jb1,JButton jb2){
    	//카드가 일치 하지 않으면 다시 뒤집어줌
    	jb1.setIcon(new ImageIcon("./img/back.jpg"));
	    jb2.setIcon(new ImageIcon("./img/back.jpg"));
    }
    
    //클릭한 카드의 이미지 번호를 저장
	public void checkCard(int su,JButton jb){
		if(model.count == 0){
			model.checkSu1 = su;
			model.imsi1 = jb;
		}else{
			model.checkSu2 = su;
			model.imsi2 = jb;
			// System.out.println(imsi1.getIcon().toString()+","+imsi2.getIcon());
			if(model.imsi1.getIcon().toString().equals(model.imsi2.getIcon().toString())){
				System.out.println(model.checkSu1+","+model.checkSu2);
				model.success ++;
				System.out.println("맞춘수:"+model.success);
				if(model.success == 6){
					endGame();
				}
		    }else{
		    	TimerThread thread = new TimerThread(this,model);
		    	thread.start();
		    }
        }
    }//end checkCard()
	
	public void endGame(){
		for(int j = 0; j < 12; j++){
			cpane.remove(but[j]);
		}//end for
		repaint();
		System.out.println("게임종료");
		label.setText("Success");
		label.setBounds(getWidth()/2-50,getHeight()/2-20,50,20);
		cpane.add(label);
	}
}//end class

