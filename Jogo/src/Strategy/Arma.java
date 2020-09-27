package Strategy;
public class Arma {

    public static void setArma() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private TipoArma tipoarma;
    
    public void setArma(TipoArma arma){
        this.tipoarma = arma;
    }
    
    public void armaSelecionada(){
        this.tipoarma.selecionarArma();
    }
}
