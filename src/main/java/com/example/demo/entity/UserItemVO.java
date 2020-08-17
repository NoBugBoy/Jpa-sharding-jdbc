package com.example.demo.entity;

public class UserItemVO {
    private Long itemId;
    private Long userId;
    private String itemName;
    private String userName;

    public UserItemVO(Long itemId, Long userId, String itemName, String userName) {
        this.itemId = itemId;
        this.userId = userId;
        this.itemName = itemName;
        this.userName = userName;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "UserItemVO{" + "itemId=" + itemId + ", userId=" + userId + ", itemName='" + itemName + '\''
            + ", userName='" + userName + '\'' + '}';
    }
}
