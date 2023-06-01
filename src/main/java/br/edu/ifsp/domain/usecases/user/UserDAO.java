package br.edu.ifsp.domain.usecases.user;

import br.edu.ifsp.domain.entities.user.User;
import br.edu.ifsp.domain.usecases.utils.DAO;

public interface UserDAO extends DAO<User, Integer> {
   User findOneByCpf(String cpf);
}
