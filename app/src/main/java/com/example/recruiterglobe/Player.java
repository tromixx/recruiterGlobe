package com.example.recruiterglobe;

/**
 * Represents an item in a COACH
 */
public class PLAYER {

    /**
     * Item text
     */
    @com.google.gson.annotations.SerializedName("id")
    private String id;

    /**
     * Item Id
     */
    @com.google.gson.annotations.SerializedName("Fname")
    private String mFname;

    @com.google.gson.annotations.SerializedName("Lname")
    private String mLname;

    @com.google.gson.annotations.SerializedName("Address")
    private String mAddress;

    @com.google.gson.annotations.SerializedName("City")
    private String mCity;

    @com.google.gson.annotations.SerializedName("Zipcode")
    private Integer mZipcode;

    @com.google.gson.annotations.SerializedName("Country")
    private String mCountry;

    @com.google.gson.annotations.SerializedName("NationalRanking")
    private String mNationalRanking;

    @com.google.gson.annotations.SerializedName("UTR")
    private String mUTR;

    @com.google.gson.annotations.SerializedName("Team")
    private String mTeam;

    @com.google.gson.annotations.SerializedName("Award")
    private String mAward;

    @com.google.gson.annotations.SerializedName("Email")
    private String mEmail;

    @com.google.gson.annotations.SerializedName("Phone")
    private Integer mPhone;


    /**
     * Indicates if the item is completed
     */
    @com.google.gson.annotations.SerializedName("complete")
    private boolean mComplete;

    /**
     * ToDoItem constructor
     */
    public PLAYER() {

    }

    @Override
    public String toString() {
        return getFname();
    }

    /**
     * Initializes a new ToDoItem
     *
     * @param RFname
     *            The item text
     * @param id
     *            The item id
     */
    public COACH(String id, String mFname, String mLname, Integer RphoneNumber, String Remail, String Runiversity, String Rpassword) {
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
    public String getFname() { return mFname; }

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