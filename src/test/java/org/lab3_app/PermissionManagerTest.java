package org.lab3_app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PermissionManagerTest {

    PermissionManager permissionManager;

    @BeforeEach
    void setUp() {
        permissionManager = new PermissionManager();
    }

    @Test
    void managePermissionTest() {
        assertEquals(permissionManager.get().getClass(), String.class);
        assertEquals("USER", permissionManager.get());
        permissionManager.set(PermissionLevel.USER);
        assertEquals("USER", permissionManager.get());
        permissionManager.set(PermissionLevel.DEVELOPER);
        assertEquals("DEVELOPER", permissionManager.get());
        permissionManager.set(PermissionLevel.ADMIN);
        assertEquals("ADMIN", permissionManager.get());
        permissionManager.set(PermissionLevel.ADMIN);
        assertEquals("ADMIN", permissionManager.get());
        permissionManager.set(PermissionLevel.USER);
        assertEquals("USER", permissionManager.get());
    }
}
