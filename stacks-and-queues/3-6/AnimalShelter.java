import java.util.LinkedList;

public class AnimalShelter {
    LinkedList<Animal> ll = new LinkedList<Animal>();
    
    public void enqueue(Animal a) {
        ll.add(a);
    }
    
    public Animal dequeueAny() {
        return ll.removeFirst();
    }
    
    public Animal dequeueCat() {
        return dequeueKind(Animal.CAT);
    }
    
    public Animal dequeueDog() {
        return dequeueKind(Animal.DOG);
    }
    
    private Animal dequeueKind(Animal kind) {
        LinkedList<Animal> temp = new LinkedList<Animal>();
        Animal a = ll.removeFirst();
        while (a != kind) {
            temp.add(a);
            a = ll.removeFirst();
        }
        temp.addAll(ll);
        ll = temp;
        return a;
    }
}
