/*
Ajustar exemplo do professor para o projeto
*/

package model;

public class LoginVerificador {

    public String authenticate(String username, String password) {
        if (("ramide".equalsIgnoreCase(username))
                && ("password".equals(password))) {
            return "success";
        } else {
            return "failure";
        }
    }
}