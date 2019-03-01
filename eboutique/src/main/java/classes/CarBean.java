package classes;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.context.annotation.Scope;
@Named
@Scope("session")
public class CarBean {

	@Inject
	CarDao carDao;

	public void setCarDao(CarDao carDao) {
		this.carDao = carDao;
	}

	public List<String> fetchCarDetails() {

		return carDao.getCarDetails();
	}

}