package br.com.devplenos.factory.apple.halfSimple.factory;

import br.com.devplenos.factory.apple.halfSimple.model.*;

public class IphoneXFactory extends IphoneFactory{
    @Override
    protected IPhone createIphone(String level) {
        if (level.equals("standard")) {
            return new IPhoneX();
        }else if(level.equals("highEnd")) {
            return new IPhoneXSMax();
        } else {
            return null;
        }
    }
}
