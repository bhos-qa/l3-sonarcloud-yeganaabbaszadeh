package org.lab3_app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MainTest {

    Main.PermissionManager permissionManager;

    @BeforeEach
    void setUp() {
        permissionManager = new Main.PermissionManager();
    }

    @Test
    void managePermissionTest() {
        permissionManager.set(Main.PermissionLevel.USER);
        assertEquals("USER", permissionManager.get());
        permissionManager.set(Main.PermissionLevel.DEVELOPER);
        assertEquals("DEVELOPER", permissionManager.get());
        permissionManager.set(Main.PermissionLevel.ADMIN);
        assertEquals("ADMIN", permissionManager.get());
    }
}
