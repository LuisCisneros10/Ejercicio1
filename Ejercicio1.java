//Esta es la importación del Scanner (Este sirve para almacenar el valor que el cliente esta ingresando
import java.util.Scanner;
public class Ejercicio1 {
public static void main(String[] args) {
//Esto sirve para almacenar cualquier valor que ingrese el usuario
Scanner pro = new Scanner(System.in);
//Esta es la declaración de las variables
int op, a;
//Es el Vector
int [] num=new int [20];
//La estructura del Menú
System.out.println("..Menú..");
System.out.println("1. Suma de dos números");
System.out.println("2. Resta de dos números");
System.out.println("3. Multiplicación de dos números");
System.out.println("4. División de dos números");
System.out.println("5. Ver Bitácora");
System.out.println("6. Borrar Bitácora");
System.out.println("7. Salir");
System.out.println("Seleccione una opción: ");
op = pro.nextInt();
do{
//Este es una condición para la opción: Suma 
if(op == 1){
System.out.println(" ");
System.out.println("Opción: Suma de dos números");
System.out.println("Ingrese el primer número:");
num[1]= pro.nextInt();
System.out.println("Ingrese el segundo número:");
num[2]= pro.nextInt();
num[3]= num[1]+num[2];
System.out.println("El resultado es: "+num[3]);
System.out.println("Precione una tecla para mostar el Menú Principal.");

System.out.println(" ");
System.out.println("..Menú..");
System.out.println("1. Suma de dos números");
System.out.println("2. Resta de dos números");
System.out.println("3. Multiplicación de dos números");
System.out.println("4. División de dos números");
System.out.println("5. Ver Bitácora");
System.out.println("6. Borrar Bitácora");
System.out.println("7. Salir");
System.out.println("Seleccione una opción: ");
op = pro.nextInt();
}
//Este es una condición para la opción: Resta
if(op == 2){
System.out.println(" ");
System.out.println("Opción: Resta de dos números");
System.out.println("Ingrese el primer número:");
num[4]= pro.nextInt();
System.out.println("Ingrese el segundo número:");
num[5]= pro.nextInt();
num[6]= num[4]-num[5];
System.out.println("El resultado es: "+num[6]);
System.out.println(" ");
System.out.println("..Menú..");
System.out.println("1. Suma de dos números");
System.out.println("2. Resta de dos números");
System.out.println("3. Multiplicación de dos números");
System.out.println("4. División de dos números");
System.out.println("5. Ver Bitácora");
System.out.println("6. Borrar Bitácora");
System.out.println("7. Salir");
System.out.println("Seleccione una opción: ");
op = pro.nextInt();
}
//Este es una condición para la opción: Multiplicación
if(op == 3){
System.out.println(" ");
System.out.println("Opción: Multiplicación de dos números");
System.out.println("Ingrese el primer número:");
num[7]= pro.nextInt();
System.out.println("Ingrese el segundo número:");
num[8]= pro.nextInt();
num[9]= num[7]*num[8];
System.out.println("El resultado es: "+num[9]);
System.out.println(" ");
System.out.println("..Menú..");
System.out.println("1. Suma de dos números");
System.out.println("2. Resta de dos números");
System.out.println("3. Multiplicación de dos números");
System.out.println("4. División de dos números");
System.out.println("5. Ver Bitácora");
System.out.println("6. Borrar Bitácora");
System.out.println("7. Salir");
System.out.println("Seleccione una opción: ");
op = pro.nextInt();
}
//Este es una condición para la opción: División 
if(op == 4){
System.out.println(" ");
System.out.println("Opción: División de dos números");
System.out.println("Ingrese el primer número:");
num[10]= pro.nextInt();
System.out.println("Ingrese el segundo número:");
num[11]= pro.nextInt();
//Este IF sirve para que nos marque error al momento de que el usuario quiera dividir entre 0
if (num[11]==0){
    System.out.println("Error, División entre 0 no es permitida.");
}
//Este IF sirve para imprimir el valor de la división cuando el divisor es distinto de 0
if(num[11]<0){
num[12]=num[10]/num[11];
System.out.println("El resultado es: "+num[12]);
}
if(num[11]>0){
num[12]=num[10]/num[11];
System.out.println("El resultado es: "+num[12]);
}
System.out.println(" ");
System.out.println("..Menú..");
System.out.println("1. Suma de dos números");
System.out.println("2. Resta de dos números");
System.out.println("3. Multiplicación de dos números");
System.out.println("4. División de dos números");
System.out.println("5. Ver Bitácora");
System.out.println("6. Borrar Bitácora");
System.out.println("7. Salir");
System.out.println("Seleccione una opción: ");
op = pro.nextInt();
}
//Esta condición es para la opción ver bitácora
if(op == 5){
System.out.println(" ");
System.out.println("Opción: Ver Bitácora");
System.out.println(num[1]+"+"+num[2]+"="+num[3]);
System.out.println(num[4]+"-"+num[5]+"="+num[6]);
System.out.println(num[7]+"*"+num[8]+"="+num[9]);
System.out.println(num[10]+"/"+num[11]+"="+num[12]);
System.out.println(" ");
System.out.println("..Menú..");
System.out.println("1. Suma de dos números");
System.out.println("2. Resta de dos números");
System.out.println("3. Multiplicación de dos números");
System.out.println("4. División de dos números");
System.out.println("5. Ver Bitácora");
System.out.println("6. Borrar Bitácora");
System.out.println("7. Salir");
System.out.println("Seleccione una opción: ");
op = pro.nextInt();
}
//Esta condición es para borrar la Bitácora
if(op == 6){
System.out.println(" ");
System.out.println("Opción: Borrar Bitácora");
System.out.println("¿Esta seguro(a) que desea borrar la Bitácora?");
System.out.println("Ingrese '1'(Si) para continuar o '2'(No) para volver al Menú principal");
a=pro.nextInt();
if (a == 1){
    num[1]=0;
    num[2]=0;
    num[3]=0;
    num[4]=0;
    num[5]=0;
    num[6]=0;
    num[7]=0;
    num[8]=0;
    num[9]=0;
    num[10]=0;
    num[11]=0;
    num[12]=0;
System.out.println("Usted selecciono la opción '1'...La Bitácora fue borrada exitosamete.");    
System.out.println(" ");    
System.out.println("..Menú..");
System.out.println("1. Suma de dos números");
System.out.println("2. Resta de dos números");
System.out.println("3. Multiplicación de dos números");
System.out.println("4. División de dos números");
System.out.println("5. Ver Bitácora");
System.out.println("6. Borrar Bitácora");
System.out.println("7. Salir");
System.out.println("Seleccione una opción: ");
op = pro.nextInt(); 
}
if(a==2){
System.out.println(" ");
System.out.println("..Menú..");
System.out.println("1. Suma de dos números");
System.out.println("2. Resta de dos números");
System.out.println("3. Multiplicación de dos números");
System.out.println("4. División de dos números");
System.out.println("5. Ver Bitácora");
System.out.println("6. Borrar Bitácora");
System.out.println("7. Salir");
System.out.println("Seleccione una opción: ");
op = pro.nextInt();    
}
}
if(op == 7){
System.out.println("Adios");
break;
}
if(op > 7 ){
System.out.println(" ");
System.out.println("Esta no es uno de los números mostrados para las opciones, por favor escriba una opción válida");
System.out.println("..Menú..");
System.out.println("1. Suma de dos números");
System.out.println("2. Resta de dos números");
System.out.println("3. Multiplicación de dos números");
System.out.println("4. División de dos números");
System.out.println("5. Ver Bitácora");
System.out.println("6. Borrar Bitácora");
System.out.println("7. Salir");
System.out.println("Seleccione una opción: ");
op = pro.nextInt();
}
}
while(op <= 7);
}}
