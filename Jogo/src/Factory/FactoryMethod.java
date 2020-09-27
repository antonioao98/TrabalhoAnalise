package Factory;
public class FactoryMethod {
    
        public SexoPersonagem tipoPersonagem(String sexo){
            if(sexo.equals ("Masculino")){
                
                return new Masculino();
                
            }else{
                
                return new Feminino();
            }
        }
}
