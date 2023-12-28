package com.carlocodes.reviewer.chapter.two.streams;

import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// TODO: Revisit - Resolve NullPointerException
public class VisitCounter {
    public static void main(String[] args) {
        // Simulating input data
        Map<String, UserStats> map1 = Map.of("1", new UserStats(Optional.of(5L)),
                "2", new UserStats(Optional.empty()),
                "3", null,
                "4", new UserStats(Optional.of(10L)));

        Map<String, UserStats> map2 = Map.of("1", new UserStats(Optional.of(3L)),
                "2", new UserStats(Optional.of(8L)),
                "3", new UserStats(Optional.of(7L)),
                "5", new UserStats(Optional.of(2L)));

        Map<String, UserStats>[] userStatsArray = new Map[]{map1, map2, null};

        // Using the VisitCounter class
        VisitCounter visitCounter = new VisitCounter();
        Map<Long, Long> result = visitCounter.count(userStatsArray);

        System.out.println("Result:" + result);
    }

    public Map<Long, Long> count(Map<String, UserStats>[] userStatsArray) {
        if (Objects.isNull(userStatsArray)) {
            return Collections.emptyMap();
        }

        return Stream.of(userStatsArray)
                .filter(Objects::nonNull)
                .flatMap(map -> map.entrySet().stream())
                .filter(entry -> entry != null && isValidEntry(entry))
                .collect(Collectors.groupingBy(
                        entry -> parseLongOrSkip(entry.getKey()),
                        Collectors.summingLong(entry -> entry.getValue().getVisitCount().orElse(0L))
                ));
    }

    private boolean isValidEntry(Map.Entry<String, UserStats> entry) {
        return parseLongOrSkip(entry.getKey()) != null
                && entry.getValue() != null
                && entry.getValue().getVisitCount().isPresent();
    }

    private Long parseLongOrSkip(String s) {
        try {
            return Long.parseLong(s);
        } catch (NumberFormatException e) {
            return 0L;
        }
    }
}
