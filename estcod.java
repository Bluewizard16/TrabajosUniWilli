import java.util.Scanner;

public class estcod{

    public static void main(String[] args){
        // Variables (res = resultado, num1 = numero 1, s = Scaner[para obtener datos del teclado])
        int res, num1, opt, value, log;
        Scanner s = new Scanner(System.in);

        System.out.println("Bienvenido! \n" + 
                            "Selecciona UNA opción \n" + 
                            "1. Acceder \n"+
                            "2. Acerca de \n" + 
                            "3. Salir");
        log = s.nextInt();

        switch (log) {
            case 1: // Loggin
                System.out.println("Digite su usuario: ");
                String usr;
                usr = s.next();

                if (usr.equals("willisss")) {
                    System.out.println("User correcto, digite su contraseña: ");
                    String psw;
                    psw = s.next();
                    if (psw.equals("123yope")) {
                        System.out.println("digita un numero diferente de 3");
                        opt = s.nextInt();

                        do {
                            switch (opt) {
                                case 1:
                                    System.out.println("nonas");
                                    break;
                            
                                default:
                                    break;
                            }
                        } while (opt < 3);
                        System.out.println("Vuelve pronto");
                        s.close();

                    }else{
                        System.out.println("Contraseña incorrecta.");
                    }
                }else{
                    System.out.println("Usuario no encontrado en la base de datos.");
                }
                break;
            case 2: // About
                System.out.println("Programa realizado para la exposición.");
                break;
            default:
                System.out.println("Gracias por visitarnos :).");
                break;
        }
    }
}
