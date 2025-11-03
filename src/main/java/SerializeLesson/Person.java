package SerializeLesson;

import lombok.Data;

import java.io.Serializable;

@Data
public class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;

    public Person(int id) {
        this.id = id;
    }
}
