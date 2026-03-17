import  java.util.ArrayList;
public class Show {
    String title;
    int duration;
    Director director;
    ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>();
    }

    public void printDirector() {
        System.out.println(director);
    }

    public void printActors() {
        for (int i = 0; i < listOfActors.size(); i++) {
            System.out.println(listOfActors.get(i));
        }
    }

    public void addActor(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Такой актер уже есть!");
            return;
        }

        listOfActors.add(actor);
    }

    public void replaceActor(String surname, Actor actor) {
        for (int i = 0; i < listOfActors.size(); i++) {
            if(listOfActors.get(i).surname.equals(surname)) {
                listOfActors.set(i, actor);
                return;
            }
        }

        System.out.println("Такой актер не найден!");
    }
}