package com.task4;

public class ZooExample {

	public static void main(String[] args) 
	{
		Lion lion = new Lion();
        Elephant elephant = new Elephant();
        Penguin penguin = new Penguin();
        
        Veterinarian vet = new Veterinarian();
       
        vet.performHealthCheckup(lion);
        vet.performHealthCheckup(elephant);
        vet.performHealthCheckup(penguin);
        vet.performHealthCheckup(lion);
	}
}
