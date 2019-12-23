package brainexam1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;


public class Controller implements ActionListener{
	
	View view;
	Model model;
	
	public Controller(Model m) {
		this.model = m;
	}//end constructor
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(model.freeze) return;
		
		if (e.getSource() == view.but[0]) {
			view.but[0].setIcon(new ImageIcon("./img/" + view.model.su[0] + ".jpg"));
			view.checkCard(view.model.su[0], view.but[0]);
		} else if (e.getSource() == view.but[1]) {
			view.but[1].setIcon(new ImageIcon("./img/" + view.model.su[1] + ".jpg"));
			view.checkCard(view.model.su[1], view.but[1]);
		} else if (e.getSource() == view.but[2]) {
			view.but[2].setIcon(new ImageIcon("./img/" + view.model.su[2] + ".jpg"));
			view.checkCard(view.model.su[2], view.but[2]);
		} else if (e.getSource() == view.but[3]) {
			view.but[3].setIcon(new ImageIcon("./img/" + view.model.su[3] + ".jpg"));
			view.checkCard(view.model.su[3], view.but[3]);
		} else if (e.getSource() == view.but[4]) {
			view.but[4].setIcon(new ImageIcon("./img/" + view.model.su[4] + ".jpg"));
			view.checkCard(view.model.su[4], view.but[4]);
		} else if (e.getSource() == view.but[5]) {
			view.but[5].setIcon(new ImageIcon("./img/" + view.model.su[5] + ".jpg"));
			view.checkCard(view.model.su[5], view.but[5]);
		} else if (e.getSource() == view.but[6]) {
			view.but[6].setIcon(new ImageIcon("./img/" + view.model.su[6] + ".jpg"));
			view.checkCard(view.model.su[6], view.but[6]);
		} else if (e.getSource() == view.but[7]) {
			view.but[7].setIcon(new ImageIcon("./img/" + view.model.su[7] + ".jpg"));
			view.checkCard(view.model.su[7], view.but[7]);
		} else if (e.getSource() == view.but[8]) {
			view.but[8].setIcon(new ImageIcon("./img/" + view.model.su[8] + ".jpg"));
			view.checkCard(view.model.su[8], view.but[8]);
		} else if (e.getSource() == view.but[9]) {
			view.but[9].setIcon(new ImageIcon("./img/" + view.model.su[9] + ".jpg"));
			view.checkCard(view.model.su[9], view.but[9]);
		} else if (e.getSource() == view.but[10]) {
			view.but[10].setIcon(new ImageIcon("./img/" + view.model.su[10] + ".jpg"));
			view.checkCard(view.model.su[10], view.but[10]);
		} else if (e.getSource() == view.but[11]) {
			view.but[11].setIcon(new ImageIcon("./img/" + view.model.su[11] + ".jpg"));
			view.checkCard(view.model.su[11], view.but[11]);
		}
		//두번째 클릭시 초기화
		if(model.count < 1){
			model.count ++;
		}else{
			model.count = 0;
		}
	}// end actionPerformed()
	
	

 
}

 

