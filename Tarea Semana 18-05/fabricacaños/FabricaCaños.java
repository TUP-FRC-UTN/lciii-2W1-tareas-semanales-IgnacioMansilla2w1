package fabricacaños;
import java.util.Scanner;
public class FabricaCaños {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de materiales: ");
        int cant = sc.nextInt();
        
        System.out.print("Ingrese la descripcion del producto: ");
        sc.nextLine();
        String descripcion = sc.nextLine();
        
        
        Producto p = new Producto(descripcion,cant);
        
        for (int i = 0; i < cant; i++) 
        {
           System.out.print("Ingrese La descripcion del material: ");
           
           String mat = sc.nextLine();
           
            System.out.print("Ingrese el codigo: ");
            int codigo = sc.nextInt();
            
            System.out.print("Ingrese el valor unitario: ");
            double valUnit = sc.nextFloat();
            System.out.println("---------------------------------------");
            sc.nextLine();
            Material m = new Material(mat,codigo,valUnit);
            
            p.agregarMaterial(m);
        }
        
        int opcion = 99;
        while(opcion != 0){
            System.out.println("---------------------------------------");
            System.out.println("Menu");
            System.out.println("1- Ver costo total");
            System.out.println("2- ver si el material existe");
            System.out.println("3- comparar precio");
            System.out.println("4- cantidad materiales por precio");
            System.out.println("0- salir");
            System.out.print("Opcion elegida: ");
            opcion = sc.nextInt();
            System.out.println("---------------------------------------");
            if(opcion == 1)   
            {
                System.out.println(p.costoTotal());
            }
            else if (opcion == 2) 
            {
                System.out.println("Ingrese codigo del material a buscar");
                int cod = sc.nextInt();
                if(p.codigoExistente(cod)){
                    System.out.println("Existe");   
                }else{
                    System.out.println("No existe");
                }
            }
            if(opcion == 3)
            {
                System.out.println("Ingrese el valor a comparar");
                double val = sc.nextFloat();
                Material[] mat = p.matMenores(val);
                for (int j = 0; j < mat.length; j++) {
                    if (mat[j] != null) {
                        System.out.println(mat[j].toString());
                    }
                    
                }
                
                
            }
            if(opcion == 4)
            {
                System.out.println("Preios mayores a 0 y menores o igual a 10");
                System.out.println(p.cantPrecio()[0]);
                System.out.println("Preios mayores a 10 y menores o igual a 20");
                System.out.println(p.cantPrecio()[1]);
                System.out.println("Preios mayores a 20 y menores o igual a 30");
                System.out.println(p.cantPrecio()[2]);
                System.out.println("Preios mayores a 30");
                System.out.println(p.cantPrecio()[3]);
            }
            
            
        }
        
    }
    
}
