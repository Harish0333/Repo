package com.task2;

import java.lang.FunctionalInterface;
@FunctionalInterface
public interface Function <T,R>
{
	R apply(T x);
}
