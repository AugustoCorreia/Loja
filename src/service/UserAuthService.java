package service;

import models.UserAuth;
import repository.UserAuthRepository;

import java.util.List;

public class UserAuthService {

    UserAuthRepository reposirory = new UserAuthRepository();

    public List<UserAuth> listar(){
        return reposirory.listarTodos();
    }

    public void incluir(UserAuth user){
        reposirory.create(user);
    }

    public void deletar(Long id){
        reposirory.delete(id);
    }

    public void atualiza(UserAuth user){
        reposirory.update(user);
    }

    public UserAuth buscaPeloId(Long id){
        return reposirory.getById(id);
    }
}
