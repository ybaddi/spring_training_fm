package org.example.nation;

import org.example.language.Salutation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("francais")
@Scope("prototype")
public class French implements European{

    @Autowired
    @Qualifier("salutationFr")
    private Salutation salutation;
    @Override
    public void saluer() {
        salutation.sayHello();
    }

    public void sayBonjour(){
        salutation.sayHello();
    }
}
