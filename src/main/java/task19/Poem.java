package task19;

public class Poem {
    private Author creator;                 // compunere/composition - consecinta a incapsularii
    private int stropheNumber;

    public Poem(Author creator, int stropheNumber) {
        this.creator = creator;
        this.stropheNumber = stropheNumber;
    }

    public Author getCreator() {
        return creator;
    }

    public void setCreator(Author creator) {
        this.creator = creator;
    }

    public int getStropheNumber() {
        return stropheNumber;
    }

    public void setStropheNumber(int stropheNumber) {
        this.stropheNumber = stropheNumber;
    }
}

