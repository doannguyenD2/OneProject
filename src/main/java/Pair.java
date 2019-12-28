/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dharm
 */
public class Pair<T1>{
        private T1 first;
        private int second;
        
        public Pair(){
            super();
        };
        
       public Pair(T1 first) {
               super();
               this.first = first;
       }
       public T1 getFirst() {
               return first;
       }
       public void setFirst(T1 first) {
               this.first = first;
       }
       public int getSecond() {
               return second;
       }
       public void setSecond(int second) {
               this.second = second;
       }
       
       public void add()
       {
           second++;
       }
       @Override
       public String toString() {
               return first+" "+second;
       }
}
