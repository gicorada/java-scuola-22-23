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
 * Classe che simula un oggetto con nome, quantità e prezzo
 * @author radaelli11353
 */
public class Item {
    private String name;
    private int quantity;
    private double price;

    /**
     * Costruttore parametrico completo
     * @param name Nome dell'oggetto
     * @param quantity Quantità iniziale
     * @param price Prezzo dell'oggetto
     */
    public Item(String name, int quantity, double price) {
        if(quantity < 0) throw new IllegalArgumentException();
        if(price < 0) throw new IllegalArgumentException();
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
    
    /**
     * Modifica la quantità dell'oggetto
     * @param modifier 
     */
    protected void modifyQuantity(int modifier) {
        if(!(quantity + modifier >= 0)) throw new IllegalArgumentException("La quantità minima per oggetto è 0");
        quantity += modifier;
    }

    /**
     * Getter nome
     * @return Nome oggetto
     */
    public String getName() {
        return name;
    }

    /**
     * Getter quantità
     * @return Quantità degli oggetti
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Getter prezzo
     * @return Prezzo dell'oggetto
     */
    public double getPrice() {
        return price;
    }
}
