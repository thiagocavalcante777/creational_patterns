package br.com.devplenos.factory.apple.full.factory;

import br.com.devplenos.factory.apple.full.model.IPhone;

public abstract class IphoneFactory {

    public IPhone orderIPhone() {
        IPhone device = null;

        device = createIphone();
        device.getHardware();
        device.assemble();
        device.certificates();
        device.pack();

        return device;
    }

    protected abstract IPhone createIphone();
}
