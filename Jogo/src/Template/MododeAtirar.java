package Template;
public abstract class MododeAtirar {
    
    
            protected abstract void alterarModo(); 
            
            public void alterandoModo(){
                System.out.println("Selecionando modo de atirar");
            }
    

            public void modoAlterado(){
                    
                    alterandoModo();
                    alterarModo();
            }
    
}
