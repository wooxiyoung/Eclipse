package com.peisia.kiosk.catcafe;

import com.peisia.util.Cw;

public class Kiosk_cat {

	public void cat() {

		e: while (true) {
			Disp.Line();
			for (Product p : Kioskobj.products_cat) {
				Cw.wn(p.name + "" + p.price + "원");
			}
			Disp.Line();
			System.out.println("1.츄르/2.참치캔/x.되돌아가기");
			Kioskobj.cmd = Kioskobj.sc.next();
			switch (Kioskobj.cmd) {
			case "1":
				System.out.println(Kioskobj.products_cat.get(0).name + " 담겼습니다");
				Kioskobj.basket.add(new Order(Kioskobj.products_cat.get(0)));
				break;
			case "2":
				System.out.println(Kioskobj.products_cat.get(1).name + " 담겼습니다");
				Kioskobj.basket.add(new Order(Kioskobj.products_cat.get(1)));
				break;
			case "x":
				System.out.println("화면을 되돌아갑니다");
				break e;
			}
		}
	}

}
