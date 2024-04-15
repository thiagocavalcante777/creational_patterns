package br.com.devplenos.factory.apple.full.factory;

import br.com.devplenos.factory.apple.full.model.IPhone;
import br.com.devplenos.factory.apple.full.model.IPhoneX;

public class IphoneXFactory extends IphoneFactory{
    @Override
    protected IPhone createIphone() {
        return new IPhoneX();
    }
}
