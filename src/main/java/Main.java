import com.company.details.Engine;
import com.company.entities.Person;
import com.company.professions.Driver;
import com.company.vehicles.Car;
import com.company.vehicles.Lorry;
import com.company.vehicles.SportCar;

public class Main {
    public static void main(String[] args) {
        Car car=new Car("Mersedes","S",2200);
        car.toString(new Driver("Иванов Иван Иваныч",45,"M",911,
                25),new Engine(450,"V8"));
        car.start();
        car.turnLeft();
        car.turnRight();
        car.stop();
        Lorry lorry=new Lorry("Камаз","A",7000,5);
        lorry.toStringLorry(new Driver("Петров Максим Сергеевич",55,"M",538,30),
                new Engine(1200,"V9"));
        lorry.start();
        lorry.turnLeft();
        lorry.turnRight();
        lorry.stop();
        SportCar sportCar=new SportCar("Porsche","S",1900,320);
        sportCar.toStringSportCar(new Driver("Шевченко Андрей Викторович",39,
                "M",777,15),new Engine(350,"W5"));
        sportCar.start();
        sportCar.turnRight();
        sportCar.turnLeft();
        sportCar.stop();
    }

}
