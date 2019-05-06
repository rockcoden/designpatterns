package designpatterns.creational.factory.abstractfactory.customcarfactory;

import java.util.List;

import designpatterns.creational.factory.abstractfactory.customcarfactory.constants.CarModel;
import designpatterns.creational.factory.abstractfactory.customcarfactory.constants.CarStyles;
import designpatterns.creational.factory.abstractfactory.customcarfactory.constants.CarTypes;

public class FastorCarShop extends CarShopImpl {

	public FastorCarShop(CarFactory carFactory) {
		super(carFactory);
	}

	@Override
	public List<CarModel> queryAvailableModels() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Car buyANewCar(CarModel model) {
		// TODO Auto-generated method stub
		return null;
	}


}
