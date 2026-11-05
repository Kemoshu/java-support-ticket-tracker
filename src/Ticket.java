public class Ticket {
    private int id;
    private String title;
    private String status = "OPEN";
    public Ticket(int id, String title) {
        this.id = id;
        this.title = title;
    }
    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getStatus() {
        return status;
    }
}
