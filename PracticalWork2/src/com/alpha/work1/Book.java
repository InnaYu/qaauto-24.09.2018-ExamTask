package com.alpha.work1;

class Book {
    private int id;
    private String titul;
    private String author;
    private String publisher;
    private int year;
    private int pages;

    public Book(int id, String titul, String author, String publisher, int year, int pages, double cost) {
        this.id = id;
        this.titul = titul;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.pages = pages;
        this.cost = cost;
    }

    public Book(String titul, String author, int year, double cost) {
        this.titul = titul;
        this.author = author;
        this.year = year;
        this.cost = cost;
    }

    public Book(int id, String titul, String author, String publisher, int pages) {
        this.id = id;
        this.titul = titul;
        this.author = author;
        this.publisher = publisher;
        this.pages = pages;

    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitul() {
        return titul;
    }

    public void setTitul(String titul) {
        this.titul = titul;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    private double cost;


    public void view(){

        System.out.println("ID="+getId()+
                        "; Titul="+getTitul()+
                        "; Author="+getAuthor()+
                        "; Publisher="+getPublisher()+
                        "; Year="+getYear()+
                        "; Pages="+getPages()+
                        "; Cost="+getCost());


    };





}
