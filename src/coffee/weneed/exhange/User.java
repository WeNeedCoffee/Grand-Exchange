package coffee.weneed.exhange;

import java.util.Map;
import java.util.UUID;

public class User {

	private UUID uuid;

	private String key;

	/**
	 * The names this user uses for various games, values must be globally unique for each key.
	 */
	private Map<UUID, String> names;

}
