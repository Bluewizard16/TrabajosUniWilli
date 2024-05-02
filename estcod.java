import java.util.Scanner;

public class estcod{

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int opt, men;
        String usr, psw;

        System.out.println("Bienvenido!");
        do {
            System.out.println("1. Acceder \n" +
                                "2. Acerca de \n" +
                                "3. Salir");
            opt = s.nextInt();

            switch (opt) {
                case 1:
                        System.out.println("Digite el usuario:");
                        usr = s.next();

                        if (usr.equals("willisss")) {
                            System.out.println("Usuario corrercto, digite la contraseña:");
                            psw = s.next();
                            if (psw.equals("1234")) {
                                System.out.println("Contraseña correcta.");
                                do {
                                    System.out.println("Selecciona una opción. \n" +
                                                        "1. Suma.\n" + 
                                                        "2. Resta \n" + 
                                                        "3. Multiplicación \n");
                                    men = s.nextInt();

                                    switch (men) {
                                        case 1:
                                            System.out.println("Digite su primer dígito");
                                            int num1;
                                            num1 = s.nextInt();
                                            System.out.println("Digite su segundo número");
                                            break;
                                    
                                        default:
                                            break;
                                    }

                                } while (men != 5);
                            }
                        }else{
                            System.out.println("Usuario incorrecto.");
                        }
                    break;
            
                default:
                    break;
            }

        } while (opt != 3);
        System.out.println("Gracias por preferirnos");
    }
}
