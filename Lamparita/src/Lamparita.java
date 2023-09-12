public class Lamparita {
    private boolean estado;

    Lamparita(){
        this.estado = false;
    }
    public void encender(){
        this.estado = true;
    }
    public void apagar(){
        this.estado = false;
    }
    public boolean estado(){
        return this.estado;
    }
    public void cambiarEstado(){
        this.estado = !this.estado;
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Vamos a programar una lamparita! ");
    }
}
