class Cars{
    protected String brand;
    protected void display(String brand){
        System.out.println("brand :"+brand);
    }
}
public class Privatemethod {
    public static void main(String[] args){
        Cars obj=new Cars();
        obj.brand="Benz";
        obj.display(obj.brand);
    }
}
