package repository;

import models.UserAuth;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class UserAuthRepository {

    private List<UserAuth> listaUsuarios = new ArrayList<>();

    public UserAuthRepository() {
        listaUsuarios.add(new UserAuth(1L,"login", "senha", true));
        listaUsuarios.add(new UserAuth(2L,"Karpeg", "senha", true));
        listaUsuarios.add(new UserAuth(3L,"Aleff", "senha", true));
    }

    // CRUD
    //create
    //read
    //Update
    //delete

    public void create(UserAuth newUser){
        listaUsuarios.add(newUser);
    }

    public List<UserAuth> listarTodos(){
        return listaUsuarios;
    }

    public UserAuth getById(Long id){
        return listaUsuarios.stream().filter(auth->auth.getId() == id).findFirst().get();
    }

    public void update(UserAuth upUser){
        UserAuth user = getById(upUser.getId());
        if(Objects.isNull(user)){
            return;
        }else{
           listaUsuarios.remove(user);
           user.setAtivo(upUser.getAtivo());
           user.setLogin(upUser.getLogin());
           user.setSenha(upUser.getSenha());
           listaUsuarios.add(user);
        }

    }

    public void delete (Long id){
        listaUsuarios.remove(getById(id));
    }

}
