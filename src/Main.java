import models.UserAuth;
import service.UserAuthService;

public class Main {
    public static void main(String[] args) {

        UserAuth auth2 = new UserAuth(51L, "acl@acl", "123", true);

        UserAuthService service = new UserAuthService();

        service.incluir(auth2);

        service.deletar(2L);

        service.listar().stream()
                .forEach(userAuth -> System.out.println(userAuth.toString()));

        System.out.println("----------------------------");
        System.out.println(service.buscaPeloId(51L));

        System.out.println("----------------------------");

        auth2.setLogin("email");

        service.atualiza(auth2);

        System.out.println(service.buscaPeloId(51L));


    }
}
