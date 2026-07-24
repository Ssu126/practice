package Practice2;

public class Human {
    private Integer id;
    private String name;
    private boolean isDeleted;

    public Human(String name) {
        this.name = name;
        isDeleted = false;
    }

    public Integer getId(){
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public boolean getIsDeleted() {
        return isDeleted;
    }
    public void setIsDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }
}
