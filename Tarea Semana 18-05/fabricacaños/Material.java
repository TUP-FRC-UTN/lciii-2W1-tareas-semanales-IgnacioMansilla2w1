package fabricacaños;
public class Material {
    private String descripcion;
    private int codigo;
    private double valorUnitario;

    @Override
    public String toString() {
        return "Material{" + "descripcion=" + descripcion + ", codigo=" + codigo + ", valorUnitario=" + valorUnitario + '}';
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(float valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public Material(String descripcion, int codigo, double valorUnitario) {
        this.descripcion = descripcion;
        this.codigo = codigo;
        this.valorUnitario = valorUnitario;
    }


    
}
