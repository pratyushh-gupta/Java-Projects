public class Book {
  private String isbn;
  private String title;
  private String author;
  private String genere;
  private boolean isAvailable;

  public Book(String isbn, String title, String author, String genere){
    this.isbn = isbn;
    this.title = title;
    this.author = author;
    this.genere = genere;
    this.isAvailable = true;
  }

  // Getter and Setter
  public String getIsbn(){
    return isbn;
  }
  public void setIsbn(String isbn){
    this.isbn = isbn;
  }

  public String getTitle(){
    return title;
  }
  public void setTitle(String title){
    this.title = title;
  }

  public String getAuthor(){
    return author;
  }
  public void setAuthor(String author){
    this.author = author;
  }

  public String getGenere(){
    return genere;
  }
  public void setGenere(String genere){
    this.genere = genere;
  }

  public boolean isAvailable(){
    return isAvailable;
  }
  public void setAvailable(boolean available){
    isAvailable = available;
  }

  public void displayInfo(){
    System.out.println("ISBN: " + isbn);
    System.out.println("Title: " + title);
    System.out.println("Author: " + author);
    System.out.println("Genere: " + genere);
    System.out.println("Status: " + (isAvailable ? "Available" : "Borrowed"));
    System.out.println("-".repeat(40));
  }
}
