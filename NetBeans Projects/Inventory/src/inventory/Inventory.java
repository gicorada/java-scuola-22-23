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

import java.util.ArrayList;

/**
 * Metodo che simula un inventario
 * @author radaelli11353
 */
public class Inventory {
    
    private ArrayList<Item> list;

    /**
     * Costruttore
     */
    public Inventory() {
        list = new ArrayList<>();
    }
    
    /**
     * Aggiunge un oggetto all'inventario.
     * @param name Nome dell'oggetto
     * @param quantity Quantità iniziale
     * @param price Prezzo unitario dell'oggetto
     */
    public void addItem(String name, int quantity, double price) {
        list.add(new Item(name, quantity, price));
    }
    
    /**
     * Aggiunge una quantità di oggetti già presenti.
     * Se gli oggetti non sono presenti nell'inventario, non fa niente
     * @param itemName Nome dell'oggetto da ricercare
     * @param quantity Quantità da aggiungere all'oggetto
     */
    public void increaseQuantity(String itemName, int quantity) {
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).getName().equals(itemName)) {
                list.get(i).modifyQuantity(quantity);
                return;
            }
        }
    }
    
    /**
     * Diminuisce di una quantità oggetti già presenti.
     * Utilizza increaseQuantity per diminuire in numero di oggetti
     * @param itemName Nome dell'oggetto da ricercare
     * @param quantity Quantità da rimuovere all'oggetto
     */
    public void decreaseQuantity(String itemName, int quantity) {
        if(quantity < 0) quantity = -quantity;
        increaseQuantity(itemName, -quantity);
    }
    
    /**
     * Resistuisce la quantità di oggetti di un determinato tipo presenti.
     * @param itemName Nome dell'oggetto da ricercare
     * @return Numero degli item presenti nell'Inventory, -1 se non presenti
     */
    public int getQuantity(String itemName) {
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).getName().equals(itemName)) {
                return list.get(i).getQuantity();
            }
        }
        return -1;
    }
    
    /**
     * Restituisce il valore complessivo di tutti gli oggetti dell'inventario.
     * @return Valore complessivo dell'inventario
     */
    public double getTotalValue() {
        double totalValue = 0;
        
        for(Item i : list) {
            totalValue += i.getPrice() * i.getQuantity();
        }
        
        return totalValue;
    }
}
