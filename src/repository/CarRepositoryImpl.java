package repository;

import model.Car;
import utils.MyArrayList;
import utils.MyList;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Sergey Bugaenko
 * {@code @date} 24.10.2024
 */

/*
CRUD - операции
- Create (Создание) - добавление новых данных
- Read (Чтение) - получение или чтение данных
- Update (Обновление) - изменение существующих данных
- Delete (Удаление) - удаление данных
 */


public class CarRepositoryImpl implements CarRepository {

    // тут будут хранится все наши машинки. Имитация БД
    private final MyList<Car> cars;

    // объект, отвечающий за генерацию уникальных id
    private final AtomicInteger currentId = new AtomicInteger(1);

    public CarRepositoryImpl() {
        this.cars = new MyArrayList<>();
    }


    @Override
    public void addCar(String model, int year, double price) {
        //currentId.getAndIncrement() -> аналог currentId++; -> получение текущего id и затем увеличение его на +1
        Car car = new Car(currentId.getAndIncrement(), model, year, price);
        cars.add(car); // сохранение в "хранилище"
    }

    @Override
    public MyList<Car> getAllCars() {
        return null;
    }

    @Override
    public Car getById(int id) {
        return null;
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
    public boolean updateCarModel(int id, String model) {
        return false;
    }

    @Override
    public boolean takeCar(int id) {
        return false;
    }

    @Override
    public Car deleteCar(int id) {
        return null;
    }
}
