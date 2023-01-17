public class theBook {
    private String bookName;
    private int price_out;
    private int yearPublish;
   private Author author;
   public theBook(String name,int price,int year,Author author){
       this.bookName=name;
       this.price_out=price;
       this.yearPublish=year;
       this.author=author;
   }
   public String getAuthorName(){
       return this.author.getAuthorName();
   }
   public String getBookName(){
       return this.bookName;
   }
   public int getPrice_out(){
       return this.price_out;
   }
   public int getYearPublish(){
       return this.yearPublish;
   }
   public void setBookName(String index)
   {
       this.bookName=index;
   }
   public void setPrice_out(int index)
   {
       this.price_out   =index;
   }
   public void setYearPublish(int index){
       this.yearPublish=index;
   }
   public void setAuthor(Author index){
       this.author=index;
   }
   public boolean equals(theBook another){
       if (this.yearPublish==another.yearPublish)
       {
           return true;
       } else return false;
   }
   public int discount(double index){
       return this.price_out -= (index * this.price_out) / 100;
   }
}
