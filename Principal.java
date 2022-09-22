import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

import javax.sound.midi.Soundbank;

public class Principal {
    public static void main(String[] args) throws Exception {
        //modelo nome_do_objeto = metodo construtor:
        Pessoa p2 = new Pessoa("lucas",12,"23456");
        Pessoa p3 = new Pessoa("lucas",34,"15678");
        Pessoa p4 = new Pessoa("fernando", 89,"44656");
        Pessoa p5 = new Pessoa("victor",11,"23354");
        Pessoa p6 = new Pessoa("carlos",100,"7777");
        Pessoa p7 = new Pessoa("longan",13,"15");
        Pessoa p8 = new Pessoa("marcelo",16,"4444");
        Pessoa p9 = new Pessoa("neon",39,"33333");
        Pessoa p10 = new Pessoa("tuane", 11,"11111");
        Pessoa p11 = new Pessoa("kiwi", 9,"123333");
        Pessoa p12 = new Pessoa("flocos", 8,"9999");
        Pessoa p13 = new Pessoa("will",23,"5555");
        Pessoa p14 = new Pessoa("quil", 7,"777");
        List<Pessoa>ListaPessoa = new ArrayList<>();
        ListaPessoa.add(p2);
        ListaPessoa.add(p3);
        ListaPessoa.add(p4);
        ListaPessoa.add(p5);
        ListaPessoa.add(p6);
        ListaPessoa.add(p7);
        ListaPessoa.add(p8);
        ListaPessoa.add(p9);
        ListaPessoa.add(p10);
        ListaPessoa.add(p11);
        ListaPessoa.add(p12);
        ListaPessoa.add(p13);
        ListaPessoa.add(p14);
        int totalObjetos= ListaPessoa.size();
        Map<String,Integer> MenorIdade = new HashMap<>();
        Map<String,Integer> MaiorIdade = new HashMap<>();
        

        for(int x=0; x<totalObjetos;++x){
            if(ListaPessoa.get(x).getIdade()>18){
                MaiorIdade.put(ListaPessoa.get(x).getNome(),ListaPessoa.get(x).getIdade());

            }
            else{
                MenorIdade.put(ListaPessoa.get(x).getNome(),ListaPessoa.get(x).getIdade());
            }
        
        
        }

        
       System.out.println(MenorIdade); 
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
       
    
     
      
      

    }

    
}
