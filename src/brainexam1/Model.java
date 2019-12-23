package brainexam1;

import javax.swing.JButton;


public class Model {
	
	public int[] su = new int[12]; //번호 카드의 종류
	
	public int checkSu1; 
	public int checkSu2; 
	public int count;
	public int clickCard;
	public boolean freeze;//클릭할 수 있는 카드를 2개로 제한
	public JButton imsi1; //클릭한 버튼의 정보
	public JButton imsi2; //클릭한 버튼의 정보
	public int success;   //카드를 맞출경우 1씩증가 6가되면 게임 종료
	
	
	public Model() {
		mixSu();
	}//end constructor
	
	public void mixSu(){
		//배열의 0~11 까지 1부터 12를 순서로 넣어줌
		for(int i = 0; i < 12; i++){
			su[i] = i+1;
			//두개씩 중복 시키기 위해 배열의 6번부터 6을 마이너스 함
			if(i > 5) su[i] -= 6;
			System.out.println(su[i]);
		}
		
		//배열에 들어있는 수들을 섞어줌
		int random = 0; //배열을 섞어줄 변수
		int temp   = 0; //배열에 들어있는 수를 임시로 저장
		for(int i = 0; i < 12; i++){
			random = (int)(Math.random() * 12);
			temp = su[0];
			su[0] = su[random];
			su[random] = temp;
			
		}
	}//end mixSu
	
	
 
}//end class



