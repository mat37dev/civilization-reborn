package com.civilizationreborn.entity;

public abstract class Building {
    private String name;
    private final float x, y, z;
    private final BuildingType type;
    private int level;

    public Building(String name, float x, float y, float z, BuildingType type) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.z = z;
        this.type = type;
        this.level = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getZ() {
        return z;
    }

    public BuildingType getType() {
        return type;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getStructureFilePath(){
        return "schematica/"+type.getCivilization()+"/"+type.getstructureFileName()+".schematica";
    }
}
