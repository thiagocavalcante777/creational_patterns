package br.com.devplenos.factory.apple.full.factory;

import br.com.devplenos.factory.apple.full.model.IPhone;
import br.com.devplenos.factory.apple.full.model.IPhone11Pro;

public class Iphone11ProFactory extends IphoneFactory{

    @Override
    protected IPhone createIphone() {
        return new IPhone11Pro();
    }
}
