//Esta es la importaci�n del Scanner (Este sirve para almacenar el valor que el cliente esta ingresando
import java.util.Scanner;
public class Ejercicio1 {
public static void main(String[] args) {
//Esto sirve para almacenar cualquier valor que ingrese el usuario
Scanner pro = new Scanner(System.in);
//Esta es la declaraci�n de las variables
int op, a;
//Es el Vector
int [] num=new int [20];
//La estructura del Men�
System.out.println("..Men�..");
System.out.println("1. Suma de dos n�meros");
System.out.println("2. Resta de dos n�meros");
System.out.println("3. Multiplicaci�n de dos n�meros");
System.out.println("4. Divisi�n de dos n�meros");
System.out.println("5. Ver Bit�cora");
System.out.println("6. Borrar Bit�cora");
System.out.println("7. Salir");
System.out.println("Seleccione una opci�n: ");
op = pro.nextInt();
do{
//Este es una condici�n para la opci�n: Suma 
if(op == 1){
System.out.println(" ");
System.out.println("Opci�n: Suma de dos n�meros");
System.out.println("Ingrese el primer n�mero:");
num[1]= pro.nextInt();
System.out.println("Ingrese el segundo n�mero:");
num[2]= pro.nextInt();
num[3]= num[1]+num[2];
System.out.println("El resultado es: "+num[3]);
System.out.println("Precione una tecla para mostar el Men� Principal.");

System.out.println(" ");
System.out.println("..Men�..");
System.out.println("1. Suma de dos n�meros");
System.out.println("2. Resta de dos n�meros");
System.out.println("3. Multiplicaci�n de dos n�meros");
System.out.println("4. Divisi�n de dos n�meros");
System.out.println("5. Ver Bit�cora");
System.out.println("6. Borrar Bit�cora");
System.out.println("7. Salir");
System.out.println("Seleccione una opci�n: ");
op = pro.nextInt();
}
//Este es una condici�n para la opci�n: Resta
if(op == 2){
System.out.println(" ");
System.out.println("Opci�n: Resta de dos n�meros");
System.out.println("Ingrese el primer n�mero:");
num[4]= pro.nextInt();
System.out.println("Ingrese el segundo n�mero:");
num[5]= pro.nextInt();
num[6]= num[4]-num[5];
System.out.println("El resultado es: "+num[6]);
System.out.println(" ");
System.out.println("..Men�..");
System.out.println("1. Suma de dos n�meros");
System.out.println("2. Resta de dos n�meros");
System.out.println("3. Multiplicaci�n de dos n�meros");
System.out.println("4. Divisi�n de dos n�meros");
System.out.println("5. Ver Bit�cora");
System.out.println("6. Borrar Bit�cora");
System.out.println("7. Salir");
System.out.println("Seleccione una opci�n: ");
op = pro.nextInt();
}
//Este es una condici�n para la opci�n: Multiplicaci�n
if(op == 3){
System.out.println(" ");
System.out.println("Opci�n: Multiplicaci�n de dos n�meros");
System.out.println("Ingrese el primer n�mero:");
num[7]= pro.nextInt();
System.out.println("Ingrese el segundo n�mero:");
num[8]= pro.nextInt();
num[9]= num[7]*num[8];
System.out.println("El resultado es: "+num[9]);
System.out.println(" ");
System.out.println("..Men�..");
System.out.println("1. Suma de dos n�meros");
System.out.println("2. Resta de dos n�meros");
System.out.println("3. Multiplicaci�n de dos n�meros");
System.out.println("4. Divisi�n de dos n�meros");
System.out.println("5. Ver Bit�cora");
System.out.println("6. Borrar Bit�cora");
System.out.println("7. Salir");
System.out.println("Seleccione una opci�n: ");
op = pro.nextInt();
}
//Este es una condici�n para la opci�n: Divisi�n 
if(op == 4){
System.out.println(" ");
System.out.println("Opci�n: Divisi�n de dos n�meros");
System.out.println("Ingrese el primer n�mero:");
num[10]= pro.nextInt();
System.out.println("Ingrese el segundo n�mero:");
num[11]= pro.nextInt();
//Este IF sirve para que nos marque error al momento de que el usuario quiera dividir entre 0
if (num[11]==0){
    System.out.println("Error, Divisi�n entre 0 no es permitida.");
}
//Este IF sirve para imprimir el valor de la divisi�n cuando el divisor es distinto de 0
if(num[11]<0){
num[12]=num[10]/num[11];
System.out.println("El resultado es: "+num[12]);
}
if(num[11]>0){
num[12]=num[10]/num[11];
System.out.println("El resultado es: "+num[12]);
}
System.out.println(" ");
System.out.println("..Men�..");
System.out.println("1. Suma de dos n�meros");
System.out.println("2. Resta de dos n�meros");
System.out.println("3. Multiplicaci�n de dos n�meros");
System.out.println("4. Divisi�n de dos n�meros");
System.out.println("5. Ver Bit�cora");
System.out.println("6. Borrar Bit�cora");
System.out.println("7. Salir");
System.out.println("Seleccione una opci�n: ");
op = pro.nextInt();
}
//Esta condici�n es para la opci�n ver bit�cora
if(op == 5){
System.out.println(" ");
System.out.println("Opci�n: Ver Bit�cora");
System.out.println(num[1]+"+"+num[2]+"="+num[3]);
System.out.println(num[4]+"-"+num[5]+"="+num[6]);
System.out.println(num[7]+"*"+num[8]+"="+num[9]);
System.out.println(num[10]+"/"+num[11]+"="+num[12]);
System.out.println(" ");
System.out.println("..Men�..");
System.out.println("1. Suma de dos n�meros");
System.out.println("2. Resta de dos n�meros");
System.out.println("3. Multiplicaci�n de dos n�meros");
System.out.println("4. Divisi�n de dos n�meros");
System.out.println("5. Ver Bit�cora");
System.out.println("6. Borrar Bit�cora");
System.out.println("7. Salir");
System.out.println("Seleccione una opci�n: ");
op = pro.nextInt();
}
//Esta condici�n es para borrar la Bit�cora
if(op == 6){
System.out.println(" ");
System.out.println("Opci�n: Borrar Bit�cora");
System.out.println("�Esta seguro(a) que desea borrar la Bit�cora?");
System.out.println("Ingrese '1'(Si) para continuar o '2'(No) para volver al Men� principal");
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
System.out.println("Usted selecciono la opci�n '1'...La Bit�cora fue borrada exitosamete.");    
System.out.println(" ");    
System.out.println("..Men�..");
System.out.println("1. Suma de dos n�meros");
System.out.println("2. Resta de dos n�meros");
System.out.println("3. Multiplicaci�n de dos n�meros");
System.out.println("4. Divisi�n de dos n�meros");
System.out.println("5. Ver Bit�cora");
System.out.println("6. Borrar Bit�cora");
System.out.println("7. Salir");
System.out.println("Seleccione una opci�n: ");
op = pro.nextInt(); 
}
if(a==2){
System.out.println(" ");
System.out.println("..Men�..");
System.out.println("1. Suma de dos n�meros");
System.out.println("2. Resta de dos n�meros");
System.out.println("3. Multiplicaci�n de dos n�meros");
System.out.println("4. Divisi�n de dos n�meros");
System.out.println("5. Ver Bit�cora");
System.out.println("6. Borrar Bit�cora");
System.out.println("7. Salir");
System.out.println("Seleccione una opci�n: ");
op = pro.nextInt();    
}
}
if(op == 7){
System.out.println("Adios");
break;
}
if(op > 7 ){
System.out.println(" ");
System.out.println("Esta no es uno de los n�meros mostrados para las opciones, por favor escriba una opci�n v�lida");
System.out.println("..Men�..");
System.out.println("1. Suma de dos n�meros");
System.out.println("2. Resta de dos n�meros");
System.out.println("3. Multiplicaci�n de dos n�meros");
System.out.println("4. Divisi�n de dos n�meros");
System.out.println("5. Ver Bit�cora");
System.out.println("6. Borrar Bit�cora");
System.out.println("7. Salir");
System.out.println("Seleccione una opci�n: ");
op = pro.nextInt();
}
}
while(op <= 7);
}}
