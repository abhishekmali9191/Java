package day8.Assignment1;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Tweeter {
    Stream<Tweet> stream;
    public void list_all_tweets_current_month(List<Tweet> tweets) {
        LocalDate today = LocalDate.now();
        stream = tweets.stream();
        stream.filter(t -> t.getDateOfPost().getMonthValue() == today.getMonthValue()).forEach(System.out::println);
    }

    public void list_all_tweets_for_hashtags(List<Tweet> tweets) {
        stream = tweets.stream();

        Map<String, List<Tweet>> hashtags = stream.flatMap(tweet -> tweet.getHashtags().stream().map(hashtag -> Map.entry(hashtag, tweet)))
                .collect(Collectors.groupingBy(Map.Entry::getKey, Collectors.mapping(Map.Entry::getValue, Collectors.toList())));

        hashtags.forEach((k, v) -> System.out.println("Hashtags: " + k + ", Tweets: " + v));
    }

    public void count_tweets_by_subject(List<Tweet> tweets){
        stream = tweets.stream();
        Map<String, Long> counts = stream.collect(Collectors.groupingBy(Tweet::getSubject, Collectors.counting()));
        counts.forEach((k, v) -> System.out.println("Subject: " + k + ", Count: " + v));
    }

    public void list_all_tweets_with_more_than_10000_views(List<Tweet> tweets) {
        stream = tweets.stream();
        stream.filter(t -> t.getViews() > 10000).forEach(System.out::println);
    }

    public void list_top5_trending_tweets(List<Tweet> tweets) {
        stream = tweets.stream();
        stream.sorted(Comparator.comparingInt(Tweet::getViews).reversed()).limit(5).forEach(System.out::println);
    }

    public static void main(String[] args) {
        Tweeter t = new Tweeter();

        List<Tweet> tweets = new ArrayList<>();
        tweets.add(new Tweet("Discussing on IQ", LocalDate.of(2024, 10, 12), 15000, Set.of("#discussion", "#IQ")));
        tweets.add(new Tweet("Weather Update", LocalDate.of(2022, 5, 13), 1000, Set.of("#weather", "#flood", "#update")));
        tweets.add(new Tweet("Festival Celebration", LocalDate.of(2021, 12, 16), 150000, Set.of("#festival", "#celebration")));
        tweets.add(new Tweet("Traffic Jam", LocalDate.of(2022, 11, 29), 2000, Set.of("#traffic", "#punerains", "city")));
        tweets.add(new Tweet("Food Recipe", LocalDate.of(2021, 4, 5), 35000, Set.of("#food", "#receipe")));
        tweets.add(new Tweet("Health Tips", LocalDate.of(2022, 8, 23), 155000, Set.of("#health", "#tips")));
        tweets.add(new Tweet("Sports Update", LocalDate.of(2024, 10, 13), 19000, Set.of("#sports","#game", "#update")));
        tweets.add(new Tweet("Discussing on EQ", LocalDate.of(2023, 6, 12), 12000, Set.of("#discussion", "#EQ")));

        System.out.println("List of all the tweets of the current month :");
        t.list_all_tweets_current_month(tweets);
        System.out.println("----------------------------------------------------------------");
        System.out.println("List of all tweets with hashtags :");
        t.list_all_tweets_for_hashtags(tweets);
        System.out.println("----------------------------------------------------------------");
        System.out.println("Count of tweets by subject :");
        t.count_tweets_by_subject(tweets);
        System.out.println("----------------------------------------------------------------");
        System.out.println("List of tweets with more than 10,000 views :");
        t.list_all_tweets_with_more_than_10000_views(tweets);
        System.out.println("----------------------------------------------------------------");
        System.out.println("Top 5 trending tweets :");
        t.list_top5_trending_tweets(tweets);
    }
}
