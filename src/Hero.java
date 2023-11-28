//勇者の金型を作成
public class Hero {
	// フィールド（属性）
	String name;
	int hp;

	// メソッド（操作・能力）
	public void sleep() {
		// 眠ることでhpを100にする
		int age = 20; //フィールドではない
		this.hp = 100;
		System.out.println(this.name + "は、眠って回復した！");
	}

	public void sit(int sec) {
		// 座って休んだ秒数分だけhpが増える
		this.hp += sec; // this.hp = this.hp + sec;
		System.out.println(this.name + "は、" + sec + "秒座った！");
		System.out.println("ＨＰが" + sec + "ポイント回復した");
	}

	public void slip() {
		this.hp -= 5;
		System.out.println(this.name + "は、転んだ！");
		System.out.println("５のダメージ！");
	}

	public void run() {
		System.out.println(this.name + "は、逃げ出した！");
		System.out.println("GAMEOVER");
		System.out.println("最終HPは" + this.hp + "でした！");
	}
}
