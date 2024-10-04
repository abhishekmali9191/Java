package day8.Assignment1;

import java.time.LocalDate;
import java.util.Set;

public class Tweet {
    private String subject;
    private LocalDate dateOfPost;
    private int views;
    Set<String> hashtags;

    public Tweet(String subject, LocalDate dateOfPost, int views, Set<String> hashtags) {
        this.subject = subject;
        this.dateOfPost = dateOfPost;
        this.views = views;
        this.hashtags = hashtags;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public LocalDate getDateOfPost() {
        return dateOfPost;
    }

    public void setDateOfPost(LocalDate dateOfPost) {
        this.dateOfPost = dateOfPost;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public Set<String> getHashtags() {
        return hashtags;
    }

    public void setHashtags(Set<String> hashtags) {
        this.hashtags = hashtags;
    }

    @Override
    public String toString() {
        return "Tweet{" +
                "subject='" + subject + '\'' +
                ", dateOfPost=" + dateOfPost +
                ", views=" + views +
                ", hashtags=" + hashtags +
                '}';
    }
}
