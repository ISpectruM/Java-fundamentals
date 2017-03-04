package C_Inheritance.B_BookShop;

public class Book {
    private String title;
    private String author;
    private double price;

    public Book(String author,String title, double price) {
        this.setTitle(title);
        this.setAuthor(author);
        this.setPrice(price);
    }

    private void setTitle(String title) {
        if (title == null || title.length()<3){
            throw new IllegalArgumentException("Title not valid!");
        }
        this.title = title;
    }

    private void setAuthor(String author) {
        if (author == null || author.isEmpty()){
            throw new IllegalArgumentException("Author not valid!");
        }else {
            String[] splitedName = author.trim().split("\\s+");
            if (splitedName.length>1) {
                String secondName = splitedName[1].trim();
                if (Character.isDigit(secondName.charAt(0))) {
                    throw new IllegalArgumentException("Author not valid!");
                }
            }
        }

        this.author = author;
    }

    protected void setPrice(double price) {
        if (price < 1 ){
            throw new IllegalArgumentException("Price not valid!");
        }
        this.price = price;
    }

    protected String getTitle() {
        return this.title;
    }

    protected String getAuthor() {
        return this.author;
    }

    protected double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Type: ").append(this.getClass().getSimpleName())
                .append(System.lineSeparator())
                .append("Title: ").append(this.getTitle())
                .append(System.lineSeparator())
                .append("Author: ").append(this.getAuthor())
                .append(System.lineSeparator())
                .append("Price: ").append(this.getPrice())
                .append(System.lineSeparator());
        return sb.toString();
    }
}
