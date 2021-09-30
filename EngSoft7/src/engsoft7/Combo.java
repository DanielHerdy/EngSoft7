package engsoft7;

/** @author Daniel Carvalho */

public class Combo {
    private PratoPrincipal prato = null;
    private Sobremesa sobremesa = null;
    private Bebida bebida = null;
    
    public Combo(PratoPrincipal prato, Sobremesa sobremesa, Bebida bebida) {
        this.prato = prato;
	this.sobremesa = sobremesa;
	this.bebida = bebida;
    }
    
    public void AdicionarCombo(PratoPrincipal combo_prato, Sobremesa combo_sobremesa, Bebida combo_bebida){
        prato.Adicionar(combo_prato);
        sobremesa.Adicionar(combo_sobremesa);
        bebida.Adicionar(combo_bebida);
    }
    
    public void RemoverCombo(PratoPrincipal combo_prato, Sobremesa combo_sobremesa, Bebida combo_bebida){
        prato.Remover(combo_prato);
        sobremesa.Remover(combo_sobremesa);
        bebida.Remover(combo_bebida);
    }
    
    public void MostrarCombo(){
        prato.MostraItens();
        sobremesa.MostraItens();
        bebida.MostraItens();
    }
}