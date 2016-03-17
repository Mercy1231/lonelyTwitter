package ca.ualberta.cs.lonelytwitter;

<<<<<<< HEAD
import android.os.Parcel;
import android.os.Parcelable;

import java.io.IOException;
import java.util.Date;

/**
 * Created by joshua2 on 9/16/15.
 */
public abstract class Tweet extends Object implements Tweetable, Parcelable {
    private String text;
    protected Date date;

    public Tweet(String tweet, Date date) throws TweetTooLongException {
        this.setText(tweet);
        this.date = date;
    }

    public Tweet(String tweet) throws TweetTooLongException {
        this.setText(tweet);
        this.date = new Date();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) throws TweetTooLongException {
        if (text.length() <= 140) {
            this.text = text;
        } else {
            throw new TweetTooLongException();
        }
    }

    public Date getDate() {
        return date;
=======
import java.util.Date;

/**
 * Created by romansky on 1/12/16.
 */
public abstract class Tweet {
    protected Date date;
    protected String message;

    public Tweet(Date date, String message) {
        this.date = date;
        this.message = message;
    }

    public Tweet(String message) {
        this.message = message;
        this.date = new Date();
    }

    public abstract Boolean isImportant();

    public Date getDate() {
        return this.date;
>>>>>>> 262dc55eaf5b1f57cdef5588852269f34e02d408
    }

    public void setDate(Date date) {
        this.date = date;
    }

<<<<<<< HEAD
    public abstract Boolean isImportant();

    @Override
    public String toString() {
        return date.toString() + " | " + text;
    }

    public int describeContents() {
        return 0;
    }

    //http://stackoverflow.com/questions/7181526/how-can-i-make-my-custom-objects-be-parcelable codelogic 06-03-2016
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeStringArray(new String[]{this.text, this.date.toString()});
    }

    public Tweet(Parcel in) {
        String[] data = new String[2];

        in.readStringArray(data);
        this.text = data[0];
        this.date = new Date(Date.parse(data[1]));
=======
    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() > 140) {
            throw new TweetTooLongException();
        }
        this.message = message;
    }

    @Override
    public String toString() {
        // Some people thought they would be funny and add tweets without dates...
        if(date == null) {
            if(message == null) {
                return "";
            } else {
                return message;
            }
        }
        return date.toString() + " | " + message;
>>>>>>> 262dc55eaf5b1f57cdef5588852269f34e02d408
    }
}
