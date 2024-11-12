package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicios {

    public void actividad_inicial() {

        System.out.println("¿Como te llamas?");

        Scanner entrada = new Scanner(System.in);

        String nombre = entrada.next();

        System.out.println("¿A que curso vas?");
        String curso = entrada.next();

        System.out.println("Hola " + nombre + ",bienvenido a " + curso);


        int num1 = 0;
        int num2 = 0;

        while (num1 == num2) {
            System.out.println("Introdcuce un numero: ");
            num1 = entrada.nextInt();


            System.out.println("Introdcuce un segundo numero: ");
            num2 = entrada.nextInt();

            if (num1 == num2) {
                System.out.println("ERROR. Los numros son iguales. ");
            }


        }

        int resultado = num1 + num2;
        System.out.println("El resultado de la suma es " + resultado);


    }


    public void actividad_1() {
        System.out.println("Introduce un numero: ");
        Scanner entrada = new Scanner(System.in);
        int num = entrada.nextInt();
        if (num > 0) {
            System.out.println("Tu numero es positivo");
        }
        else if (num < 0) {
            System.out.println("Tu numero es negativo");
        }
        else {
            System.out.println("El 0 es natural");
        }

    }

    public void actividad_2() {
        System.out.println("Introduce primer numero");
        Scanner entrada = new Scanner(System.in);
        int num1 = entrada.nextInt();
        System.out.println("Introduce el segundo numero");

        int num2 = entrada.nextInt();

        if (num1>num2){
                System.out.println("El" + num1 + "es mayor que el" + num2);
        }
        else if (num1<num2) {
                System.out.println("El" + num1 + "es meor que el" + num2);
        }
        else {
            System.out.println("ERROR:los numeros introducidos son iguales");
        }


    }

    public void control_excepciones() {
        Scanner entrada = new Scanner(System.in);

        int numero;
        boolean error = true;

        while (error==true){

            try {
                System.out.println("Introduce un numero");
                numero = entrada.nextInt();
                error = false;
            } catch (InputMismatchException er) {
                System.out.println("RROR. Introduce un valor valido");
                entrada.nextLine();
            }
        }
    }

    public void actividad_3() {

        Scanner entrada = new Scanner(System.in);

        float num1 = 0;
        float num2 = 0;
        float resultado;
        int aux = 0;

        while (aux==0){

            try {
                System.out.println("Introduce un divideno");
                num1 = entrada.nextInt();

                System.out.println("Introduce un divisor");
                num2 = entrada.nextInt();
                aux = 1;
            }catch (InputMismatchException er){
            System.out.println("ERROR. Introduce un valor valido");
        }
     }
        if (num2==0){
            System.out.println("El divisor no puede ser 0");

        }else {
            resultado = (num1/num2);
            System.out.println("El resultado es " + resultado);
        }
    }

    public void actividad_4() {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce el valor b: ");

        int num1 = entrada.nextInt();

        if (num1 < 0){
            System.out.println("El valor de la base tiene que ser positivo");
        }
        System.out.println("Introduce el valor h: ");
        int num2 = entrada.nextInt();

        if (num2 < 0){
            System.out.println("El valor de la altura tiene que ser positivo");
        }

        int multiplicar = num1 * num2;
        int resultado =   multiplicar / 2;

        System.out.println("El area del triangulo es " + resultado);

    }

    public void actividad_5() {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce primer numero: ");

        int num1 = entrada.nextInt();

        System.out.println("Introduce el segundo numero:");

        int num2 = entrada.nextInt();

        System.out.println("Introduce el tercer numero: ");

        int num3 = entrada.nextInt();

        if (num1 == num2 | num2 == num3 | num1 == num3) {
            System.out.println("ERROR");

        } else {
            if (num1 > num2) {
                if (num1 > num3) {
                    System.out.println("El" + num1 + "es mayor que el" + num2 + "y" + num3);

                }
                if (num2 > num1) {
                    if (num2 > num3) {
                        System.out.println("El" + num2 + "es mayor que el" + num1 + "y" + num3);

                    }

                }
                if (num3 > num1) {
                    if (num3 > num2) {
                        System.out.println("El" + num3 + "es mayor que el" + num2 + "y" + num1);

                    }
                }


            }
        }
    }
        public void practica3(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Como te llamas: ");
        String nombre = entrada.next();

        int edad = -1;
        int edad2 = 18;
        int resultado = edad2 - edad;

        while (edad < 0){
            try {
                System.out.println("Hola " + nombre+ ". Introduce tu edad: ");
               edad = entrada.nextInt();


            }catch (InputMismatchException er){
                System.out.println("ERROR. Introduce de nuevo la edad: ");
                entrada.nextLine();

            }
        }

        if (edad2>edad){
            System.out.println("Lo siento " + nombre+ ". No puedes votar. Te faltan " + resultado+ " años para ser mayor de edad");
        }else if (edad2<=edad){
            System.out.println("Enhorabuena " + nombre+ ". Puedes votar.");
        }

        }

        public void practica4() {

            Scanner entrada = new Scanner(System.in);
                    int num1 = 0;
                    int num2 = 0;
                    boolean entradaValida = false;

                    while (!entradaValida) {
                        try {
                            System.out.print("Introduce el multiplicando (3 cifras): ");
                            num1 = entrada.nextInt();

                            System.out.print("Introduce el multiplicador (3 cifras): ");
                            num2 = entrada.nextInt();

                            if (num1 <= 0 || num2 <= 0) {
                                System.out.println("Error: Los números no pueden ser negativos ni cero. Inténtalo de nuevo.");
                            } else {
                                entradaValida = true;
                            }

                        } catch (InputMismatchException er) {
                            System.out.println("Error: Debes introducir un número entero. Inténtalo de nuevo.");
                            entrada.next();
                        }
                    }

                    String num2C = Integer.toString(num2);
                    String num2_C1 = num2C.substring(0, 1);
                    String num2_C2 = num2C.substring(1, 2);
                    String num2_C3 = num2C.substring(2, 3);

                    int num2_1 = Integer.parseInt(num2_C1);
                    int num2_2 = Integer.parseInt(num2_C2);
                    int num2_3 = Integer.parseInt(num2_C3);

                    int resultado = num1 * num2;
                    int resultado1 = num2_1 * num1;
                    int resultado2 = num2_2 * num1;
                    int resultado3 = num2_3 * num1;

                    System.out.println("El producto de la multiplicación es: " + resultado);
                    System.out.println("El proceso es:");
                    System.out.println(" " + num1);
                    System.out.println("x " + num2);
                    System.out.println("--------");
                    System.out.println(resultado3);
                    System.out.println(resultado2 + "x");
                    System.out.println(resultado1 + "xx");
                    System.out.println("--------");
                    System.out.println(resultado);
                }

    public void caracteres() {

        String frase = "No me porto mal en clase y no lo reconozco. ";

        int tamnayo = frase.length();

        System.out.println("El tamaño de la frase es " + tamnayo);

        char letra = frase.charAt(33);
        System.out.println("La letra en la posicion 33 es " + letra);

        String palabra = frase.substring(9,12);
        System.out.println("La palabra con substring es "+ palabra);

        String palabra2 = "Parte. ";
        String concatenacion = frase.concat(palabra2);
            System.out.println(" La concatenacion de la frase con la palabra " + palabra2 + " es " + concatenacion);

           int posicion = concatenacion.indexOf(palabra2);
            System.out.println("La palabra  " + palabra2+ "esta en la posicion " + posicion);

            int posicion2 = concatenacion.indexOf("no",  8);
            System.out.println(" La posicion de la palabra no si no tenemos en cuenta la 8 primeras posiciones es " +posicion2  );

            int posicion3 = concatenacion.lastIndexOf("no");
            System.out.println(" =La posicion de la ultima aparacion de la palabra no es "+ posicion3 );

            String mayusculas = frase.toUpperCase();
            String minuscuñlsa = frase.toLowerCase();
            System.out.println(mayusculas + minuscuñlsa );

            String nombre = "Patricia               ";
             nombre = nombre.trim();
            System.out.println(" Tu nombre sin espacios es " +nombre );

            String remplazar = frase.replace("mal", "bien");
            System.out.println( remplazar);

            String palabra3 = "hola";
            String palabra4 = "HOLA";

            if (palabra3.equals(palabra4)==true){

                System.out.printf("Son iguales");

            }else {
                System.out.printf("Son distintos");
            }

            String palabra5 = "hola";
            String palabra6 = "HOLA";

            if (palabra5.equalsIgnoreCase(palabra6)==true){

                System.out.printf("Son iguales");

            }else {
                System.out.printf("Son distintos");
            }



        }

        public void ejer1und4(){

        String frase = "Prueba ejercicios caracteres";

        int longitud = frase.length();

            System.out.println("La longitud de la frase es "+ longitud);

            String remplazar = frase.replace(" " , "");
            System.out.println(remplazar);

            String mitad1 = frase.substring(0,13);
            String mitad2 = frase.substring(14,28);
            System.out.println("La primera mitad de texto es " + mitad1 + " y la segunda mitad es " + mitad2);

            String mayus = frase.toUpperCase();
            System.out.println(mayus);


        }

        public void ejer2und4() {


         String comida1 = "magadalena";
         String comida2 = "galletas";

         int palabra = comida1.length();
            System.out.println("La palabra magdalena tiene " + palabra+ " caracteres");
         int palabra2 = comida2.length();
            System.out.println("La palabra galletas tiene " + palabra2+ " caracteres");


            if (comida1.equals(comida2)==true){

                System.out.println("Son iguales");

            }else {
                System.out.println("Son distintos");
            }

            if (palabra>palabra2){
                System.out.println("La palabra "+ comida1 + " tiene mas caracteres que la palabra "+ comida2);
            }else {
                System.out.println("La palabra "+ comida2 + " tiene mas caracteres que la palabra "+ comida1);
            }



        }

        public void ejer3und4(){


            Scanner entrada = new Scanner(System.in);

            boolean err = true;
            int n= 0;
            int m = 0;


            while (err) {

                try {

                    System.out.println("Introduce un numero:");
                     n = entrada.nextInt();


                    System.out.println("Introduce otro numero para quitar las ciras al anterior:");

                     m = entrada.nextInt();

                     if (n>m){
                         err=false;
                     }else{
                         System.out.println("No se pueden quitar mas cifras de las que hay");
                     }

                } catch (InputMismatchException e) {
                    System.out.println("El formato no es el correcto");
                    entrada.nextLine();
                }
            }

            String n_string = Integer.toString(n);

            int tamanyo = n_string.length();

            n_string = n_string.substring(0, tamanyo-m);

            System.out.println("El numero sin las" + m+ "cifras es "+ n_string);


        }

        public void ejer4und4(){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce una frase: ");
        String frase = entrada.nextLine();

        frase = " " + frase + " ";
        frase = frase.replace("." , " ");
        frase = frase.toLowerCase();
        System.out.println("Introduce una subcadena: ");
        String subcadena = entrada.nextLine();
        subcadena = " " + subcadena + " ";


        int fraselength = frase.length();

        int frasesinsubcadena = frase.replace(subcadena, "").length();

        int division = (fraselength - frasesinsubcadena) / subcadena.length();
            System.out.println(division);
        }
      public void nuevas_excepciones (){

        Scanner entrada = new Scanner(System.in);

            System.out.println("BIENVENIDO A LA CLASIFICACIONN DE GENERACIONES");
            System.out.println("ELIGE UN MDOO");
            System.out.println("1. AÑO DE NACIMIENTO");
            System.out.println("2. EDAD");

            String modo = entrada.next();

            LocalDateTime hoy = LocalDateTime.now();
            int anyo_actual = hoy.getYear();
            int anyo_nacimiento = 1800;

            boolean error = false;

            if (modo.equals("1")){

                System.out.println("Introduce año de nacimiento: ");
                String anyo = entrada.next();


               try {
                   anyo_nacimiento = Integer.parseInt(anyo);
               }catch (NumberFormatException e1){
                   System.out.println("El formato del año no es correcto" + e1.getMessage());
                   error=true;
               }

                if (anyo_nacimiento < 1900 || anyo_nacimiento > anyo_actual){
                    System.out.println("El año introducido no es correcto");
                    error=true;
                }

            } else if (modo.equals("2")) {
                System.out.println("Introduce tu edad");
               int edad = 0;

               if (entrada.hasNextInt()){
                   edad = entrada.nextInt();
               }else {
                   System.out.println("El formato de la edad es incorrecto");
                   error=true;
               }

                if (edad < 0){
                    System.out.println("La edad introducida no es correcta");
                    error=true;
                }else {
                    anyo_nacimiento = anyo_actual - edad;

                }

            }else {
                System.out.println("Eres tonto");
                error=true;
            }
            if (!error){
                if (anyo_nacimiento>=1900 && anyo_nacimiento<=1927){
                    System.out.println("Eres de la generacion fosil");
                } else if (anyo_nacimiento>=1928 && anyo_nacimiento<=1944) {
                    System.out.println("Eres de la generacion Silent");

                } else if (anyo_nacimiento>=1945 && anyo_nacimiento<=1964) {
                    System.out.println("Eres de la generacion baby boommer");
                } else if (anyo_nacimiento>=1965 && anyo_nacimiento<=1981) {
                    System.out.println("XXX");
                } else if (anyo_nacimiento>=1982 && anyo_nacimiento<=1994) {
                    System.out.println("Peor");
                } else if (anyo_nacimiento>=1995 && anyo_nacimiento<=anyo_actual) {
                    System.out.println("La mejor generacion");
                }else {
                    System.out.println("No tienes generacion");
                }
            }


        }

     public void numerodelasuerte () {

            Scanner entrada = new Scanner(System.in);

            try {
                System.out.println("Introduce tu fecha de nacimiento (dd/mm/aaaa): ");
                String fecha = entrada.nextLine();


                if (fecha.length() != 10 || fecha.charAt(2) != '/' || fecha.charAt(5) != '/') {
                    System.out.println("Formato de fecha incorrecto. Usa dd/mm/aaaa.");
                } else {
                    try {
                        int dia = Integer.parseInt(fecha.substring(0, 2));
                        int mes = Integer.parseInt(fecha.substring(3, 5));
                        int anio = Integer.parseInt(fecha.substring(6, 10));


                        int sumaTotal = dia + mes + anio;
                        System.out.print(dia + " + " + mes + " + " + anio + " = " + sumaTotal + "\n");


                        int numeroDeLaSuerte = sumaTotal;
                        int sumaCifras = 0;


                        while (numeroDeLaSuerte > 0) {
                            sumaCifras += numeroDeLaSuerte % 10;
                            numeroDeLaSuerte /= 10;
                        }

                        System.out.print("Sumando las cifras de " + sumaTotal + ": ");
                        System.out.print(sumaTotal + " = ");
                        System.out.println(sumaCifras);
                        System.out.println("Número de la suerte: " + sumaCifras);
                    } catch (NumberFormatException e) {
                        System.out.println("Error al convertir los valores. Asegúrate de que la fecha esté en el formato correcto.");
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Error en la entrada. Por favor, ingresa la fecha correctamente.");
            }
        }
     public void calculadora (){

        Scanner entrada = new Scanner(System.in);
        System.out.println("Bienvenido a tu calculadora");

        try {

            System.out.print("Ingrese el primer operando (int): ");
            int operando1 = entrada.nextInt();


            System.out.print("Ingrese el signo de la operación (+, -, /, x, R): ");
            String operador = entrada.next();


            int operando2 = 0;


            if (!operador.equalsIgnoreCase("R")) {
                System.out.print("Ingrese el segundo operando (int): ");
                operando2 = entrada.nextInt();
            }


            double resultado = 0;
            boolean operacionValida = true;


            switch (operador) {
                case "+":
                    resultado = operando1 + operando2;
                    break;
                case "-":
                    resultado = operando1 - operando2;
                    break;
                case "/":
                    if (operando2 == 0) {
                        System.out.println("Error: No se puede dividir entre cero.");
                        operacionValida = false;
                    } else {
                        resultado = (double) operando1 / operando2;
                    }
                    break;
                case "x":
                    resultado = operando1 * operando2;
                    break;
                case "R":
                    if (operando1 < 0) {
                        System.out.println("Error: No se puede calcular la raíz cuadrada de un número negativo.");
                        operacionValida = false;
                    } else {

                        double raizCuadrada = operando1 / 2;
                        System.out.println("Aproximación de la raíz cuadrada de " + operando1 + " es: " + raizCuadrada);
                        operacionValida = false;
                    }
                    break;
                default:
                    System.out.println("Error: Operador no válido.");
                    operacionValida = false;
                    break;
            }


            if (operacionValida) {
                System.out.println("El resultado es: " + resultado);
            }
        } catch (Exception e) {
            System.out.println("Error: Entrada no válida. Por favor, asegúrese de ingresar números enteros.");
        }

    }

     public void bucles1 (){

        Scanner entrada = new Scanner(System.in);

        String psw = "entornos";
        String psw_ususario;
        do {
            System.out.println("Introduce tu contraseña: ");
            psw_ususario = entrada.next();

        }while (!psw_ususario.equals(psw));

        System.out.println("BIENVENIDO LUCAS");

    }

    public void bucles2 (){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce un numero");

        int numero = entrada.nextInt();

        for (int j=numero ;j>=1;j--){

            if (j%2==0){
                System.out.println(j);
        }

        }

    }

    public void bucles3 (){

      for (int i= 1 ; i <=50; i++ ){

          if (i%3==0){
              System.out.println(i + " ");
          }
      }

    }

        public void bucles4 (){

        Scanner entrada = new Scanner(System.in);

            System.out.println("Introduce una palabra");
        String palabra = entrada.nextLine();

        for (int i=0 ; i <palabra.length(); i++){
            System.out.println(palabra.charAt(i));
        }


        }
        public void bucles5 (){

        Scanner entrada = new Scanner(System.in);

            System.out.println("Introduce un numero");

            int numero = entrada.nextInt();

            for (int i=1 ; i <=10 ; i++ ){

                int resultado = numero * i;
                System.out.println(resultado);
            }


        }
    public void isbn () {
    Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce un ISBN de 10 dígitos :");
        String isbn = entrada.nextLine();

        if (isbn.length() != 10) {
            System.out.println("El ISBN " + isbn + " no es válido (debe tener 10 dígitos).");
        } else {
            try {
                boolean error = false;

                if (isbn.contains("?")) {
                    int suma = 0;
                    int multiplicador = 10;
                    int posInterrogacion = -1;

                    for (int i = 0; i < 9; i++) {
                        char c = isbn.charAt(i);
                        if (Character.isDigit(c)) {
                            suma += (c - '0') * multiplicador;
                        } else if (c == '?') {
                            posInterrogacion = i;
                        } else {
                            System.out.println("El ISBN contiene caracteres inválidos.");
                            error = true;
                            break;
                        }
                        multiplicador--;
                    }

                    if (!error) {
                        char ultimoChar = isbn.charAt(9);
                        if (ultimoChar == 'X') {
                            suma += 10;
                        } else if (Character.isDigit(ultimoChar)) {
                            suma += (ultimoChar - '0');
                        } else if (ultimoChar == '?') {
                            posInterrogacion = 9;
                        } else {
                            System.out.println("El último carácter del ISBN es inválido.");
                            error = true;
                        }

                        if (!error) {
                            boolean repaired = false;
                            for (int i = 0; i <= 10; i++) {
                                int sumaTemporal = suma;
                                if (posInterrogacion < 9) {
                                    sumaTemporal += i * (10 - posInterrogacion);
                                } else {
                                    sumaTemporal += i;
                                }

                                if (sumaTemporal % 11 == 0) {
                                    System.out.println("El dígito faltante en el ISBN " + isbn + " es: " + i);
                                    repaired = true;
                                    break;
                                }
                            }

                            if (!repaired) {
                                System.out.println("No se pudo reparar el ISBN " + isbn + ".");
                            }
                        }
                    }
                } else {
                    int suma = 0;
                    int multiplicador = 10;
                    boolean isbnValido = true;

                    for (int i = 0; i < 9; i++) {
                        char c = isbn.charAt(i);
                        if (Character.isDigit(c)) {
                            suma += (c - '0') * multiplicador;
                            multiplicador--;
                        } else {
                            System.out.println("El ISBN contiene caracteres inválidos.");
                            isbnValido = false;
                            break;
                        }
                    }

                    if (isbnValido) {
                        char ultimoChar = isbn.charAt(9);
                        if (ultimoChar == 'X') {
                            suma += 10;
                        } else if (Character.isDigit(ultimoChar)) {
                            suma += (ultimoChar - '0');
                        } else {
                            System.out.println("El último carácter del ISBN es inválido.");
                            isbnValido = false;
                        }

                        if (isbnValido && suma % 11 == 0) {
                            System.out.println("El ISBN " + isbn + " es válido.");
                        } else if (isbnValido) {
                            System.out.println("El ISBN " + isbn + " no es válido.");
                        }
                    }
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }


    
    }

      public void dados (){

        Random aleatorio = new Random();

        int dado1 = aleatorio.nextInt(6) + 1;
        System.out.println("DADO 1:" + dado1);
        int dado2 = aleatorio.nextInt(6) +1;
        System.out.println("DADO2:" + dado2);
        int resultado = dado1 + dado2;
        System.out.println(resultado);

        }

        public void gencontra (){

        Random aleatorio = new Random();
        String contra = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        int longitud = 10;
        String contra_generada = "";
        for (int i=0 ; i < longitud ; i++){
            int posiciom = aleatorio.nextInt(contra.length());
            contra_generada += contra.charAt(posiciom);

        }
            System.out.println(contra_generada);


        }

        public void numrango (){

        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();
        System.out.println("Cuantos numeros aleatorios quieres generar?");
        int numero = entrada.nextInt();

        System.out.println("Dime el rango minimo y maximo:");
        int minnum = entrada.nextInt() ;
        int maxnum = entrada.nextInt();

        System.out.println("Los numeros generados son:");
        for (int i=0 ; i < numero ; i++){
            int numero_aleatorio = aleatorio.nextInt(maxnum -minnum + 1) + minnum ;
            System.out.println(numero_aleatorio);
        }



        }

        public void gencontra2 (){
            Random aleatorio = new Random();
            String contra = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
            int longitud = aleatorio.nextInt(3) +6;
            String contra_generada = "";
            for (int i=0 ; i < longitud ; i++){
                int posiciom = aleatorio.nextInt(contra.length());
                contra_generada += contra.charAt(posiciom);

            }

            System.out.println(contra_generada);


        }

    public void repaso1(){
        Scanner entrada = new Scanner(System.in);
        int numinto = 0;
        int num = 0;
        int mayor = 0;
        int menor = 0;
        int igual = 0;
        boolean error = true;
        while (error = true){
            try {
                System.out.println("Dime la cantidad de numeros que quieres introducir: ");
                numinto = entrada.nextInt();
                for (int i = 0; i < numinto; i++){
                    System.out.println("Dime un numero: ");
                    num = entrada.nextInt();
                    if(num < 0){
                        menor++;
                    }
                    if (num > 0){
                        mayor++;
                    }
                    if (num == 0){
                        igual++;
                    }
                }
                System.out.println("Hay " + mayor + " numeros mayores a 0 " + "Hay " + menor + " numeros menores a 0 " + "Hay " + igual + " numeros iguales a 0 ");
                break;
            }catch (InputMismatchException e1){
                System.out.println("Error de caracater");
            }
        }

    }

    public void repaso2() {
        Scanner entrada = new Scanner(System.in);
        boolean error = true;
        int base = 0;
        int expo = -1;
        int res = 0;
        while (error = true) {
            try {
                System.out.println("Introduce un numero (base): ");
                base = entrada.nextInt();
                while (expo < 0){
                    System.out.println("Introduceme un numero (exponente): ");
                    expo = entrada.nextInt();
                }
                for (int i = 1; i < expo; i++){
                    int x = base;
                    res += base * x;
                }
                System.out.println("El resultado es: " + res);
                break;
            } catch (InputMismatchException e1) {
                System.out.println("Error de caracater");
                entrada.nextLine();
            }
        }
    }

    public void repaso4(){
        Scanner entrada = new Scanner(System.in);
        boolean error = true;
        int nota = 0;
        int i = 0;
        while (error = true){
            try {
                System.out.println("Dime tu nota: ");
                nota = entrada.nextInt();
                switch (nota){
                    case 0,1,2,3,4:
                        System.out.println("INSUFICIENTE");
                        i = 1;
                        break;
                    case 5:
                        System.out.println("SUFICIENTE");
                        i = 1;
                        break;
                    case 6:
                        System.out.println("BIEN");
                        i = 1;
                        break;
                    case 7,8:
                        System.out.println("NOTABLE");
                        i = 1;
                        break;
                    case 9,10:
                        System.out.println("SOBRESALIENTE");
                        i = 1;
                        break;
                    default:
                        System.out.println("Nota no valida");
                        break;
                }
                if (i == 1){
                    break;
                }
            }catch (InputMismatchException e1){
                System.out.println("Error de caracteres");
                entrada.nextLine();
            }
        }
    }

    public void repaso5(){
        Scanner entrada = new Scanner(System.in);
        boolean error = true;
        int sueldo = 0;
        int mayor = 0;
        int masmil =0;
        while (error = true){
            try {
                for(int i = 0; i < 5; i++){
                    System.out.println("Dime tu sueldo");
                    sueldo = entrada.nextInt();
                     if (sueldo <= 0) {
                        System.out.println("Subnormal ");
                        i--;
                        continue;
                    }
                    if (sueldo > mayor){
                        mayor = sueldo;
                    }
                    if(sueldo > 1000){
                        masmil++;
                    }
                }

                System.out.println("El sueldo mas alto es: " + mayor);
                System.out.println("Hay mas de " + masmil + " personas ganando mas de 1000 euros");
                break;
            }catch (InputMismatchException e1){
                System.out.println("Error de caracteres");
                entrada.nextLine();
            }
        }
    }

    public void repaso6() {
        Scanner entrada = new Scanner(System.in);
        int numalum = 0;
        int mayor = 0;
        int altos = 0;
        int altura = 0;
        int edad = 0;
        int edadtotal = 0;
        int alturatotal = 0;
        int mediaedadd = 0;
        int mediaalt = 0;
        boolean error = true;
        while (error = true) {
            while (numalum <= 0) {
                System.out.println("Dime la cantidad de alumnos ");
                numalum = entrada.nextInt();
            }
            try {
                for (int i = 0; i < numalum; i++){
                    System.out.println("Dime la edad de tu alumno ");
                    edad = entrada.nextInt();
                    System.out.println("Dime la altura (cm) de tu alumno");
                    altura = entrada.nextInt();
                    if (edad <= 0 || altura <= 0){
                        System.out.println("Eres gilipollas");
                        i--;
                        continue;
                    }
                    if (altura > 175){
                        altos++;
                    }
                    if (edad > 18){
                        mayor ++;
                    }
                    edadtotal += edad;
                    alturatotal += altura;
                }
                mediaedadd = edadtotal / numalum;
                mediaalt = alturatotal / numalum;
                System.out.println("La media de edad es: "+ mediaedadd);
                System.out.println("La media de altura es: "+ mediaalt);
                System.out.println("Hay "+ mayor + " mayores de 18");
                System.out.println("Hay " + altos + " que miden mas de 175 cm");
                break;
            } catch (InputMismatchException e1) {
                System.out.println("Error de caracteres");
                entrada.nextLine();
            }
        }
    }

    public void repaso7() {
        Scanner entrada = new Scanner(System.in);
        int num = 0;
        int suma = 0;
        String secuencia = "";
        boolean error = true;
        while (error = true) {
            try{
                while (num <= 0) {
                    System.out.println("Dime un numero");
                    num = entrada.nextInt();
                }
                System.out.println("La secuencia de Numeros:");
                int anterior = 0, actual = 1;

                for (int i = 0; i < num; i++){
                    if (i == 0) {
                        System.out.print(anterior);
                    } else if (i == 1) {
                        System.out.print(" " + actual);
                    } else {
                        int siguiente = anterior + actual;
                        System.out.print(" " + siguiente);
                        anterior = actual;
                        actual = siguiente;
                    }
                }
                break;
            }catch (InputMismatchException e1) {
                System.out.println("Error de caracteres");
                entrada.nextLine();
            }
        }
    }
      public void vectores() {

        int vector[];

        vector = new int[7];

        vector[2] = 7;
        vector[5] = vector[2] + 4;


        System.out.println(vector[2] + "" + vector[5]);

        for (int i = 0; i <= vector.length - 1; i++) {
            System.out.print(" " + vector[i] + ",");
        }

        String palabras[] = new String[3];
        palabras[0] = "Pepe";

        for (int i = 0; i < palabras.length; i++) {

            System.out.print(" " + palabras[i] + " ");
        }

    }

    public void vector1() {
        Random aleatorio = new Random();

        int numeros[] = new int[8];
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {

            numeros[i] = aleatorio.nextInt(501);
            suma += numeros[i];
        }
        System.out.println("la suma de los elementos es: " + suma);
    }

    public void vectores2() {

        Scanner entrada = new Scanner(System.in);

        int numeros[] = new int[5];

        int ultimo = numeros[numeros.length - 1];
        System.out.println("Introduce los numeros a invertir");
        for (int i = 0; i < numeros.length; i++) {

            numeros[i] = entrada.nextInt();

        }

        int tam_mitad = numeros.length / 2;
        for (int i = 0; i < tam_mitad; i++) {

            int cambio = numeros[i];
            numeros[i] = numeros[numeros.length - 1 - i];
            numeros[numeros.length - 1 - i] = cambio;
        }

//        for (int i = numeros.length-1;i>=0;i--){
//            System.out.print(" " + numeros[i] + " ");
//        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(" " + numeros[i] + " ");
        }
    }

    public void vectores3() {

        Scanner entrada = new Scanner(System.in);
        Random aleatorios = new Random();

        int numero[] = new int[25];

        int numerointro = 0;
        int numerocant = 0;


        for (int i = 0; i < numero.length; i++) {

            numero[i] = aleatorios.nextInt(101);


        }

        System.out.println("Introduce un numero para buscar [0,100]: ");

        numerointro = entrada.nextInt();


        for (int i = 0; i < numero.length; i++) {

            if (numerointro == numero[i]) {
                numerocant++;
            }
        }

        System.out.println("El numero" + numerointro + "aparece " + numerocant + "veces");

    }

    public void vectores5() {
        Scanner entrada = new Scanner(System.in);

        int numeros[] = new int[5];
        System.out.println("Introduce los numeros a invertir");
        for (int i = 0; i < numeros.length; i++) {

            numeros[i] = entrada.nextInt();

        }

        System.out.println("Array original:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }


        int ultimo = numeros[numeros.length - 1];
        for (int i = numeros.length - 1; i > 0; i--) {
            if (i == 0) {
                numeros[i] = ultimo;
            } else {
                numeros[i] = numeros[i - 1];
            }
        }
        numeros[0] = ultimo;


        System.out.println("Array rotado:");
        for (int num : numeros) {
            System.out.println(num + " ");
        }
    }

    public void vectoresforeach() {

        String palabras[] = {"Whisky", "Ginebra", "Vodka", "Ron"};

        for (String i : palabras) { // se guarda el valor


        }
//copiar una palabra
        String texto = Arrays.toString(palabras);
        System.out.println("\n" + texto);

        String palabras2[] = palabras;

        palabras2[0] = "Francisco";

        System.out.println(palabras);
        System.out.println(palabras2);
        System.out.println(Arrays.toString(palabras));
        System.out.println(Arrays.toString(palabras2));

        //clonar

        String palabras3[] = palabras.clone();

        palabras3[1] = "Marta";
        System.out.println(palabras3);
        System.out.println(Arrays.toString(palabras));
        System.out.println(Arrays.toString(palabras2));

        //copiar un trozo de array

        String nombre_guays[] = new String[2];

        System.arraycopy(palabras, 0, nombre_guays, 0, 2);

        System.out.println(Arrays.toString(nombre_guays));
    }

    public void ejervect1() {

        Random aleatorio = new Random();

        int num[] = new int[8];

        int suma = 0;

        for (int i = 0; i < num.length; i++) {
            num[i] = aleatorio.nextInt(501);
            suma += num[i];
        }
        System.out.println("La suma de los elementos es: " + suma);

    }

    public void ejervect4() {
        Scanner entrada = new Scanner(System.in);

        int enterios[] = {4, 5, 6, 7, 8, 19, 30};

        int enteros2[] = new int[enterios.length - 1];

        System.out.println("Introduce una posicion a eliminar");

        int eliminar = entrada.nextInt();

        for (int i = 0; i < enterios.length - 1; i++) {

            if (i < eliminar) {
                enteros2[i] = enterios[i];
            } else {
                enteros2[i] = enterios[i + 1];
            }
        }
        System.out.println(Arrays.toString(enterios));
        System.out.println(Arrays.toString(enteros2));
    }

    public void vectores6 (){

        Scanner entrada = new Scanner(System.in);

        int num[] = new int[5];

        System.out.println("Introduce 5 numeros: ");

        for (int i = 0; i<num.length; i++){
            num[i] = entrada.nextInt();
        }

        for (int i = 0; i< num.length/2 ;i++){
          if (  num[i] != num[num.length-1-i]){
              System.out.println("No es simetrico");
              return;
          }
        }

        System.out.println("Es simetrico");
    }

    public void vectores7 (){

      int equipo1[] = {1,2,3};
      int equipo2[] = {4,5,6};
      int equipo3[] = new int[equipo1.length + equipo2.length];

      for (int i=0; i<equipo1.length; i++){
          equipo3[i] = equipo1[i];
      }

    for (int i= 0 ; i< equipo2.length; i++){
        equipo3[equipo1.length +i] = equipo2[i];
    }
        System.out.println("Equipo final:");
      for (int i=0 ; i< equipo3.length; i++){
          System.out.println(equipo3[i] + "");
      }
    }

    public void vectores8  (){
        Scanner entrada = new Scanner(System.in);

        int equipo1[] = {1,2,3,5};
        int equpo11[] = new int[equipo1.length + 1];
        int posicion = 3;
        int nuevojugador = 4;

        for (int i = 0; i < equipo1.length; i++) {
            equpo11[i] = equipo1[i];
        }

        equpo11[posicion] = nuevojugador;

        for (int i = posicion; i <equipo1.length ; i++) {

            equpo11[i+1] = equipo1[i];
        }

        for (int jugador : equpo11){
            System.out.println(jugador + "");
        }

    }

    public void samurais () {
        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();

        int[] equipo1 = new int[7];
        int[] equipo2 = new int[7];
        int potenciatotal;
        for (int equipo = 1; equipo <= 2; equipo++) {
            boolean potenciavalida = false;
            while (!potenciavalida) {
                potenciatotal = 0;
                try {
                    int[] equipoActual = (equipo == 1) ? equipo1 : equipo2;
                    System.out.println("Equipo" + equipo + ". Introduce potencia de los samurais:");
                    String intropoten = entrada.nextLine();
                    String[] valores = intropoten.split(" ");

                    if (valores.length != equipoActual.length) {
                        System.out.println("ERROR. Tienes que introducir 7 valores");
                        continue;
                    }

                    for (int i = 0; i < equipoActual.length; i++) {
                        equipoActual[i] = Integer.parseInt(valores[i]);
                        potenciatotal += equipoActual[i];
                    }

                    if (potenciatotal == 30) {
                        System.out.println("Equipo" + equipo+ " Completado");
                        potenciavalida = true;
                    } else {
                        System.out.println("ERROR.La potencia total no suma 30");
                    }

                } catch (NumberFormatException e1) {
                    System.out.println("ERROR. Caracteres no validos.");
                }
            }
        }

        int iniciobatalla = aleatorio.nextInt(equipo1.length);
        System.out.println("¡Empieza la batalla!");
        System.out.println("La batalla inicia con el Samurai " + (iniciobatalla + 1) + ".");

        for (int i = 0; i < equipo1.length; i++) {
            int indice = (iniciobatalla + i) % equipo1.length;
            System.out.print("Samurai " + (indice + 1) + ". ");

            if (equipo1[indice] > equipo2[indice]) {
                System.out.println("Gana Equipo 1. " + equipo1[indice] + " vs " + equipo2[indice]);
                equipo2[indice] = 0;
            }else if (equipo1[indice] < equipo2[indice]) {
                System.out.println("Gana Equipo 2. " + equipo1[indice] + " vs " + equipo2[indice]);
                equipo1[indice] = 0;
            } else {
                System.out.println("Empate. Ambos samuráis mueren. " + equipo1[indice] + " vs " + equipo2[indice]);
                equipo1[indice] = 0;
                equipo2[indice] = 0;
            }

            int bajasEquipo1 = 0;
            int bajasEquipo2 = 0;
            for (int j = 0; j < equipo1.length; j++) {
                if (equipo1[j] == 0) bajasEquipo1++;
                if (equipo2[j] == 0) bajasEquipo2++;
            }

            if (bajasEquipo1 >= 4) {
                System.out.println("¡Equipo 2 GANA! Equipo 1 ha tenido 4 bajas.");
                return;
            } else if (bajasEquipo2 >= 4) {
                System.out.println("¡Equipo 1 GANA! Equipo 2 ha tenido 4 bajas.");
                return;
            }
        }

    }
}


