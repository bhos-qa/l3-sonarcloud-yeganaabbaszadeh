package org.lab3_app;

public class Main {

    enum PermissionLevel {
        ADMIN, DEVELOPER, USER;
    }

    public static class PermissionManager {
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

    public static void main(String[] args) {
        System.out.println("Welcome to Permission Manager!");
        PermissionManager permissionManager = new PermissionManager();
        System.out.println(permissionManager.get());
        permissionManager.set(PermissionLevel.ADMIN);
        System.out.println(permissionManager.get());
        permissionManager.set(PermissionLevel.DEVELOPER);
        System.out.println(permissionManager.get());
        permissionManager.set(PermissionLevel.USER);
        System.out.println(permissionManager.get());
    }


}
