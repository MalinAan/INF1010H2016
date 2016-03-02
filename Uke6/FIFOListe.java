//import java.util.Iterable;
import java.util.Iterator;

/**
 * Created by malinaandahl on 23.02.16.
 */
public class FIFOListe<E> implements Iterable<E>, Liste<E>{

        private Node forste;
        private Node siste;

        private class Node{

                Node neste;
                E element;
                Node(E element){
                        this.element = element;
                }
        }


        /**
         * Returnerer nummer of elementer i lista.
         *
         * @return nummer av elementer i lista.
         */
        public int storrelse(){
                int teller = 0;

                for(Node temp = forste; temp != null; temp = temp.neste){
                        teller++;
                }
                return teller;
        }

        public Iterator<E> iterator(){
            return new ListeIterator();
        }

        private class ListeIterator implements Iterator<E>{
            Node midl = forste;

            public boolean hasNext(){
                if(midl == null){
                    return false;
                } return true;
            }

            public E next(){
                E element = midl.element;
                midl = midl.neste;
                return element;
            }

            public void remove(){
                throw new UnsupportedOperationException();
            }
        }

        /**
         * Returnerer true hvis lista ikke inneholder noen elementer.
         *
         * @return true hvis lista ikke inneholder noen elementer.
         */
        public boolean erTom(){
                if(forste == null){
                        return true;
                } return false;
        }

        /**
         * Returnerer true hvis lista ikke inneholder det spesifikke elementet.
         *
         * @param o element som vi skal sjekke finnes i lista.
         * @return true om lista inneholder det spesifikke elementet.
         */
        public boolean inneholder(Object o){
                for(Node temp = forste; temp != null; temp = temp.neste){
                        if(temp.element == o){
                                return true;
                        }
                } return false;
        }


        // Modifikasjons operatorer

        /**
         * Legger til det spesifikke elementet i listen.
         *
         * @param e elementet som skal bli lagt til i listen.
         */
        public void leggTil(E e){
                Node nyNode = new Node(e);

                //Sjekker om listen er tom.
                if(forste == null){
                        forste = nyNode;
                        siste = forste;
                        return;
                } else if(forste == siste){
                        //Ett element i listen.
                        forste.neste = nyNode;
                        siste = nyNode;
                } else {
                        //Flere elementer i listen.
                        siste.neste = nyNode;
                        siste = nyNode;
                }
        }

        /**
         * Fjerner det spesifikke elementet fra listen, om det finnes. Hvis listen ikke
         * inneholder elementet, vil den forbli uendret.
         *
         * @param o element som skal bli fjernet fra listen, om det finnes.
         * @return true om listen inneholdt det spesifikke elementet.
         */
        public boolean fjern(Object o){

                int index = indeksTil(o);

                if(index == -1){
                        //elementet finnes ikke i lista
                        return false;
                }

                fjern(index);
                return true;
        }

        /**
         * Fjerner alle elementet fra denne listen.
         * Listen vil vaere tom naar dette kallet returnerer.
         */
        public void toem(){
               forste = null;
                siste = null;
        }

        /**
         * Returnerer elementet paa den spesifikke posisjonen i denne lista.
         * Listen returnerer null dersom indeksen er mindre eller storre enn listen.
         *
         * @param index index av elementet som skal returneres.
         * @return elementet som er paa den spesifikke posisjonen i denne lista.
         */
        public E hent(int index){
                if(index < 0){
                        return null;
                }

                Node temp = forste;

                for(int i = 0; i <= index; i++){
                        if(temp == null){
                              return null;
                        } else if(i == index){
                                return temp.element;
                        }
                        temp = temp.neste;
                } return null;
        }



        /**
         * Fjerner elementet paa den spesifikke posisjonen til denne listen.
         * Returnerer null om indeksen er mindre eller storre enn listen.
         *
         * @param index indeksen til det elementet som skal bli fjernet.
         * @return elementet som tidligere var paa den posisjonen.
         */
        public E fjern(int index){
                if(index < 0){
                        return null;
                }

                Node forrige = forste;
                Node temp = forste;

                //Skal fjerne forste-pekeren.
                if(index == 0 && forste != null){
                        forste = forste.neste;
                        return temp.element;
                }

                for(int i = 0; i <= index; i++){
                        if(temp == null){
                                //Elementet fantes ikke i lsiten.
                                return null;
                        } else if(i == index){
                                forrige.neste = temp.neste;
                                return temp.element;
                        }
                        forrige = temp;
                        temp = temp.neste;
                } return null;


        }


        /**
         * Returnerer indeksen av den forste forekomsten av det spesifikke elementet i listen,
         * eller -1 om listen ikke inneholder det elementet.
         *
         * @param o element for aa soke etter.
         * @return indeksen til den forste forekomsten av det spesifikke elementet i denne listen,
         * eller -1 om listen ikke inneholder det elementet.
         */

        public int indeksTil(Object o){
                int teller = 0;

                for(Node temp = forste; temp != null; temp = temp.neste){
                        if(temp.element == o){
                                return teller;
                        }
                        teller++;
                }
                return -1;
        }


}
