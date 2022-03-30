package me.repayed.rminigame.arena;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ArenaHandler {

    private List<Arena> arenaList = new ArrayList<>();


    /**
     * Loads all of the arenas from the arenas.yml
     */
    public void loadArenas() {

    }

    public boolean containsArena(String name) {
        return arenaList.stream().anyMatch(arena -> arena.getName().equals(name));
    }

    public void addArena(Arena arena) {
        arenaList.add(arena);
    }

    public Optional<Arena> getArenaByName(String name) {
        return arenaList.stream().filter(arena -> arena.getName().equals(name)).findAny();
    }

    public List<Arena> getArenas() {
        return this.arenaList;
    }
}
