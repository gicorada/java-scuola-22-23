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

import java.util.Scanner;

/**
 *
 * @author radaelli11353
 */
public class Tester {
    public static void main(String[] args) {
        MasterMind test = new MasterMind();
        Scanner in = new Scanner(System.in);
        int tentativi = 0;
        boolean vinto = false;
        
        while(test.hasNext() && !vinto) {
            String parola = in.nextLine().toUpperCase().replace(" ","");

            int[] risultato = test.muovi(parola);
            tentativi++;
            if(risultato[0] == 4) {
                System.out.println("HAI VINTO!");
                vinto = true;
                break;
            }

            if(tentativi == 10) {
                System.out.println("Hai perso");
                return;
            }
            System.out.printf("%d %d <-- Risultato del %d tentativo", risultato[0], risultato[1], tentativi);

        }
    }
    
    
}
