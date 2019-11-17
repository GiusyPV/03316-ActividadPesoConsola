/* 
 * Copyright 2019 Josefina Pugliese Vazquez - josefinapwork@gmail.com.
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
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Josefina Pugliese Vazquez
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {

        //Constantes
        final int NUM_DIAS = 7;
        final int PESO_MIN = 0;
        final int PESO_MAX = 250;

        //Variables
        double peso = 0;
        double acum = 0;
        boolean pesoOk;

        for (int dia = 0; dia < NUM_DIAS; dia++) {
            do {

                try {

                    System.out.print("Introduce tu peso .: ");
                    peso = SCN.nextDouble();

                } catch (Exception e) {
                    System.out.print("ERROR: El valor introducido es incorrecto.");
                } finally {
                    SCN.nextLine();
                }

                pesoOk = peso >= PESO_MIN && peso <= PESO_MAX;
                if (!pesoOk) {
                    System.out.println("ERROR: Peso incorrecto.");

                }
            } while (!pesoOk);

            acum += peso;
        }

        System.out.printf("El peso medio semanal es .: %.2f%n", acum / NUM_DIAS);

    }
}
