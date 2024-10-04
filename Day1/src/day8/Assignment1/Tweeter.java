package day8.Assignment1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.Map;
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
        Map<Set<String>, Long> hashtags = stream.collect(Collectors.groupingBy(Tweet::getHashtags, Collectors.counting()));
        hashtags.forEach((k, v) -> System.out.println("Hashtags: " + k + ", Tweets: " + v));
    }

    public void count_tweets_by_subject(List<Tweet> tweets)

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


        t.list_all_tweets_current_month(tweets);
        t.list_all_tweets_for_hashtags(tweets);
    }
}
