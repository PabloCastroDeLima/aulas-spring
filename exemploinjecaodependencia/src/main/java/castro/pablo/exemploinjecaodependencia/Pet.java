package castro.pablo.exemploinjecaodependencia;

import castro.pablo.exemploinjecaodependencia.Interface.AnimalInterface;
import castro.pablo.exemploinjecaodependencia.Model.Cat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @ author Pablo castro
 * @ since 20/06/2020 16:40
 * @ version 1.0
 */
@Component
public class Pet {
    @Autowired
    @Qualifier("Cat")
    private AnimalInterface animalInterface;

//    /**
//     *
//     * @param animalInterface
//     */
//    public Pet(AnimalInterface animalInterface) {
//        this.animalInterface = animalInterface;
//    }

    public void execute() {
        animalInterface.comunicar();
    }
}
