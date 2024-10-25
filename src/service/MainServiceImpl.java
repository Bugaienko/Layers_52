package service;

import model.Car;
import model.User;
import repository.CarRepository;
import utils.MyList;

/**
 * @author Sergey Bugaenko
 * {@code @date} 25.10.2024
 */

public class MainServiceImpl implements MainService {

    private final CarRepository repositoryCar;
    private User activeUser;

    public MainServiceImpl(CarRepository carRepository) {
        this.repositoryCar = carRepository;
    }


    @Override
    public void addCar(String model, int year, double price) {

    }

    @Override
    public MyList<Car> getAllCars() {
        return repositoryCar.getAllCars();
    }

    @Override
    public MyList<Car> getCarsByModel(String model) {
        return null;
    }

    @Override
    public MyList<Car> getFreeCars() {
        return null;
    }

    @Override
    public boolean updateCarPrice(int id, double price) {
        Car car = repositoryCar.getById(id);
        if (car == null || price < 0) {
            return false;
        }

        car.setPrice(price);
        return true;
    }

    @Override
    public boolean takeCar(int id) {
        Car car = repositoryCar.getById(id);
        // Todo
        /*
        1. Проверить, что машина найден и свободна. Если нет - закончить метод
        2. Пометить машину, как занятую
        3. Добавить машину в список машин текущего пользователя
         */

        return false;
    }

    @Override
    public Car deleteCar(int id) {
        Car car = repositoryCar.getById(id);
        if (car == null) return null;

        repositoryCar.deleteCar(car);
        return car;
    }

    @Override
    public User registerUser(String email, String password) {
        return null;
    }

    @Override
    public boolean loginUser(String email, String password) {
        return false;
    }

    @Override
    public void logout() {

    }
}
