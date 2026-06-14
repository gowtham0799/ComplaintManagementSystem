package com.cms.dto;
import java.sql.Timestamp;

public class Complaint {

    private int id;
    private String title;
    private String description;
    private String status;
    private int employeeId;
    private String category;
    private String priority;
    private Timestamp createdAt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public String getCategory() {
    return category;
}

public void setCategory(String category) {
    this.category = category;
}
public String getPriority() {
    return priority;
}

public void setPriority(String priority) {
    this.priority = priority;
}
public Timestamp getCreatedAt() {
    return createdAt;
}

public void setCreatedAt(Timestamp createdAt) {
    this.createdAt = createdAt;
}
}