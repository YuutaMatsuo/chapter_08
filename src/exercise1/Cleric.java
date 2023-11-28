package exercise1;

import java.util.Random;

public class Cleric {
	String name;
	int hp = 50;
	final int MAXHP = 50;
	int mp = 10;
	final int MAXMP = 10;

	public void selfAid() {
		// mpを５消費する
		mp -= 5;
		hp = MAXHP;
		System.out.println("HPが全回復した。\n現在のMPは" + this.mp + "です。");
	}

	public int pray(int s) {
		int recoveryMp = new Random().nextInt(3) + s;
		if ((recoveryMp + this.mp) >= this.MAXMP) {
			System.out.println(this.name + "は" + s + "秒祈った。MPは全回復した。");
			this.mp = MAXMP;
			return this.MAXMP;
		} else {
			System.out.println(this.name + "は" + s + "秒祈った。MPは" + recoveryMp + "回復した。");
			this.mp += recoveryMp;
			System.out.println("現在のMPは" + this.mp + "です。");
			return recoveryMp;
		}
	}
}
