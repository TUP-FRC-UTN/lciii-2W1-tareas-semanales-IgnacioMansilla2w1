package fabricacaños;
public class Producto {
    private String descripcion;
    private Material[]Materiales;

    public Producto(String descripcion,int cantidadElementos) {
        this.descripcion=descripcion;
        Materiales=new Material[cantidadElementos];
    }
    public void agregarMaterial(Material materia){
        for (int i = 0; i < Materiales.length; i++) {
            if(Materiales[i]==null){
                Materiales[i]=materia;
                break;
            }
        }
    }
    public double sumaCostos=0;
    public double costoTotal(){
        for (int i = 0; i <Materiales.length; i++) {
            if(Materiales[i]!=null){
                sumaCostos+=Materiales[i].getValorUnitario();
            }
        }
      return sumaCostos;
    }
    public boolean codigoExistente(int codigo){
       boolean existe=false;
        for (int i = 0; i <Materiales.length; i++) {
            if(Materiales[i]!=null && Materiales[i].getCodigo()==codigo){
                existe=true;
                break;
            }
        }
        return existe;
    }
    public Material[] matMenores(double valorMaximo){
        Material[] matMenores=new Material[Materiales.length];
        int contIndice=0;
        for (int i = 0; i <Materiales.length; i++) {
            if(Materiales[i]!=null && Materiales[i].getValorUnitario()< valorMaximo){
                matMenores[contIndice]=Materiales[i];
                contIndice++;
            }
        }
        
        
        return matMenores;
    }
    public int[] cantPrecio(){
        int[]cantPorPrecio=new int[4];
        for (int i = 0; i <Materiales.length; i++) {
            if(Materiales[i]!=null){
                if(Materiales[i].getValorUnitario()>0 && Materiales[i].getValorUnitario()<=10){
                    cantPorPrecio[0]++;
                }else if(Materiales[i].getValorUnitario()>10 && Materiales[i].getValorUnitario()<=20){
                    cantPorPrecio[1]++;
                }else if(Materiales[i].getValorUnitario()>20 && Materiales[i].getValorUnitario()<=30){
                    cantPorPrecio[2]++;
                }else{
                    cantPorPrecio[3]++;
                }
            }
        }
        return cantPorPrecio;
    }
}
