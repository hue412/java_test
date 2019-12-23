package brainexam1;

public class TimerThread extends Thread{
	View view;
    Model model;
 
  
 
	 public TimerThread(View v,Model m) {
	    this.view = v;
	    this.model = m;
	 }//end constructor
	 
	 public void run() {
		 //카드가 열려 있을때는 다른 카드를 클릭못함
		 model.freeze = true;
		 try {
			 Thread.sleep(500);
		 }catch (InterruptedException e) {
			 // TODO Auto-generated catch block
			 e.printStackTrace();
		 }
		 view.setDefaultCard(model.imsi1,model.imsi2);
		 //카드를 뒤집고 클릭 가능하게 변경
		 model.freeze = false;
		 System.out.println("thread");
	 }//end run


}//end class

