package br.com.devplenos.factory.apple.full.factory;

import br.com.devplenos.factory.apple.full.model.IPhone;
import br.com.devplenos.factory.apple.full.model.IPhoneXSMax;

public class IphoneXSMaxFactory extends IphoneFactory{
    @Override
    protected IPhone createIphone() {
        return new IPhoneXSMax();
    }
}
