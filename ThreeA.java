class ConstructorO {
    ConstructorO(){
        System.out.println("Inside the constructor");
    }
    ConstructorO(char letter){
        System.out.println(letter);
    }
    ConstructorO(String word1, String word2){
        System.out.println(word1 + word2);
    }
}

class ThreeA{
public static void main(String[] args){
    // invoking constructor into main class
    ConstructorO obj = new ConstructorO();
    ConstructorO obj1 = new ConstructorO('P');
    ConstructorO obj2 = new ConstructorO("Good","Game");
}
}
