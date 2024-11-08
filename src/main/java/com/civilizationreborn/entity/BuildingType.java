package com.civilizationreborn.entity;

public class BuildingType {
    private final String name;
    private final Civilization civilization;
    private String structureFileName;

    public BuildingType(String name, Civilization civilization, String structureFileName) {
        this.name = name;
        this.civilization = civilization;
        this.structureFileName = structureFileName;
    }

    public BuildingType(String name, Civilization civilization) {
        this.name = name;
        this.civilization = civilization;
        this.structureFileName = name;
    }

    public String getName() {
        return name;
    }

    public Civilization getCivilization() {
        return civilization;
    }

    public String getstructureFileName() {
        return structureFileName;
    }

    public void setstructureFileName(String structureFileName) {
        this.structureFileName = structureFileName;
    }
}



