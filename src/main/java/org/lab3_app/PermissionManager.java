package org.lab3_app;


enum PermissionLevel {
    ADMIN, DEVELOPER, USER;
}

public class PermissionManager {
    private PermissionLevel mLevel = PermissionLevel.USER;

    public void set(PermissionLevel level) {
        this.mLevel = level;
    }

    public String get() {
        switch (this.mLevel) {
            case USER:
                return "USER";
            case DEVELOPER:
                return "DEVELOPER";
            case ADMIN:
                return  "ADMIN";
            default:
                return null;
        }
    }
}

