  class Movie2
{
private String movieName;
private float movieLength;
private String movieType;
private String yearOfRelease;

Movie2(String movieName, float movieLength, String movieType, String yearOfRelease)
{
this.movieName=movieName;
this.movieLength = movieLength;
this.movieType = movieType;
this.yearOfRelease = yearOfRelease;
}
Movie2(String movieName, float movieLength, String yearOfRelease)
{
this.movieName=movieName;
this.movieLength = movieLength;
this.movieType = movieType;
this.yearOfRelease = yearOfRelease;
}
public String toString()
{
if(this.movieType!=null)
{
return "Movie Name = "+this.movieName + "\nMovie Length = "+this.movieLength+
"\nMovie Type = "+this.movieType+"\nMovie Year Of Realease = " + this.yearOfRelease+"\n";
}
else
{
return "Movie Name = "+this.movieName + "\nMovie Length = "+this.movieLength+"\nMovie Year Of Realease = "+this.yearOfRelease+"\n";
}
}
}
class App
{
public static void main(String ...args)
{
Movie jannat = new Movie("Jannat",2.3f,"Action","2012");
System.out.println(jannat);
Movie Dhammal = new Movie("Dhammal", 2.5f,"2014");
System.out.println(Dhammal);

}
}

