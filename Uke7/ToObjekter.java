public class ToObjekter<T>{
    private T forste;
    private T andre;

    ToObjekter(T forste, T andre){
        this.forste = forste;
        this.andre = andre;
    }

    public T returnerAndre(){
        return andre;
    }

    public T returnerForste(){
        return forste;
    }
}