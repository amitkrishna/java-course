package _02_07.end;

public class ChildTicket extends Ticket {


    @Override
    public int getPrice() {
        return 5;
    }

    @Override
    public String toString() {
        return "Child ticket";
    }

}
