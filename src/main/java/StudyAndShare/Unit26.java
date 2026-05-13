package StudyAndShare;

public class Unit26 {
    public static void main(String[] args) {
        RefBook refBook = new RefBook();
        refBook.show();
        refBook.move();
    }
}

interface Document {
    void show();
}

interface eDocument {

}

interface RefDocument extends Document, eDocument {

}

class Book implements Document {
    public void show() {

    }

    public void move() {

    }
}

class Paper implements  Document{

    public void show() {

    }
}

class RefBook extends Book implements Document, RefDocument {

}
