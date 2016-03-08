class SpraakListe<E extends ProgSpraak>{
    private Node forste;

    private class Node{
        E spraak;
        Node neste;
        Node(E spraak){
            this.spraak = spraak;
        }
    }

    public void leggTil(E spraak){

        //Oppretter ny node.
        Node nyNode = new Node(spraak);

        //Ingen spraak i listen.
        if(forste == null){
            forste = nyNode;
        } else if(forste.spraak.compareTo(nyNode.spraak) < 0){
            //Nynode skal ligge forst i listen.
            nyNode.neste = forste;
            forste = nyNode;
        } else {
            Node temp = forste;

            while(temp.neste != null && temp.neste.spraak.compareTo(nyNode.spraak) > 0){
                //Leter etter riktig plass
                temp = temp.neste;
            }

            nyNode.neste = temp.neste;
            temp.neste = nyNode;
        }


    }

    public void skrivUtSpraak(){
        Node temp = forste;

        while(temp != null){
            System.out.println(temp.spraak);
            temp = temp.neste;
        }
    }
}