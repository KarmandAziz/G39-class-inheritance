package org.example.books;

public class ReferenceBook extends Book{

    private String description;
    private String difficulty;
    private String ageGroup;


    public ReferenceBook(String title, String author, Category Category, int year, int pages, String description, String difficulty, String ageGroup) {
        super(title, author, Category.NOT_LOANABLE, year, pages);
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

}
