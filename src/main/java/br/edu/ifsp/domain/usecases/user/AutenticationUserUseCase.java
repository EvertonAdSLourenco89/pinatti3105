package br.edu.ifsp.domain.usecases.user;

import br.edu.ifsp.domain.entities.user.User;
import br.edu.ifsp.domain.usecases.utils.Validator;

public class AutenticationUserUseCase {

    private UserDAO userDAO;

    public AutenticationUserUseCase(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public boolean select(String cpf, String password){
        if (Validator.nullOrEmpty(cpf) || Validator.nullOrEmpty(password))
            throw new IllegalArgumentException("CPF ou Password can not be null or empty.");

        User user = userDAO.findOneByCpf(cpf);

        if (!user.getCpfUser().equals(cpf) && !user.getPasswordUser().equals(password)){
            throw new IllegalArgumentException("Authentication failed! Username or password incorrect.");
        }
        return true;
    }
}
