package service;

public final class IdGenerator {

	private static int counter = 0;

	private IdGenerator() {

	}

	public static int getNextId() {
		return counter++;
	}
}
