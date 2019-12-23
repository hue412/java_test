package brainexam1;

public class TimerThread extends Thread{
	View view;
    Model model;
 
  
 
	 public TimerThread(View v,Model m) {
	    this.view = v;
	    this.model = m;
	 }//end constructor
	 
	 public void run() {
		 //ī�尡 ���� �������� �ٸ� ī�带 Ŭ������
		 model.freeze = true;
		 try {
			 Thread.sleep(500);
		 }catch (InterruptedException e) {
			 // TODO Auto-generated catch block
			 e.printStackTrace();
		 }
		 view.setDefaultCard(model.imsi1,model.imsi2);
		 //ī�带 ������ Ŭ�� �����ϰ� ����
		 model.freeze = false;
		 System.out.println("thread");
	 }//end run


}//end class

