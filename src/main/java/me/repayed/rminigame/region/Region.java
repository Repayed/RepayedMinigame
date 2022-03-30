package me.repayed.rminigame.region;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;

public class Region {

    private World world;

    private Location firstSelection;
    private Location secondSelection;

    private double maxX;
    private double maxY;
    private double maxZ;

    private double minX;
    private double minY;
    private double minZ;

    public Region(Location firstSelection, Location secondSelection) {
        if (!firstSelection.getWorld().equals(secondSelection.getWorld())) return;

        this.firstSelection = firstSelection;
        this.secondSelection = secondSelection;

        this.world = firstSelection.getWorld();

        this.maxX = Math.max(firstSelection.getX(), secondSelection.getX());
        this.maxY = Math.max(firstSelection.getY(), secondSelection.getY());
        this.maxZ = Math.max(firstSelection.getZ(), secondSelection.getZ());

        this.minX = Math.min(firstSelection.getX(), secondSelection.getX());
        this.minY = Math.min(firstSelection.getY(), secondSelection.getY());
        this.minZ = Math.min(firstSelection.getZ(), secondSelection.getZ());
    }

    public Location getFirstSelection() {
        return firstSelection;
    }

    public Location getSecondSelection() {
        return secondSelection;
    }

    public boolean withinRegion(Player player) {
        for (double x = minX; x < maxX; x++) {
            for (double y = minY; y < maxY; y++) {
                for (double z = minZ; z < maxZ; z++) {
                    Location location = new Location(world, x, y, z);
                    if (player.getLocation().equals(location)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
