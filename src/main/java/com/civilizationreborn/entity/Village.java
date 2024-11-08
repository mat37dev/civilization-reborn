package com.civilizationreborn.entity;

import java.util.List;

public class Village {
    private String name;
    private Civilization civilization;
    private final List<Building> buildings;
    private final List<Villager> villagers;

    public Village(String name, Civilization civilization, List<Building> buildings, List<Villager> villagers) {
        this.name = name;
        this.civilization = civilization;
        this.buildings = buildings;
        this.villagers = villagers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Civilization getCivilization() {
        return civilization;
    }

    public void setCivilization(Civilization civilization) {
        this.civilization = civilization;
    }

    public List<Building> getBuildings() {
        return buildings;
    }

    public void addBuilding(Building building) {
        buildings.add(building);
    }

    public void removeBuilding(Building building) {
        buildings.remove(building);
    }
    public List<Villager> getVillagers() {
        return villagers;
    }
    public void addVillager(Villager villager) {
        villagers.add(villager);
    }
    public void removeVillager(Villager villager) {
        villagers.remove(villager);
    }
}
