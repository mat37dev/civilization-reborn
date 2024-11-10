package com.civilizationreborn.entity;

public class Villager {
    public enum Age{
        CHILD,
        ADULT
    }

    private String name;
    private Age age;
    private JobType jobType;
    private float x, y, z;

    public Villager(String name, JobType jobType, float x, float y, float z) {
        this.name = name;
        this.jobType = jobType;
        this.x = x;
        this.y = y;
        this.z = z;
        this.age = Age.ADULT;
    }

    public Villager(String name, float x, float y, float z) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.z = z;
        this.age = Age.CHILD;
        this.jobType = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Age getAge() {
        return age;
    }

    public void setAge(Age age) {
        this.age = age;
    }

    public JobType getJobType() {
        return jobType;
    }

    public void setJobType(JobType jobType) {
        this.jobType = jobType;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
}
