package me.repayed.rminigame.arena;

import me.repayed.rminigame.region.Region;
import org.bukkit.Location;

import java.util.List;

public class Arena {

    private String name;
    private int minimumPlayers;
    private int maximumPlayers;

    private Location arenaLobby;

    private Region arenaRegion;
    private List<Location> spawnLocations;

    public Arena(String name, int minimumPlayers, int maximumPlayers) {
        this.name = name;
        this.minimumPlayers = minimumPlayers;
        this.maximumPlayers = maximumPlayers;
    }

    public String getName() {
        return this.name;
    }

    public Location getArenaLobby() {
        return arenaLobby;
    }

    public void setArenaLobby(Location location) {
        this.arenaLobby = location;
    }

    public Region getArenaRegion() {
        return arenaRegion;
    }

    public void setRegion(Location firstSelection, Location secondSelection) {
        this.arenaRegion = new Region(firstSelection, secondSelection);
    }

    public List<Location> getSpawnLocations() {
        return this.getSpawnLocations();
    }

    public void setSpawnLocations(List<Location> locations) {
        this.spawnLocations = locations;
    }

}
