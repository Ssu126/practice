package Practice3;

public class Human {
    private Integer id;
    private String name;
    private boolean isDeleted;

    public Human(String name) {
        this.name = name;
        isDeleted = false;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public boolean getIsDeleted(){
        return isDeleted;
    }
}
