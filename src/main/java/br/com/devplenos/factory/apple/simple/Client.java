package br.com.devplenos.factory.apple.simple;

import br.com.devplenos.factory.apple.simple.factory.IphoneSimpleFactory;
import br.com.devplenos.factory.apple.simple.model.*;

public class Client {

	public static void main(String[] args) {
		System.out.println("### Ordering an iPhone X");
		IPhone IphoneXSimpleFactory = IphoneSimpleFactory.orderIPhone("X", "standard");
		System.out.println(IphoneXSimpleFactory);

		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone Iphone11SimpleFactory = IphoneSimpleFactory.orderIPhone("11", "highEnd");
		System.out.println(Iphone11SimpleFactory);
	}
}
