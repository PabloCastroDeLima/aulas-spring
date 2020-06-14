package castro.pablo.exemplolombok.model;

import lombok.*;

/**
 * @ author Pablo castro
 * @ Since 10/06/2020 15:30
 * @ version 1.0
 */
@ToString   @NoArgsConstructor @AllArgsConstructor
public class Client {
    @Getter @Setter
    private String name;
    @Getter @Setter
    private String lastName;
    @Getter @Setter
    private int age;

    /**
     *
     * @return returna a idade do cliente vezes 12
     */
    public int calculateAgeInMonths() {
        return this.age * 12;
    }
}
