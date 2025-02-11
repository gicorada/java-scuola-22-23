/*
 * Copyright 2023 radaelli11353.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package inventory;

/**
 * Classe di test per Inventory
 * @author gicorada
 */
public class Tester {
    public static void main(String[] args) {
        Inventory inv = new Inventory();
        
        inv.addItem("Prova1", 5, 10.00);
        System.out.println(inv.getQuantity("Prova1"));
        
        inv.increaseQuantity("Prova1", 7);
        System.out.println(inv.getQuantity("Prova1"));
        
        inv.decreaseQuantity("Prova1", 2);
        System.out.println(inv.getQuantity("Prova1"));
        
        System.out.println(inv.getTotalValue());
    }
}
