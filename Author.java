public class Author {
    private String authorName;
    private MyDate myDate;
    MyDate date=new MyDate(24,11,2004);
    public Author(String name){
        this.authorName=name;
    }
    public String getAuthorName()
    {
        return this.authorName;
    }
    public String toString(){
        return date.getDay()+"/"+date.getMonth()+"/"+date.getYear();
    }
    public void setAuthorName(String index)
    {
        this.authorName=index;
    }
}
