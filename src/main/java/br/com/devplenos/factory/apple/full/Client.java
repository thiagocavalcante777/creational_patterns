package br.com.devplenos.factory.apple.full;

import br.com.devplenos.factory.apple.full.factory.Iphone11ProFactory;
import br.com.devplenos.factory.apple.full.factory.IphoneXFactory;
import br.com.devplenos.factory.apple.full.model.*;

public class Client {

	public static void main(String[] args) {
		IphoneXFactory iphoneXFactory = new IphoneXFactory();
		Iphone11ProFactory iphone11ProFactory = new Iphone11ProFactory();

		System.out.println("### Ordering an iPhone X");
		IPhone iphone = iphoneXFactory.orderIPhone();
		System.out.println(iphone);

		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iphone2 = iphone11ProFactory.orderIPhone();
		System.out.println(iphone2);
	}
}
