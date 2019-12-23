package brainexam1;

import javax.swing.JButton;


public class Model {
	
	public int[] su = new int[12]; //��ȣ ī���� ����
	
	public int checkSu1; 
	public int checkSu2; 
	public int count;
	public int clickCard;
	public boolean freeze;//Ŭ���� �� �ִ� ī�带 2���� ����
	public JButton imsi1; //Ŭ���� ��ư�� ����
	public JButton imsi2; //Ŭ���� ��ư�� ����
	public int success;   //ī�带 ������ 1������ 6���Ǹ� ���� ����
	
	
	public Model() {
		mixSu();
	}//end constructor
	
	public void mixSu(){
		//�迭�� 0~11 ���� 1���� 12�� ������ �־���
		for(int i = 0; i < 12; i++){
			su[i] = i+1;
			//�ΰ��� �ߺ� ��Ű�� ���� �迭�� 6������ 6�� ���̳ʽ� ��
			if(i > 5) su[i] -= 6;
			System.out.println(su[i]);
		}
		
		//�迭�� ����ִ� ������ ������
		int random = 0; //�迭�� ������ ����
		int temp   = 0; //�迭�� ����ִ� ���� �ӽ÷� ����
		for(int i = 0; i < 12; i++){
			random = (int)(Math.random() * 12);
			temp = su[0];
			su[0] = su[random];
			su[random] = temp;
			
		}
	}//end mixSu
	
	
 
}//end class



