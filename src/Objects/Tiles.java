package Objects;

public class Tiles {
	String Name; //땅 이름
	int Num; //땅 번호
	int Purchased; //구매된 땅인지 아닌지
	int Buildings[]; //구매된 땅이라면 설치된 건물 종류 표시
	int Price1; // 땅만 구매 가격
	int Price2; // 1차 건물 가격
	int Price3; // 2차 건물 가격
	int Price4; // 3차 건물 가격
	int Pay; //남의 땅일 때, 지불 가격, 건물 가격 * 1.2
	int TakeOverMoney; //남의 땅일 때, 지불 비용 *1.2예상
	int Owner; //주인이 없으면 0, 땅의 주인 표시 1 또는 2
	int Type; //0 기본 땅, 1 무인도, 2 국제여행, 3 기부
	
	//일반 타일 초기화
	public Tiles(String Name, int Num, int Purchased,int[] Buildings,int Owner,int Type){
		super();
		this.Name = Name;
		this.Num = Num;
		this.Purchased = Purchased;
		this.Buildings = Buildings;
		this.Price1 = Num*100;
		this.Price2 = Num*30;
		this.Price3 = Num*40;
		this.Price4 = Num*50;
		this.Owner = Owner;
		this.Type = Type;
	}
	
	// 특수 타일 초기화
	public Tiles(String Name, int Num, int Type) {
		super();
		this.Name = Name;
		this.Num = Num;
		this.Type = Type;
	}
	
}
