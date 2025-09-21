package com.task;
import java.lang.FunctionalInterface;

@FunctionalInterface
public interface Consumer <T>
{
	void accept(T x);
}
