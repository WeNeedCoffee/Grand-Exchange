package coffee.weneed.exhange;

import java.util.UUID;

public class Item {

	private String game;

	/**
	 * Used for internal identification 
	 */
	private UUID uuid;

	/**
	 * The id that the game would recognize this by
	 */
	private String id;

	/**
	 * Serialised data, basically what makes this item different.
	 */
	private String data;

	private UUID seller;

	private UUID originServer;

	private boolean cheated;

	private long listDate;

	public Item() {

	}
}
