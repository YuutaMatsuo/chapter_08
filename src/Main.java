
public class Main {
	public static void main(String[] args) {
		// 実行クラス（冒険の書）

		// 1.勇者をインスタンス化
		Hero h = new Hero();
		// 2.フィールドに初期値をセット
		h.name = "ミナト";
		h.hp = 100;
		
		//お化けキノコをインスタンス化しフィールドに初期値をセット
		Matango m1 = new Matango();
		m1.hp = 50;
		m1.suffix = 'A';
		Matango m2 = new Matango();
		m2.hp = 48;
		m2.suffix = 'B';
		
//		System.out.println("勇者" + h.name + "(HP：" + h.hp + "）を生み出しました！");
//		// 3.勇者のメソッドを呼び出してゆく
//		h.sit(5);
//		System.out.println("勇者" + h.name + "のHP：" + h.hp);
//		h.slip();
//		h.sit(25);
//		System.out.println("勇者" + h.name + "のHP：" + h.hp);
//		h.run();
		
		//冒険のはじまり
		h.slip();
		m1.run();
		m2.run();
		h.run();
	}
}
