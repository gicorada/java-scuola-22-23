/*
 * Copyright (C) 2023 Giacomo Radaelli
 *
 *     Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package mastermind;

import java.util.ArrayList;
import java.util.Random;

/**
 * Classe che simula il gioco Mastermind
 * @author radaelli11353
 */
public class MasterMind {
    ArrayList<Character> lettereValide;
    ArrayList<Character> segreto;
    int tentativi;

    public MasterMind() {
        lettereValide = new ArrayList<>(6);
        lettereValide.add('R');
        lettereValide.add('V');
        lettereValide.add('G');
        lettereValide.add('B');
        lettereValide.add('N');
        lettereValide.add('M');
        tentativi = 0;
        segreto = genera();
        System.out.println(segreto);
    }
    
    static private ArrayList<Character> genera() {
        Random gen = new Random();
        ArrayList<Character> segreto = new ArrayList<>();
        

        for(int i = 0; i < 4; i++) {
            int num = gen.nextInt(5);
            
            switch (num) {
                case 0: segreto.add('R'); break;
                case 1: segreto.add('V'); break;
                case 2: segreto.add('G'); break;
                case 3: segreto.add('B'); break;
                case 4: segreto.add('N'); break;
                default: segreto.add('M'); break;
            }
        }
        
        return segreto;
    }
    
    public int[] muovi(String originale) {
        if(tentativi >= 10) throw new IllegalStateException("Hai esaurito i tentativi");
        if(originale.length() != 4) throw new IllegalArgumentException("Devi inserire quattro caratteri");
        ArrayList<Character> utente = new ArrayList<>(4);
        
        for(int i = 0; i < 4; i++) {
            if(!lettereValide.contains(originale.charAt(i))) throw new IllegalArgumentException("I colori inseriti non sono validi");
            utente.add(originale.charAt(i));
        }
        
        int pgiusto = 0, psbagliato = 0;
        
        for (int i = 0; i < 4; i++) {
            if(utente.indexOf(segreto.get(i)) == -1) {

            } else if(utente.indexOf(segreto.get(i)) == i) {
                pgiusto++;
                utente.set(i, Character.MIN_VALUE);
            } else {
                psbagliato++;
            }
        }
        
        return new int[] {pgiusto, psbagliato};
    }
    
    public boolean hasNext() {
        return tentativi < 9;
    }
}
