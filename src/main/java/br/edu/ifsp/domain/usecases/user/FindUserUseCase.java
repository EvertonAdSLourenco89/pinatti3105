package br.edu.ifsp.domain.usecases.user;

import br.edu.ifsp.domain.entities.user.User;
import br.edu.ifsp.domain.usecases.utils.Validator;

import java.util.List;
import java.util.Optional;

public class FindUserUseCase {
    private UserDAO userDAO;

    public FindUserUseCase(UserDAO userDAO) {
        this.userDAO = userDAO;
    }
    /*

    ************ Não esta nos casos de uso ******************

    public Optional<User> findOne(Integer id){
        if (id==null)
            throw new IllegalArgumentException("ID can not be null.");
        return userDAO.findOne(id);
    }

  */
    public Optional<User> findOneByCpf(String cpf) {
        if (Validator.nullOrEmpty(cpf))
            throw new IllegalArgumentException("CPF can not be null or empty.");
        return Optional.ofNullable(userDAO.findOneByCpf(cpf));
    }


    public List<User> findAll(){
        return userDAO.findAll();
    }

}
