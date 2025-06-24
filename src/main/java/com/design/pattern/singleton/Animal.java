package com.design.pattern.singleton;

public class Animal {
    //implementation to prevent from reflection api


    private static Animal animal;

    private Animal()
    {
        if(animal!=null)
        {
            throw new RuntimeException("Hey reflection api !! stop it please !!");
        }
    }

    public static Animal getAnimal()
    {
        if(animal==null)
        {
            synchronized (Animal.class)
            {
                if(animal==null)
                {
                    animal= new Animal();
                }
            }

        }
        return animal;
    }
}
