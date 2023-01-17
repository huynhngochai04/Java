public class MyDate{
    private int day;
    private int month;
    private int year;
    public MyDate(int d,int m,int y){
        this.day=d;
        this.month=m;
        this.year=y;
    }
    public int getDay()
    {
        return this.day;
    }
    public int getMonth(){
        return this.month;
    }
    public int getYear(){
        return this.year;
    }
    public String toString() {
        return this.day+"/"+this.month+"/"+this.year;
    }
    public boolean equals(MyDate another) {
        if (this.day==another.day)
        {
            if (this.month==another.month)
            {
                if (this.year==another.year)
                {
                    return true;
                } else return false;
            } else return false;
        } else return false;
    }
}
