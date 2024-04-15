package br.com.devplenos.factory.apple.halfSimple.factory;

import br.com.devplenos.factory.apple.halfSimple.model.*;

public abstract class IphoneFactory {

    public IPhone orderIPhone(String level) {
        IPhone device = null;

        device = createIphone(level);

        device.getHardware();
        device.assemble();
        device.certificates();
        device.pack();

        return device;
    }

    protected abstract IPhone createIphone(String level);
}
