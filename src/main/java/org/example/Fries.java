package org.example;

public  final class Fries extends Product{

    //Fields - private
    private Size size;
    private boolean isSpacy;
    private boolean isSweetPotato;

    // Constructor

    public Fries(Size size,boolean isSpacy,boolean isSweetPotato){
       //defined in Product(name+price)
        super(size.getName(), size.getPrice());
        this.size = size;
        this.isSpacy = isSpacy;
        this.isSweetPotato = isSweetPotato;
    }

    public Fries() {
        // for boolean isSpacy and isSweetPotato we have default value (false)
        super(Size.SMALL.getName(), Size.SMALL.getPrice());
    }

    //Method for get description -override
    @Override
    public String getDescription(){
        return super.getDescription() + ", Is Spacy :" + isSpacy + ", Sweet potato :" + isSweetPotato;
    }

    @Override
    public double calculateTax() {
        return getPrice()*0.2;
    }

    @Override
    public String toString() {
        return "Fries{" +
                "size=" + size +
                ", isSpacy=" + isSpacy +
                ", isSweetPotato=" + isSweetPotato +
                '}';
    }



}
