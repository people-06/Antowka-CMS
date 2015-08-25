package ru.antowka.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

/**
 * Created by Anton Nik on 13.08.15.
 */
@Entity
public class Attachment implements Serializable{

    private int attachmentId;
    private int userOwnerId;
    private String realFileName;
    private String filePathInStorage;
    private String previewPath;
    private Long fileSize;
    private String mimeType;

    @JsonIgnore
    private Set<Ticket> tickets;


    /**
     * ****************************** Getters and Setters ***************************************
     */

    public int getAttachmentId() {
        return attachmentId;
    }

    public void setAttachmentId(int attachmentId) {
        this.attachmentId = attachmentId;
    }

    public String getRealFileName() {
        return realFileName;
    }

    public void setRealFileName(String realFileName) {
        this.realFileName = realFileName;
    }

    public String getFilePathInStorage() {
        return filePathInStorage;
    }

    public void setFilePathInStorage(String filePathInStorage) {
        this.filePathInStorage = filePathInStorage;
    }

    public String getPreviewPath() {
        return previewPath;
    }

    public void setPreviewPath(String previewPath) {
        this.previewPath = previewPath;
    }

    public Long getFileSize() {
        return fileSize;
    }

    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    public int getUserOwnerId() {
        return userOwnerId;
    }

    public void setUserOwnerId(int userOwnerId) {
        this.userOwnerId = userOwnerId;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public Set<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(Set<Ticket> tickets) {
        this.tickets = tickets;
    }
}
