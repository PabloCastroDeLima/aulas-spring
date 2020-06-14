package castro.pablo.exemploinjecaodependencia.Model;

import castro.pablo.exemploinjecaodependencia.Interface.AnimalInterface;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @ author Pablo castro
 * @ since 20/06/2020 16:35
 * @ version 1.0
 */
@Component
@Primary
@Qualifier("Dog")
public class Dog implements AnimalInterface {

    @Override
    public void comunicar() {
        System.out.println("au au");
    }
}
