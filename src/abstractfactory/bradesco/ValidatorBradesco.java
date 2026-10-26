package abstractfactory.bradesco;

import abstractfactory.Validator;

public class ValidatorBradesco implements Validator {
    @Override
    public boolean validate() {
        System.out.println("Validando dados do bradesco");
        return false;
    }
}
