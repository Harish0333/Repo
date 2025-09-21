package com.task.product;

import java.io.Serializable;

public record product(int id, String name, double price) implements Serializable 
{

}
