import java.util.Scanner;

public class estcod{

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int opt, men;
        String usr, psw;

        System.out.println("Bienvenido!");
        do {
            System.out.println("\n1. Acceder \n" +
                                "2. Acerca de \n" +
                                "3. Salir");
            opt = s.nextInt();

            switch (opt) {
                    case 1:
                        System.out.println("\nDigite el usuario:");
                        usr = s.next();

                        if (usr.equals("willisss")) {
                            System.out.println("Usuario corrercto, digite la contraseña:");
                            psw = s.next();
                            if (psw.equals("1234")) {
                                System.out.println("Contraseña correcta.");
                                do {
                                    System.out.println("\nSelecciona una opción. \n" +
                                                        "1. Suma.\n" + 
                                                        "2. Resta. \n" + 
                                                        "3. Multiplicación. \n" +
                                                        "4. Resta\n" + 
                                                        "5. Factorial\n" +
                                                        "6. Salir");
                                    men = s.nextInt();

                                    int num1, num2, result, factorial = 1;

                                    switch (men) {
                                        case 1: //SUMA
                                            System.out.println("\nDigite su primer dígito");
                                            num1 = s.nextInt();
                                            System.out.println("Digite su segundo número");
                                            num2 = s.nextInt();
                                            result = num1 + num2;
                                            System.out.println("******************************");
                                            System.out.println("El resultado de la suma es: " + result);
                                            System.out.println("******************************");
                                            break;
                                    
                                        case 2: //RESTA
                                            System.out.println("\nDigite su primer dígito");
                                            num1 = s.nextInt();
                                            System.out.println("Digite su segundo número");
                                            num2 = s.nextInt();
                                            result = num1 - num2;
                                            System.out.println("*********************************");
                                            System.out.println("El resultado de la resta es: " + result);
                                            System.out.println("*********************************");
                                        break;

                                        case 3: //MULTIPLICACIÓN
                                            System.out.println("\nDigite su primer dígito");
                                            num1 = s.nextInt();
                                            System.out.println("Digite su segundo número");
                                            num2 = s.nextInt();
                                            result = num1 * num2;
                                            System.out.println("****************************************");
                                            System.out.println("El resultado de la multiplicación es: " + result);
                                            System.out.println("****************************************");
                                        break;

                                        case 4: //DIVISIÓN
                                            System.out.println("\nDigite su primer dígito");
                                            num1 = s.nextInt();
                                            System.out.println("Digite su segundo número");
                                            num2 = s.nextInt();
                                            result = num1 / num2;
                                            System.out.println("*************************************");
                                            System.out.println("El resultado de la división es: " + result);
                                            System.out.println("*************************************");
                                        break;

                                        case 5://FACTORIAL
                                            System.out.println("\nDigita el número al cual deseas sacar su factorial");
                                            num1 = s.nextInt();
                                            for(int i = 1; i<=num1 ; i++){
                                                factorial *= i;
                                            }
                                            System.out.println("*******************************************");
                                            System.out.println("El factorial de 12 es: 12!= " + factorial);
                                            System.out.println("*******************************************");
                                        break;

                                        default:
                                            break;
                                    }

                                } while (men != 6);
                            }
                        }else{
                            System.out.println("Usuario incorrecto.");
                        }
                    break;

                    case 2:
                        System.out.println("Este programa fue realizado para fines educativos.");
                    break;

                    default:
                    break;
            }

        } while (opt != 3);
        System.out.println("Gracias por preferirnos");
    }
}
