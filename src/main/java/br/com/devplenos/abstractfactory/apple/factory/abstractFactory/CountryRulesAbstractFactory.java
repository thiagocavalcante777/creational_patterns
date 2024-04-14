package br.com.devplenos.abstractfactory.apple.factory.abstractFactory;

import br.com.devplenos.abstractfactory.apple.model.certificate.Certificate;
import br.com.devplenos.abstractfactory.apple.model.packing.Packing;

public interface CountryRulesAbstractFactory {
	Certificate getCertificates();
	
	Packing getPacking();
}
