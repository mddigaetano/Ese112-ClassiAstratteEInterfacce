/*
 * Copyright (C) 2016 Amedeo Di Gaetano <digaetano.amedeo@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

/**
 *
 * @author Amedeo Di Gaetano <digaetano.amedeo@gmail.com>
 */
public class First {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Triangolo tri = new Triangolo(5);
        Esagono esa = new Esagono(7);
        
        System.out.println("Il perimetro del quadrato è: "+tri.perimetro());
        System.out.println("L'area dell'esagono è: "+esa.area());
        
        FiguraPiana poligono = new FiguraPiana("Miku-chan");
        
        System.out.println("Il mio nome era: "+poligono.getNome());
        poligono.setNome("GUMI");
        System.out.println("Adesso mi chiamo: "+poligono.getNome());
        
        FiguraQuadrato quad = new FiguraQuadrato(4, "VY1V4");
        
        System.out.println("Sono un quadrato di area "+quad.area()+" e mi chiamo "+quad.getNome());
    }
    
}
