package coffee.weneed.exhange;

import java.util.List;
import java.util.UUID;

public class Server {

	private UUID uuid;

	/**
	 * list of servers this server will accept items from
	 */
	private List<UUID> cooperatingServers;

	/**
	 * whether or not this server care about the cooperatingServers list
	 */
	private boolean cooperater;

	private UUID owner;

	/**
	 * Key for the server to identify with
	 */
	private String key;
}
