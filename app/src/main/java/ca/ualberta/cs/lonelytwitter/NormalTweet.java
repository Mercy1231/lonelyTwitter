package ca.ualberta.cs.lonelytwitter;

<<<<<<< HEAD
import android.os.Parcel;
import android.os.Parcelable;

import java.util.Date;

/**
 * Created by joshua2 on 9/16/15.
 */
public class NormalTweet extends Tweet {
    public NormalTweet(String tweet, Date date) {
        super(tweet, date);
    }

    public NormalTweet(String tweet) {
        super(tweet);
    }

    public Boolean isImportant() {
        return Boolean.FALSE;
    }

    public NormalTweet(Parcel in) { super(in); }

    //http://stackoverflow.com/questions/7181526/how-can-i-make-my-custom-objects-be-parcelable codelogic 06-03-2016
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        public NormalTweet createFromParcel(Parcel in) {
            return new NormalTweet(in);
        }

        public NormalTweet[] newArray(int size) {
            return new NormalTweet[0];
        }
    };
=======
import java.util.Date;

/**
 * Created by romansky on 1/12/16.
 */
public class NormalTweet extends Tweet implements Tweetable {
    public NormalTweet(Date date, String message) {
        super(date, message);
    }

    public NormalTweet(String message) {
        super(message);
    }

    public Date getDate() {
        return this.date;
    }

    public String getMessage() {
        return this.message;
    }

    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
>>>>>>> 262dc55eaf5b1f57cdef5588852269f34e02d408
}
