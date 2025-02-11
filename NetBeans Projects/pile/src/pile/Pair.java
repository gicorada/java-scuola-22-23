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

package pile;

/**
 * Classe che rappresenta una coppia riga/colonna
 * @author radaelli11353
 */
public class Pair {
    private final int row;
    private final int column;

    /**
     * Costruttore parametrico completo
     * @param row Numero riga
     * @param column Numero colonna
     */
    public Pair(int row, int column) {
        this.row = row;
        this.column = column;
    }

    /**
     * Getter della riga
     * @return Riga
     */
    public int getRow() {
        return row;
    }

    /**
     * Getter della colonna
     * @return Colonna
     */
    public int getColumn() {
        return column;
    }
}
