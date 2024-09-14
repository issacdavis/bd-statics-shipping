package com.amazon.ata.statics;
import java.util.UUID;

public class TrackedBox {
    private static String boxId;
    private static String trackingId;

    /**
     * Constructs a TrackedBox object. A trackingId will also be generated for this TrackedBox object.
     * @param boxId - the id of the box
     */
    public TrackedBox(String boxId) {
        TrackedBox.boxId = boxId;
        TrackedBox.trackingId = createTrackingId();
    }

    public String getTrackingId() {
        return createTrackingId();
    }

    public String getBoxId() {
        return TrackedBox.boxId;
    }
    private String createTrackingId() {
        return TrackedBox.boxId + UUID.randomUUID();
    }

}
