package org.example.nation;

import org.example.language.Salutation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class English implements European{

    @Autowired
    @Qualifier("salutationEn")
    private Salutation salutation;
    @Override
    public void saluer() {

        System.out.println("Hello");
        salutation.sayHello();
    }
}
