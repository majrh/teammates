package teammates.ui.template;

import teammates.common.util.Url;

/**
 * Data model for Instructor Feedback Results view by question, view by...
 */
public class InstructorResultsResponseRow {
    private ElementTag rowAttributes;
    private boolean isRowGrey;
    
    private boolean isGiverDisplayed = true;
    private String giverDisplayableIdentifier;
    private String giverTeam;
    
    private boolean isGiverProfilePictureAColumn = false;
    private Url giverProfilePictureLink;
    
    private boolean isRecipientDisplayed = true;
    private String recipientDisplayableIdentifier;
    private String recipientTeam;
    
    private boolean isRecipientProfilePictureAColumn = false;
    private Url recipientProfilePictureLink;
    
    private boolean isActionsDisplayed;
    
    private String displayableResponse;
    private InstructorResultsModerationButton moderationButton;
    
    
    public InstructorResultsResponseRow(String giverDisplayableIdentifier, String giverTeam,
                                        String recipientDisplayableIdentifier, String recipientTeam,
                                        String displayableResponse, 
                                        InstructorResultsModerationButton moderationButton) {
        this(giverDisplayableIdentifier, giverTeam, recipientDisplayableIdentifier, recipientTeam,
             displayableResponse, moderationButton, false);
    }
    
    public InstructorResultsResponseRow(String giverDisplayableIdentifier, String giverTeam,
                                        String recipientDisplayableIdentifier, String recipientTeam,
                                        String displayableResponse, 
                                        InstructorResultsModerationButton moderationButton, boolean isRowGrey) {
        this.giverDisplayableIdentifier = giverDisplayableIdentifier;
        this.giverTeam = giverTeam;
        
        this.recipientDisplayableIdentifier = recipientDisplayableIdentifier;
        this.recipientTeam = recipientTeam;
        
        this.displayableResponse = displayableResponse;
        
        this.moderationButton = moderationButton;
        
        this.isRowGrey = isRowGrey;
    }
    
    public String getGiverDisplayableIdentifier() {
        return giverDisplayableIdentifier;
    }
    
    public String getGiverTeam() {
        return giverTeam;
    }
    
    public String getRecipientDisplayableIdentifier() {
        return recipientDisplayableIdentifier;
    }
    
    public String getRecipientTeam() {
        return recipientTeam;
    }
    
    public String getDisplayableResponse() {
        return displayableResponse;
    }
    
    
    public InstructorResultsModerationButton getModerationButton() {
        return moderationButton;
    }

    public Url getGiverProfilePictureLink() {
        return giverProfilePictureLink;
    }

    public Url getRecipientProfilePictureLink() {
        return recipientProfilePictureLink;
    }

    public boolean isRowGrey() {
        return isRowGrey;
    }

    public void setGiverProfilePictureLink(Url giverProfilePictureLink) {
        this.giverProfilePictureLink = giverProfilePictureLink;
    }

    public void setRecipientProfilePictureLink(Url recipientProfilePictureLink) {
        this.recipientProfilePictureLink = recipientProfilePictureLink;
    }

    public ElementTag getRowAttributes() {
        return rowAttributes;
    }

    public void setRowAttributes(ElementTag rowAttributes) {
        this.rowAttributes = rowAttributes;
    }

    public boolean isGiverDisplayed() {
        return isGiverDisplayed;
    }

    public void setGiverDisplayed(boolean isGiverDisplayed) {
        this.isGiverDisplayed = isGiverDisplayed;
    }

    public boolean isGiverProfilePictureAColumn() {
        return isGiverProfilePictureAColumn;
    }

    public void setGiverProfilePictureAColumn(boolean isGiverProfilePictureAColumn) {
        this.isGiverProfilePictureAColumn = isGiverProfilePictureAColumn;
    }

    public boolean isRecipientDisplayed() {
        return isRecipientDisplayed;
    }

    public void setRecipientDisplayed(boolean isRecipientDisplayed) {
        this.isRecipientDisplayed = isRecipientDisplayed;
    }

    public boolean isRecipientProfilePictureAColumn() {
        return isRecipientProfilePictureAColumn;
    }

    public void setRecipientProfilePictureAColumn(boolean isRecipientProfilePictureAColumn) {
        this.isRecipientProfilePictureAColumn = isRecipientProfilePictureAColumn;
    }

    public boolean isActionsDisplayed() {
        return isActionsDisplayed;
    }

    public void setActionsDisplayed(boolean isActionsDisplayed) {
        this.isActionsDisplayed = isActionsDisplayed;
    }
    
    
}