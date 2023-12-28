package com.carlocodes.reviewer.chapter.two.streams;

import java.util.Optional;

public class UserStats {
    public UserStats(Optional<Long> visitCount) {
        this.visitCount = visitCount;
    }

    private Optional<Long> visitCount;

    public Optional<Long> getVisitCount() {
        return visitCount;
    }

    public void setVisitCount(Optional<Long> visitCount) {
        this.visitCount = visitCount;
    }

    @Override
    public String toString() {
        return "UserStats{" +
                "visitCount=" + visitCount +
                '}';
    }
}
