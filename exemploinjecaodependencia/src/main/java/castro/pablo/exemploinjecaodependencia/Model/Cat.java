package castro.pablo.exemploinjecaodependencia.Model;

import castro.pablo.exemploinjecaodependencia.Interface.AnimalInterface;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @ author Pablo castro
 * @ since 20/06/2020 16:38
 * @ version 1.0
 */
@Component
@Qualifier("Cat")
public class Cat implements AnimalInterface {
    @Override
    public void comunicar() {
        System.out.println("miau miau");
    }
}
