package br.com.devplenos.factory.apple.halfSimple;

import br.com.devplenos.factory.apple.halfSimple.factory.Iphone11Factory;
import br.com.devplenos.factory.apple.halfSimple.factory.IphoneXFactory;
import br.com.devplenos.factory.apple.halfSimple.model.*;

public class Client {

	public static void main(String[] args) {
		Iphone11Factory iphoneGen11 = new Iphone11Factory();
		IphoneXFactory iphoneGenX = new IphoneXFactory();

		System.out.println("### Ordering an iPhone X");
		IPhone iphone = iphoneGenX.orderIPhone("standard");
		System.out.println(iphone);

		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iphone2 = iphoneGen11.orderIPhone("highEnd");
		System.out.println(iphone2);
	}
}
