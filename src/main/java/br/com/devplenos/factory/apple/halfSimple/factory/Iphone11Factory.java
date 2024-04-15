package br.com.devplenos.factory.apple.halfSimple.factory;

import br.com.devplenos.factory.apple.halfSimple.model.IPhone;
import br.com.devplenos.factory.apple.halfSimple.model.IPhone11;
import br.com.devplenos.factory.apple.halfSimple.model.IPhone11Pro;

public class Iphone11Factory extends IphoneFactory{

    @Override
    protected IPhone createIphone(String level) {
        if (level.equals("standard")) {
            return new IPhone11();
        }else if(level.equals("highEnd")) {
            return new IPhone11Pro();
        } else {
            return null;
        }
    }
}
