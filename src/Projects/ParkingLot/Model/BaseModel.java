package Projects.ParkingLot.Model;

import jdk.jshell.execution.LoaderDelegate;

import java.time.LocalDateTime;

public abstract class BaseModel { // abstract because we don't want someone to create its object
    private int id;
    private LocalDateTime createdAt;
    private LoaderDelegate updatedAt;
    private String createdBy;
    private String updatedBy;

    public BaseModel() {
    }

    public BaseModel(int id, LocalDateTime createdAt, LoaderDelegate updatedAt, String createdBy, String updatedBy) {
        this.id = id;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LoaderDelegate getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LoaderDelegate updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }
}
