public class Cachorro extends Animal implements Correr {


    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public void som() {
        System.out.println("Au au au");
    }

    @Override
    public void corrida() {
        System.out.println("Correndo");
    }
}


