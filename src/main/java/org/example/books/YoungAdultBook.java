package org.example.books;

public class YoungAdultBook extends Book implements Loanable{

    private String description;
    private String difficulty;
    private String ageGroup;

    public YoungAdultBook(String title, String author, Category Category, int year, int pages, String description, String difficulty, String ageGroup) {
        super(title, author, Category.ADULT, year, pages);
        this.description = description;
        this.difficulty = difficulty;
        this.ageGroup = ageGroup;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(String ageGroup) {
        this.ageGroup = ageGroup;
    }

    @Override
    public void loan() {
        System.out.println("Don't forget to return it in time!");

    }
}
