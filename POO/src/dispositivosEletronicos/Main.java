package dispositivosEletronicos;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<dispositivoEletronicos> dispositivoEletronicos = new ArrayList<>();

        dispositivoEletronicos.add(new Smartphone("Samsung", "Galaxy", "Android"));
        dispositivoEletronicos.add(new Televisão("LG", "Oled", 47));
        dispositivoEletronicos.add(new Notebook("Positivo","Explosivo", 2));

        for (dispositivoEletronicos dispositivoEletronicos1 : dispositivoEletronicos){
            dispositivoEletronicos1.isLigado();
            dispositivoEletronicos1.executarFuncaoPrincipal();
            dispositivoEletronicos1.exibirStatus();
            dispositivoEletronicos1.Desligar();
            dispositivoEletronicos1.executarFuncaoPrincipal();
            System.out.println("---------");
        }
    }
}
