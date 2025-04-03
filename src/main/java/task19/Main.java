package task19;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author();
        author1.setSurname("Iancu Jianu");
        author1.setNationality("Romanian");

        Author author2 = new Author("Luigi", "Italian");

        Poem poem1 = new Poem(author1,5);
        Poem poem2 = new Poem(author2, 15);

        Poem[] arrPoems = {poem1, poem2};
        for(int i = 0; i < arrPoems.length; i++){
            System.out.println(arrPoems[i].getStropheNumber()
                    + " " + arrPoems[i].getCreator().getSurname()
                    + " " + arrPoems[i].getCreator().getNationality());
        }


    }
}
