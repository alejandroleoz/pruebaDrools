package utn.dds.pruebaDrools;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;/* This is a sample class to launch a rule. */
import org.kie.api.runtime.KieSession;

import java.util.ArrayList;
import java.util.List;

public class DroolsApp {
    public static final void main(String[] args) {

        System.out.println( "Bootstrapping the Rule Engine ..." );
        //1) Bootstrapping a Rule Engine Session
        KieServices ks = KieServices.Factory.get();
        KieContainer kContainer = ks.getKieClasspathContainer();
        KieSession kSession =  kContainer.newKieSession();

        List<Persona> personas = new ArrayList<Persona>();
        personas.add(new Persona("Alejandro", 24));
        personas.add(new Persona("Ezequiel", 33));
        personas.add(new Persona("Pepe", 15));

        personas.stream().forEach(p -> {
            kSession.insert(p);
        });

        //2) Provide information to the Rule Engine Context
//        kSession.insert(personas);
        //3) Execute the rules that are matching
        int fired = kSession.fireAllRules();

        System.out.println( "Number of Rules executed = " + fired );

        personas.stream().forEach(p -> {
            System.out.printf("%s es mayor: %b \n", p.getNombre(), p.isMayor());
        });

    }
}