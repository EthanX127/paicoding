package com.github.paicoding.forum.test;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * A tiny test file used to verify the Codex cloud edit and local sync flow.
 */
public class CodexSyncTest {

    @Test
    public void shouldConfirmCodexSyncSmokeTest() {
        String message = "Codex cloud sync smoke test";

        assertTrue(message.contains("Codex"));
    }
}
