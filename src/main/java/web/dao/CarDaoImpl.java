package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {
    private final List<Car> cars = new ArrayList<> ( );

    @Override
    public List<Car> carList() {

        cars.add ( new Car ( "Lada", "Red", 1990 ) );
        cars.add ( new Car ( "BMW", "Green", 2000 ) );
        cars.add ( new Car ( "Renault", "Blue", 2005 ) );
        cars.add ( new Car ( "Volga", "Black", 2010 ) );
        cars.add ( new Car ( "Jeep", "Pink", 2020 ) );

        return cars;
    }

}