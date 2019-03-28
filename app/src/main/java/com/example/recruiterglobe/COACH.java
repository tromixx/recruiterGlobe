package com.example.recruiterglobe;

/**
 * Represents an item in a COACH
 */
public class COACH {

    /**
     * Item text
     */
    @com.google.gson.annotations.SerializedName("RFname")
    private String mRFname;

    /**
     * Item Id
     */
    @com.google.gson.annotations.SerializedName("id")
    private String mId;

    @com.google.gson.annotations.SerializedName("RLname")
    private String mRLname;

    @com.google.gson.annotations.SerializedName("RphoneNumber")
    private Integer mRphoneNumber;

    @com.google.gson.annotations.SerializedName("Remail")
    private String mRemail;

    @com.google.gson.annotations.SerializedName("Runiversity")
    private String mRuniversity;

    @com.google.gson.annotations.SerializedName("Rpassword")
    private String mRpassword;
    /**
     * Indicates if the item is completed
     */
    @com.google.gson.annotations.SerializedName("complete")
    private boolean mComplete;

    /**
     * ToDoItem constructor
     */
    public COACH() {

    }

    @Override
    public String toString() {
        return getRFname();
    }

    /**
     * Initializes a new ToDoItem
     *
     * @param RFname
     *            The item text
     * @param id
     *            The item id
     */
    public COACH(String RFname, String id, String RLname, Integer RphoneNumber, String Remail, String Runiversity, String Rpassword) {
        this.setRFname(RFname);
        this.setId(id);
        this.setRLname(RLname);
        this.setRphoneNumber(RphoneNumber);
        this.setRemail(Remail);
        this.setRuniversity(Runiversity);
        this.setRpassword(Rpassword);
    }

    /**
     * Returns the item text
     */
    public String getRFname() {
        return mRFname;
    }

    /**
     * Sets the item text
     *
     * @param RFname
     *            text to set
     */
    public final void setRFname(String RFname) {
        mRFname = RFname;
    }

    public String getRLname() { return mRLname; }
    public final void setRLname(String RLname) { mRLname = RLname; }

    public Integer getRphoneNumber() { return mRphoneNumber; }
    public final void setRphoneNumber(Integer RphoneNumber) { mRphoneNumber = RphoneNumber; }

    public String getRemail() { return mRemail; }
    public final void setRemail(String Remail) { mRemail = Remail; }

    public String getRuniversity() { return mRuniversity; }
    public final void setRuniversity(String Runiversity) { mRuniversity = Runiversity; }

    public String getRpassword() { return mRpassword; }
    public final void setRpassword(String Rpassword) { mRpassword = Rpassword; }

    /**
     * Returns the item id
     */
    public String getId() {
        return mId;
    }

    /**
     * Sets the item id
     *
     * @param id
     *            id to set
     */
    public final void setId(String id) {
        mId = id;
    }

    /**
     * Indicates if the item is marked as completed
     */
    public boolean isComplete() {
        return mComplete;
    }

    /**
     * Marks the item as completed or incompleted
     */
    public void setComplete(boolean complete) {
        mComplete = complete;
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof COACH && ((COACH) o).mId == mId;
    }
}