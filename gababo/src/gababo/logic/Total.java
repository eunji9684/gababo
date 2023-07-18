//making 정석 강, 강정석

package gababo.logic;

public class Total {

	public Total() {}
	
	private int totalplay;
	private int winR;
	private int drawR;
	private int loseR;


	public void plustotal() {
		this.totalplay++;
	}
	
	public void pluswin() {
		this.winR++;
	}
	
	public void plusdraw() {
		this.drawR++;
	}
	
	public void pluslose() {
		this.loseR++;
	}
	
	public void myScore() {
		System.out.println("총 게임 수 : "+totalplay +" \n승 : "+winR+" \n무승부 : "+drawR+" \n패 : "+loseR);
	}
}