import com.anthony.factory.factorymethod.EuropeanFactory;
import com.anthony.factory.factorymethod.PeopleFactoryInterface;
import com.anthony.factory.product.People;
import com.anthony.factory.simplefactory.SimplePeopleFactory;

public class Main {
    public static void main(String[] args) {
        SimplePeopleFactory spf=new SimplePeopleFactory();
        People p=spf.createPeople(SimplePeopleFactory.AFRICAN);
        PeopleFactoryInterface pfi=new EuropeanFactory();
        System.out.println(pfi.createPeople());
    }
}
