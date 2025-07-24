package com.design.pattern.builder;

public class Pizza {
    private String size;
    private boolean cheese;
    private boolean peproni;
    private boolean mushroom;


    public static class Builder
    {
        private String size;
        private boolean cheese;
        private boolean peproni;
        private boolean mushroom;
        public Builder (String size)
        {
            this.size= size;
        }

        public Builder addCheese(boolean cheese)
        {
            this.cheese= cheese;
            return this;
        }
        public Builder addMushroom(boolean mushroom)
        {
            this.mushroom= mushroom;
            return this;
        }
        public Builder addPeproni(boolean peproni)
        {
            this.peproni = peproni;
            return this;

        }

        public Pizza build()
        {
            Pizza pizza = new Pizza();
            pizza.size= this.size;
            pizza.cheese=this.cheese;
            pizza.peproni= this.peproni;
            pizza.mushroom= this.mushroom;
            return  pizza;
        }



    }
    @Override
    public String toString()
    {
        return "Pizza sizeeee "+size+", Cheese "+ cheese+", peproni "+ peproni + ", mushroom "+mushroom;
    }

}
