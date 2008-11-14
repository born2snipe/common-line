package commonline.core.layout;


import flapjack.layout.RecordLayout;

/**
 * Represents the layout of a commonline record
 */
public interface CommonLineRecordLayout extends RecordLayout {
    /**
     * The @ code tied to this specific record
     *
     * @return the @ code
     */
    String getCode();
}
